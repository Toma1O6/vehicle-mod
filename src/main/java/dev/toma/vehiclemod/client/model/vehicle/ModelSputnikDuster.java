package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.*;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleSputnikDuster;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSputnikDuster extends ModelVehicle<VehicleSputnikDuster> {

    private final ModelRenderer bb_main;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone9;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone13;
    private final ModelRenderer bone12;
    private final ModelRenderer bone14;
    private final ModelRenderer bone41;
    private final ModelRenderer bone56;
    private final ModelRenderer bone55;
    private final ModelRenderer bone54;
    private final ModelRenderer bone40;
    private final ModelRenderer bone15;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone21;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone33;
    private final ModelRenderer bone32;
    private final ModelRenderer bone34;
    private final ModelRenderer bone35;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone29;
    private final ModelRenderer bone36;
    private final ModelRenderer bone39;
    private final ModelRenderer bone42;
    private final ModelRenderer bone44;
    private final ModelRenderer bone43;
    private final ModelRenderer bone45;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone53;
    private final ModelRenderer bone52;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer head_lights_a;
    private final ModelRenderer head_lights_b;
    private final ModelRenderer head_lights_left;
    private final ModelRenderer head_lights_right;
    private final ModelRenderer plate_a;
    private final ModelRenderer plate_b;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_lights_reverse;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer interier;

    public ModelSputnikDuster() {
        textureWidth = 512;
        textureHeight = 512;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, 21.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, 21.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -7.0F, 21.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -7.0F, -29.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, -29.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, -29.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, 19.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, 19.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -7.0F, 19.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -7.0F, -31.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, -31.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, -31.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -8.0F, 20.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -8.0F, 20.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -8.0F, 20.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -8.0F, -30.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -8.0F, -30.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -8.0F, -30.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -6.0F, 20.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -6.0F, 20.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -6.0F, 20.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -19.0F, -6.0F, -30.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -6.0F, -30.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -6.0F, -30.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -9.0F, -27.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -9.0F, 23.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -9.0F, 23.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -9.0F, -27.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -9.0F, -36.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -9.0F, 14.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -9.0F, 14.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -9.0F, -36.0F, 5, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -4.0F, -32.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -4.0F, 18.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -4.0F, 18.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -4.0F, -32.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -13.0F, -32.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -18.0F, -13.0F, 18.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -13.0F, 18.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 13.0F, -13.0F, -32.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 0.0F, -9.0F, -27.0F, 14, 3, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, 0.0F, -30.0F, -18.4F, 17, 2, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 137, 22, 0.0F, -32.0F, -17.9F, 14, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 137, 22, -14.0F, -32.0F, -17.9F, 14, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, 0.0F, -30.0F, 9.6F, 17, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, 14.0F, -26.0F, 29.6F, 3, 18, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 60, 24, 12.0F, -17.0F, 29.1F, 2, 9, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 60, 24, 0.0F, -17.0F, 29.7F, 12, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 50, 40, 0.0F, -15.0F, 30.0F, 12, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 50, 40, 0.0F, -12.0F, 30.0F, 12, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 60, 24, -12.0F, -17.0F, 29.7F, 12, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 50, 40, -12.0F, -15.0F, 30.0F, 12, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 50, 40, -12.0F, -12.0F, 30.0F, 12, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 60, 24, -14.0F, -17.0F, 29.1F, 2, 9, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 5.0F, -7.0F, -45.0F, 7, 1, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 12.0F, -7.0F, -45.0F, 6, 1, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -18.0F, -7.0F, -45.0F, 6, 1, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -7.0F, -21.0F, 3, 2, 22, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 18.0F, -6.0F, -19.0F, 1, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 141, 13, 17.0F, -7.0F, -19.0F, 1, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 0.0F, -9.0F, 1.0F, 14, 3, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 213, 16, 0.0F, -9.1F, 1.0F, 12, 1, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 213, 16, 12.0F, -9.1F, 1.0F, 2, 1, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 213, 16, -14.0F, -9.1F, 1.0F, 2, 1, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 213, 16, -12.0F, -9.1F, 1.0F, 12, 1, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 213, 16, -14.0F, -9.1F, -20.0F, 14, 1, 21, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 213, 16, 0.0F, -9.1F, -20.0F, 14, 1, 21, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 12.0F, -14.0F, 11.0F, 2, 7, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 330, 24, -13.0F, -14.1F, 6.0F, 26, 7, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 330, 24, -14.0F, -14.0F, -11.0F, 10, 7, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 330, 24, -2.0F, -16.0F, -9.0F, 3, 2, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 330, 24, -2.0F, -14.0F, -4.0F, 3, 4, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 330, 24, 3.0F, -14.0F, -11.0F, 10, 7, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -14.0F, -14.0F, 11.0F, 2, 7, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 141, 24, 13.5F, -7.6F, 32.1F, 5, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 141, 24, -18.5F, -7.6F, 32.1F, 5, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 24, 56, 13.0F, -8.0F, 29.0F, 6, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -7.0F, 1.0F, 3, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 18.0F, -6.0F, 1.0F, 1, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 148, 24, 17.0F, -7.0F, 1.0F, 1, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -14.0F, -9.0F, -27.0F, 14, 3, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, -4.0F, 3, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 36, -16.0F, -20.0F, -19.0F, 2, 13, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, -4.0F, 3, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 36, 14.0F, -20.0F, -19.0F, 2, 13, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 244, 44, 15.5F, -18.0F, -9.0F, 1, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 244, 44, -16.5F, -18.0F, -9.0F, 1, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 244, 44, 15.5F, -18.0F, 10.0F, 1, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 244, 44, -16.5F, -18.0F, 10.0F, 1, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 140, 12, 14.0F, -28.0F, -3.0F, 2, 8, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 140, 12, 14.0F, -28.0F, 16.0F, 2, 8, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 140, 12, -16.0F, -28.0F, -3.0F, 2, 8, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 140, 12, -16.0F, -28.0F, 16.0F, 2, 8, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, -21.0F, 3, 13, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, -21.0F, 3, 13, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, -23.0F, 3, 9, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, -23.0F, 3, 9, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, -25.0F, 3, 6, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, -25.0F, 3, 6, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 36, -16.0F, -20.0F, 0.0F, 2, 13, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -16.0F, -20.0F, 12.0F, 2, 9, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 228, 41, 5.6F, -5.7F, 30.1F, 7, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, 12.0F, 2, 9, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, 14.0F, 3, 7, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, 14.0F, 3, 7, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, 16.0F, 3, 6, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, 16.0F, 3, 6, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, 26.0F, 3, 8, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, 26.0F, 3, 8, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -20.0F, 29.0F, 3, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, 14.0F, -20.0F, 29.0F, 3, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 36, 14.0F, -20.0F, 0.0F, 2, 13, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, -17.0F, -30.0F, -18.4F, 17, 2, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, -17.0F, -30.0F, 9.6F, 17, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, -17.0F, -26.0F, 29.6F, 3, 18, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, -14.0F, -26.0F, 29.6F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 20, 28, 13.0F, -26.0F, 29.6F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -12.0F, -7.0F, -45.0F, 7, 1, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -7.0F, -21.0F, 3, 2, 22, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -19.0F, -6.0F, -19.0F, 1, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 136, 16, -18.0F, -7.0F, -19.0F, 1, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -14.0F, -9.0F, 1.0F, 14, 3, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 24, 56, -19.0F, -8.0F, 29.0F, 6, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 52, 36, -13.0F, -8.0F, 28.3F, 13, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 52, 36, -13.0F, -6.0F, 28.3F, 13, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 220, 35, -9.0F, -5.0F, 23.3F, 4, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 220, 35, -9.0F, -6.0F, 23.3F, 4, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 144, 24, -13.0F, -7.0F, 29.0F, 13, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 52, 36, 0.0F, -8.0F, 28.3F, 13, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 52, 36, 0.0F, -6.0F, 28.3F, 13, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 144, 24, 0.0F, -7.0F, 29.0F, 13, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -17.0F, -7.0F, 1.0F, 3, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -19.0F, -6.0F, 1.0F, 1, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 136, 16, -18.0F, -7.0F, 1.0F, 1, 2, 11, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(12.0F, 12.0F, 0.0F);
        setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -10.6066F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -10.6066F, 18.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, -10.6066F, 18.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, 24.7487F, -17.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 24.7487F, -17.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 24.7487F, -17.2635F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -11.6066F, 17.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -11.6066F, 17.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, -11.6066F, 17.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, 23.7487F, -18.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 23.7487F, -18.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 23.7487F, -18.2635F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -12.6066F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -12.6066F, 18.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, -12.6066F, 18.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, 22.7487F, -17.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 22.7487F, -17.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 22.7487F, -17.2635F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -11.6066F, 19.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -11.6066F, 19.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, -11.6066F, 19.0919F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -31.0F, 23.7487F, -16.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 23.7487F, -16.2635F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 23.7487F, -16.2635F, 16, 2, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-23.5F, 16.0F, -35.0F);
        setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -9.8284F, 2.6569F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -45.1838F, 38.0122F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -45.1838F, 38.0122F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -9.8284F, 2.6569F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -0.8284F, 2.6569F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -36.1838F, 38.0122F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -36.1838F, 38.0122F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -0.8284F, 2.6569F, 5, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -5.8284F, -1.3431F, 5, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -41.1838F, 34.0122F, 5, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -41.1838F, 34.0122F, 5, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -5.8284F, -1.3431F, 5, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -5.8284F, 7.6569F, 5, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 5.5F, -41.1838F, 43.0122F, 5, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -41.1838F, 43.0122F, 5, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 36.5F, -5.8284F, 7.6569F, 5, 6, 5, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 18.0F, 0.75F);
        setRotationAngle(bone, 0.0F, 0.0F, 0.7854F);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 18.0F, -2.25F);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, 2.25F, 2, 2, 20, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, -2.0F, 2.25F, 2, 2, 20, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 200, 17, -2.0F, -1.0F, 2.25F, 2, 2, 20, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, 2.25F, 2, 2, 20, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, -26.75F, 2, 2, 29, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 200, 17, -2.0F, -1.0F, -26.75F, 2, 2, 29, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, -2.0F, -26.75F, 2, 2, 29, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, -26.75F, 2, 2, 29, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 17.5F, 31.0F);
        setRotationAngle(bone5, 0.6981F, 0.0F, 0.0F);

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 14.0F, 29.5F);
        setRotationAngle(bone6, 0.6109F, 0.0F, 0.0F);

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, -14.7F, 0.3F);
        setRotationAngle(bone9, 0.5236F, 0.0F, 0.0F);
        bone6.addChild(bone9);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -11.7F, 0.3F);
        setRotationAngle(bone7, 0.2618F, 0.0F, 0.0F);
        bone6.addChild(bone7);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -11.7F, 0.3F);
        setRotationAngle(bone8, 0.2618F, 0.0F, 0.0F);
        bone6.addChild(bone8);

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, -1.3F, -29.0F);
        setRotationAngle(bone10, 0.2618F, 0.0F, 0.0F);

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, 4.3F, -27.1F);
        setRotationAngle(bone11, -0.6981F, 0.0F, 0.0F);
        bone10.addChild(bone11);

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, -3.3F, 19.1F);
        setRotationAngle(bone13, -0.4363F, 0.0F, 0.0F);
        bone11.addChild(bone13);

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 13.5F, -30.5F);
        setRotationAngle(bone12, 0.4363F, 0.0F, 0.0F);

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 7.0F, -33.0F);
        setRotationAngle(bone14, 0.0873F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -17.0F, -2.2924F, 8.1743F, 17, 5, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -17.0F, -2.2924F, -0.8257F, 3, 5, 8, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -14.0F, -1.9924F, -0.8257F, 14, 5, 8, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 136, 29, -14.0F, -1.6924F, 7.1743F, 14, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -17.0F, -2.2924F, -7.8257F, 3, 4, 7, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -14.0F, -1.9924F, -7.8257F, 14, 4, 7, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -17.0F, 1.7076F, -7.8257F, 7, 2, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -9.0F, -1.2924F, -10.8257F, 2, 5, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -16.0F, -2.2924F, 9.1743F, 16, 14, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 330, 72, -14.0F, -2.2924F, 12.1743F, 14, 6, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 77, 199, -13.3F, -1.2924F, 14.3743F, 3, 3, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 330, 72, 0.0F, -2.2924F, 12.1743F, 14, 6, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 330, 72, 7.0F, -2.2924F, 15.1743F, 3, 3, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 341, 142, -16.0F, 1.7076F, -7.8257F, 16, 8, 9, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 77, 58, -17.0F, 1.7076F, -7.8257F, 1, 8, 9, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 77, 58, 16.0F, 1.7076F, -7.8257F, 1, 8, 9, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 0.0F, -2.2924F, 8.1743F, 17, 5, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 14.0F, -2.2924F, -0.8257F, 3, 5, 8, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 0.0F, -1.9924F, -0.8257F, 14, 5, 8, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 136, 29, 0.0F, -1.6924F, 7.1743F, 14, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 14.0F, -2.2924F, 7.1743F, 3, 5, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, -17.0F, -2.2924F, 7.1743F, 3, 5, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 14.0F, -2.2924F, -7.8257F, 3, 4, 7, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 0.0F, -1.9924F, -7.8257F, 14, 4, 7, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 10.0F, 1.7076F, -7.8257F, 7, 2, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 41, 22, 0.0F, -1.2924F, -10.8257F, 7, 2, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 32, 13, 0.0F, -2.2924F, -9.8257F, 7, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 58, 28, 7.0F, -2.2924F, -10.8257F, 10, 1, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 41, 22, -7.0F, -1.2924F, -10.8257F, 7, 2, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 32, 13, -7.0F, -2.2924F, -9.8257F, 7, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 78, 34, -17.0F, -2.2924F, -10.8257F, 10, 1, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 7.0F, -1.2924F, -10.8257F, 2, 5, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 36, 36, 0.0F, -2.2924F, 9.1743F, 16, 14, 3, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 341, 142, 0.0F, 1.7076F, -7.8257F, 16, 8, 9, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, -2.1924F, 7.1743F);
        setRotationAngle(bone41, 0.4363F, 0.0F, 0.0F);
        bone14.addChild(bone41);
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, -13.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, -11.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, -9.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, -7.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, -5.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, -3.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, -1.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, 0.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, 2.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, 4.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, 6.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, 8.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, 10.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 224, 45, 12.5F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));

        bone56 = new ModelRenderer(this);
        bone56.setRotationPoint(-5.75F, 0.7076F, 15.1743F);
        setRotationAngle(bone56, -0.5236F, 0.0F, 0.0F);
        bone14.addChild(bone56);
        bone56.cubeList.add(new ModelBox(bone56, 330, 72, -4.25F, -1.0F, -1.0F, 4, 4, 2, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 330, 72, -0.25F, -1.0F, -1.0F, 5, 4, 2, 0.0F, false));

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(8.5F, -0.7924F, 17.591F);
        setRotationAngle(bone55, 0.0873F, 0.0F, 0.0F);
        bone14.addChild(bone55);
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, -2.5F, 1.6F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, -3.5F, -1.4F, -0.6167F, 1, 3, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, -2.5F, -2.4F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, -1.5F, -3.4F, -0.6167F, 3, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, 1.5F, -2.4F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, 2.5F, -1.4F, -0.6167F, 1, 3, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, 1.5F, 1.6F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, -1.5F, 2.6F, -0.6167F, 3, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, -0.5F, -2.4F, -0.6167F, 1, 5, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, 0.5F, -0.4F, -0.6167F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 338, 53, -2.5F, -0.4F, -0.6167F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 330, 72, -0.5F, -0.4F, -1.6167F, 1, 1, 1, 0.0F, false));

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(8.0F, 9.2076F, 14.6743F);
        setRotationAngle(bone54, 0.6981F, 0.0F, 0.0F);
        bone14.addChild(bone54);
        bone54.cubeList.add(new ModelBox(bone54, 330, 72, 2.0F, -2.5F, -0.5F, 2, 5, 1, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 330, 72, -1.0F, -2.5F, -0.5F, 2, 5, 1, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 330, 72, -4.0F, -2.5F, -0.5F, 2, 5, 1, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, -1.7924F, -10.3257F);
        setRotationAngle(bone40, -0.7854F, 0.0F, 0.0F);
        bone14.addChild(bone40);
        bone40.cubeList.add(new ModelBox(bone40, 155, 27, 5.5F, -0.4F, 0.1F, 1, 1, 1, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 155, 27, 3.5F, -0.4F, 0.1F, 1, 1, 1, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 155, 27, 1.5F, -0.4F, 0.1F, 1, 1, 1, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 155, 27, -0.5F, -0.4F, 0.1F, 1, 1, 1, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 155, 27, -2.5F, -0.4F, 0.1F, 1, 1, 1, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 155, 27, -4.5F, -0.4F, 0.1F, 1, 1, 1, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 155, 27, -6.5F, -0.4F, 0.1F, 1, 1, 1, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 12.5F, -43.0F);
        setRotationAngle(bone15, -0.0873F, 0.0F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, 7.0F, -1.8924F, -0.6743F, 10, 4, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, -7.0F, 3.1076F, -0.6743F, 14, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 224, 45, -4.5F, 4.1076F, -1.0743F, 9, 3, 1, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, 0.0F, -6.8924F, -0.6743F, 17, 1, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, -17.0F, -1.8924F, -0.6743F, 10, 4, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, -17.0F, 4.1076F, -0.6743F, 10, 1, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, 7.0F, 4.1076F, -0.6743F, 10, 1, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, 7.0F, 2.1076F, -0.6743F, 1, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, -8.0F, 2.1076F, -0.6743F, 1, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, -17.0F, 2.1076F, -0.6743F, 1, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, 16.0F, 2.1076F, -0.6743F, 1, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 141, 18, 9.0F, 2.1076F, -0.0743F, 2, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 141, 18, 13.0F, 2.1076F, -0.0743F, 2, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 141, 18, -15.0F, 2.1076F, -0.0743F, 2, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 141, 18, -11.0F, 2.1076F, -0.0743F, 2, 2, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 36, 36, -17.0F, -6.8924F, -0.6743F, 17, 1, 5, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(-5.5F, 1.1076F, 0.2257F);
        setRotationAngle(bone37, 0.0F, 0.0F, 0.7854F);
        bone15.addChild(bone37);
        bone37.cubeList.add(new ModelBox(bone37, 251, 32, 0.5F, -9.0F, -0.5F, 1, 12, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 251, 32, 2.5F, -11.0F, -0.5F, 1, 12, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 251, 32, 4.5F, -13.0F, -0.5F, 1, 12, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 251, 32, 6.5F, -12.0F, -0.5F, 1, 9, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 251, 32, 8.5F, -10.0F, -0.5F, 1, 5, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 251, 32, -1.5F, -7.0F, -0.5F, 1, 9, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 251, 32, -3.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(7.0F, -7.5F, 0.0F);
        setRotationAngle(bone38, 0.0F, 0.0F, -1.5708F);
        bone37.addChild(bone38);
        bone38.cubeList.add(new ModelBox(bone38, 251, 32, 2.5F, -4.5F, -0.5F, 1, 5, 1, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 251, 32, 0.5F, -6.5F, -0.5F, 1, 9, 1, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 251, 32, -1.5F, -8.5F, -0.5F, 1, 12, 1, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 251, 32, -3.5F, -10.5F, -0.5F, 1, 12, 1, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 251, 32, -5.5F, -12.5F, -0.5F, 1, 13, 1, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 251, 32, -7.5F, -10.5F, -0.5F, 1, 8, 1, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 251, 32, -9.5F, -8.5F, -0.5F, 1, 4, 1, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 5.0F, -23.0F);
        setRotationAngle(bone16, -0.5236F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 36, 36, -17.0F, -11.8F, -1.5F, 3, 13, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 36, 36, 14.0F, -11.8F, -1.5F, 3, 13, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 36, 36, 0.0F, -11.8F, -1.5F, 14, 1, 1, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 138, 18, 0.0F, -10.8F, -1.5F, 14, 1, 1, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 36, 36, -14.0F, -11.8F, -1.5F, 14, 1, 1, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 138, 18, -14.0F, -10.8F, -1.5F, 14, 1, 1, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, -4.5F, 30.6F);
        setRotationAngle(bone17, 0.6109F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 20, 28, -17.0F, -1.3F, -2.6F, 3, 4, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 20, 28, 14.0F, -1.3F, -2.6F, 3, 4, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 20, 28, 0.0F, -1.3F, -2.6F, 14, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 140, 20, 0.0F, -0.3F, -2.6F, 14, 2, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 60, 32, 0.0F, 1.7F, -2.6F, 14, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 20, 28, -14.0F, -1.3F, -2.6F, 14, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 140, 20, -14.0F, -0.3F, -2.6F, 14, 2, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 60, 32, -14.0F, 1.7F, -2.6F, 14, 1, 2, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 10.5F, 13.0F);
        setRotationAngle(bone19, -0.5236F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 36, 36, 14.9F, 1.5F, 0.4F, 3, 6, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 36, 36, -17.9F, 1.5F, 0.4F, 3, 6, 2, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 10.5F, 13.0F);
        setRotationAngle(bone20, -0.5236F, 0.0F, 0.0F);

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, -1.0F, 1.4F);
        setRotationAngle(bone22, -0.3491F, 0.0F, 0.0F);
        bone20.addChild(bone22);
        bone22.cubeList.add(new ModelBox(bone22, 36, 36, -17.9F, -2.3F, -0.1F, 3, 5, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 36, 36, 14.9F, -2.3F, -0.1F, 3, 5, 2, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, -1.0F, 1.4F);
        setRotationAngle(bone23, -0.3491F, 0.0F, 0.0F);
        bone20.addChild(bone23);

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, -4.8F, 0.9F);
        setRotationAngle(bone21, -0.6981F, 0.0F, 0.0F);
        bone23.addChild(bone21);
        bone21.cubeList.add(new ModelBox(bone21, 36, 36, -17.9F, -5.4F, 0.8F, 3, 8, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 36, 36, -17.9F, 43.6F, 0.8F, 3, 9, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 36, 36, 14.9F, 43.6F, 0.8F, 3, 9, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 36, 36, 14.9F, -5.4F, 0.8F, 3, 8, 2, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, 39.6F, 1.8F);
        setRotationAngle(bone30, -0.6981F, 0.0F, 0.0F);
        bone21.addChild(bone30);
        bone30.cubeList.add(new ModelBox(bone30, 36, 36, 14.9F, -4.3F, 1.8F, 3, 8, 2, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 36, 36, -17.9F, -4.3F, 1.8F, 3, 8, 2, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, 39.6F, 1.8F);
        setRotationAngle(bone31, -0.6981F, 0.0F, 0.0F);
        bone21.addChild(bone31);

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, -5.3F, 2.8F);
        setRotationAngle(bone33, -0.4363F, 0.0F, 0.0F);
        bone31.addChild(bone33);
        bone33.cubeList.add(new ModelBox(bone33, 36, 36, -17.9F, -2.4F, -0.5F, 3, 4, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 36, 36, 14.9F, -2.4F, -0.5F, 3, 4, 2, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone31.addChild(bone32);

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, 53.6F, 1.8F);
        setRotationAngle(bone34, 0.8727F, 0.0F, 0.0F);
        bone21.addChild(bone34);
        bone34.cubeList.add(new ModelBox(bone34, 36, 36, -17.9F, -1.4F, 0.1F, 3, 6, 2, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 36, 36, 14.9F, -1.4F, 0.1F, 3, 6, 2, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, 6.6F, 1.1F);
        setRotationAngle(bone35, 0.4189F, 0.0F, 0.0F);
        bone34.addChild(bone35);
        bone35.cubeList.add(new ModelBox(bone35, 36, 36, 14.9F, -2.3F, -0.1F, 3, 4, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 36, 36, -17.9F, -2.3F, -0.1F, 3, 4, 2, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, -4.8F, 0.9F);
        setRotationAngle(bone24, -0.6981F, 0.0F, 0.0F);
        bone23.addChild(bone24);

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, -6.9F, 1.8F);
        setRotationAngle(bone25, -0.5236F, 0.0F, 0.0F);
        bone24.addChild(bone25);
        bone25.cubeList.add(new ModelBox(bone25, 36, 36, -17.9F, -3.2F, -0.1F, 3, 5, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 36, 36, 14.9F, -3.2F, -0.1F, 3, 5, 2, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.0F, -5.7F, 0.9F);
        setRotationAngle(bone26, -0.6981F, 0.0F, 0.0F);
        bone25.addChild(bone26);
        bone26.cubeList.add(new ModelBox(bone26, 36, 36, -17.9F, -2.4F, 0.8F, 3, 5, 2, 0.0F, false));
        bone26.cubeList.add(new ModelBox(bone26, 36, 36, 14.9F, -2.4F, 0.8F, 3, 5, 2, 0.0F, false));

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(16.0F, -5.7435F, 39.822F);
        setRotationAngle(bone27, 0.0F, -1.5708F, 0.0F);
        bone27.cubeList.add(new ModelBox(bone27, 202, 6, -8.0F, 16.7435F, 13.978F, 5, 2, 2, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 202, 6, -8.0F, 17.7435F, 14.978F, 5, 2, 2, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 202, 6, -8.0F, 16.7435F, 15.978F, 5, 2, 2, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 202, 6, -8.0F, 15.7435F, 14.978F, 5, 2, 2, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 142, 6, -9.0F, 14.7435F, 17.978F, 5, 6, 5, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 142, 6, -9.0F, 10.7435F, 12.978F, 5, 6, 6, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 142, 6, -9.0F, 14.7435F, 8.978F, 5, 6, 5, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 142, 6, -9.0F, 19.7435F, 12.978F, 5, 5, 6, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(-5.5F, 18.045F, 15.3618F);
        setRotationAngle(bone28, -0.7854F, 0.0F, 0.0F);
        bone27.addChild(bone28);
        bone28.cubeList.add(new ModelBox(bone28, 202, 6, -2.5F, -0.6657F, -0.7343F, 5, 2, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 202, 6, -2.5F, -1.6657F, 0.2657F, 5, 2, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 202, 6, -2.5F, -2.6657F, -0.7343F, 5, 2, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 202, 6, -2.5F, -1.6657F, -1.7343F, 5, 2, 2, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(-6.5F, 17.7679F, 15.1821F);
        setRotationAngle(bone29, -0.7854F, 0.0F, 0.0F);
        bone27.addChild(bone29);
        bone29.cubeList.add(new ModelBox(bone29, 142, 6, -2.5F, 1.4343F, -2.4343F, 5, 5, 6, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 142, 6, -2.5F, -3.5657F, 2.5657F, 5, 6, 5, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 142, 6, -2.5F, -7.5657F, -2.4343F, 5, 5, 6, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 142, 6, -2.5F, -3.5657F, -6.4343F, 5, 6, 5, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(-0.375F, 17.7F, -39.55F);
        bone36.cubeList.add(new ModelBox(bone36, 136, 17, 11.875F, -0.5F, -5.75F, 7, 1, 8, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 136, 17, 4.875F, -0.5F, -5.75F, 7, 1, 15, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 136, 17, -12.125F, -0.5F, -5.75F, 8, 1, 15, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 136, 17, -18.125F, -0.5F, -5.75F, 6, 1, 8, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, -7.0F, -15.9F);
        setRotationAngle(bone39, -0.5236F, 0.0F, 0.0F);
        bone39.cubeList.add(new ModelBox(bone39, 18, 32, -13.0F, 0.45F, -1.367F, 13, 1, 3, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 18, 32, 0.0F, 0.45F, -1.367F, 13, 1, 3, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(-0.4F, -3.2F, 29.6F);
        setRotationAngle(bone44, 0.1745F, 0.0F, 0.0F);
        bone42.addChild(bone44);
        bone44.cubeList.add(new ModelBox(bone44, 228, 41, 14.0F, -2.5F, -0.1F, 5, 5, 1, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 228, 41, -18.0F, -2.5F, -0.1F, 5, 5, 1, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(-0.4F, -3.2F, -20.4F);
        setRotationAngle(bone45, 0.0873F, 0.0F, 0.0F);
        bone43.addChild(bone45);
        bone45.cubeList.add(new ModelBox(bone45, 228, 41, -18.0F, -2.5F, -0.2F, 5, 5, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 228, 41, 13.0F, -2.5F, -0.2F, 5, 5, 1, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.0F, -6.5F, -0.4F);
        setRotationAngle(bone46, 0.5236F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 136, 13, -0.5F, 4.5F, 6.0F, 1, 1, 14, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(18.5F, 4.5F, -23.5F);
        setRotationAngle(bone47, 0.0F, 0.0F, -0.6981F);
        bone47.cubeList.add(new ModelBox(bone47, 154, 18, -2.5F, -0.5F, 1.5F, 4, 1, 1, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(-19.0F, 4.5F, -23.5F);
        setRotationAngle(bone48, 0.0F, 0.0F, 0.6981F);
        bone48.cubeList.add(new ModelBox(bone48, 154, 18, -1.0F, -0.8F, 1.5F, 4, 1, 1, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(20.0F, 2.5F, -21.35F);
        setRotationAngle(bone49, 0.0F, -0.1745F, 0.0F);
        bone49.cubeList.add(new ModelBox(bone49, 394, 197, -1.5F, -1.0F, -0.25F, 3, 2, 1, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 36, 36, -2.0F, -1.5F, -1.35F, 4, 3, 2, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(-20.0F, 2.5F, -21.6F);
        setRotationAngle(bone50, 0.0F, 0.2618F, 0.0F);
        bone50.cubeList.add(new ModelBox(bone50, 36, 36, -2.0F, -1.5F, -0.7F, 4, 3, 2, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 394, 197, -1.5F, -1.0F, 0.4F, 3, 2, 1, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(-0.3333F, 6.0F, 3.1667F);

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(0.3333F, 0.0F, 11.3333F);
        setRotationAngle(bone53, -0.1745F, 0.0F, 0.0F);
        bone51.addChild(bone53);
        bone53.cubeList.add(new ModelBox(bone53, 330, 24, -13.0F, -4.0F, -1.5F, 26, 9, 3, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(-0.1667F, 0.0F, -5.6667F);
        setRotationAngle(bone52, -0.2618F, 0.0F, 0.0F);
        bone51.addChild(bone52);
        bone52.cubeList.add(new ModelBox(bone52, 330, 24, -13.0F, -4.0F, -1.5F, 9, 9, 3, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 330, 24, 4.0F, -4.0F, -1.5F, 9, 9, 3, 0.0F, false));

        bone57 = new ModelRenderer(this);
        bone57.setRotationPoint(-0.5F, 7.7778F, -12.1111F);
        setRotationAngle(bone57, -0.1745F, 0.0F, 0.0F);
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -2.5F, 4.2222F, -7.8889F, 5, 4, 20, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -1.5F, 3.2222F, -2.8889F, 3, 1, 5, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -0.5F, 2.2222F, -0.8889F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -0.5F, 1.2222F, -0.8889F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -0.5F, 0.2222F, -0.8889F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -1.5F, 0.2222F, -0.8889F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -0.5F, 0.2222F, 0.1111F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, 0.5F, 0.2222F, -0.8889F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 330, 24, -0.5F, 0.2222F, -1.8889F, 1, 1, 1, 0.0F, false));

        bone58 = new ModelRenderer(this);
        bone58.setRotationPoint(-7.0F, 20.5F, 26.8F);
        setRotationAngle(bone58, 0.0873F, 0.0F, 0.0F);
        bone58.cubeList.add(new ModelBox(bone58, 236, 44, -1.0F, -0.9F, -0.5F, 1, 1, 7, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 236, 44, 0.0F, -0.9F, -0.5F, 1, 1, 7, 0.0F, false));

        head_lights_a = new ModelRenderer(this);
        head_lights_a.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 393, 212, -13.0F, -31.5F, -18.0F, 2, 1, 1, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 393, 212, -9.0F, -31.5F, -18.0F, 2, 1, 1, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 393, 212, -5.0F, -31.5F, -18.0F, 2, 1, 1, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 393, 212, -1.0F, -31.5F, -18.0F, 2, 1, 1, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 393, 212, 3.0F, -31.5F, -18.0F, 2, 1, 1, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 393, 212, 7.0F, -31.5F, -18.0F, 2, 1, 1, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 393, 212, 11.0F, -31.5F, -18.0F, 2, 1, 1, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 390, 195, 7.9F, -17.8F, -43.2F, 8, 5, 3, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 387, 196, -15.9F, -17.8F, -43.2F, 8, 5, 3, 0.0F, false));

        head_lights_b = new ModelRenderer(this);
        head_lights_b.setRotationPoint(0.0F, 12.5F, -43.0F);
        setRotationAngle(head_lights_b, -0.0873F, 0.0F, 0.0F);
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, -16.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, 9.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, -14.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, 11.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, -12.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, 13.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, -10.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));
        head_lights_b.cubeList.add(new ModelBox(head_lights_b, 397, 214, 15.5F, -1.3924F, -0.7743F, 1, 1, 1, 0.0F, false));

        head_lights_left = new ModelRenderer(this);
        head_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_left.cubeList.add(new ModelBox(head_lights_left, 445, 247, 15.9F, -17.8F, -43.2F, 1, 5, 3, 0.0F, false));
        head_lights_left.cubeList.add(new ModelBox(head_lights_left, 445, 250, 16.3F, -18.0F, -27.0F, 1, 1, 1, 0.0F, false));

        head_lights_right = new ModelRenderer(this);
        head_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 445, 247, -16.9F, -17.8F, -43.2F, 1, 5, 3, 0.0F, false));
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 445, 250, -17.3F, -18.0F, -27.0F, 1, 1, 1, 0.0F, false));

        plate_a = new ModelRenderer(this);
        plate_a.setRotationPoint(0.0F, 12.5F, -43.0F);
        setRotationAngle(plate_a, -0.0873F, 0.0F, 0.0F);
        plate_a.cubeList.add(new ModelBox(plate_a, 356, 168, -4.0F, 4.5893F, -1.1096F, 8, 2, 1, 0.0F, false));

        plate_b = new ModelRenderer(this);
        plate_b.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate_b.cubeList.add(new ModelBox(plate_b, 345, 179, 6.1F, -5.2F, 30.2F, 6, 2, 1, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 428, 176, -17.0F, -7.1F, 32.2F, 2, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 428, 176, 15.0F, -7.1F, 32.2F, 2, 1, 1, 0.0F, false));

        rear_lights_reverse = new ModelRenderer(this);
        rear_lights_reverse.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 425, 212, -15.0F, -7.1F, 32.2F, 1, 1, 1, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 425, 212, 14.0F, -7.1F, 32.2F, 1, 1, 1, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 440, 248, -18.0F, -7.1F, 32.2F, 1, 1, 1, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 440, 248, 17.0F, -7.1F, 32.2F, 1, 1, 1, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 436, 182, -2.0F, -28.1F, 29.7F, 5, 1, 1, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 7.0F, -33.0F);
        setRotationAngle(interier, 0.0873F, 0.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 180, 222, 12.0F, -1.2924F, 14.2743F, 1, 2, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 192, 222, 4.0F, -1.2924F, 14.2743F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 225, 219, 3.0F, -1.2924F, 14.2743F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 240, 182, 2.5F, 0.1076F, 14.2743F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 202, 225, 2.5F, 1.5076F, 14.2743F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 170, 219, 3.5F, 0.1076F, 14.2743F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 344, 252, 3.5F, 1.5076F, 14.2743F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 197, 212, 12.0F, 0.7076F, 14.2743F, 1, 2, 1, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, head_lights_a, rear_lights),
                new LightControllerEntry<>(0.6F, head_lights_b, interier, plate_a, plate_b),
                new BrakeLights<>(rear_lights_brake),
                new ReverseLights<>(rear_lights_reverse),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, head_lights_right, rear_lights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left, rear_lights_left)
        );
    }

    @Override
    protected void renderModel() {
        bb_main.render(1.0F);
        bone2.render(1.0F);
        bone3.render(1.0F);
        bone.render(1.0F);
        bone4.render(1.0F);
        bone5.render(1.0F);
        bone6.render(1.0F);
        bone10.render(1.0F);
        bone12.render(1.0F);
        bone14.render(1.0F);
        bone15.render(1.0F);
        bone16.render(1.0F);
        bone17.render(1.0F);
        bone18.render(1.0F);
        bone19.render(1.0F);
        bone20.render(1.0F);
        bone27.render(1.0F);
        bone36.render(1.0F);
        bone39.render(1.0F);
        bone42.render(1.0F);
        bone43.render(1.0F);
        bone46.render(1.0F);
        bone47.render(1.0F);
        bone48.render(1.0F);
        bone49.render(1.0F);
        bone50.render(1.0F);
        bone51.render(1.0F);
        bone57.render(1.0F);
        bone58.render(1.0F);
    }
}
