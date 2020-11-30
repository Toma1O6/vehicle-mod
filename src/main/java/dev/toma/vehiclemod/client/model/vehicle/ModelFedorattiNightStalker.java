package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.*;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiNightStalker;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFedorattiNightStalker extends ModelVehicle<VehicleFedorattiNightStalker> {

    private final ModelRenderer bb_main;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone33;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone55;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer bone43;
    private final ModelRenderer bone31;
    private final ModelRenderer bone34;
    private final ModelRenderer bone48;
    private final ModelRenderer bone42;
    private final ModelRenderer bone46;
    private final ModelRenderer bone45;
    private final ModelRenderer bone47;
    private final ModelRenderer bone44;
    private final ModelRenderer bone32;
    private final ModelRenderer bone35;
    private final ModelRenderer bone40;
    private final ModelRenderer bone62;
    private final ModelRenderer bone68;
    private final ModelRenderer bone69;
    private final ModelRenderer bone70;
    private final ModelRenderer bone67;
    private final ModelRenderer bone66;
    private final ModelRenderer bone65;
    private final ModelRenderer bone64;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer bone60;
    private final ModelRenderer bone61;
    private final ModelRenderer bone39;
    private final ModelRenderer bone41;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone53;
    private final ModelRenderer bone52;
    private final ModelRenderer bone56;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone59;
    private final ModelRenderer bone63;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer rear_lights_reverse;
    private final ModelRenderer head_lights;
    private final ModelRenderer head_lights_left;
    private final ModelRenderer head_lights_right;
    private final ModelRenderer plate;
    private final ModelRenderer interier_a;
    private final ModelRenderer interier_b;
    private final ModelRenderer interier_c;

    public ModelFedorattiNightStalker() {
        textureWidth = 512;
        textureHeight = 512;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, -29.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, 19.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, -29.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, 19.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, -29.0F, 2, 2, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, 19.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, -29.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, 19.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -7.0F, 32.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -7.0F, 32.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, 32.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -29.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -7.0F, -29.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -7.0F, -29.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -7.0F, 30.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -7.0F, 30.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, 30.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -31.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -7.0F, -31.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -7.0F, -31.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -8.0F, 31.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -8.0F, 31.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -8.0F, 31.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -8.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -8.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -8.0F, -30.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -6.0F, 31.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -6.0F, 31.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -6.0F, 31.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -6.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -6.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -6.0F, -30.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, -27.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, 34.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, 34.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, -27.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, -36.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, 25.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, 25.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, -36.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -4.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -4.0F, 29.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -4.0F, 29.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -4.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -13.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -13.0F, 29.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -13.0F, 29.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -13.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -5.0F, -8.0F, 15, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 226, 37, -4.0F, -11.5F, -40.2F, 8, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -5.0F, -31.0F, 15, 3, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 348, 28, 12.5F, -12.0F, -30.0F, 2, 7, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 348, 28, -14.5F, -12.0F, -30.0F, 2, 7, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 9.0F, -15.0F, -26.0F, 6, 3, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 141, 9, 8.0F, -15.0F, -26.0F, 1, 4, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 141, 9, -9.0F, -15.0F, -26.0F, 1, 4, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -15.0F, -10.0F, 15, 10, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -21.0F, -10.0F, 2, 6, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -21.0F, -10.0F, 2, 6, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 9.0F, -15.0F, -31.0F, 6, 10, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 141, 9, 8.0F, -15.0F, -31.0F, 1, 11, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 141, 9, -9.0F, -15.0F, -31.0F, 1, 11, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 27, 14.0F, -12.2F, -40.6F, 1, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -5.0F, 1.0F, 15, 3, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -14.3F, 16.1F, 2, 10, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.5F, -14.3F, 16.1F, 2, 10, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -9.5F, 18.1F, 15, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -9.5F, 20.1F, 15, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -9.5F, 22.1F, 15, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -9.5F, 24.1F, 15, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -5.0F, -8.0F, 15, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -5.0F, -31.0F, 15, 3, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -15.0F, -26.0F, 6, 3, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 160, 22, 13.7F, -12.0F, -13.0F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 160, 22, 13.7F, -12.0F, -15.0F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 160, 22, 13.7F, -12.0F, -17.0F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 160, 22, 13.7F, -12.0F, -19.0F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 160, 22, 13.7F, -12.0F, -21.0F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 132, 18, -8.0F, -14.7F, -14.0F, 16, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 132, 18, -8.0F, -14.7F, -22.0F, 16, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 132, 18, -8.0F, -14.7F, -18.0F, 16, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 132, 18, -8.0F, -14.7F, -26.0F, 16, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 132, 18, -8.0F, -14.7F, -30.0F, 16, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -15.0F, -10.0F, 15, 10, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -15.0F, -11.0F, 6, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 9.0F, -15.0F, -11.0F, 6, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 155, 27, 0.0F, -15.0F, -11.0F, 9, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 155, 27, -9.0F, -15.0F, -11.0F, 9, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -15.0F, -31.0F, 6, 10, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 160, 14, -11.0F, -17.1F, -35.6F, 1, 4, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 160, 14, 10.0F, -17.1F, -35.6F, 1, 4, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -11.0F, -34.0F, 12, 4, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -4.0F, -34.0F, 12, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -7.0F, -34.0F, 3, 3, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 3.0F, -7.0F, -34.0F, 3, 3, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 328, 45, -2.5F, -7.0F, -33.0F, 5, 3, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 341, 26, -2.2F, -6.5F, -37.0F, 2, 2, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 341, 26, 0.2F, -6.5F, -37.0F, 2, 2, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 27, -15.0F, -12.2F, -40.6F, 1, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 27, -7.0F, -12.2F, -40.6F, 1, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 27, 6.0F, -12.2F, -40.6F, 1, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 155, 22, 7.0F, -11.7F, -40.4F, 7, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 155, 22, -14.0F, -11.7F, -40.4F, 7, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -5.0F, 1.0F, 15, 3, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -14.3F, 18.1F, 1, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 14.0F, -14.3F, 18.1F, 1, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -14.3F, 16.1F, 2, 10, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.5F, -14.3F, 16.1F, 2, 10, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -9.5F, 18.1F, 15, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -9.5F, 20.1F, 15, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -9.5F, 22.1F, 15, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -9.5F, 24.1F, 15, 5, 2, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(12.0F, 12.0F, 0.0F);
        setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -18.3848F, 25.8701F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -18.3848F, 25.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -18.3848F, 25.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 24.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 24.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -22.0F, 24.7487F, -17.2635F, 20, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -19.3848F, 24.8701F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -19.3848F, 24.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -19.3848F, 24.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 23.7487F, -18.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 23.7487F, -18.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -22.0F, 23.7487F, -18.2635F, 20, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -20.3848F, 25.8701F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -20.3848F, 25.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -20.3848F, 25.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 22.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 22.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -22.0F, 22.7487F, -17.2635F, 20, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -19.3848F, 26.8701F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -19.3848F, 26.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -19.3848F, 26.8701F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 23.7487F, -16.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 23.7487F, -16.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -22.0F, 23.7487F, -16.2635F, 20, 2, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-23.5F, 16.0F, -35.0F);
        setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -9.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -52.9619F, 45.7904F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -52.9619F, 45.7904F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -9.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -0.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -43.9619F, 45.7904F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -43.9619F, 45.7904F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -0.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -5.8284F, -1.3431F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -48.9619F, 41.7904F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -48.9619F, 41.7904F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -5.8284F, -1.3431F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -5.8284F, 7.6569F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -48.9619F, 50.7904F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -48.9619F, 50.7904F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -5.8284F, 7.6569F, 4, 6, 5, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 18.0F, 0.75F);
        setRotationAngle(bone, 0.0F, 0.0F, 0.7854F);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 18.0F, -2.25F);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, 22.25F, 2, 2, 12, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, -2.0F, 21.25F, 2, 2, 13, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 200, 17, -2.0F, -1.0F, 21.25F, 2, 2, 13, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, 22.25F, 2, 2, 12, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, -26.75F, 2, 2, 19, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 200, 17, -2.0F, -1.0F, -26.75F, 2, 2, 20, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, -2.0F, -26.75F, 2, 2, 20, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, -26.75F, 2, 2, 19, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 19.5F, -18.0F);
        setRotationAngle(bone5, -1.5708F, 0.0F, 0.0F);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -19.0F, 0.5F, 0.0F, 4, 1, 4, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -19.0F, -60.5F, 0.0F, 4, 1, 4, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 15.0F, 0.5F, 0.0F, 4, 1, 4, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 15.0F, -60.5F, 0.0F, 4, 1, 4, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 19.5F, -18.0F);
        setRotationAngle(bone6, -1.5708F, 0.0F, 0.0F);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone7, 0.1745F, 0.0F, 0.0F);
        bone6.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 15.0F, -0.3F, -0.9F, 4, 1, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 15.0F, -60.3733F, 9.6925F, 4, 1, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -19.0F, -0.3F, -0.9F, 4, 1, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -19.0F, -60.3733F, 9.6925F, 4, 1, 2, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone8, 0.2618F, 0.0F, 0.0F);
        bone6.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 15.0F, -0.4F, -2.8F, 4, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 15.0F, -59.3215F, 12.988F, 4, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -19.0F, -0.4F, -2.8F, 4, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -19.0F, -59.3215F, 12.988F, 4, 1, 2, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone9, 0.4363F, 0.0F, 0.0F);
        bone6.addChild(bone9);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 15.0F, -0.9F, -4.7F, 4, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 16.0F, -56.1848F, 21.0797F, 3, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 15.0F, -56.1848F, 21.0797F, 1, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -19.0F, -0.9F, -4.7F, 4, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -19.0F, -56.1848F, 21.0797F, 4, 1, 2, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone10, 0.6109F, 0.0F, 0.0F);
        bone6.addChild(bone10);
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 15.0F, -1.7F, -6.4F, 4, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 16.0F, -51.6683F, 28.5882F, 3, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 15.0F, -51.6683F, 28.5882F, 1, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -19.0F, -1.7F, -6.4F, 4, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -19.0F, -51.6683F, 28.5882F, 4, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -15.0F, -51.6683F, 28.5882F, 1, 3, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 14.0F, -51.6683F, 28.5882F, 1, 3, 2, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, -50.9505F, 29.6618F);
        setRotationAngle(bone33, -0.1222F, 0.0F, 0.0F);
        bone10.addChild(bone33);

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone11, 0.8727F, 0.0F, 0.0F);
        bone6.addChild(bone11);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 15.0F, -3.3F, -7.7F, 4, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 16.0F, -42.51F, 39.0287F, 3, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 15.0F, -42.51F, 39.0287F, 1, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -19.0F, -3.3F, -7.7F, 4, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -19.0F, -42.51F, 39.0287F, 4, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -15.0F, -42.51F, 39.0287F, 1, 3, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 14.0F, -42.51F, 39.0287F, 1, 3, 2, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone12, 1.0472F, 0.0F, 0.0F);
        bone6.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 15.0F, -4.6F, -9.0F, 4, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 15.0F, -35.1F, 43.8275F, 4, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -19.0F, -4.6F, -9.0F, 4, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -19.0F, -35.1F, 43.8275F, 4, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -15.0F, -35.1F, 43.8275F, 1, 3, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 14.0F, -35.1F, 43.8275F, 1, 3, 2, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone13, 1.2217F, 0.0F, 0.0F);
        bone6.addChild(bone13);
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 15.0F, -6.1F, -10.0F, 4, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 15.0F, -26.9632F, 47.3212F, 4, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -19.0F, -6.1F, -10.0F, 4, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -19.0F, -26.9632F, 47.3212F, 4, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -15.0F, -26.9632F, 47.3212F, 1, 3, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 14.0F, -26.9632F, 47.3212F, 1, 3, 2, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone14, 1.3963F, 0.0F, 0.0F);
        bone6.addChild(bone14);
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, 15.0F, -7.8F, -10.8F, 4, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, 15.0F, -18.3925F, 49.2733F, 4, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, -19.0F, -7.8F, -10.8F, 4, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, -19.0F, -18.3925F, 49.2733F, 4, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, -15.0F, -18.3925F, 49.2733F, 1, 3, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, 14.0F, -18.3925F, 49.2733F, 1, 3, 2, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone15, 1.5708F, 0.0F, 0.0F);
        bone6.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, 15.0F, -9.6F, -11.3F, 4, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, 15.0F, -9.6F, 49.7F, 4, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -19.0F, -9.6F, -11.3F, 4, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -19.0F, -9.6F, 49.7F, 4, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -15.0F, -9.6F, 49.7F, 1, 3, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, 14.0F, -9.6F, 49.7F, 1, 3, 2, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone16, 1.7453F, 0.0F, 0.0F);
        bone6.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, 15.0F, -11.4F, -11.3F, 4, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, 15.0F, -0.8075F, 48.7733F, 4, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -19.0F, -11.4F, -11.3F, 4, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -19.0F, -0.8075F, 48.7733F, 4, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -15.0F, -0.8075F, 48.7733F, 1, 3, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, 14.0F, -0.8075F, 48.7733F, 1, 3, 2, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone17, 1.9199F, 0.0F, 0.0F);
        bone6.addChild(bone17);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 15.0F, -13.2F, -11.1F, 4, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 15.0F, 7.6632F, 46.2212F, 4, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -19.0F, -13.2F, -11.1F, 4, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -19.0F, 7.6632F, 46.2212F, 4, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -15.0F, 7.6632F, 46.2212F, 1, 3, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 14.0F, 7.6632F, 46.2212F, 1, 3, 2, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone18, 2.0944F, 0.0F, 0.0F);
        bone6.addChild(bone18);
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 15.0F, -14.9F, -10.6F, 4, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 15.0F, 15.6F, 42.2275F, 4, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -19.0F, -14.9F, -10.6F, 4, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -19.0F, 15.6F, 42.2275F, 4, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -15.0F, 15.6F, 42.2275F, 1, 3, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 14.0F, 15.6F, 42.2275F, 1, 3, 2, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone19, 2.2689F, 0.0F, 0.0F);
        bone6.addChild(bone19);
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, 15.0F, -16.5F, -9.8F, 4, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, 15.0F, 22.71F, 36.9287F, 4, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, -19.0F, -16.5F, -9.8F, 4, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, -19.0F, 22.71F, 36.9287F, 4, 1, 2, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone20, 2.5307F, 0.0F, 0.0F);
        bone6.addChild(bone20);
        bone20.cubeList.add(new ModelBox(bone20, 0, 0, 15.0F, -18.5F, -7.1F, 4, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 0, 0, 15.0F, 31.4683F, 27.8882F, 4, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 0, 0, -19.0F, -18.5F, -7.1F, 4, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 0, 0, -19.0F, 31.4683F, 27.8882F, 4, 1, 2, 0.0F, false));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone21, 2.7227F, 0.0F, 0.0F);
        bone6.addChild(bone21);
        bone21.cubeList.add(new ModelBox(bone21, 0, 0, 15.0F, -19.5F, -5.3F, 4, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 0, 0, 15.0F, 36.2263F, 19.5109F, 4, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 0, 0, -19.0F, -19.5F, -5.3F, 4, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 0, 0, -19.0F, 36.2263F, 19.5109F, 4, 1, 2, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone22, 2.8972F, 0.0F, 0.0F);
        bone6.addChild(bone22);
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, 15.0F, -20.1F, -3.8F, 4, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, 15.0F, 39.088F, 10.9572F, 4, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, -19.0F, -20.1F, -3.8F, 4, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, -15.0F, -20.1F, -3.8F, 1, 6, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, 14.0F, -20.1F, -3.8F, 1, 6, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, -19.0F, 39.088F, 10.9572F, 4, 1, 2, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone23, 2.9845F, 0.0F, 0.0F);
        bone6.addChild(bone23);
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, 15.0F, -20.4F, -3.9F, 4, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, 15.0F, 39.849F, 5.6425F, 4, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, -19.0F, -20.4F, -3.9F, 4, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, -15.0F, -20.4F, -3.9F, 1, 6, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, 14.0F, -20.4F, -3.9F, 1, 6, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, -19.0F, 39.849F, 5.6425F, 4, 1, 2, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, 1.0F, -1.0F);
        setRotationAngle(bone24, -3.1241F, 0.0F, 0.0F);
        bone6.addChild(bone24);
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, 15.0F, -20.8001F, -4.3122F, 4, 1, 4, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, 15.0F, 40.1907F, -5.3646F, 4, 1, 4, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, -19.0F, -20.8F, -4.3F, 4, 1, 4, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, -15.0F, -20.8F, -4.3F, 1, 6, 4, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, 14.0F, -20.8F, -4.3F, 1, 6, 4, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, -19.0F, 40.1907F, -5.3646F, 4, 1, 4, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 17.0F, -36.5F);
        setRotationAngle(bone25, -0.9599F, 0.0F, 0.0F);
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, 6.0F, -5.2F, -4.5F, 9, 7, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 138, 18, 7.0F, -6.2F, -2.5F, 6, 7, 8, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 138, 18, -13.0F, -6.2F, -2.5F, 6, 7, 8, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, 6.0F, -5.2F, -2.5F, 1, 7, 8, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, 13.0F, -5.2F, -2.5F, 1, 7, 8, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, -14.0F, -5.2F, -2.5F, 1, 7, 8, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 155, 27, -5.0F, -0.8F, 4.5F, 1, 2, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 155, 27, -2.0F, -0.8F, 4.5F, 1, 2, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 155, 27, 1.0F, -0.8F, 4.5F, 1, 2, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 155, 27, 4.0F, -0.8F, 4.5F, 1, 2, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, -15.0F, -5.2F, -4.5F, 9, 7, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, -7.0F, -5.2F, -2.5F, 1, 7, 8, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.0F, 17.0F, -36.5F);
        setRotationAngle(bone26, -0.9599F, 0.0F, 0.0F);

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0F, 13.35F, -36.0F);
        setRotationAngle(bone27, 0.2618F, 0.0F, 0.0F);
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, 6.0F, 1.85F, -1.0F, 9, 3, 7, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, -15.0F, 1.85F, -1.0F, 9, 3, 7, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.0F, -0.35F, 1.0F);
        setRotationAngle(bone28, 0.0175F, 0.0F, 0.0F);
        bone27.addChild(bone28);
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, 0.0F, -2.5F, -5.0F, 15, 4, 10, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -15.0F, -2.5F, -5.0F, 15, 4, 10, 0.0F, false));

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(0.0F, -2.0F, -3.5F);
        setRotationAngle(bone55, -0.5236F, 0.0F, 0.0F);
        bone28.addChild(bone55);
        bone55.cubeList.add(new ModelBox(bone55, 142, 14, 0.5F, -0.5F, -0.5F, 14, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 142, 14, -14.5F, -0.5F, -0.5F, 15, 1, 1, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(0.0F, 12.5F, -21.8333F);
        setRotationAngle(bone29, 0.0524F, 0.0F, 0.0F);
        bone29.cubeList.add(new ModelBox(bone29, 342, 163, -8.0F, -1.2F, -8.9667F, 16, 3, 5, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 345, 144, 0.0F, -1.2F, -3.9667F, 8, 3, 15, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 345, 144, -8.0F, -1.2F, -3.9667F, 8, 3, 15, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, 17.0F, 35.5F);
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, -15.0F, 1.0F, -11.5F, 15, 4, 18, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, -14.0F, 1.0F, 7.5F, 14, 2, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, 0.0F, 1.0F, 7.5F, 15, 2, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, -15.0F, 0.0F, 5.9F, 15, 1, 4, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, -15.0F, 1.0F, 5.9F, 1, 3, 4, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, -14.0F, 3.0F, 5.9F, 28, 1, 4, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 138, 22, 0.0F, 1.5F, 8.1F, 14, 1, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 138, 22, -14.0F, 1.5F, 8.1F, 14, 1, 1, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, 0.0F, 1.0F, -11.5F, 15, 4, 18, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, 0.0F, 0.0F, 5.9F, 15, 1, 4, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, 14.0F, 1.0F, 5.9F, 1, 3, 4, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 4.0F, 9.9F);
        setRotationAngle(bone43, -0.0873F, 0.0F, 0.0F);
        bone30.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 137, 18, 0.0F, -0.1F, -3.0F, 16, 2, 4, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 137, 18, -16.0F, -0.1F, -3.0F, 16, 2, 4, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, 0.0F, 1.5F);
        setRotationAngle(bone31, -0.192F, 0.0F, 0.0F);
        bone30.addChild(bone31);

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, -1.8F, -23.5F);
        setRotationAngle(bone34, 0.0873F, 0.0F, 0.0F);
        bone31.addChild(bone34);
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, -15.0F, -1.5F, 4.7F, 2, 5, 7, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, 13.0F, -1.5F, 4.7F, 2, 5, 7, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, 0.0F, -1.5F, 8.7F, 13, 5, 2, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, 0.0F, -1.2F, 10.7F, 13, 5, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, -13.0F, -1.5F, 8.7F, 13, 5, 2, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, -13.0F, -1.2F, 10.7F, 13, 5, 1, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(0.0F, -1.1F, 11.2F);
        setRotationAngle(bone48, -0.3665F, 0.0F, 0.0F);
        bone34.addChild(bone48);
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, -12.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, -10.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, -8.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, -6.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, -4.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, -2.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, -0.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, 1.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, 3.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, 5.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, 7.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, 9.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 226, 24, 11.5F, -0.1F, -0.7F, 1, 1, 1, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, -1.8F, -0.5F);
        setRotationAngle(bone42, 0.0698F, 0.0F, 0.0F);
        bone31.addChild(bone42);
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -3.3F, -11.5F, 15, 6, 17, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -3.3F, -11.5F, 15, 6, 17, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.0F, -2.8F, 5.6F);
        bone42.addChild(bone46);
        bone46.cubeList.add(new ModelBox(bone46, 0, 0, -15.0F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 0, 0, 6.0F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(0.0F, -0.9F, 6.0F);
        setRotationAngle(bone45, 0.1745F, 0.0F, 0.0F);
        bone42.addChild(bone45);
        bone45.cubeList.add(new ModelBox(bone45, 141, 18, -14.0F, -2.0F, -0.6F, 7, 4, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 141, 18, 7.0F, -2.0F, -0.6F, 7, 4, 1, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, -6.2F, -9.9F);
        setRotationAngle(bone47, 0.3491F, 0.0F, 0.0F);
        bone45.addChild(bone47);
        bone47.cubeList.add(new ModelBox(bone47, 238, 10, 16.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 238, 10, -17.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(0.0F, -1.3F, 7.0F);
        setRotationAngle(bone44, 0.5236F, 0.0F, 0.0F);
        bone42.addChild(bone44);
        bone44.cubeList.add(new ModelBox(bone44, 0, 0, -15.0F, -2.2F, -3.0F, 1, 5, 3, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 0, 0, 14.0F, -2.2F, -3.0F, 1, 5, 3, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 0, 0, 6.0F, -2.2F, -3.0F, 1, 5, 3, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 0, 0, -7.0F, -2.2F, -3.0F, 1, 5, 3, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 13, 9, -6.0F, -2.2F, -3.5F, 12, 5, 3, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 225, 152, -1.0F, -1.2F, -3.2F, 2, 2, 3, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(-14.5F, 15.5F, -16.5F);
        bone32.cubeList.add(new ModelBox(bone32, 160, 22, -0.2F, -3.5F, -4.5F, 1, 7, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 160, 22, -0.2F, -3.5F, -2.5F, 1, 7, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 160, 22, -0.2F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 160, 22, -0.2F, -3.5F, 1.5F, 1, 7, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 160, 22, -0.2F, -3.5F, 3.5F, 1, 7, 1, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, 14.0F, 3.3333F);
        setRotationAngle(bone35, -0.0349F, 0.0F, 0.0F);
        bone35.cubeList.add(new ModelBox(bone35, 0, 0, -13.0F, -4.8F, -8.1333F, 1, 11, 17, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 146, 26, -13.5F, -2.8F, -6.1333F, 1, 1, 3, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 146, 26, 12.5F, -2.8F, -6.1333F, 1, 1, 3, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 0, 0, -14.0F, -4.8F, 8.8667F, 2, 10, 5, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 314, 0, -12.0F, -4.5F, 8.5667F, 11, 5, 6, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 314, 0, -8.5F, -4.5F, 6.5667F, 3, 2, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 314, 0, -12.0F, -4.5F, 14.5667F, 11, 5, 5, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, 2.0F, -0.5F, 8.5667F, 10, 1, 6, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, 9.0F, -3.5F, 8.5667F, 3, 3, 6, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 320, 2, 5.0F, -3.5F, 8.4667F, 4, 3, 5, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 263, 22, 6.5F, -3.2F, 8.3667F, 1, 1, 1, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, 2.0F, -3.5F, 8.5667F, 3, 3, 6, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, 2.0F, -4.5F, 8.5667F, 10, 1, 6, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, -1.0F, -0.5F, 8.5667F, 3, 1, 6, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, -1.0F, -3.5F, 9.1667F, 3, 3, 5, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, -1.0F, -4.5F, 8.5667F, 3, 1, 6, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, 2.0F, -4.5F, 14.5667F, 10, 5, 5, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 316, 0, -1.0F, -4.5F, 14.5667F, 3, 5, 5, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 0, 0, 12.0F, -4.8F, -8.1333F, 1, 11, 17, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 0, 0, 12.0F, -4.8F, 8.8667F, 2, 10, 5, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, 0.2F, -10.1333F);
        setRotationAngle(bone40, 0.0349F, 0.0F, 0.0F);
        bone35.addChild(bone40);
        bone40.cubeList.add(new ModelBox(bone40, 0, 0, 12.0F, -4.9F, -1.8F, 2, 10, 4, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 0, 0, -14.0F, -4.9F, -1.8F, 2, 10, 4, 0.0F, false));

        bone62 = new ModelRenderer(this);
        bone62.setRotationPoint(0.0F, -2.8F, -7.6333F);
        setRotationAngle(bone62, 0.1745F, 0.0F, 0.0F);
        bone35.addChild(bone62);
        bone62.cubeList.add(new ModelBox(bone62, 340, 0, 2.5F, -3.4F, -1.5F, 9, 8, 4, 0.0F, false));
        bone62.cubeList.add(new ModelBox(bone62, 340, 0, -11.5F, -3.4F, -1.5F, 9, 8, 4, 0.0F, false));

        bone68 = new ModelRenderer(this);
        bone68.setRotationPoint(0.0F, 3.2F, -3.1333F);
        setRotationAngle(bone68, 0.0349F, 0.0F, 0.0F);
        bone35.addChild(bone68);
        bone68.cubeList.add(new ModelBox(bone68, 347, 0, -11.5F, -2.0F, -6.0F, 9, 4, 12, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 347, 0, 2.5F, -2.0F, -6.0F, 9, 4, 12, 0.0F, false));

        bone69 = new ModelRenderer(this);
        bone69.setRotationPoint(0.0F, -0.5F, 4.0F);
        setRotationAngle(bone69, 0.0698F, 0.0F, 0.0F);
        bone68.addChild(bone69);
        bone69.cubeList.add(new ModelBox(bone69, 316, 2, -1.5F, -0.5F, -14.0F, 3, 4, 14, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 304, 5, -1.5F, -0.5F, 0.0F, 3, 5, 11, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 339, 10, -1.5F, -1.1F, 0.0F, 3, 1, 3, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 339, 10, -0.5F, -2.1F, 1.0F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 344, 0, -0.5F, -3.1F, 1.0F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 315, 26, -0.5F, -3.3F, 1.0F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 339, 10, -1.5F, -3.1F, 1.0F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 339, 10, 0.5F, -3.1F, 1.0F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 339, 10, -0.5F, -3.1F, 0.0F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 339, 10, -0.5F, -3.1F, 2.0F, 1, 1, 1, 0.0F, false));

        bone70 = new ModelRenderer(this);
        bone70.setRotationPoint(0.0F, -1.0F, 0.0F);
        setRotationAngle(bone70, 0.1745F, 0.0F, 0.0F);
        bone69.addChild(bone70);
        bone70.cubeList.add(new ModelBox(bone70, 362, 2, -0.5F, -1.2F, -10.0F, 1, 1, 7, 0.0F, false));
        bone70.cubeList.add(new ModelBox(bone70, 201, 244, -0.5F, -1.2F, -3.0F, 1, 1, 1, 0.0F, false));

        bone67 = new ModelRenderer(this);
        bone67.setRotationPoint(-2.3F, -2.0F, 8.0667F);
        setRotationAngle(bone67, 0.7854F, 0.0F, 0.0F);
        bone35.addChild(bone67);
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 12.1F, -1.0F, 1.4F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 4.5F, -1.0F, 1.4F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 12.1F, -0.1F, 0.5F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 4.5F, -0.1F, 0.5F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 12.1F, -0.7F, 1.1F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 4.5F, -0.7F, 1.1F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 12.1F, 0.2F, 0.2F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 4.5F, 0.2F, 0.2F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 12.1F, -0.4F, 0.8F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 4.5F, -0.4F, 0.8F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 12.1F, 0.5F, -0.1F, 2, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 406, 181, 4.5F, 0.5F, -0.1F, 2, 1, 1, 0.0F, false));

        bone66 = new ModelRenderer(this);
        bone66.setRotationPoint(-11.1F, -1.9667F, 8.9667F);
        setRotationAngle(bone66, 0.0F, -0.7854F, 0.0F);
        bone35.addChild(bone66);

        bone65 = new ModelRenderer(this);
        bone65.setRotationPoint(-7.0F, -3.6F, 5.22F);
        setRotationAngle(bone65, -0.1745F, 0.0F, 0.0F);
        bone35.addChild(bone65);
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, 1.5F, -2.5F, -0.9533F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, 2.5F, -1.5F, -0.9533F, 1, 3, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, 1.5F, 1.5F, -0.9533F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, -2.5F, -0.5F, -0.9533F, 5, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, -1.5F, 0.5F, -0.9533F, 3, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, -1.5F, -1.5F, -0.9533F, 3, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 358, 244, -0.5F, -0.5F, -1.0533F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, -2.5F, -2.5F, -0.9533F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, -3.5F, -1.5F, -0.9533F, 1, 3, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 386, 9, -2.5F, 1.5F, -0.9533F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 329, 0, -0.5F, -0.5F, -0.0533F, 1, 1, 2, 0.0F, false));

        bone64 = new ModelRenderer(this);
        bone64.setRotationPoint(-7.15F, -3.6F, 3.9667F);
        setRotationAngle(bone64, 0.0F, -0.7854F, 0.0F);
        bone35.addChild(bone64);

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.0F, -5.8F, 19.8667F);
        setRotationAngle(bone36, -0.4363F, 0.0F, 0.0F);
        bone35.addChild(bone36);
        bone36.cubeList.add(new ModelBox(bone36, 0, 0, -14.0F, 1.0F, -16.1F, 2, 2, 18, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 136, 8, -12.0F, 1.0F, -14.1F, 12, 1, 1, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 58, 30, -12.0F, 1.0F, -16.1F, 12, 2, 2, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 136, 8, 0.0F, 1.0F, -14.1F, 12, 1, 1, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 58, 30, 0.0F, 1.0F, -16.1F, 12, 2, 2, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 0, 0, 12.0F, 1.0F, -16.1F, 2, 2, 18, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.0F, -5.8F, 19.8667F);
        bone35.addChild(bone37);

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.0F, -4.9F, -23.0F);
        setRotationAngle(bone38, -0.0175F, 0.0F, 0.0F);
        bone37.addChild(bone38);
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, -14.0F, -1.1F, -5.0F, 14, 2, 13, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, 0.0F, -1.1F, -5.0F, 14, 2, 13, 0.0F, false));

        bone60 = new ModelRenderer(this);
        bone60.setRotationPoint(6.0F, 5.9667F, -2.9333F);
        setRotationAngle(bone60, -0.4363F, 0.0F, 0.0F);
        bone38.addChild(bone60);
        bone60.cubeList.add(new ModelBox(bone60, 149, 21, -6.5F, -7.3667F, -9.3667F, 1, 1, 9, 0.0F, false));

        bone61 = new ModelRenderer(this);
        bone61.setRotationPoint(-6.0F, 14.7333F, 2.7333F);
        bone60.addChild(bone61);

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, -0.1F, -7.0F);
        setRotationAngle(bone39, 0.0524F, 0.0F, 0.0F);
        bone38.addChild(bone39);
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, -14.0F, -0.9F, -1.9F, 14, 2, 4, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, 0.0F, -0.9F, -1.9F, 14, 2, 4, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 0.1F, -10.4F);
        setRotationAngle(bone41, 0.3665F, 0.0F, 0.0F);
        bone39.addChild(bone41);
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -14.0F, 2.1F, -12.7F, 2, 2, 21, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -12.0F, 2.1F, -12.7F, 2, 2, 21, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, 12.0F, 2.1F, -12.7F, 2, 2, 21, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, 10.0F, 2.1F, -12.7F, 2, 2, 21, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -10.0F, 2.1F, 7.3F, 20, 2, 1, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 136, 16, -10.0F, 2.1F, 6.3F, 20, 1, 1, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 146, 21, 12.5F, 4.1F, -6.7F, 1, 1, 13, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 146, 21, 12.5F, 5.1F, -4.7F, 1, 2, 11, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 146, 21, 12.5F, 7.1F, 1.3F, 1, 2, 4, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 146, 21, -13.5F, 4.1F, -6.7F, 1, 1, 13, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 146, 21, -13.5F, 5.1F, -4.7F, 1, 2, 11, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 146, 21, -13.5F, 7.1F, 1.3F, 1, 2, 4, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(-15.5F, 21.5F, 2.0F);
        setRotationAngle(bone49, 0.0F, 0.0F, 0.6981F);
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, 0.5F, -2.5F, -21.0F, 1, 3, 22, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, 0.5F, -2.5F, 1.0F, 1, 3, 19, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(18.5F, -7.5F, 2.25F);
        setRotationAngle(bone50, 0.0F, 0.0F, -0.6981F);
        bone50.cubeList.add(new ModelBox(bone50, 0, 0, -22.5F, 18.0F, -21.25F, 1, 3, 22, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 0, 0, -22.5F, 18.0F, 0.75F, 1, 3, 19, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(-0.5F, 6.5F, -34.0F);
        setRotationAngle(bone51, -0.0698F, 0.0F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, -15.5F, -0.5F, -2.0F, 10, 1, 4, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 144, 32, -15.5F, -0.5F, -3.0F, 10, 1, 1, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, 5.5F, -0.5F, -2.0F, 10, 1, 4, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 144, 32, 5.5F, -0.5F, -3.0F, 10, 1, 1, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, -4.5F, 0.4F, -2.0F, 9, 1, 4, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 144, 32, -4.5F, 0.4F, -3.0F, 9, 1, 1, 0.0F, false));

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(-4.5F, 0.0F, 0.0F);
        setRotationAngle(bone53, 0.0F, 0.0F, 0.5585F);
        bone51.addChild(bone53);
        bone53.cubeList.add(new ModelBox(bone53, 0, 0, -1.1F, 0.1F, -2.0F, 2, 1, 2, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 144, 32, -1.1F, 0.1F, -3.0F, 2, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 0, 0, -1.1F, 0.1F, 0.0F, 2, 1, 2, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(4.5F, 0.0F, 0.0F);
        setRotationAngle(bone52, 0.0F, 0.0F, -0.5585F);
        bone51.addChild(bone52);
        bone52.cubeList.add(new ModelBox(bone52, 0, 0, -0.9F, 0.1F, -2.0F, 2, 1, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 144, 32, -0.9F, 0.1F, -3.0F, 2, 1, 1, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 0, 0, -0.9F, 0.1F, 0.0F, 2, 1, 2, 0.0F, false));

        bone56 = new ModelRenderer(this);
        bone56.setRotationPoint(-17.0F, 10.2F, 17.6F);
        setRotationAngle(bone56, 0.0F, 0.0F, 0.5236F);
        bone56.cubeList.add(new ModelBox(bone56, 72, 48, -1.0F, -1.9F, 0.5F, 4, 1, 1, 0.0F, false));

        bone57 = new ModelRenderer(this);
        bone57.setRotationPoint(17.0F, 10.2F, 17.6F);
        setRotationAngle(bone57, 0.0F, 0.0F, -0.5236F);
        bone57.cubeList.add(new ModelBox(bone57, 72, 48, -3.0F, -1.9F, 0.5F, 4, 1, 1, 0.0F, false));

        bone58 = new ModelRenderer(this);
        bone58.setRotationPoint(17.5F, 8.0F, 18.45F);
        setRotationAngle(bone58, 0.0F, 0.2618F, 0.0F);
        bone58.cubeList.add(new ModelBox(bone58, 0, 0, -1.3F, -1.0F, -0.55F, 3, 2, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 408, 213, -0.8F, -0.5F, -0.65F, 2, 1, 1, 0.0F, false));

        bone59 = new ModelRenderer(this);
        bone59.setRotationPoint(-17.5F, 8.0F, 18.45F);
        setRotationAngle(bone59, 0.0F, -0.1745F, 0.0F);
        bone59.cubeList.add(new ModelBox(bone59, 0, 0, -1.5F, -1.0F, -0.55F, 3, 2, 1, 0.0F, false));
        bone59.cubeList.add(new ModelBox(bone59, 408, 213, -1.0F, -0.5F, -0.65F, 2, 1, 1, 0.0F, false));

        bone63 = new ModelRenderer(this);
        bone63.setRotationPoint(-6.0F, 18.5F, 13.3F);
        setRotationAngle(bone63, 0.6981F, 0.0F, 0.0F);
        bone63.cubeList.add(new ModelBox(bone63, 361, 32, -1.5F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 361, 32, 1.5F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 361, 32, -4.5F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(7.5F, 12.8F, -39.5F);
        setRotationAngle(rear_lights, 0.0F, -0.7854F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, -14.7492F, 0.1F, 13.2492F, 1, 1, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, 2.6F, 0.1F, -4.1F, 1, 1, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, 2.0F, 0.1F, -3.5F, 1, 1, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, -14.1492F, 0.1F, 12.6492F, 1, 1, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, -14.4492F, 0.1F, 12.9492F, 1, 1, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, 2.9F, 0.1F, -4.4F, 1, 1, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, -15.0492F, 0.1F, 13.5492F, 1, 1, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 430, 178, 2.3F, 0.1F, -3.8F, 1, 1, 2, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(7.5F, 12.8F, -39.5F);
        setRotationAngle(rear_lights_brake, 0.0F, -0.7854F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, 1.4F, 0.1F, -2.9F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -13.8492F, 0.1F, 12.3492F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, 0.5F, 0.1F, -2.0F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -12.6492F, 0.1F, 11.1492F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -0.1F, 0.1F, -1.4F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -13.2492F, 0.1F, 11.7492F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, 1.1F, 0.1F, -2.6F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -12.0492F, 0.1F, 10.5492F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, 1.7F, 0.1F, -3.2F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -13.5492F, 0.1F, 12.0492F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, 0.8F, 0.1F, -2.3F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -12.3492F, 0.1F, 10.8492F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, 0.2F, 0.1F, -1.7F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 430, 178, -12.9492F, 0.1F, 11.4492F, 1, 1, 2, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(7.5F, 12.8F, -39.5F);
        setRotationAngle(rear_lights_left, 0.0F, -0.7854F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 378, 246, -15.3492F, 0.1F, 13.8492F, 1, 1, 2, 0.0F, false));
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 378, 246, -15.6492F, 0.1F, 14.1492F, 1, 1, 2, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(7.5F, 12.8F, -39.5F);
        setRotationAngle(rear_lights_right, 0.0F, -0.7854F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 378, 246, 3.2F, 0.1F, -4.7F, 1, 1, 2, 0.0F, false));
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 378, 246, 3.5F, 0.1F, -5.0F, 1, 1, 2, 0.0F, false));

        rear_lights_reverse = new ModelRenderer(this);
        rear_lights_reverse.setRotationPoint(7.5F, 12.8F, -39.5F);
        setRotationAngle(rear_lights_reverse, 0.0F, -0.7854F, 0.0F);
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 412, 212, -0.7F, 0.1F, -0.8F, 1, 1, 2, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 412, 212, -11.7492F, 0.1F, 10.2492F, 1, 1, 2, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 412, 212, -11.4492F, 0.1F, 9.9492F, 1, 1, 2, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 412, 212, -0.4F, 0.1F, -1.1F, 1, 1, 2, 0.0F, false));

        head_lights = new ModelRenderer(this);
        head_lights.setRotationPoint(0.0F, 15.2F, 43.3F);
        setRotationAngle(head_lights, 0.0349F, 0.0F, 0.0F);
        head_lights.cubeList.add(new ModelBox(head_lights, 405, 214, -13.5F, 0.6F, -0.9F, 6, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 405, 214, -13.5F, -0.5F, -0.9F, 6, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 405, 214, -13.5F, -1.6F, -0.9F, 6, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 405, 214, 7.5F, 0.6F, -0.9F, 6, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 405, 214, 7.5F, -0.5F, -0.9F, 6, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 405, 214, 7.5F, -1.6F, -0.9F, 6, 1, 1, 0.0F, false));

        head_lights_left = new ModelRenderer(this);
        head_lights_left.setRotationPoint(-17.0F, 13.0F, 39.6F);
        setRotationAngle(head_lights_left, 0.0873F, 0.0F, 0.0F);
        head_lights_left.cubeList.add(new ModelBox(head_lights_left, 441, 249, -1.0F, -0.4F, -0.1F, 2, 1, 1, 0.0F, false));

        head_lights_right = new ModelRenderer(this);
        head_lights_right.setRotationPoint(-17.0F, 13.0F, 39.6F);
        setRotationAngle(head_lights_right, 0.0873F, 0.0F, 0.0F);
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 441, 249, 33.0F, -0.4F, -0.1F, 2, 1, 1, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 400, 205, -3.5F, -10.7F, -40.3F, 7, 2, 1, 0.0F, false));

        interier_a = new ModelRenderer(this);
        interier_a.setRotationPoint(0.5F, 12.0F, 12.6F);
        setRotationAngle(interier_a, -0.0349F, 0.0F, 0.0F);
        interier_a.cubeList.add(new ModelBox(interier_a, 359, 241, -1.5F, -1.2F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 189, 192, -0.5F, -1.2F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 180, 189, 0.5F, -1.2F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 243, 220, 0.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 199, 197, -0.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 189, 193, -1.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 236, 215, -1.5F, 0.8F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 244, 222, -0.5F, 0.8F, -0.5F, 1, 1, 1, 0.0F, false));
        interier_a.cubeList.add(new ModelBox(interier_a, 244, 218, 0.5F, 0.8F, -0.5F, 1, 1, 1, 0.0F, false));

        interier_b = new ModelRenderer(this);
        interier_b.setRotationPoint(-11.0F, 12.0333F, 12.4F);
        setRotationAngle(interier_b, 3.1241F, -2.4435F, -3.1416F);
        interier_b.cubeList.add(new ModelBox(interier_b, 160, 226, -0.5F, 1.0667F, -0.4F, 1, 1, 1, 0.0F, false));
        interier_b.cubeList.add(new ModelBox(interier_b, 448, 249, -0.5F, -0.2333F, -0.4F, 1, 1, 1, 0.0F, false));
        interier_b.cubeList.add(new ModelBox(interier_b, 433, 177, 5.5F, -1.2333F, -5.4F, 1, 1, 1, 0.0F, false));
        interier_b.cubeList.add(new ModelBox(interier_b, 238, 206, 6.1F, -1.2333F, -5.9F, 1, 1, 1, 0.0F, false));
        interier_b.cubeList.add(new ModelBox(interier_b, 428, 174, 6.7F, -1.2333F, -6.4F, 1, 1, 1, 0.0F, false));
        interier_b.cubeList.add(new ModelBox(interier_b, 445, 208, -0.5F, -1.4333F, -0.4F, 1, 1, 1, 0.0F, false));

        interier_c = new ModelRenderer(this);
        interier_c.setRotationPoint(-2.5F, 13.0F, 11.8F);
        setRotationAngle(interier_c, 0.7854F, 0.0F, 0.0F);
        interier_c.cubeList.add(new ModelBox(interier_c, 346, 242, -1.1F, -0.4F, 0.3F, 1, 1, 1, 0.0F, false));
        interier_c.cubeList.add(new ModelBox(interier_c, 176, 224, 0.1F, -0.4F, 0.3F, 1, 1, 1, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, head_lights, rear_lights),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, head_lights_right, rear_lights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left, rear_lights_left),
                new BrakeLights<>(rear_lights_brake),
                new ReverseLights<>(rear_lights_reverse),
                new LightControllerEntry<>(0.8F, interier_a, interier_b, interier_c),
                new LightControllerEntry<>(0.6F, plate)
        );
    }

    @Override
    public void renderModel() {
        bb_main.render(1.0F);
        bone2.render(1.0F);
        bone3.render(1.0F);
        bone.render(1.0F);
        bone4.render(1.0F);
        bone5.render(1.0F);
        bone6.render(1.0F);
        bone25.render(1.0F);
        bone26.render(1.0F);
        bone27.render(1.0F);
        bone29.render(1.0F);
        bone30.render(1.0F);
        bone32.render(1.0F);
        bone35.render(1.0F);
        bone49.render(1.0F);
        bone50.render(1.0F);
        bone51.render(1.0F);
        bone56.render(1.0F);
        bone57.render(1.0F);
        bone58.render(1.0F);
        bone59.render(1.0F);
        bone63.render(1.0F);
    }
}
