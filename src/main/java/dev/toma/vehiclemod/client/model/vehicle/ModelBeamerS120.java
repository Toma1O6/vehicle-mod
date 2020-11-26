package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleBeamerS120;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class ModelBeamerS120 extends ModelVehicle<VehicleBeamerS120> {

	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone21;
	private final ModelRenderer bone34;
	private final ModelRenderer bone36;
	private final ModelRenderer bone39;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone51;

	public ModelBeamerS120() {
		textureWidth = 512;
		textureHeight = 512;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-19.0F, -5.0F, -8.0F);


		ModelRenderer bone6 = new ModelRenderer(this);
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

		ModelRenderer bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.5F, -30.5F, -12.5F);
		bone6.addChild(bone11);
		setRotationAngle(bone11, -0.4363F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 2, 51, -24.5F, -1.5F, -0.5F, 25, 3, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 51, 0.5F, -1.5F, -0.5F, 23, 3, 1, 0.0F, false));

		ModelRenderer bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -19.0F, 41.0F);
		bone11.addChild(bone15);
		setRotationAngle(bone15, 1.2566F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 2, 51, -24.5F, -0.5F, 0.5F, 25, 6, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 2, 51, 0.5F, -0.5F, 0.5F, 23, 6, 1, 0.0F, false));

		ModelRenderer bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 1.5F, -1.0F);
		bone11.addChild(bone28);
		setRotationAngle(bone28, -0.2618F, 0.0F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 400, 142, -23.5F, -2.0F, 0.5F, 24, 4, 1, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 400, 140, 0.5F, -2.0F, 0.5F, 22, 4, 1, 0.0F, false));

		ModelRenderer bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 17, 54, 0.5F, 21.7F, -5.8F, 21, 4, 1, 0.0F, false));
		bone33.cubeList.add(new ModelBox(bone33, 17, 54, -21.5F, 21.7F, -5.8F, 22, 4, 1, 0.0F, false));

		ModelRenderer bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.5F, -30.5F, 24.5F);
		bone6.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 2, 51, 0.5F, -1.5F, -8.5F, 23, 3, 17, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 2, 51, -24.5F, -1.5F, -8.5F, 25, 3, 17, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-11.0F, -5.0F, -40.0F);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 2, 51, -10.0F, -11.0F, -5.0F, 25, 5, 15, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 51, -35.0F, -11.0F, -5.0F, 25, 5, 15, 0.0F, false));

		ModelRenderer bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-10.0F, -52.0F, 46.5F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -1.4835F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, -25.0F, 4.7888F, -2.9298F, 25, 4, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, 0.0F, 4.7888F, -2.9298F, 25, 4, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, 0.0F, 62.7888F, 46.0702F, 25, 4, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 51, -25.0F, 62.7888F, 46.0702F, 25, 4, 15, 0.0F, false));

		ModelRenderer bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 6.0F, -22.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, -0.8727F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -17.0F, -0.5F, 25, 4, 15, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -17.0F, -0.5F, 25, 4, 15, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -17.0F, -13.5F, 25, 4, 19, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -17.0F, -13.5F, 25, 4, 19, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, 0.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 51, -25.0F, -19.0F, 74.5F, 25, 6, 16, 0.0F, false));

		ModelRenderer bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(bone20);
		setRotationAngle(bone20, 0.1571F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, -25.0F, -25.0F, -11.5F, 20, 10, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, 6.0F, -25.0F, -11.5F, 19, 10, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 429, 174, 14.0F, -22.7397F, -12.0927F, 9, 4, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 201, 36, -1.0F, -28.3F, -12.7F, 27, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 227, 35, -9.0F, -28.3F, -12.7F, 10, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 225, 40, -14.0F, -28.3F, -12.7F, 2, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 230, 41, -26.0F, -28.3F, -12.7F, 9, 4, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 260, 36, -17.0F, -26.3F, -12.7F, 8, 2, 7, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, -5.0F, -25.0F, -11.5F, 11, 1, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 2, 51, -5.0F, -20.0F, -11.5F, 11, 4, 6, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 48, 47, -5.0F, -24.0F, -10.6F, 11, 4, 6, 0.0F, false));

		ModelRenderer bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-17.5F, -24.0F, -13.0F);
		bone20.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, 3.1416F);
		bone25.cubeList.add(new ModelBox(bone25, 429, 174, -4.5F, -5.2603F, 0.9073F, 9, 4, 1, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 77, 204, -22.5F, -3.0603F, 0.9073F, 9, 2, 1, 0.0F, false));

		ModelRenderer bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-19.5F, 10.5F, 15.5F);
		bone20.addChild(bone27);
		setRotationAngle(bone27, 0.2618F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, -0.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 38.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 6.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 13.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 31.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 79, 200, 24.5F, -1.5F, -1.0F, 1, 2, 3, 0.0F, false));

		ModelRenderer bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, -14.0F, -11.0F);
		bone20.addChild(bone31);
		setRotationAngle(bone31, -0.6981F, 0.0F, 0.0F);
		bone31.cubeList.add(new ModelBox(bone31, 49, 56, -24.0F, -2.0F, -1.5F, 24, 3, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 49, 56, 0.0F, -2.0F, -1.5F, 24, 3, 1, 0.0F, false));

		ModelRenderer bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-13.0F, -27.7F, -9.7F);
		bone20.addChild(bone47);
		setRotationAngle(bone47, -0.0873F, 0.0F, 0.0F);
		bone47.cubeList.add(new ModelBox(bone47, 152, 240, 1.5F, -1.0F, -5.0F, 2, 2, 12, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 152, 240, -3.5F, -1.0F, -5.0F, 2, 2, 12, 0.0F, false));

		ModelRenderer bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(bone48);
		setRotationAngle(bone48, -0.1745F, 0.0F, 0.0F);
		bone48.cubeList.add(new ModelBox(bone48, 167, 501, -4.0F, -2.0F, 4.0F, 8, 3, 10, 0.0F, false));

		ModelRenderer bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.5F, -13.0F, 83.5F);
		bone4.addChild(bone30);
		setRotationAngle(bone30, -0.7854F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, -19.5F, -12.0F, 6.0F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, 12.7F, -12.0F, 6.0F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, -19.5F, -9.0F, 3.6F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, 12.5F, -9.0F, 3.6F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, -19.5F, -6.1F, 1.3F, 7, 2, 4, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 156, 244, 12.5F, -6.1F, 1.3F, 7, 2, 4, 0.0F, false));

		ModelRenderer bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, -12.0F, 7.0F);
		bone4.addChild(bone46);
		setRotationAngle(bone46, -0.4363F, 0.0F, 0.0F);


		ModelRenderer bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 64.7888F, 66.5702F);
		bone3.addChild(bone24);
		setRotationAngle(bone24, -0.8727F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 2, 51, -25.0F, 2.0F, -7.5F, 25, 4, 15, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 2, 51, 0.0F, 2.0F, -7.5F, 25, 4, 15, 0.0F, false));

		ModelRenderer bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-10.0F, -63.0F, 55.5F);
		bone2.addChild(bone16);
		setRotationAngle(bone16, 0.0873F, 0.0F, 0.0F);
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

		ModelRenderer bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-43.5F, -45.5F, -22.5F);
		bone5.addChild(bone10);
		setRotationAngle(bone10, 0.8901F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, -1.5F, -7.5F, -13.5F, 3, 3, 27, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, 43.5F, -7.5F, -13.5F, 3, 3, 27, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, 43.5F, -7.5F, -13.5F, 3, 3, 27, 0.0F, false));

		ModelRenderer bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone12);
		setRotationAngle(bone12, 0.6109F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, 43.5F, 18.5F, -4.5F, 3, 3, 21, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -1.5F, 18.5F, -4.5F, 3, 3, 21, 0.0F, false));

		ModelRenderer bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(22.5F, 44.0F, 6.0F);
		bone12.addChild(bone17);
		setRotationAngle(bone17, -0.0175F, 0.0F, 0.0F);
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

		ModelRenderer bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-23.5F, 26.5F, -10.5F);
		bone17.addChild(bone23);
		setRotationAngle(bone23, 0.8727F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 0, 0, -1.5F, -2.0F, -4.0F, 3, 4, 8, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 0, 0, 45.5F, -2.0F, -5.0F, 3, 4, 8, 0.0F, false));

		ModelRenderer bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(22.5F, 51.0F, 47.0F);
		bone10.addChild(bone14);
		setRotationAngle(bone14, 1.5882F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 20, 22, 15.0F, -7.5F, -10.5F, 9, 3, 34, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 20, 22, -24.0F, -7.5F, -10.5F, 9, 3, 34, 0.0F, false));

		ModelRenderer bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.2618F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 39, 39, -21.1F, -6.5F, -13.5F, 9, 1, 31, 0.0F, false));

		ModelRenderer bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.5F, -6.0F, -35.0F);
		bone18.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -0.5236F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 39, 39, 31.0F, -0.5F, 16.5F, 9, 1, 31, 0.0F, false));

		ModelRenderer bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(bone38);
		setRotationAngle(bone38, 0.0175F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 18, 50, -21.0F, -7.1F, -10.5F, 3, 3, 34, 0.0F, false));
		bone38.cubeList.add(new ModelBox(bone38, 18, 50, 18.0F, -7.1F, -10.5F, 3, 3, 34, 0.0F, false));

		ModelRenderer bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(22.0F, -6.0F, 23.5F);
		bone10.addChild(bone32);
		setRotationAngle(bone32, -0.4363F, 0.0F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 154, 238, -0.5F, 5.5F, -5.0F, 1, 1, 16, 0.0F, false));

		ModelRenderer bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(47.0F, -5.0F, -8.0F);
		bone10.addChild(bone49);
		setRotationAngle(bone49, 0.0F, 0.6109F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 0, 0, 0.139F, -0.7229F, -2.9845F, 1, 1, 5, 0.0F, false));

		ModelRenderer bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-2.0F, -6.0F, -9.0F);
		bone10.addChild(bone50);
		setRotationAngle(bone50, 0.0F, -0.6109F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -0.139F, 0.2771F, -1.9845F, 1, 1, 5, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-21.0F, -16.5F, -56.0F);
		setRotationAngle(bone7, 0.1222F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -25.0F, 0.5F, -15.0F, 25, 5, 20, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, 0.5F, -15.0F, 25, 5, 20, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -25.0F, 0.5F, -15.0F, 4, 10, 15, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 21.0F, 0.5F, -15.0F, 4, 10, 15, 0.0F, false));

		ModelRenderer bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 1.0F, -18.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.6632F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -25.0F, 1.5F, -7.0F, 25, 9, 10, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, 0.0F, 1.5F, -7.0F, 25, 9, 10, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 236, 184, 13.0F, 1.0F, -4.0F, 8, 1, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 236, 184, -21.0F, 1.0F, -4.0F, 8, 1, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 442, 248, -22.0F, 1.0F, -4.0F, 1, 1, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 441, 250, 21.0F, 1.0F, -4.0F, 1, 1, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 233, 148, -2.0F, 0.9F, -5.0F, 4, 1, 3, 0.0F, false));

		ModelRenderer bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, 0.4363F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -25.0F, -1.5F, -10.0F, 25, 10, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, -1.5F, -10.0F, 25, 10, 3, 0.0F, false));

		ModelRenderer bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -1.0F, -10.5F);
		bone9.addChild(bone29);
		setRotationAngle(bone29, -0.5236F, 0.0F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 195, 32, 0.0F, 0.5F, -1.5F, 26, 1, 6, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 198, 32, -26.0F, 0.5F, -1.5F, 26, 1, 6, 0.0F, false));

		ModelRenderer bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.5F, -5.0F);
		bone7.addChild(bone26);
		setRotationAngle(bone26, -0.1222F, 0.0F, 0.0F);
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

		ModelRenderer bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(2.5F, -27.0F, 33.0F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
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

		ModelRenderer bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-21.0F, -32.5F, -8.5F);
		bone34.addChild(bone35);
		setRotationAngle(bone35, -1.7453F, 0.0F, 0.0F);
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
		bone36.cubeList.add(new ModelBox(bone36, 97, 156, 15.0F, -5.5F, 3.3F, 4, 1, 2, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 500, 251, 18.0F, -5.5F, 1.3F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 444, 251, 16.0F, -5.5F, 1.3F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 168, 222, 17.0F, -5.5F, -0.7F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 223, 215, 4.0F, -5.5F, -0.7F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 500, 249, 4.0F, -5.5F, 1.3F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 352, 246, 4.0F, -5.5F, 4.3F, 2, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 220, 209, -4.0F, -5.5F, -0.7F, 6, 1, 5, 0.0F, false));

		ModelRenderer bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.5F, 1.2F, 1.0F);
		bone36.addChild(bone37);
		setRotationAngle(bone37, 1.0123F, 0.0F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 163, 236, -5.0F, -9.6F, -26.9F, 7, 3, 14, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 155, 243, -5.0F, -10.6F, -3.9F, 7, 4, 10, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 166, 238, -5.0F, -10.6F, -12.9F, 7, 4, 9, 0.0F, false));

		ModelRenderer bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-1.5F, -6.1F, -8.9F);
		bone37.addChild(bone40);
		setRotationAngle(bone40, -0.2618F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 168, 240, -0.5F, -0.5F, -5.0F, 1, 1, 10, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-8.0F, -8.3354F, -26.8676F);
		setRotationAngle(bone39, -0.2618F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 188, 243, 2.2F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 188, 243, -1.8F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 188, 243, -5.8F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, 24.0F, 0.0F);


		ModelRenderer bone43 = new ModelRenderer(this);
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

		ModelRenderer bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(3.0F, -27.0F, -44.0F);
		bone43.addChild(bone44);
		setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
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

		ModelRenderer bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-20.0F, -23.0F, -27.9F);
		bone42.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 0.0F, 0.7854F);
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


		ModelRenderer bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-48.1F, -44.1F, -31.1F);
		bone51.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.3491F, 0.0F);
		bone52.cubeList.add(new ModelBox(bone52, 0, 0, -2.7588F, -1.5F, 0.4659F, 5, 3, 1, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 261, 236, -2.7588F, -1.5F, 1.5659F, 5, 3, 0, 0.0F, false));

		ModelRenderer bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(6.2F, -44.1F, -31.7F);
		bone51.addChild(bone53);
		setRotationAngle(bone53, 0.0F, -0.2618F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 0, 0, -2.2412F, -1.5F, 0.7659F, 5, 3, 1, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 261, 236, -2.2412F, -1.5F, 1.8659F, 5, 3, 0, 0.0F, false));
	}

	@Override
	public void renderModel() {
		GlStateManager.translate(21, 0, 0);
		bone.render(1f);
		bone2.render(1f);
		bone5.render(1f);
		bone7.render(1f);
		bone21.render(1f);
		bone34.render(1f);
		bone36.render(1f);
		bone39.render(1f);
		bone41.render(1f);
		bone42.render(1f);
		bone51.render(1f);
	}
}