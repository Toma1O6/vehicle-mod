package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik3000L;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSputnik3000L extends ModelVehicle<VehicleSputnik3000L> {

    private final ModelRenderer bb_main;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone9;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone43;
    private final ModelRenderer bone23;
    private final ModelRenderer bone22;
    private final ModelRenderer bone21;
    private final ModelRenderer bone20;
    private final ModelRenderer bone19;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone12;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone28;
    private final ModelRenderer bone29;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer bone30;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone40;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone50;
    private final ModelRenderer bone49;
    private final ModelRenderer bone51;
    private final ModelRenderer bone52;
    private final ModelRenderer bone53;
    private final ModelRenderer bone54;
    private final ModelRenderer bone55;
    private final ModelRenderer bone56;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone59;
    private final ModelRenderer head_lights_a;
    private final ModelRenderer bone64;
    private final ModelRenderer head_lights_b;
    private final ModelRenderer bone66;
    private final ModelRenderer bone67;
    private final ModelRenderer bone68;
    private final ModelRenderer head_lights_left;
    private final ModelRenderer bone60;
    private final ModelRenderer head_lights_right;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer rear_lights_reverse;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer plate;
    private final ModelRenderer interier;

    public ModelSputnik3000L() {
        textureWidth = 512;
        textureHeight = 512;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, 0.0F, 2, 2, 32, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, 0.0F, 2, 2, 32, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, 0.0F, 2, 2, 32, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, -29.0F, 2, 2, 29, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, 0.0F, 2, 2, 32, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, 31.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, 31.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -7.0F, 31.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -7.0F, -29.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, -29.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, -29.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, 29.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, 29.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -7.0F, 29.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -7.0F, -31.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, -31.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, -31.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -8.0F, 30.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -8.0F, 30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -8.0F, 30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -8.0F, -30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -8.0F, -30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -8.0F, -30.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -6.0F, 30.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -6.0F, 30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -6.0F, 30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -22.0F, -6.0F, -30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -6.0F, -30.0F, 14, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -6.0F, -30.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -9.0F, -27.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -9.0F, 33.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -9.0F, 33.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -9.0F, -27.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -9.0F, -36.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -9.0F, 24.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -9.0F, 24.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -9.0F, -36.0F, 7, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -4.0F, -32.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -4.0F, 28.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -4.0F, 28.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -4.0F, -32.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -13.0F, -32.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -21.0F, -13.0F, 28.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -13.0F, 28.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 14.0F, -13.0F, -32.0F, 7, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -18.0F, -9.0F, 0.0F, 18, 6, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, -15.0F, -11.0F, 1.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, -15.0F, -11.0F, -17.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, -4.0F, -11.0F, -17.0F, 8, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, 4.0F, -11.0F, 1.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, 4.0F, -11.0F, -17.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, -15.0F, -13.0F, 1.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, -15.0F, -13.0F, -17.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, -4.0F, -13.0F, -17.0F, 8, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, 4.0F, -13.0F, 1.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 107, 203, 4.0F, -13.0F, -17.0F, 11, 2, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -22.0F, -6.0F, 0.0F, 3, 4, 17, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -20.0F, -31.0F, -15.0F, 20, 2, 30, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 21, 13, -22.0F, -6.0F, 17.0F, 22, 4, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 37, -22.0F, -6.0F, -22.0F, 22, 4, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -22.0F, -17.3F, 28.0F, 8, 4, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 29, 20, 14.0F, -17.3F, 28.0F, 8, 4, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -18.0F, -9.0F, -18.0F, 18, 6, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -22.0F, -6.0F, -18.0F, 3, 4, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -20.0F, -19.0F, -18.0F, 3, 14, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 53, 25, -20.0F, -19.0F, -21.0F, 3, 14, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -20.0F, -19.0F, -3.0F, 3, 13, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.0F, -19.0F, -3.0F, 3, 13, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -20.0F, -30.0F, -2.0F, 3, 11, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.0F, -30.0F, -2.0F, 3, 11, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.0F, -19.0F, -18.0F, 3, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 22, 17.0F, -19.0F, -21.0F, 3, 13, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 22, 26, 0.0F, -17.7F, -23.0F, 17, 12, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 24, 9, 0.0F, -15.7F, -35.0F, 17, 8, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 48, 20, 0.0F, -17.7F, -35.0F, 15, 2, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 150, 28, 14.0F, -18.7F, -40.0F, 1, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 150, 28, -15.0F, -18.7F, -40.0F, 1, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 73, 34, -15.0F, -19.7F, -40.0F, 15, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 73, 34, 0.0F, -19.7F, -40.0F, 15, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 69, 37, 16.0F, -10.1F, -41.4F, 1, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 26, 24, 16.0F, -13.1F, -41.4F, 1, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 50, 28, 0.0F, -14.1F, -41.3F, 17, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 22, 26, -17.0F, -17.7F, -23.0F, 17, 12, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 33, 26, -17.0F, -15.7F, -35.0F, 17, 8, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 48, 20, -15.0F, -17.7F, -35.0F, 15, 2, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 37, -17.0F, -17.7F, -35.0F, 2, 2, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 26, 24, 15.0F, -17.7F, -35.0F, 2, 2, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 44, 49, -17.0F, -10.1F, -41.4F, 1, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 41, 30, -11.0F, -10.1F, -41.4F, 7, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 41, 30, 4.0F, -10.1F, -41.4F, 7, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 153, 23, 11.0F, -10.1F, -40.7F, 5, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 153, 23, -16.0F, -10.1F, -40.7F, 5, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 44, 49, -17.0F, -13.1F, -41.4F, 1, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 41, 30, -11.0F, -13.1F, -41.4F, 7, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 41, 30, -4.0F, -13.1F, -41.4F, 8, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 41, 30, 4.0F, -13.1F, -41.4F, 7, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 153, 23, 11.0F, -13.1F, -40.7F, 5, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 153, 23, -16.0F, -13.1F, -40.7F, 5, 3, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 60, 28, -17.0F, -14.1F, -41.3F, 17, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -20.0F, -19.0F, 16.0F, 3, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.0F, -19.0F, 2.0F, 2, 13, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 212, 28, -19.5F, -16.0F, 4.0F, 2, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 212, 28, 17.5F, -16.0F, 4.0F, 2, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 212, 28, -19.5F, -16.0F, -15.0F, 2, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 212, 28, 17.5F, -16.0F, -15.0F, 2, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.0F, -19.0F, 2.0F, 2, 13, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.0F, -19.0F, -17.0F, 2, 13, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.0F, -19.0F, -17.0F, 2, 13, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.0F, -19.0F, 16.0F, 3, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -9.0F, 0.0F, 18, 6, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 19.0F, -6.0F, 0.0F, 3, 4, 17, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -31.0F, -15.0F, 20, 2, 30, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 29, 20, 0.0F, -6.0F, 17.0F, 22, 4, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 22, 0.0F, -6.0F, -22.0F, 22, 4, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 33, 17.0F, -19.0F, 17.0F, 3, 13, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 132, 12, 18.0F, -28.0F, 17.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 132, 12, -19.0F, -28.0F, 17.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 36, 33, 17.0F, -19.0F, 22.0F, 3, 5, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 320, 25, 0.0F, -19.0F, 22.0F, 17, 5, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 321, 0, 0.0F, -19.0F, 19.0F, 17, 6, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 320, 25, -17.0F, -19.0F, 22.0F, 17, 5, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 321, 0, -17.0F, -19.0F, 19.0F, 17, 6, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 21, 13, -20.0F, -19.0F, 17.0F, 3, 13, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 21, 13, -20.0F, -19.0F, 22.0F, 3, 5, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -9.0F, -18.0F, 18, 6, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 19.0F, -6.0F, -18.0F, 3, 4, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 241, 36, 10.5F, -4.0F, -40.0F, 2, 2, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 22, 13.0F, -17.2F, -31.8F, 9, 3, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 22, 17.0F, -9.3F, -39.8F, 5, 7, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 37, -22.0F, -9.3F, -39.8F, 5, 7, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 37, -22.0F, -17.2F, -31.8F, 9, 3, 6, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 18.0F, -2.0F);
        setRotationAngle(bone, 0.0F, 0.0F, -0.7854F);
        bone.cubeList.add(new ModelBox(bone, 206, 17, -1.0F, 0.0F, -27.0F, 2, 2, 29, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 206, 17, -1.0F, 0.0F, 2.0F, 2, 2, 32, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 206, 17, 0.0F, -1.0F, -27.0F, 2, 2, 29, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 206, 17, 0.0F, -1.0F, 2.0F, 2, 2, 32, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 206, 17, -1.0F, -2.0F, -27.0F, 2, 2, 29, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 206, 17, -1.0F, -2.0F, 2.0F, 2, 2, 32, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 206, 17, -2.0F, -1.0F, -27.0F, 2, 2, 29, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 206, 17, -2.0F, -1.0F, 2.0F, 2, 2, 32, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(12.0F, 12.0F, 0.0F);
        setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -17.6777F, 25.163F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -17.6777F, 25.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, -17.6777F, 25.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, 24.7487F, -17.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 24.7487F, -17.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 24.7487F, -17.2635F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -18.6777F, 24.163F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -18.6777F, 24.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, -18.6777F, 24.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, 23.7487F, -18.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 23.7487F, -18.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 23.7487F, -18.2635F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -19.6777F, 25.163F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -19.6777F, 25.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, -19.6777F, 25.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, 22.7487F, -17.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 22.7487F, -17.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 22.7487F, -17.2635F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -18.6777F, 26.163F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -18.6777F, 26.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, -18.6777F, 26.163F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -34.0F, 23.7487F, -16.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 23.7487F, -16.2635F, 14, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 23.7487F, -16.2635F, 16, 2, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-23.5F, 16.0F, -35.0F);
        setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -9.8284F, 2.6569F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -52.2548F, 45.0833F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -52.2548F, 45.0833F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -9.8284F, 2.6569F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -0.8284F, 2.6569F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -43.2548F, 45.0833F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -43.2548F, 45.0833F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -0.8284F, 2.6569F, 7, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -5.8284F, -1.3431F, 7, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -48.2548F, 41.0833F, 7, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -48.2548F, 41.0833F, 7, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -5.8284F, -1.3431F, 7, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -5.8284F, 7.6569F, 7, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 2.5F, -48.2548F, 50.0833F, 7, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -48.2548F, 50.0833F, 7, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 37.5F, -5.8284F, 7.6569F, 7, 6, 5, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 16.0F, 23.5F);
        setRotationAngle(bone4, 1.2217F, 0.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 21, 13, -22.0F, -4.3F, -6.5F, 22, 4, 9, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 29, 20, 0.0F, -4.3F, -6.5F, 22, 4, 9, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -2.3F, 3.0F);
        setRotationAngle(bone5, -0.3491F, 0.0F, 0.0F);
        bone4.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 29, 20, 0.0F, -1.7F, -1.2F, 22, 4, 5, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 21, 13, -22.0F, -1.7F, -1.2F, 22, 4, 5, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -2.3F, 3.0F);
        setRotationAngle(bone6, -0.3491F, 0.0F, 0.0F);
        bone4.addChild(bone6);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, 0.3F, 4.3F);
        setRotationAngle(bone7, -0.5236F, 0.0F, 0.0F);
        bone6.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 21, 13, -22.0F, -1.5F, -1.4F, 22, 4, 5, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 29, 20, 0.0F, -1.5F, -1.4F, 22, 4, 5, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 6.5F, 29.5F);
        setRotationAngle(bone8, -0.0349F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 18, 2, 0.0F, -1.4F, -2.7F, 20, 5, 5, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 18, 2, -20.0F, -1.4F, -2.7F, 20, 5, 5, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(-20.5F, -1.9F, -3.2F);
        setRotationAngle(bone44, -0.3491F, 0.8727F, 0.0F);
        bone8.addChild(bone44);
        bone44.cubeList.add(new ModelBox(bone44, 213, 25, -0.5F, -0.5F, -3.5F, 1, 1, 6, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(20.5F, -1.9F, -3.2F);
        setRotationAngle(bone45, -0.3491F, -0.8727F, 0.0F);
        bone8.addChild(bone45);
        bone45.cubeList.add(new ModelBox(bone45, 213, 25, -0.5F, -0.5F, -3.5F, 1, 1, 6, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.5F, -2.4F, -1.7F);
        setRotationAngle(bone26, -0.6109F, 0.0F, 0.0F);
        bone8.addChild(bone26);
        bone26.cubeList.add(new ModelBox(bone26, 0, 0, -20.5F, -1.0F, -10.0F, 3, 2, 14, 0.0F, false));
        bone26.cubeList.add(new ModelBox(bone26, 0, 0, 16.5F, -1.0F, -10.0F, 3, 2, 14, 0.0F, false));

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.5F, -2.4F, -1.7F);
        setRotationAngle(bone27, -0.6109F, 0.0F, 0.0F);
        bone8.addChild(bone27);
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, -20.5F, -1.0F, -16.0F, 3, 2, 6, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 143, 22, -0.5F, 11.0F, -42.0F, 1, 1, 10, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 140, 10, -17.5F, -1.0F, -16.0F, 17, 2, 1, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 46, 14, -20.5F, -1.0F, -17.0F, 21, 2, 1, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, 16.5F, -1.0F, -16.0F, 3, 2, 6, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 140, 10, -0.5F, -1.0F, -16.0F, 17, 2, 1, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 46, 14, -0.5F, -1.0F, -17.0F, 20, 2, 1, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 6.5F, 29.5F);
        setRotationAngle(bone9, -0.0349F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 18, 2, 14.0F, -1.4F, 2.3F, 6, 5, 5, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, 9.0F, 2.2F, 16.4F, 4, 5, 5, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, 0.0F, 7.2F, 13.4F, 12, 5, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 29, 20, 0.0F, 12.2F, 13.4F, 12, 3, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 18, 2, -20.0F, -1.4F, 2.3F, 6, 5, 5, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 18, 2, -14.0F, -1.4F, 3.3F, 14, 5, 4, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 140, 10, -14.0F, -0.4F, 2.3F, 14, 4, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, -1.4F, 3.3F, 14, 5, 4, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 140, 10, 0.0F, -0.4F, 2.3F, 14, 4, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -13.0F, 2.2F, 16.4F, 4, 5, 5, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -19.0F, 2.2F, 15.4F, 1, 6, 6, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, 18.0F, 2.2F, 15.4F, 1, 6, 6, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, -8.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, -0.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, -6.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, 1.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, -4.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, 3.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, -2.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, 5.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 192, 24, 7.5F, 4.2F, 19.8F, 1, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -9.0F, 2.2F, 16.4F, 9, 2, 5, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, 0.0F, 2.2F, 16.4F, 9, 2, 5, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -12.0F, 7.2F, 13.4F, 12, 5, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 29, 20, -12.0F, 12.2F, 13.4F, 12, 3, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 338, 137, -9.0F, 3.2F, 19.2F, 18, 4, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -19.0F, 8.2F, 13.4F, 7, 1, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -18.0F, 6.2F, 13.4F, 6, 2, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, 12.0F, 6.2F, 13.4F, 6, 2, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 46, 14, -18.0F, 10.2F, 13.4F, 5, 1, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 53, 20, 13.0F, 10.2F, 13.4F, 5, 1, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 54, 26, -13.0F, 9.2F, 19.4F, 1, 2, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 33, 24, 12.0F, 9.2F, 19.4F, 1, 2, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 33, 24, 15.0F, 9.2F, 19.4F, 1, 2, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -16.0F, 9.2F, 19.4F, 1, 2, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, 12.0F, 8.2F, 13.4F, 7, 1, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 16, 14, -19.0F, 9.2F, 13.4F, 7, 3, 6, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 72, 38, -19.0F, 12.2F, 13.4F, 7, 3, 6, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 50, 22, 12.0F, 9.2F, 13.4F, 7, 3, 6, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 29, 20, 12.0F, 12.2F, 13.4F, 7, 3, 6, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 4, 22, -19.0F, 9.2F, 19.4F, 1, 2, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 33, 24, 18.0F, 9.2F, 19.4F, 1, 2, 2, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, 9.7F, 20.4F);
        setRotationAngle(bone17, 0.7854F, 0.0F, 0.0F);
        bone9.addChild(bone17);

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 1.0F, -0.5F);
        setRotationAngle(bone18, 0.2618F, 0.0F, 0.0F);
        bone17.addChild(bone18);
        bone18.cubeList.add(new ModelBox(bone18, 196, 16, -21.0F, -2.2F, -2.4F, 21, 5, 3, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 196, 16, 0.0F, -2.2F, -2.4F, 21, 5, 3, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 1.1F, 3.3F);
        setRotationAngle(bone43, -0.1745F, 0.0F, 0.0F);
        bone9.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, -13.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, -11.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, -9.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, -7.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, -5.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, -3.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, -1.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, 0.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, 2.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, 4.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, 6.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, 8.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, 10.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 216, 21, 12.5F, -2.2F, -1.5F, 1, 5, 2, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(-36.4F, 7.9069F, 18.2071F);
        setRotationAngle(bone23, 0.0F, 0.0F, -3.1416F);
        bone9.addChild(bone23);

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, 17.5F, -29.5F);
        bone9.addChild(bone22);

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 17.5F, -29.5F);
        setRotationAngle(bone21, 0.0F, 0.0F, -1.5708F);
        bone9.addChild(bone21);

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 17.5F, -29.5F);
        bone9.addChild(bone20);

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 17.5F, -29.5F);
        bone9.addChild(bone19);

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 6.5F, 29.5F);
        setRotationAngle(bone10, -0.0349F, 0.0F, 0.0F);

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, 0.1F, 9.8F);
        setRotationAngle(bone11, -0.0175F, 0.0F, 0.0F);
        bone10.addChild(bone11);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -19.0F, -1.5F, -2.6F, 19, 6, 5, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 0.0F, -1.5F, -2.6F, 19, 6, 5, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, -0.7F, 5.9F);
        setRotationAngle(bone24, 0.2967F, 0.0F, 0.0F);
        bone11.addChild(bone24);

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, -0.1F, -0.4F);
        setRotationAngle(bone25, 0.1571F, 0.0F, 0.0F);
        bone24.addChild(bone25);

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 0.1F, 9.8F);
        setRotationAngle(bone12, -0.0175F, 0.0F, 0.0F);
        bone10.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 16, 14, -22.0F, 8.2F, 0.2F, 9, 7, 4, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 29, 20, 13.0F, 8.2F, 0.2F, 9, 7, 4, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 4.25F, 4.9F);
        setRotationAngle(bone15, -0.1745F, 0.0F, 0.0F);
        bone12.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 48, 10, -19.0F, -0.25F, -3.5F, 19, 6, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -19.0F, -5.25F, -3.5F, 19, 5, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 29, 20, 0.0F, -0.25F, -3.5F, 19, 6, 5, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, 0.0F, -5.25F, -3.5F, 19, 5, 5, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 0.0F, 4.0F);
        setRotationAngle(bone16, -0.3491F, 0.0F, 0.0F);
        bone15.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -13.0F, -4.05F, -4.1F, 13, 5, 5, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 32, 32, -19.0F, -4.05F, -4.1F, 1, 5, 5, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 4, 22, 18.0F, -4.05F, -4.1F, 1, 5, 5, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, 0.0F, -4.05F, -4.1F, 13, 5, 5, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 4, 22, 12.0F, -4.05F, -4.1F, 7, 5, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 32, 32, -19.0F, -4.05F, -4.1F, 7, 5, 2, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 7.0F, 1.9F);
        setRotationAngle(bone13, 0.8727F, 0.0F, 0.0F);
        bone12.addChild(bone13);
        bone13.cubeList.add(new ModelBox(bone13, 16, 14, -22.0F, -7.8F, -1.3F, 9, 6, 4, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 29, 20, 13.0F, -7.8F, -1.3F, 9, 6, 4, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(bone14, -0.4363F, 0.0F, 0.0F);
        bone13.addChild(bone14);
        bone14.cubeList.add(new ModelBox(bone14, 16, 14, -22.0F, -2.9F, -2.4F, 9, 5, 4, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 29, 20, 13.0F, -2.9F, -2.4F, 9, 5, 4, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.0F, 16.0F, -19.5F);
        setRotationAngle(bone28, 0.1745F, 0.0F, 0.0F);
        bone28.cubeList.add(new ModelBox(bone28, 9, 37, -22.0F, -3.6F, -1.9F, 9, 6, 3, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 32, 22, 13.0F, -3.6F, -1.9F, 9, 6, 3, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(0.0F, 16.0F, -19.5F);
        setRotationAngle(bone29, 0.1745F, 0.0F, 0.0F);

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, -4.6F, -0.4F);
        setRotationAngle(bone31, 0.3491F, 0.0F, 0.0F);
        bone29.addChild(bone31);
        bone31.cubeList.add(new ModelBox(bone31, 32, 22, 13.0F, -1.6F, -1.9F, 9, 3, 3, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 9, 37, -22.0F, -1.6F, -1.9F, 9, 3, 3, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, -4.6F, -0.4F);
        setRotationAngle(bone32, 0.7854F, 0.0F, 0.0F);
        bone29.addChild(bone32);
        bone32.cubeList.add(new ModelBox(bone32, 32, 22, 13.0F, -4.0F, -1.3F, 9, 3, 3, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 9, 37, -22.0F, -4.0F, -1.3F, 9, 3, 3, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, -4.6F, -0.4F);
        setRotationAngle(bone30, 1.0472F, 0.0F, 0.0F);
        bone29.addChild(bone30);
        bone30.cubeList.add(new ModelBox(bone30, 32, 22, 13.0F, -6.4F, -0.3F, 9, 3, 3, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 9, 37, -22.0F, -6.4F, -0.3F, 9, 3, 3, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, 8.3F, -32.3F);
        setRotationAngle(bone33, 0.3491F, 0.0F, 0.0F);
        bone33.cubeList.add(new ModelBox(bone33, 9, 37, -22.0F, -1.2F, -3.0F, 9, 3, 4, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 32, 22, 13.0F, -1.2F, -3.0F, 9, 3, 4, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, 8.3F, -32.3F);
        setRotationAngle(bone34, 0.7854F, 0.0F, 0.0F);
        bone34.cubeList.add(new ModelBox(bone34, 9, 37, -22.0F, -2.4F, -6.2F, 9, 3, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 32, 22, 13.0F, -2.4F, -6.2F, 9, 3, 4, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, 8.3F, -32.3F);
        setRotationAngle(bone35, 1.2217F, 0.0F, 0.0F);
        bone35.cubeList.add(new ModelBox(bone35, 9, 37, -22.0F, -4.8F, -8.6F, 5, 3, 4, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 32, 22, 17.0F, -4.8F, -8.6F, 5, 3, 4, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.0F, 18.8F, -38.0F);
        setRotationAngle(bone36, 0.6109F, 0.0F, 0.0F);

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.0F, 11.3F, -38.0F);
        setRotationAngle(bone37, 0.3665F, 0.0F, 0.0F);

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, 1.4F, 1.1F);
        setRotationAngle(bone40, -0.2618F, 0.0F, 0.0F);
        bone37.addChild(bone40);
        bone40.cubeList.add(new ModelBox(bone40, 26, 24, 0.0F, -5.7F, -1.7F, 17, 9, 4, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 54, 41, 10.0F, -5.7F, -4.7F, 7, 4, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 54, 41, 2.0F, -5.7F, -4.7F, 5, 4, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 9, 37, -17.0F, -5.7F, -1.7F, 17, 9, 4, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 57, 37, -17.0F, -5.7F, -4.7F, 7, 4, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 54, 41, -7.0F, -5.7F, -4.7F, 5, 4, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 54, 41, -10.0F, -5.7F, -4.7F, 3, 1, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 54, 41, 7.0F, -5.7F, -4.7F, 3, 1, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 76, 30, 7.0F, -4.7F, -4.3F, 3, 2, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 57, 37, -10.0F, -4.7F, -4.3F, 3, 2, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 68, 42, -10.0F, -2.7F, -4.7F, 3, 1, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 57, 37, 7.0F, -2.7F, -4.7F, 3, 1, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 41, 30, -2.0F, -2.7F, -4.7F, 4, 1, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 54, 41, -2.0F, -5.7F, -4.7F, 4, 1, 3, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 160, 15, -2.0F, -4.7F, -4.0F, 4, 2, 3, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.0F, 7.5F, -24.5F);
        setRotationAngle(bone38, 0.2618F, 0.0F, 0.0F);
        bone38.cubeList.add(new ModelBox(bone38, 54, 34, 17.0F, -1.5F, -3.0F, 3, 5, 7, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 46, 44, -20.0F, -1.5F, -3.0F, 3, 5, 7, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, 19.4F, -39.5F);
        setRotationAngle(bone39, 0.5236F, 0.0F, 0.0F);
        bone39.cubeList.add(new ModelBox(bone39, 26, 24, 13.0F, -4.05F, 0.0866F, 4, 7, 5, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 41, 30, 0.0F, -4.05F, 0.0866F, 10, 7, 5, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 26, 24, 10.0F, -4.05F, 0.0866F, 3, 5, 5, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 57, 37, -17.0F, -4.05F, 0.0866F, 17, 7, 5, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, -6.0F, -31.5F);
        setRotationAngle(bone41, 1.0472F, 0.0F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 36, 45, -20.0F, 13.8F, -4.9F, 3, 2, 12, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 22, 26, 17.0F, 13.8F, -4.9F, 3, 2, 12, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 140, 13, 0.0F, 13.8F, 6.1F, 17, 2, 1, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 140, 13, -17.0F, 13.8F, 6.1F, 17, 2, 1, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, -6.0F, -31.5F);
        setRotationAngle(bone42, 1.0472F, 0.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 90, 17, -20.0F, 13.8F, 7.1F, 3, 2, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 90, 17, 17.0F, 13.8F, 7.1F, 3, 2, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 18, 32, -17.0F, 13.8F, 7.1F, 34, 2, 2, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(-23.0F, 3.5F, 24.3F);

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, 3.5F, 24.3F);

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(-23.0F, 0.0F, 0.0F);
        setRotationAngle(bone48, 0.0F, -0.2618F, 0.0F);
        bone47.addChild(bone48);
        bone48.cubeList.add(new ModelBox(bone48, 56, 29, -2.0F, -1.5F, -0.5F, 4, 3, 1, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(-23.0F, 0.0F, 0.0F);
        setRotationAngle(bone50, 0.0F, -0.2618F, 0.0F);
        bone47.addChild(bone50);
        bone50.cubeList.add(new ModelBox(bone50, 406, 199, -1.5F, -1.1F, -0.6F, 3, 2, 1, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(23.0F, 0.0F, 0.0F);
        setRotationAngle(bone49, 0.0F, 0.5236F, 0.0F);
        bone47.addChild(bone49);
        bone49.cubeList.add(new ModelBox(bone49, 54, 24, -2.0F, -1.5F, -0.5F, 4, 3, 1, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 412, 202, -1.4F, -1.0F, -0.6F, 3, 2, 1, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(0.0F, 6.0F, -8.7F);

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(0.0F, 0.0F, -6.8F);
        setRotationAngle(bone52, 0.0698F, 0.0F, 0.0F);
        bone51.addChild(bone52);
        bone52.cubeList.add(new ModelBox(bone52, 107, 203, -15.0F, -5.7F, -1.5F, 11, 11, 3, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 107, 203, -15.0F, -4.6302F, 16.4976F, 11, 11, 3, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 107, 203, -4.0F, -5.7F, -1.5F, 8, 11, 3, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 107, 203, 4.0F, -5.7F, -1.5F, 11, 11, 3, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 107, 203, 4.0F, -4.6302F, 16.4976F, 11, 11, 3, 0.0F, false));

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(-12.0F, 2.5F, -0.5F);
        setRotationAngle(bone54, 0.0F, 0.0F, 0.7854F);

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(-12.0F, 2.5F, -0.5F);
        setRotationAngle(bone55, 0.0F, 0.0F, -0.7854F);

        bone56 = new ModelRenderer(this);
        bone56.setRotationPoint(-10.0F, 13.5F, 18.5F);
        setRotationAngle(bone56, 0.7854F, 0.0F, 0.0F);
        bone56.cubeList.add(new ModelBox(bone56, 321, 0, 2.0F, -0.5F, -2.7F, 2, 1, 3, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 321, 0, -1.0F, -0.5F, -2.7F, 2, 1, 3, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 321, 0, -4.0F, -0.5F, -2.7F, 2, 1, 3, 0.0F, false));

        bone57 = new ModelRenderer(this);
        bone57.setRotationPoint(-10.5F, 5.8F, 17.4353F);
        setRotationAngle(bone57, -0.1745F, 0.0F, 0.0F);
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, 1.5F, 0.8F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, -2.5F, 0.8F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, 1.5F, -3.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, -2.5F, -3.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, 0.5F, 1.8F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 309, 28, -0.5F, -4.2F, -0.7353F, 1, 7, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, -1.5F, 1.8F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, 0.5F, -4.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, -1.5F, -4.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, 2.5F, -2.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, 0.5F, -1.2F, -0.7353F, 3, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, 2.5F, -0.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, -3.5F, -1.2F, -0.7353F, 3, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, -3.5F, -0.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 332, 10, -3.5F, -2.2F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 321, 0, -0.5F, -1.2F, 0.2647F, 1, 1, 1, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 321, 0, -2.5F, -2.2F, 1.2647F, 5, 3, 6, 0.0F, false));

        bone58 = new ModelRenderer(this);
        bone58.setRotationPoint(0.0F, 9.6375F, 13.0F);
        setRotationAngle(bone58, 0.0873F, 0.0F, 0.0F);
        bone58.cubeList.add(new ModelBox(bone58, 321, 0, -1.5F, -0.0375F, 0.0F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 321, 0, -0.5F, -0.0375F, -1.0F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 321, 0, 0.5F, -0.0375F, 0.0F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 321, 0, -0.5F, -0.0375F, 1.0F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 321, 0, -0.5F, -0.0375F, 0.0F, 1, 3, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 321, 0, -1.5F, 2.9625F, -1.0F, 3, 1, 3, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 321, 0, -3.5F, 3.3625F, -14.0F, 7, 6, 22, 0.0F, false));

        bone59 = new ModelRenderer(this);
        bone59.setRotationPoint(0.0F, 2.8625F, -7.5F);
        setRotationAngle(bone59, 0.1745F, 0.0F, 0.0F);
        bone58.addChild(bone59);
        bone59.cubeList.add(new ModelBox(bone59, 319, 16, -0.5F, -0.1F, -3.5F, 1, 1, 7, 0.0F, false));

        head_lights_a = new ModelRenderer(this);
        head_lights_a.setRotationPoint(0.0F, 6.5F, 29.5F);
        setRotationAngle(head_lights_a, -0.0349F, 0.0F, 0.0F);
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 409, 225, -18.9F, 2.4138F, 15.0072F, 7, 3, 6, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 408, 208, -18.0F, 9.2138F, 15.0072F, 5, 1, 6, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 408, 208, 13.0F, 9.2138F, 15.0072F, 5, 1, 6, 0.0F, false));
        head_lights_a.cubeList.add(new ModelBox(head_lights_a, 409, 225, 11.9F, 2.4069F, 15.0071F, 7, 3, 6, 0.0F, false));

        bone64 = new ModelRenderer(this);
        bone64.setRotationPoint(-36.4F, 7.9069F, 18.2071F);
        setRotationAngle(bone64, 0.0F, 0.0F, -3.1416F);
        head_lights_a.addChild(bone64);

        head_lights_b = new ModelRenderer(this);
        head_lights_b.setRotationPoint(0.0F, 6.5F, 29.5F);
        setRotationAngle(head_lights_b, -0.0349F, 0.0F, 0.0F);

        bone66 = new ModelRenderer(this);
        bone66.setRotationPoint(0.0F, 0.1F, 9.8F);
        setRotationAngle(bone66, -0.0175F, 0.0F, 0.0F);
        head_lights_b.addChild(bone66);

        bone67 = new ModelRenderer(this);
        bone67.setRotationPoint(0.0F, 4.25F, 4.9F);
        setRotationAngle(bone67, -0.1745F, 0.0F, 0.0F);
        bone66.addChild(bone67);

        bone68 = new ModelRenderer(this);
        bone68.setRotationPoint(0.0F, 0.0F, 4.0F);
        setRotationAngle(bone68, -0.3491F, 0.0F, 0.0F);
        bone67.addChild(bone68);
        bone68.cubeList.add(new ModelBox(bone68, 391, 221, -18.9F, -3.6733F, -2.2588F, 7, 2, 3, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 391, 221, 11.9F, -3.5733F, -2.2588F, 7, 2, 3, 0.0F, false));

        head_lights_left = new ModelRenderer(this);
        head_lights_left.setRotationPoint(0.0F, 6.5F, 29.5F);
        setRotationAngle(head_lights_left, -0.0349F, 0.0F, 0.0F);

        bone60 = new ModelRenderer(this);
        bone60.setRotationPoint(-36.4F, 7.9069F, 18.2071F);
        setRotationAngle(bone60, 0.0F, 0.0F, -3.1416F);
        head_lights_left.addChild(bone60);
        bone60.cubeList.add(new ModelBox(bone60, 427, 243, -24.5F, 1.4918F, -3.2697F, 7, 1, 6, 0.0F, false));

        head_lights_right = new ModelRenderer(this);
        head_lights_right.setRotationPoint(0.0F, 6.5F, 29.5F);
        setRotationAngle(head_lights_right, -0.0349F, 0.0F, 0.0F);
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 427, 248, 11.9F, 5.4081F, 14.9373F, 7, 1, 6, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 441, 180, -15.5F, -12.5F, -40.8F, 4, 2, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 441, 180, 11.5F, -12.5F, -40.8F, 4, 2, 1, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 441, 180, -14.0F, -10.0F, -40.8F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 441, 179, -1.5F, -15.5F, -41.0F, 3, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 441, 180, 13.0F, -10.0F, -40.8F, 1, 1, 1, 0.0F, false));

        rear_lights_reverse = new ModelRenderer(this);
        rear_lights_reverse.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 426, 203, 11.5F, -10.0F, -40.8F, 1, 1, 1, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 426, 203, -12.5F, -10.0F, -40.8F, 1, 1, 1, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 445, 248, 14.5F, -10.0F, -40.8F, 1, 1, 1, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 445, 248, -15.5F, -10.0F, -40.8F, 1, 1, 1, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 347, 166, -4.0F, -12.1F, -40.8F, 8, 3, 4, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 24.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 104, 153, -3.4F, -18.0F, 18.9F, 6, 4, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 257, 152, -6.4F, -18.0F, 18.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 174, 198, -6.4F, -16.0F, 18.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 183, 225, -16.4F, -18.2F, 18.9F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 244, 221, -16.4F, -17.0F, 18.9F, 2, 1, 1, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, head_lights_a, head_lights_b, rear_lights),
                new LightControllerEntry<>(0.6F, plate, interier),
                new BrakeLights<>(rear_lights_brake),
                new ReverseLights<>(rear_lights_reverse),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, head_lights_right, rear_lights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left, rear_lights_left)
        );
    }

    @Override
    protected void renderModel() {
        bb_main.render(1.0F);
        bone.render(1.0F);
        bone2.render(1.0F);
        bone3.render(1.0F);
        bone4.render(1.0F);
        bone8.render(1.0F);
        bone9.render(1.0F);
        bone10.render(1.0F);
        bone28.render(1.0F);
        bone29.render(1.0F);
        bone33.render(1.0F);
        bone34.render(1.0F);
        bone35.render(1.0F);
        bone36.render(1.0F);
        bone37.render(1.0F);
        bone38.render(1.0F);
        bone39.render(1.0F);
        bone41.render(1.0F);
        bone42.render(1.0F);
        bone46.render(1.0F);
        bone47.render(1.0F);
        bone51.render(1.0F);
        bone53.render(1.0F);
        bone54.render(1.0F);
        bone55.render(1.0F);
        bone56.render(1.0F);
        bone57.render(1.0F);
        bone58.render(1.0F);
    }
}
