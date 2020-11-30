package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleBeamerS120;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class ModelBeamerS120 extends ModelVehicle<VehicleBeamerS120> {

	private final ModelRenderer bone;
	private final ModelRenderer bone6;
	private final ModelRenderer bone11;
	private final ModelRenderer bone15;
	private final ModelRenderer bone28;
	private final ModelRenderer bone33;
	private final ModelRenderer bone13;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone20;
	private final ModelRenderer bone25;
	private final ModelRenderer bone27;
	private final ModelRenderer bone31;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone30;
	private final ModelRenderer bone46;
	private final ModelRenderer bone24;
	private final ModelRenderer bone16;
	private final ModelRenderer bone5;
	private final ModelRenderer bone10;
	private final ModelRenderer bone12;
	private final ModelRenderer bone17;
	private final ModelRenderer bone23;
	private final ModelRenderer bone14;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone38;
	private final ModelRenderer bone32;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone29;
	private final ModelRenderer bone26;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone40;
	private final ModelRenderer bone39;
	private final ModelRenderer bone41;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone42;
	private final ModelRenderer bone45;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer head_lights;
	private final ModelRenderer bone55;
	private final ModelRenderer head_lights_left;
	private final ModelRenderer bone54;
	private final ModelRenderer head_lights_right;
	private final ModelRenderer bone56;
	private final ModelRenderer plate;
	private final ModelRenderer bone77;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer bone80;
	private final ModelRenderer interior;
	private final ModelRenderer rear_lights;
	private final ModelRenderer bone58;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer rear_lights_brake;
	private final ModelRenderer bone57;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer rear_lights_reverse;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer rear_lights_left;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer rear_lights_right;
	private final ModelRenderer bone73;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;

	public ModelBeamerS120() {
		textureWidth = 512;
		textureHeight = 512;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-19.0F, -5.0F, -8.0F);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -2.0F, -2.0F, -21.0F, 25, 4, 29, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -27.0F, -2.0F, -7.0F, 25, 4, 15, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -27.0F, -2.0F, 8.0F, 25, 4, 19, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -26.0F, -32.0F, -12.0F, 25, 3, 28, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -2.0F, -2.0F, -20.0F, 25, 4, 28, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -27.0F, -2.0F, -20.0F, 25, 4, 28, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -27.0F, -2.0F, 8.0F, 25, 4, 19, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -2.0F, -2.0F, 8.0F, 25, 4, 19, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 51, -26.0F, -32.0F, -12.0F, 25, 3, 28, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 10, 39, -1.0F, -32.0F, -12.0F, 23, 3, 28, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.5F, -30.5F, -12.5F);
		setRotationAngle(bone11, -0.4363F, 0.0F, 0.0F);
		bone6.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 2, 51, -24.5F, -1.5F, -0.5F, 25, 3, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 51, 0.5F, -1.5F, -0.5F, 23, 3, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -19.0F, 41.0F);
		setRotationAngle(bone15, 1.2566F, 0.0F, 0.0F);
		bone11.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 2, 51, -24.5F, -0.5F, 0.5F, 25, 6, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 2, 51, 0.5F, -0.5F, 0.5F, 23, 6, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 1.5F, -1.0F);
		setRotationAngle(bone28, -0.2618F, 0.0F, 0.0F);
		bone11.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 400, 142, -23.5F, -2.0F, 0.5F, 24, 4, 1, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 400, 140, 0.5F, -2.0F, 0.5F, 22, 4, 1, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 17, 54, 0.5F, 21.7F, -5.8F, 21, 4, 1, 0.0F, false));
		bone33.cubeList.add(new ModelBox(bone33, 17, 54, -21.5F, 21.7F, -5.8F, 22, 4, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.5F, -30.5F, 24.5F);
		bone6.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 2, 51, 0.5F, -1.5F, -8.5F, 23, 3, 17, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 2, 51, -24.5F, -1.5F, -8.5F, 25, 3, 17, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 2, 51, -10.0F, -11.0F, -5.0F, 25, 5, 15, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 51, -35.0F, -11.0F, -5.0F, 25, 5, 15, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-10.0F, -52.0F, 46.5F);
		setRotationAngle(bone3, -1.4835F, 0.0F, 0.0F);
		bone2.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, -25.0F, 4.7888F, -2.9298F, 25, 4, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, 0.0F, 4.7888F, -2.9298F, 25, 4, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, 0.0F, 62.7888F, 46.0702F, 25, 4, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, -25.0F, 62.7888F, 46.0702F, 25, 4, 15, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 6.0F, -22.0F);
		setRotationAngle(bone4, -0.8727F, 0.0F, 0.0F);
		bone3.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -17.0F, -0.5F, 25, 4, 15, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -17.0F, -0.5F, 25, 4, 15, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -17.0F, -13.5F, 25, 4, 19, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -17.0F, -13.5F, 25, 4, 19, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone20, 0.1571F, 0.0F, 0.0F);
		bone4.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, -25.0F, -25.0F, -11.5F, 20, 10, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, 6.0F, -25.0F, -11.5F, 19, 10, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 201, 36, -1.0F, -28.3F, -12.7F, 27, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 227, 35, -9.0F, -28.3F, -12.7F, 10, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 225, 40, -14.0F, -28.3F, -12.7F, 2, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 230, 41, -26.0F, -28.3F, -12.7F, 9, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 260, 36, -17.0F, -26.3F, -12.7F, 8, 2, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, -5.0F, -25.0F, -11.5F, 11, 1, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, -5.0F, -20.0F, -11.5F, 11, 4, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 48, 47, -5.0F, -24.0F, -10.6F, 11, 4, 6, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-17.5F, -24.0F, -13.0F);
		setRotationAngle(bone25, 0.0F, 0.0F, 3.1416F);
		bone20.addChild(bone25);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-19.5F, 10.5F, 15.5F);
		setRotationAngle(bone27, 0.2618F, 0.0F, 0.0F);
		bone20.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, -0.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 38.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 6.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 13.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 31.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 24.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, -14.0F, -11.0F);
		setRotationAngle(bone31, -0.6981F, 0.0F, 0.0F);
		bone20.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 49, 56, -24.0F, -2.0F, -1.5F, 24, 3, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 49, 56, 0.0F, -2.0F, -1.5F, 24, 3, 1, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-13.0F, -27.7F, -9.7F);
		setRotationAngle(bone47, -0.0873F, 0.0F, 0.0F);
		bone20.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 152, 240, 1.5F, -1.0F, -5.0F, 2, 2, 12, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 152, 240, -3.5F, -1.0F, -5.0F, 2, 2, 12, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone48, -0.1745F, 0.0F, 0.0F);
		bone47.addChild(bone48);
		bone48.cubeList.add(new ModelBox(bone48, 167, 501, -4.0F, -2.0F, 4.0F, 8, 3, 10, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.5F, -13.0F, 83.5F);
		setRotationAngle(bone30, -0.7854F, 0.0F, 0.0F);
		bone4.addChild(bone30);
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, -19.5F, -12.0F, 6.0F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, 12.7F, -12.0F, 6.0F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, -19.5F, -9.0F, 3.6F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, 12.5F, -9.0F, 3.6F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, -19.5F, -6.1F, 1.3F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, 12.5F, -6.1F, 1.3F, 7, 2, 4, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, -12.0F, 7.0F);
		setRotationAngle(bone46, -0.4363F, 0.0F, 0.0F);
		bone4.addChild(bone46);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 64.7888F, 66.5702F);
		setRotationAngle(bone24, -0.8727F, 0.0F, 0.0F);
		bone3.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 2, 51, -25.0F, 2.0F, -7.5F, 25, 4, 15, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 2, 51, 0.0F, 2.0F, -7.5F, 25, 4, 15, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-10.0F, -63.0F, 55.5F);
		setRotationAngle(bone16, 0.0873F, 0.0F, 0.0F);
		bone2.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 2, 51, 0.0F, -2.0F, -7.5F, 25, 4, 15, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 2, 51, -25.0F, -2.0F, -7.5F, 25, 4, 15, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, 0.0F, -41.0F, -36.0F, 3, 10, 61, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -45.0F, -41.0F, -36.0F, 3, 10, 61, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 416, 144, 3.0F, -39.0F, -10.0F, 1, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 424, 144, 3.0F, -39.0F, 13.0F, 1, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 412, 148, -46.0F, -39.0F, 13.0F, 1, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 420, 152, -46.0F, -39.0F, -10.0F, 1, 1, 3, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-43.5F, -45.5F, -22.5F);
		setRotationAngle(bone10, 0.8901F, 0.0F, 0.0F);
		bone5.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, -1.5F, -7.5F, -13.5F, 3, 3, 27, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, 43.5F, -7.5F, -13.5F, 3, 3, 27, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, 43.5F, -7.5F, -13.5F, 3, 3, 27, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone12, 0.6109F, 0.0F, 0.0F);
		bone10.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, 43.5F, 18.5F, -4.5F, 3, 3, 21, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -1.5F, 18.5F, -4.5F, 3, 3, 21, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(22.5F, 44.0F, 6.0F);
		setRotationAngle(bone17, -0.0175F, 0.0F, 0.0F);
		bone12.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 0, 0, -24.0F, -1.5F, -10.5F, 3, 3, 21, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 0, 21.0F, -1.5F, -10.5F, 3, 3, 21, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 0, 21.0F, 1.5F, -10.5F, 3, 4, 21, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 0, -24.0F, 1.5F, -10.5F, 3, 4, 21, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, 21.0F, 21.5F, -10.5F, 2, 4, 8, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, -23.0F, 21.5F, -10.5F, 2, 4, 8, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, -23.0F, 17.5F, -7.5F, 2, 4, 7, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, 21.0F, 17.5F, -7.5F, 2, 4, 7, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, -23.0F, 13.5F, -7.5F, 2, 4, 10, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, 21.0F, 13.5F, -7.5F, 2, 4, 10, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, 21.0F, 9.5F, -7.5F, 2, 4, 13, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, -23.0F, 9.5F, -7.5F, 2, 4, 13, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, 21.0F, 5.5F, -7.5F, 2, 4, 15, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 40, 53, -23.0F, 5.5F, -7.5F, 2, 4, 15, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-23.5F, 26.5F, -10.5F);
		setRotationAngle(bone23, 0.8727F, 0.0F, 0.0F);
		bone17.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 0, 0, -1.5F, -2.0F, -4.0F, 3, 4, 8, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 0, 0, 45.5F, -2.0F, -5.0F, 3, 4, 8, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(22.5F, 51.0F, 47.0F);
		setRotationAngle(bone14, 1.5882F, 0.0F, 0.0F);
		bone10.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 20, 22, 15.0F, -7.5F, -10.5F, 9, 3, 34, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 20, 22, -24.0F, -7.5F, -10.5F, 9, 3, 34, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone18, 0.0F, 0.2618F, 0.0F);
		bone14.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 39, 39, -21.1F, -6.5F, -13.5F, 9, 1, 31, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.5F, -6.0F, -35.0F);
		setRotationAngle(bone19, 0.0F, -0.5236F, 0.0F);
		bone18.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 39, 39, 31.0F, -0.5F, 16.5F, 9, 1, 31, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone38, 0.0175F, 0.0F, 0.0F);
		bone14.addChild(bone38);
		bone38.cubeList.add(new ModelBox(bone38, 18, 50, -21.0F, -7.1F, -10.5F, 3, 3, 34, 0.0F, false));
		bone38.cubeList.add(new ModelBox(bone38, 18, 50, 18.0F, -7.1F, -10.5F, 3, 3, 34, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(22.0F, -6.0F, 23.5F);
		setRotationAngle(bone32, -0.4363F, 0.0F, 0.0F);
		bone10.addChild(bone32);
		bone32.cubeList.add(new ModelBox(bone32, 154, 238, -0.5F, 5.5F, -5.0F, 1, 1, 16, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(47.0F, -5.0F, -8.0F);
		setRotationAngle(bone49, 0.0F, 0.6109F, 0.0F);
		bone10.addChild(bone49);
		bone49.cubeList.add(new ModelBox(bone49, 0, 0, 0.139F, -0.7229F, -2.9845F, 1, 1, 5, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-2.0F, -6.0F, -9.0F);
		setRotationAngle(bone50, 0.0F, -0.6109F, 0.0F);
		bone10.addChild(bone50);
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -0.139F, 0.2771F, -1.9845F, 1, 1, 5, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-21.0F, -16.5F, -56.0F);
		setRotationAngle(bone7, 0.1222F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -25.0F, 0.5F, -15.0F, 25, 5, 20, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, 0.5F, -15.0F, 25, 5, 20, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -25.0F, 0.5F, -15.0F, 4, 10, 15, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 21.0F, 0.5F, -15.0F, 4, 10, 15, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 1.0F, -18.0F);
		setRotationAngle(bone8, 0.6632F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -25.0F, 1.5F, -7.0F, 25, 9, 10, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, 0.0F, 1.5F, -7.0F, 25, 9, 10, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 233, 148, -2.0F, 0.9F, -5.0F, 4, 1, 3, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone9, 0.4363F, 0.0F, 0.0F);
		bone8.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -25.0F, -1.5F, -10.0F, 25, 10, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, -1.5F, -10.0F, 25, 10, 3, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -1.0F, -10.5F);
		setRotationAngle(bone29, -0.5236F, 0.0F, 0.0F);
		bone9.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 195, 32, 0.0F, 0.5F, -1.5F, 26, 1, 6, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 198, 32, -26.0F, 0.5F, -1.5F, 26, 1, 6, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.5F, -5.0F);
		setRotationAngle(bone26, -0.1222F, 0.0F, 0.0F);
		bone7.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 153, 233, -7.0F, -1.0F, -6.0F, 13, 3, 20, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 147, 14, -3.7F, -31.0F, 35.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 139, 19, -3.7F, -37.0F, 29.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 145, 11, -3.7F, -25.0F, 29.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 142, 8, -3.7F, -31.0F, 23.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 139, 20, -3.9F, -31.0F, -42.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 137, 14, -3.9F, -37.0F, -48.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 142, 17, -3.9F, -25.0F, -48.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 147, 12, -3.9F, -31.0F, -54.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 140, 25, -45.3F, -31.0F, 35.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 141, 27, -45.3F, -37.0F, 29.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 151, 24, -45.3F, -25.0F, 29.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 147, 21, -45.3F, -31.0F, 23.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 140, 17, -45.2F, -31.0F, -42.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 136, 19, -45.2F, -37.0F, -48.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 147, 16, -45.2F, -25.0F, -48.0F, 7, 8, 8, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 142, 17, -45.2F, -31.0F, -54.0F, 7, 8, 8, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(2.5F, -27.0F, 33.0F);
		setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
		bone21.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 145, 12, -6.2F, -4.0F, 2.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 139, 19, -6.2F, -10.0F, -4.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 137, 12, -6.2F, -4.0F, -10.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 153, 20, -6.2F, 2.0F, -4.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 155, 25, -6.4F, 50.4472F, -52.4472F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 144, 22, -6.4F, 44.4472F, -58.4472F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 156, 19, -6.4F, 50.4472F, -64.4472F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 147, 16, -6.4F, 56.4472F, -58.4472F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 146, 20, -47.8F, -4.0F, 2.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 144, 19, -47.8F, -10.0F, -4.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 146, 26, -47.8F, -4.0F, -10.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 150, 23, -47.8F, 2.0F, -4.0F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 131, 16, -47.7F, 50.4472F, -52.4472F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 152, 22, -47.7F, 44.4472F, -58.4472F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 142, 20, -47.7F, 50.4472F, -64.4472F, 7, 8, 8, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 140, 16, -47.7F, 56.4472F, -58.4472F, 7, 8, 8, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 93, 206, -17.0F, -35.0F, -19.0F, 15, 4, 14, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 92, 214, -40.0F, -35.0F, -19.0F, 15, 4, 14, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 92, 208, -16.0F, -35.0F, 4.0F, 15, 4, 14, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 92, 217, -41.0F, -35.0F, 4.0F, 15, 4, 14, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 99, 211, -26.0F, -35.0F, 4.0F, 10, 4, 14, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-21.0F, -32.5F, -8.5F);
		setRotationAngle(bone35, -1.7453F, 0.0F, 0.0F);
		bone34.addChild(bone35);
		bone35.cubeList.add(new ModelBox(bone35, 108, 220, -19.0F, -3.4696F, -14.8473F, 15, 3, 13, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 108, 219, 4.0F, -3.4696F, -14.8473F, 15, 3, 13, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 94, 209, 5.0F, -26.1202F, -18.8412F, 15, 3, 13, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 107, 216, -20.0F, -26.1202F, -18.8412F, 15, 3, 13, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 99, 208, -5.0F, -26.1202F, -18.8412F, 10, 3, 13, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-20.0F, -15.1354F, -23.6676F);
		setRotationAngle(bone36, 2.0071F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 104, 236, -22.0F, -10.8F, -3.7F, 42, 6, 10, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 169, 241, 8.0F, -8.8F, -0.7F, 5, 8, 5, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 164, 492, 9.0F, -2.8F, 0.3F, 3, 3, 3, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 158, 248, 10.0F, 0.2F, -1.7F, 1, 1, 7, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 180, 243, 7.0F, 0.3F, 1.3F, 7, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 208, 243, 9.0F, 0.3F, 5.3F, 3, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 177, 241, 9.0F, 0.3F, -2.7F, 3, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 188, 240, 14.0F, 0.2F, 0.3F, 1, 1, 3, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 188, 240, 6.0F, 0.2F, 0.3F, 1, 1, 3, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 165, 249, 7.0F, 0.2F, 3.3F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 178, 241, 13.0F, 0.2F, 3.3F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 188, 241, 13.0F, 0.2F, -0.7F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 165, 251, 7.0F, 0.2F, -0.7F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 179, 241, 8.0F, 0.2F, 4.3F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 181, 240, 12.0F, 0.2F, 4.3F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 187, 244, 12.0F, 0.2F, -1.7F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 179, 241, 8.0F, 0.2F, -1.7F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 180, 243, 9.0F, 0.3F, 0.3F, 3, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 180, 243, 9.0F, 0.3F, 2.3F, 3, 1, 1, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.5F, 1.2F, 1.0F);
		setRotationAngle(bone37, 1.0123F, 0.0F, 0.0F);
		bone36.addChild(bone37);
		bone37.cubeList.add(new ModelBox(bone37, 163, 236, -5.0F, -9.6F, -26.9F, 7, 3, 14, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 155, 243, -5.0F, -10.6F, -3.9F, 7, 4, 10, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 166, 238, -5.0F, -10.6F, -12.9F, 7, 4, 9, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-1.5F, -6.1F, -8.9F);
		setRotationAngle(bone40, -0.2618F, 0.0F, 0.0F);
		bone37.addChild(bone40);
		bone40.cubeList.add(new ModelBox(bone40, 168, 240, -0.5F, -0.5F, -5.0F, 1, 1, 10, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-8.0F, -8.3354F, -26.8676F);
		setRotationAngle(bone39, -0.2618F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 188, 243, 2.2F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 188, 243, -1.8F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 188, 243, -5.8F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone41.addChild(bone43);
		bone43.cubeList.add(new ModelBox(bone43, 216, 35, -13.0F, -29.0F, -45.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 222, 44, -13.0F, -28.0F, -46.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 204, 52, -13.0F, -27.0F, -45.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 193, 60, -13.0F, -28.0F, -44.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 217, 43, -46.0F, -29.0F, -45.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 208, 52, -46.0F, -28.0F, -46.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 203, 59, -46.0F, -27.0F, -45.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 204, 62, -46.0F, -28.0F, -44.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 200, 60, -13.0F, -29.0F, 32.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 216, 56, -13.0F, -28.0F, 31.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 220, 49, -13.0F, -27.0F, 32.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 217, 51, -13.0F, -28.0F, 33.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 206, 55, -46.0F, -29.0F, 32.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 201, 55, -46.0F, -28.0F, 31.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 214, 54, -46.0F, -27.0F, 32.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 201, 58, -46.0F, -28.0F, 33.0F, 17, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 176, 71, -29.0F, -29.0F, 32.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 206, 52, -29.0F, -28.0F, 31.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 204, 40, -29.0F, -27.0F, 32.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 217, 44, -29.0F, -28.0F, 33.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 220, 43, -29.0F, -29.0F, -45.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 212, 52, -29.0F, -28.0F, -46.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 209, 48, -29.0F, -27.0F, -45.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 206, 59, -29.0F, -28.0F, -44.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 176, 71, -29.0F, -29.0F, -45.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 176, 71, -29.0F, -28.0F, -46.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 176, 71, -29.0F, -27.0F, -45.0F, 16, 2, 2, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 176, 71, -29.0F, -28.0F, -44.0F, 16, 2, 2, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(3.0F, -27.0F, -44.0F);
		setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
		bone43.addChild(bone44);
		bone44.cubeList.add(new ModelBox(bone44, 216, 38, -16.0F, -1.0F, -2.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 219, 54, -16.0F, -2.0F, -1.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 209, 57, -16.0F, -1.0F, 0.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 227, 38, -16.0F, 0.0F, -1.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 211, 59, -49.0F, -1.0F, -2.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 217, 51, -49.0F, -2.0F, -1.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 214, 59, -49.0F, -1.0F, 0.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 208, 51, -49.0F, 0.0F, -1.0F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 209, 54, -16.0F, -55.4472F, 52.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 206, 49, -16.0F, -56.4472F, 53.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 227, 44, -16.0F, -55.4472F, 54.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 209, 49, -16.0F, -54.4472F, 53.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 208, 55, -49.0F, -55.4472F, 52.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 205, 54, -49.0F, -56.4472F, 53.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 206, 51, -49.0F, -55.4472F, 54.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 208, 57, -49.0F, -54.4472F, 53.4472F, 17, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 214, 41, -32.0F, -56.4472F, 53.4472F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 220, 41, -32.0F, -55.4472F, 52.4472F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 206, 48, -32.0F, -54.4472F, 53.4472F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 212, 56, -32.0F, -55.4472F, 54.4472F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 208, 48, -32.0F, -2.0F, -1.0F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 204, 51, -32.0F, -1.0F, -2.0F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 206, 52, -32.0F, 0.0F, -1.0F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 209, 51, -32.0F, -1.0F, 0.0F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 176, 71, -32.0F, -2.0F, -1.0F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 176, 71, -32.0F, -1.0F, -2.0F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 176, 71, -32.0F, 0.0F, -1.0F, 16, 2, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 176, 71, -32.0F, -1.0F, 0.0F, 16, 2, 2, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-1.0F, 20.0F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 201, 11, -21.0F, -23.0F, -44.4F, 2, 2, 46, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 193, 11, -21.0F, -25.0F, -44.4F, 2, 2, 46, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 201, 17, -22.0F, -24.0F, -44.4F, 2, 2, 46, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 200, 14, -20.0F, -24.0F, -44.4F, 2, 2, 46, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 216, 30, -21.0F, -23.0F, 1.6F, 2, 2, 32, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 209, 35, -21.0F, -25.0F, 1.6F, 2, 2, 32, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 203, 12, -22.0F, -24.0F, 1.6F, 2, 2, 32, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 217, 30, -20.0F, -24.0F, 1.6F, 2, 2, 32, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-20.0F, -23.0F, -27.9F);
		setRotationAngle(bone45, 0.0F, 0.0F, 0.7854F);
		bone42.addChild(bone45);
		bone45.cubeList.add(new ModelBox(bone45, 201, 16, -1.0F, -2.0F, -16.5F, 2, 2, 46, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 201, 20, -2.0F, -1.0F, -16.5F, 2, 2, 46, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 200, 9, -1.0F, 0.0F, -16.5F, 2, 2, 46, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 200, 14, 0.0F, -1.0F, -16.5F, 2, 2, 46, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 195, 33, -1.0F, -2.0F, 29.5F, 2, 2, 32, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 211, 28, -2.0F, -1.0F, 29.5F, 2, 2, 32, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 208, 28, -1.0F, 0.0F, 29.5F, 2, 2, 32, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 211, 32, 0.0F, -1.0F, 29.5F, 2, 2, 32, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-48.1F, -44.1F, -31.1F);
		setRotationAngle(bone52, 0.0F, 0.3491F, 0.0F);
		bone51.addChild(bone52);
		bone52.cubeList.add(new ModelBox(bone52, 0, 0, -2.7588F, -1.5F, 0.4659F, 5, 3, 1, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 261, 236, -2.7588F, -1.5F, 1.5659F, 5, 3, 0, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(6.2F, -44.1F, -31.7F);
		setRotationAngle(bone53, 0.0F, -0.2618F, 0.0F);
		bone51.addChild(bone53);
		bone53.cubeList.add(new ModelBox(bone53, 0, 0, -2.2412F, -1.5F, 0.7659F, 5, 3, 1, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 261, 236, -2.2412F, -1.5F, 1.8659F, 5, 3, 0, 0.0F, false));

		head_lights = new ModelRenderer(this);
		head_lights.setRotationPoint(-21.0F, -16.5F, -56.0F);
		setRotationAngle(head_lights, 0.1222F, 0.0F, 0.0F);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.0F, 1.0F, -18.0F);
		setRotationAngle(bone55, 0.6632F, 0.0F, 0.0F);
		head_lights.addChild(bone55);
		bone55.cubeList.add(new ModelBox(bone55, 236, 184, 13.0F, 1.0F, -4.0F, 8, 1, 3, 0.0F, false));
		bone55.cubeList.add(new ModelBox(bone55, 236, 184, -21.0F, 1.0F, -4.0F, 8, 1, 3, 0.0F, false));

		head_lights_left = new ModelRenderer(this);
		head_lights_left.setRotationPoint(-21.0F, -16.5F, -56.0F);
		setRotationAngle(head_lights_left, 0.1222F, 0.0F, 0.0F);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, 1.0F, -18.0F);
		setRotationAngle(bone54, 0.6632F, 0.0F, 0.0F);
		head_lights_left.addChild(bone54);
		bone54.cubeList.add(new ModelBox(bone54, 441, 250, 21.0F, 1.0F, -4.0F, 1, 1, 3, 0.0F, false));

		head_lights_right = new ModelRenderer(this);
		head_lights_right.setRotationPoint(-21.0F, -16.5F, -56.0F);
		setRotationAngle(head_lights_right, 0.1222F, 0.0F, 0.0F);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, 1.0F, -18.0F);
		setRotationAngle(bone56, 0.6632F, 0.0F, 0.0F);
		head_lights_right.addChild(bone56);
		bone56.cubeList.add(new ModelBox(bone56, 442, 248, -22.0F, 1.0F, -4.0F, 1, 1, 3, 0.0F, false));

		plate = new ModelRenderer(this);
		plate.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(plate, -0.7854F, 0.0F, 0.0F);

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(-10.0F, -52.0F, 46.5F);
		setRotationAngle(bone77, -1.4835F, 0.0F, 0.0F);
		plate.addChild(bone77);

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(0.0F, 6.0F, -22.0F);
		setRotationAngle(bone78, -0.8727F, 0.0F, 0.0F);
		bone77.addChild(bone78);

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone79, 0.1571F, 0.0F, 0.0F);
		bone78.addChild(bone79);

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(-17.5F, -24.0F, -13.0F);
		setRotationAngle(bone80, 0.0F, 0.0F, 3.1416F);
		bone79.addChild(bone80);
		bone80.cubeList.add(new ModelBox(bone80, 77, 204, -22.5F, -3.4603F, 1.9073F, 9, 3, 1, 0.0F, false));

		interior = new ModelRenderer(this);
		interior.setRotationPoint(-20.0F, -15.1354F, -23.6676F);
		setRotationAngle(interior, 2.0071F, 0.0F, 0.0F);
		interior.cubeList.add(new ModelBox(interior, 97, 156, 15.0F, -5.5F, 3.3F, 4, 1, 2, 0.0F, false));
		interior.cubeList.add(new ModelBox(interior, 500, 251, 18.0F, -5.5F, 1.3F, 1, 1, 1, 0.0F, false));
		interior.cubeList.add(new ModelBox(interior, 444, 251, 16.0F, -5.5F, 1.3F, 1, 1, 1, 0.0F, false));
		interior.cubeList.add(new ModelBox(interior, 168, 222, 17.0F, -5.5F, -0.7F, 1, 1, 1, 0.0F, false));
		interior.cubeList.add(new ModelBox(interior, 223, 215, 4.0F, -5.5F, -0.7F, 1, 1, 1, 0.0F, false));
		interior.cubeList.add(new ModelBox(interior, 500, 249, 4.0F, -5.5F, 1.3F, 1, 1, 1, 0.0F, false));
		interior.cubeList.add(new ModelBox(interior, 352, 246, 4.0F, -5.5F, 4.3F, 2, 1, 1, 0.0F, false));
		interior.cubeList.add(new ModelBox(interior, 220, 209, -4.0F, -5.5F, -0.7F, 6, 1, 5, 0.0F, false));

		rear_lights = new ModelRenderer(this);
		rear_lights.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(rear_lights, -0.7854F, 0.0F, 0.0F);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-10.0F, -52.0F, 46.5F);
		setRotationAngle(bone58, -1.4835F, 0.0F, 0.0F);
		rear_lights.addChild(bone58);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, 6.0F, -22.0F);
		setRotationAngle(bone59, -0.8727F, 0.0F, 0.0F);
		bone58.addChild(bone59);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone60, 0.1571F, 0.0F, 0.0F);
		bone59.addChild(bone60);
		bone60.cubeList.add(new ModelBox(bone60, 429, 174, 18.0F, -22.7397F, -12.0927F, 3, 4, 1, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-17.5F, -24.0F, -13.0F);
		setRotationAngle(bone61, 0.0F, 0.0F, 3.1416F);
		bone60.addChild(bone61);
		bone61.cubeList.add(new ModelBox(bone61, 429, 174, 0.5F, -5.2603F, 0.9073F, 3, 4, 1, 0.0F, false));

		rear_lights_brake = new ModelRenderer(this);
		rear_lights_brake.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(rear_lights_brake, -0.7854F, 0.0F, 0.0F);

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-10.0F, -52.0F, 46.5F);
		setRotationAngle(bone57, -1.4835F, 0.0F, 0.0F);
		rear_lights_brake.addChild(bone57);

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.0F, 6.0F, -22.0F);
		setRotationAngle(bone62, -0.8727F, 0.0F, 0.0F);
		bone57.addChild(bone62);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone63, 0.1571F, 0.0F, 0.0F);
		bone62.addChild(bone63);
		bone63.cubeList.add(new ModelBox(bone63, 429, 174, 15.0F, -22.7397F, -12.0927F, 3, 4, 1, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 429, 174, -18.0F, -22.7397F, -12.0927F, 3, 4, 1, 0.0F, false));

		rear_lights_reverse = new ModelRenderer(this);
		rear_lights_reverse.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(rear_lights_reverse, -0.7854F, 0.0F, 0.0F);

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(-10.0F, -52.0F, 46.5F);
		setRotationAngle(bone65, -1.4835F, 0.0F, 0.0F);
		rear_lights_reverse.addChild(bone65);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(0.0F, 6.0F, -22.0F);
		setRotationAngle(bone66, -0.8727F, 0.0F, 0.0F);
		bone65.addChild(bone66);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone67, 0.1571F, 0.0F, 0.0F);
		bone66.addChild(bone67);
		bone67.cubeList.add(new ModelBox(bone67, 406, 230, 13.0F, -22.7397F, -12.0927F, 2, 4, 1, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 406, 230, -15.0F, -22.7397F, -12.0927F, 2, 4, 1, 0.0F, false));

		rear_lights_left = new ModelRenderer(this);
		rear_lights_left.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(rear_lights_left, -0.7854F, 0.0F, 0.0F);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-10.0F, -52.0F, 46.5F);
		setRotationAngle(bone69, -1.4835F, 0.0F, 0.0F);
		rear_lights_left.addChild(bone69);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(0.0F, 6.0F, -22.0F);
		setRotationAngle(bone70, -0.8727F, 0.0F, 0.0F);
		bone69.addChild(bone70);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone71, 0.1571F, 0.0F, 0.0F);
		bone70.addChild(bone71);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(-17.5F, -24.0F, -13.0F);
		setRotationAngle(bone72, 0.0F, 0.0F, 3.1416F);
		bone71.addChild(bone72);
		bone72.cubeList.add(new ModelBox(bone72, 441, 249, -40.5F, -5.2603F, 0.9073F, 2, 4, 1, 0.0F, false));

		rear_lights_right = new ModelRenderer(this);
		rear_lights_right.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(rear_lights_right, -0.7854F, 0.0F, 0.0F);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(-10.0F, -52.0F, 46.5F);
		setRotationAngle(bone73, -1.4835F, 0.0F, 0.0F);
		rear_lights_right.addChild(bone73);

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.0F, 6.0F, -22.0F);
		setRotationAngle(bone74, -0.8727F, 0.0F, 0.0F);
		bone73.addChild(bone74);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone75, 0.1571F, 0.0F, 0.0F);
		bone74.addChild(bone75);

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-17.5F, -24.0F, -13.0F);
		setRotationAngle(bone76, 0.0F, 0.0F, 3.1416F);
		bone75.addChild(bone76);
		bone76.cubeList.add(new ModelBox(bone76, 441, 252, 3.5F, -5.2603F, 0.9073F, 2, 4, 1, 0.0F, false));

		registerLightEntries(
				new LightControllerEntry<>(1.0F, head_lights, rear_lights),
				new LightControllerEntry<>(0.8F, interior),
				new LightControllerEntry<>(0.6F, plate),
				new BrakeLights<>(rear_lights_brake),
				new ReverseLights<>(rear_lights_reverse),
				new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, head_lights_right, rear_lights_right),
				new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left, rear_lights_left)
		);
	}

	@Override
	protected void renderModel() {
		GlStateManager.translate(21, 0, 0);
		bone.render(1.0F);
		bone2.render(1.0F);
		bone5.render(1.0F);
		bone7.render(1.0F);
		bone21.render(1.0F);
		bone34.render(1.0F);
		bone36.render(1.0F);
		bone39.render(1.0F);
		bone41.render(1.0F);
		bone42.render(1.0F);
		bone51.render(1.0F);
	}
}