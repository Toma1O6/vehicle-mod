package dev.toma.vehiclemod.vehicle.entity;

import java.util.List;

import javax.vecmath.Vector3f;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import dev.toma.vehiclemod.VMConfig;
import dev.toma.vehiclemod.VehicleMod;
import dev.toma.vehiclemod.network.VMNetworkManager;
import dev.toma.vehiclemod.network.packets.CPacketVehicleData;
import dev.toma.vehiclemod.vehicle.VMTickableSound;
import dev.toma.vehiclemod.vehicle.VehicleSounds;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public abstract class EntityVehicle extends Entity implements IEntityAdditionalSpawnData {
	
	private static final Predicate<Entity> TARGET = Predicates.and(EntitySelectors.NOT_SPECTATING, EntitySelectors.IS_ALIVE, Entity::canBeCollidedWith);
	
	public float health;
	public VehicleStatsCFG stats;
	public float currentSpeed;
	public float prevSpeed;
	public float turnModifier;
	public float fuel;
	public boolean isBroken;
	private short timeInInvalidState;
	private int variantType;
	
	private boolean inputForward, inputBack, inputRight, inputLeft;
	
	public EntityVehicle(World world) {
		super(world);
		setSize(1f, 1f);
		stepHeight = 1f;
		preventEntitySpawning = true;
	}
	
	public EntityVehicle(World world, BlockPos pos) {
		this(world);
		setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
	}
	
	public abstract String[] getVariants();
	
	//0 = engine, 1 = exhaust
	public abstract Vector3f[] getPartVecs();
	
	public abstract VehicleStatsCFG getStats();
	
	public abstract int maximumAmountOfPassengers();
	
	public abstract VehicleSounds getSounds();
	
	public abstract void initSounds();
	
	public void updateVehicle() {
		if(!this.isBeingRidden() && (!noAccelerationInput() || !noTurningInput() || !hasFuel())) {
			inputForward = false;
			inputBack = false;
			inputRight = false;
			inputLeft = false;
		}
		
		updateMotion();
		handleEntityCollisions();
		checkState();
		
		if(collidedHorizontally) {
			currentSpeed *= 0.6;
		}
		
		if(!world.isRemote) {
			VMNetworkManager.instance().sendToAllAround(new CPacketVehicleData(this), new TargetPoint(dimension, posX, posY, posZ, 256));
		}

		playSoundAtVehicle();
		spawnParticles();
		move(MoverType.SELF, motionX, motionY, motionZ);
	}
	
	public void updateMotion() {
		Vec3d lookVec = this.getLookVec();
		if(!isBroken && hasFuel()) {
			if(inputForward && !inputBack) {
				burnFuel();
				currentSpeed = currentSpeed < stats.maxSpeed ? currentSpeed + stats.acceleration : stats.maxSpeed;
			}
			if(!inputForward && inputBack) {
				burnFuel();
				currentSpeed = currentSpeed > 0 ? currentSpeed - stats.brakeSpeed : currentSpeed > (-stats.maxSpeed * 0.3f) ? currentSpeed - 0.02f : -stats.maxSpeed * 0.3f;
			}
		}
		
		if(inputRight && !inputLeft) {
			turnModifier = turnModifier < stats.maxTurningAngle ? turnModifier + stats.turnSpeed : stats.maxTurningAngle;
		}
		if(inputLeft && !inputRight) {
			turnModifier = turnModifier > -stats.maxTurningAngle ? turnModifier - stats.turnSpeed : -stats.maxTurningAngle;
		}
		
		if(noAccelerationInput() || isBroken) {
			if(Math.abs(currentSpeed) < 0.01)
				currentSpeed = 0f;
			
			if(currentSpeed != 0) {
				currentSpeed = currentSpeed > 0 ? currentSpeed - 0.008f : currentSpeed + 0.008f;
			}
		}
		
		if(noTurningInput()) {
			if(Math.abs(turnModifier) < 0.1f)
				turnModifier = 0f;
			
			if(turnModifier != 0) {
				turnModifier = turnModifier > 0 ? turnModifier - 0.3f : turnModifier + 0.3f;
			}
		}
		
		motionX = lookVec.x * currentSpeed;
		motionZ = lookVec.z * currentSpeed;
		
		if(currentSpeed != 0) {
			rotationYaw += currentSpeed > 0 ? turnModifier : -turnModifier;
		}
		if(!onGround) {
			motionY -= -0.1d;
		}
	}
	
	public void checkState() {
		if(this.isInWater() || world.getBlockState(getPosition().up()).getMaterial().isLiquid()) {
			timeInInvalidState++;
			motionX *= 0.4d;
			motionZ *= 0.4d;
			motionY = -0.15d;
		}
		
		if(timeInInvalidState > 30) {
			isBroken = true;
		}
		
		if(isInLava() || health <= 0f) {
			this.explode();
		}
	}
	
	@Override
	public void onUpdate() {
		
		updateVehicle();
		super.onUpdate();
		prevSpeed = currentSpeed;
	}
	
	public void updateInput(boolean forward, boolean back, boolean right, boolean left) {
		if(hasFuel()) {
			this.inputForward = forward;
			this.inputBack = back;
		}
		this.inputRight = right;
		this.inputLeft = left;
		if(VMConfig.simpleVehicleControls) {
			if(this.getRidingEntity() != null) {
				EntityPlayer player = (EntityPlayer)this.getRidingEntity();
				float playerRot = player.rotationYaw;
				playerRot = playerRot < 0 ? playerRot + 360f : playerRot > 360f ? playerRot - 360f : playerRot;
				float delta = rotationYaw - playerRot;
				if((delta < (-stats.maxTurningAngle*3) && delta > -200f) || delta >= 200f) {
					inputRight = true;
				} else if(delta > (stats.maxTurningAngle*3) && delta < 200f || delta <= -200f) {
					inputLeft = true;
				}
			}
		}
	}
	
	@Override
	public Entity getRidingEntity() {
		if(this.getPassengers().size() > 0) {
			if(this.getPassengers().get(0) instanceof EntityPlayer) {
				return this.getPassengers().get(0);
			}
		}
		return null;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if(!this.getPassengers().contains(source.getTrueSource())) {
			this.health -= amount;
		}
		return true;
	}
	
	@Override
	public boolean isInRangeToRenderDist(double distance) {
		return true;
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
		if(!world.isRemote) {
			if(canBeRidden(player) && canFitPassenger(player)) {
				player.startRiding(this);
			}
		}
		return true;
	}
	
	@Override
	public void writeSpawnData(ByteBuf buf) {
		buf.writeFloat(health);
		buf.writeFloat(fuel);
		buf.writeInt(variantType);
	}
	
	@Override
	public void readSpawnData(ByteBuf buf) {
		health = buf.readFloat();
		fuel = buf.readFloat();
		variantType = buf.readInt();
	}
	
	public VMTickableSound getVehicleSound() {
		if(isAccelerating()) {
			return this.getSounds().getAccelerateSound();
		} else if(isBraking()) {
			return this.getSounds().getBrakeSound();
		} else if(hasReleasedGas()) {
			return this.getSounds().getGasReleaseSound();
		}
		return this.getSounds().idle;
	}
	
	public void refillFuel() {
		fuel += 25f;
		if(fuel > 100f) {
			fuel = 100f;
		}
	}
	
	protected void spawnParticles() {
		if(world.isRemote) {
			if(health / stats.maxHealth <= 0.35f) {
				Vec3d engineVec = (new Vec3d(getPartVecs()[0].x, getPartVecs()[0].y + 0.25d, getPartVecs()[0].z)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float)Math.PI / 2F));
				world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, true, posX + engineVec.x, posY + engineVec.y, posZ + engineVec.z, 0d, 0.1d, 0d);
				
				if(health / stats.maxHealth <= 0.15f) {
					double rngX = (rand.nextDouble() - rand.nextDouble()) * 0.1;
					double rngZ = (rand.nextDouble() - rand.nextDouble()) * 0.1;
					world.spawnParticle(EnumParticleTypes.FLAME, true, posX + engineVec.x, posY + engineVec.y - 0.2, posZ + engineVec.z, rngX, 0.02d, rngZ);
				}
			}
			
			if(!isBroken && hasFuel()) {
				Vec3d exhaustVec = (new Vec3d(getPartVecs()[1].x, getPartVecs()[1].y + 0.25d, getPartVecs()[1].z)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float)Math.PI / 2F));
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, true, posX + exhaustVec.x, posY + exhaustVec.y, posZ + exhaustVec.z, 0, 0.02d, 0);
			}
			if(isBroken) {
				Vec3d engine = (new Vec3d(getPartVecs()[0].x, getPartVecs()[0].y + 0.25d, getPartVecs()[0].z)).rotateYaw(-this.rotationYaw * 0.017453292F - ((float)Math.PI / 2F));
				world.spawnParticle(EnumParticleTypes.CLOUD, true, posX + engine.x, posY + engine.y, posZ + engine.z, 0d, 0.05d, 0d);
			}
		}
	}
	
	protected void playSoundAtVehicle() {
		VehicleMod.proxy.playSoundAt(this);
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
		compound.setDouble("posX", this.posX);
		compound.setDouble("posY", this.posY);
		compound.setDouble("posZ", this.posZ);
		compound.setDouble("motionX", this.motionX);
		compound.setDouble("motionY", this.motionY);
		compound.setDouble("motionZ", this.motionZ);
		compound.setFloat("health", this.health);
		compound.setFloat("fuel", this.fuel);
		compound.setFloat("speed", this.currentSpeed);
		compound.setBoolean("isBroken", this.isBroken);
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
		posX = compound.getDouble("posX");
		posY = compound.getDouble("posY");
		posZ = compound.getDouble("posZ");
		motionX = compound.getDouble("motionX");
		motionY = compound.getDouble("motionY");
		motionZ = compound.getDouble("motionZ");
		health = compound.getFloat("health");
		fuel = compound.getFloat("fuel");
		currentSpeed = compound.getFloat("speed");
		isBroken = compound.getBoolean("isBroken");
	}
	
	@Override
	protected boolean canFitPassenger(Entity passenger) {
		return this.getPassengers().size() < maximumAmountOfPassengers();
	}
	
	private void handleEntityCollisions() {
		Vec3d vec1 = new Vec3d(posX, posY, posZ);
		Vec3d vec2 = new Vec3d(vec1.x + motionX, vec1.y + motionY, vec1.z + motionZ);
		Entity e = findEntityInPath(vec1, vec2);
		
		if(e != null) {
			e.motionX += motionX * currentSpeed * 3;
			e.motionY += currentSpeed;
			e.motionZ += motionZ * currentSpeed * 3;
			e.attackEntityFrom(DamageSource.FALL, Math.abs(currentSpeed) * 15f);
		}
	}
	
	private Entity findEntityInPath(Vec3d start, Vec3d end) {
		Entity e = null;
		List<Entity> entityList = world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox().expand(motionX, motionY * 2, motionZ), TARGET);
		double d0 = 0;
		for(Entity ent : entityList) {
			if(ent != this && !this.getPassengers().contains(ent)) {
				AxisAlignedBB aabb = ent.getEntityBoundingBox().grow(0.3);
				RayTraceResult rayTrace = aabb.calculateIntercept(start, end);
				
				if(rayTrace != null) {
					double d1 = start.squareDistanceTo(rayTrace.hitVec);
					if(d1 < d0 || d0 == 0) {
						e = ent;
					}
				}
			}
		}
		return e;
	}
	
	private boolean noAccelerationInput() {
		return !this.inputForward && !this.inputBack;
	}
	
	private boolean noTurningInput() {
		return !this.inputRight && !this.inputLeft;
	}
	
	private boolean hasFuel() {
		return fuel > 0;
	}
	
	private void burnFuel() {
		this.fuel -= this.stats.fuelConsumption;
	}
	
	private void explode() {
		if(!world.isRemote) {
			world.createExplosion(this, posX, posY, posZ, 3.0F, false);
			setDead();
		}
	}
	
	private boolean isStandingStill() {
		return noAccelerationInput() && currentSpeed == prevSpeed;
	}
	
	private boolean isAccelerating() {
		return currentSpeed > prevSpeed;
	}
	
	private boolean isBraking() {
		return currentSpeed < prevSpeed;
	}
	
	private boolean hasReleasedGas() {
		return noAccelerationInput() && currentSpeed > 0;
	}
	
	public final class VehicleStatsCFG {
		
		@Config.Name("Max Health")
		@RequiresWorldRestart
		public float maxHealth;
		
		@Config.Name("Max Speed")
		@RequiresWorldRestart
		public float maxSpeed;
		
		@Config.Name("Acceleration")
		@RequiresWorldRestart
		public float acceleration;
		
		@Config.Name("Turning Speed")
		@RequiresWorldRestart
		public float turnSpeed;
		
		@Config.Name("Max Turning Angle")
		@RequiresWorldRestart
		public float maxTurningAngle;
		
		@Config.Name("Braking Speed")
		@RequiresWorldRestart
		public float brakeSpeed;
		
		@Config.Name("Fuel Consumption")
		@RequiresWorldRestart
		public float fuelConsumption;
		
		@Config.Name("Texture variants")
		@RequiresWorldRestart
		public String[] textures;
		
		public VehicleStatsCFG(float maxHP, float maxSpeed, float acceleration, float brakeSpeed, float turningSpeed, float maxAngle, float fuelConsumption, String... textures) {
			this.maxHealth = maxHP;
			this.maxSpeed = maxSpeed;
			this.acceleration = acceleration;
			this.turnSpeed = turningSpeed;
			this.maxTurningAngle = maxAngle;
			this.brakeSpeed = brakeSpeed;
			this.fuelConsumption = fuelConsumption;
			this.textures = textures;
		}
	}
}
