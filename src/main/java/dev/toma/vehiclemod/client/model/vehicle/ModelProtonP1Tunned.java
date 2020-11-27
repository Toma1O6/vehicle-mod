package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.*;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP1Tunned;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelProtonP1Tunned extends ModelVehicle<VehicleProtonP1Tunned> {

    private final ModelRenderer bb_main;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone30;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone26;
    private final ModelRenderer bone25;
    private final ModelRenderer bone24;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone8;
    private final ModelRenderer bone31;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone11;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone29;
    private final ModelRenderer bone32;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone40;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone52;
    private final ModelRenderer bone53;
    private final ModelRenderer bone54;
    private final ModelRenderer bone55;
    private final ModelRenderer bone56;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone59;
    private final ModelRenderer bone60;
    private final ModelRenderer bone61;
    private final ModelRenderer bone62;
    private final ModelRenderer bone63;
    private final ModelRenderer bone64;
    private final ModelRenderer bone65;
    private final ModelRenderer bone66;
    private final ModelRenderer bone67;
    private final ModelRenderer bone68;
    private final ModelRenderer bone69;
    private final ModelRenderer bone70;
    private final ModelRenderer bone71;
    private final ModelRenderer head_lights;
    private final ModelRenderer head_lights_right;
    private final ModelRenderer head_lights_left;
    private final ModelRenderer plate;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_reverse;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer interier;

    public ModelProtonP1Tunned() {
        textureWidth = 512;
        textureHeight = 512;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, -18.0F, 2, 2, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, -18.0F, 2, 2, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, -18.0F, 2, 2, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, -18.0F, 2, 2, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, 0.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, 21.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, 21.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -7.0F, 21.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -7.0F, -18.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, -18.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, -18.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, 19.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, 19.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -7.0F, 19.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -7.0F, -20.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -7.0F, -20.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -7.0F, -20.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -8.0F, 20.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -8.0F, 20.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -8.0F, 20.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -8.0F, -19.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -8.0F, -19.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -8.0F, -19.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -6.0F, 20.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -6.0F, 20.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -6.0F, 20.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -16.0F, -6.0F, -19.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 8.0F, -6.0F, -19.0F, 8, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -8.0F, -6.0F, -19.0F, 16, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -15.0F, -9.0F, -16.0F, 3, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -15.0F, -9.0F, 23.0F, 3, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -9.0F, 23.0F, 3, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -9.0F, -16.0F, 3, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -15.0F, -9.0F, -25.0F, 3, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -16.0F, -9.0F, 14.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -9.0F, 14.0F, 3, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -9.0F, -25.0F, 3, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -15.0F, -4.0F, -21.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -15.0F, -4.0F, 18.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -4.0F, 18.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -4.0F, -21.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -15.0F, -13.0F, -21.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -15.0F, -13.0F, 18.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -13.0F, 18.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 12.0F, -13.0F, -21.0F, 3, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -7.0F, -12.0F, 12, 3, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -14.9F, -16.0F, 12, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -14.9F, -13.0F, 12, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 349, 45, 0.0F, -14.9F, -12.0F, 12, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 349, 45, 5.0F, -14.9F, -6.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 349, 45, 3.0F, -10.9F, 1.0F, 8, 4, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -12.0F, -14.9F, -16.0F, 12, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -12.0F, -14.9F, -13.0F, 12, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 349, 45, -12.0F, -14.9F, -12.0F, 12, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 349, 45, -11.0F, -10.9F, 1.0F, 8, 4, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 3.0F, -22.3F, -2.7F, 11, 1, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -22.3F, 5.3F, 7, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -22.3F, -2.7F, 7, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -11.0F, 2, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -12.0F, 2, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -13.0F, 2, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -14.0F, 2, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -15.0F, 2, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -16.0F, 2, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, -10.0F, 2, 10, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -21.0F, -6.0F, 1, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -22.0F, 9.0F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -19.0F, 20.0F, 1, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -18.0F, 21.0F, 1, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -17.5F, 22.0F, 1, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -16.5F, 23.0F, 1, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -16.2F, 24.0F, 1, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -10.0F, 2, 10, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -21.0F, -6.0F, 1, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -22.0F, 9.0F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -19.0F, 20.0F, 1, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -18.0F, 21.0F, 1, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -17.5F, 22.0F, 1, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -16.5F, 23.0F, 1, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -16.2F, 24.0F, 1, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, 9.0F, 2, 10, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, 13.0F, 2, 10, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, 17.0F, 2, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -14.3F, 21.6F, 3, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, 9.0F, 2, 10, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, 13.0F, 2, 10, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, 17.0F, 2, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -14.3F, 21.6F, 3, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -15.0F, -5.0F, 1, 10, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -15.0F, -5.0F, 1, 10, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 234, 13, 12.4F, -13.0F, 6.0F, 1, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 234, 13, -13.4F, -13.0F, 6.0F, 1, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -22.3F, -2.7F, 10, 1, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, -11.0F, 2, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, -12.0F, 2, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, -13.0F, 2, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, -14.0F, 2, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, -15.0F, 2, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -15.0F, -16.0F, 2, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -5.0F, -22.0F, 12, 1, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -7.0F, -30.0F, 12, 3, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -14.0F, -21.0F, 1, 3, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -14.0F, -21.0F, 1, 3, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -13.0F, -14.0F, 1, 9, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -13.0F, -14.0F, 1, 9, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -13.0F, -23.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -13.0F, -23.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -13.0F, -22.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -13.0F, -22.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -12.4F, -24.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -12.4F, -24.0F, 1, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -11.7F, -24.9F, 1, 8, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -11.7F, -24.9F, 1, 8, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -10.9F, -25.9F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -10.9F, -25.9F, 1, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -9.9F, -26.9F, 1, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -13.0F, -9.9F, -26.9F, 1, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 341, 141, -5.0F, -9.4F, -27.0F, 10, 3, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 12.0F, -5.0F, -10.0F, 3, 1, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 13.7F, -4.0F, -10.0F, 2, 1, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -5.0F, -10.0F, 3, 1, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.7F, -4.0F, -10.0F, 2, 1, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -5.0F, 16.0F, 12, 1, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -14.0F, 23.0F, 14, 9, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 328, 10, 0.0F, -14.0F, 11.0F, 12, 9, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 221, 26, 5.0F, -15.0F, 32.0F, 1, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 221, 26, -6.0F, -15.0F, 32.0F, 1, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 9.0F, -12.0F, 27.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 232, 32, -9.0F, -12.0F, 27.0F, 18, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -9.0F, 30.1F, 15, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 14.0F, -11.0F, 30.1F, 1, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -11.0F, 30.1F, 1, 2, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 14.0F, -8.0F, 30.1F, 1, 3, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -8.0F, 30.1F, 1, 3, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 9.0F, -8.0F, 30.1F, 1, 3, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -8.0F, 30.1F, 1, 3, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -9.0F, -6.0F, 30.1F, 9, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -9.0F, -8.0F, 31.1F, 9, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -6.0F, 30.1F, 9, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -8.0F, 31.1F, 9, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 6.0F, -5.0F, 30.1F, 9, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 80, 48, 5.0F, -4.0F, 31.3F, 11, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -5.0F, 30.1F, 9, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 80, 48, -16.0F, -4.0F, 31.3F, 11, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 9.0F, -7.0F, 27.4F, 5, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, 12.5F, -6.4F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, -11.5F, -6.4F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, 10.5F, -6.4F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, -13.5F, -6.4F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, -13.5F, -7.5F, 32.4F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, 10.5F, -7.5F, 32.4F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, 12.5F, -7.7F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, -11.5F, -7.7F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, 10.5F, -7.7F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 224, 29, -13.5F, -7.7F, 31.4F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 232, 32, -9.0F, -7.0F, 27.4F, 18, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.0F, -6.0F, 27.6F, 14, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -12.0F, -7.0F, -12.0F, 12, 3, 28, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -12.0F, -5.0F, -22.0F, 12, 1, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -12.0F, -7.0F, -30.0F, 12, 3, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 221, 26, -4.0F, -6.8F, -30.1F, 8, 3, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 390, 228, -3.5F, -6.6F, -30.2F, 7, 2, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -12.0F, -5.0F, 16.0F, 12, 1, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -12.0F, -14.0F, 23.0F, 12, 9, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 328, 10, -12.0F, -14.0F, 11.0F, 12, 9, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 157, 26, -14.0F, -11.4F, 33.4F, 6, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 157, 26, 8.0F, -11.4F, 33.4F, 6, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -12.0F, 27.0F, 5, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -15.0F, -9.0F, 30.1F, 15, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -7.0F, 27.4F, 5, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -6.0F, 27.6F, 14, 1, 2, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(12.0F, 12.0F, 0.0F);
        setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -10.6066F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -10.6066F, 18.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, -10.6066F, 18.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, 16.9706F, -9.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 16.9706F, -9.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 16.9706F, -9.4853F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -11.6066F, 17.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -11.6066F, 17.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, -11.6066F, 17.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, 15.9706F, -10.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 15.9706F, -10.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 15.9706F, -10.4853F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -12.6066F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -12.6066F, 18.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, -12.6066F, 18.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, 14.9706F, -9.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 14.9706F, -9.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 14.9706F, -9.4853F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, -11.6066F, 19.0919F, 16, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, -11.6066F, 19.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, -11.6066F, 19.0919F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -28.0F, 15.9706F, -8.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -4.0F, 15.9706F, -8.4853F, 8, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -20.0F, 15.9706F, -8.4853F, 16, 2, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-23.5F, 16.0F, -35.0F);
        setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -17.6066F, 10.435F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -45.1838F, 38.0122F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -45.1838F, 38.0122F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -17.6066F, 10.435F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -8.6066F, 10.435F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -36.1838F, 38.0122F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -36.1838F, 38.0122F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -8.6066F, 10.435F, 3, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -13.6066F, 6.435F, 3, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -41.1838F, 34.0122F, 3, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -41.1838F, 34.0122F, 3, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -13.6066F, 6.435F, 3, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -13.6066F, 15.435F, 3, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 8.5F, -41.1838F, 43.0122F, 3, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -41.1838F, 43.0122F, 3, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 35.5F, -13.6066F, 15.435F, 3, 6, 5, 0.0F, false));

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
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, -15.75F, 2, 2, 18, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 200, 17, -2.0F, -1.0F, -15.75F, 2, 2, 18, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, -2.0F, -15.75F, 2, 2, 18, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, -15.75F, 2, 2, 18, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 13.5F, -30.5F);
        setRotationAngle(bone5, -0.6981F, 0.0F, 0.0F);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 5.0F, -1.5F, 2.5F, 10, 1, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 5.0F, 1.5F, 2.5F, 10, 1, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 5.0F, -0.5F, 2.5F, 2, 2, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -15.0F, 1.5F, 2.5F, 10, 1, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -7.0F, -0.5F, 2.5F, 2, 2, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -15.0F, -0.5F, 2.5F, 2, 2, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 13.0F, -0.5F, 2.5F, 2, 2, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -15.0F, -1.5F, 2.5F, 10, 1, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 368, 32, -4.5F, -1.5F, 3.4F, 1, 4, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 368, 32, -2.5F, -1.5F, 3.4F, 1, 4, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 368, 32, -0.5F, -1.5F, 3.4F, 1, 4, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 368, 32, 10.5F, -8.5F, 4.4F, 1, 4, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 368, 32, -11.5F, -8.5F, 4.4F, 1, 4, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 368, 32, 1.5F, -1.5F, 3.4F, 1, 4, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 368, 32, 3.5F, -1.5F, 3.4F, 1, 4, 3, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, 0.5F, 4.5F);
        setRotationAngle(bone30, 0.2618F, 0.0F, 0.0F);
        bone5.addChild(bone30);
        bone30.cubeList.add(new ModelBox(bone30, 85, 32, 7.0F, -1.4F, -1.5F, 6, 2, 3, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 85, 32, -13.0F, -1.4F, -1.5F, 6, 2, 3, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 13.5F, -30.5F);
        setRotationAngle(bone6, -0.6981F, 0.0F, 0.0F);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -3.5F, 3.0F);
        setRotationAngle(bone7, -0.192F, 0.0F, 0.0F);
        bone6.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 2.0F, -2.9F, -0.1F, 6, 5, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 136, 16, 8.0F, -0.8075F, 0.0964F, 6, 3, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 136, 16, -14.0F, -0.8075F, 0.0964F, 6, 3, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 8.0F, -2.9F, -0.1F, 5, 2, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 12.0F, -0.9F, -0.1F, 1, 1, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -13.0F, -0.9F, -0.1F, 1, 1, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -13.0F, -2.9F, -0.1F, 5, 2, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 13.0F, -2.9F, -0.1F, 2, 5, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -8.0F, -2.9F, -0.1F, 6, 5, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -15.0F, -2.9F, -0.1F, 2, 5, 1, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.0F, -0.4F, 0.4F);
        setRotationAngle(bone26, 0.1571F, 0.0F, 0.0F);
        bone7.addChild(bone26);
        bone26.cubeList.add(new ModelBox(bone26, 0, 0, -2.0F, -2.5F, 0.0F, 2, 5, 1, 0.0F, false));
        bone26.cubeList.add(new ModelBox(bone26, 0, 0, 0.0F, -2.5F, 0.0F, 2, 5, 1, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, -0.4F, 0.2F);
        setRotationAngle(bone25, 0.6458F, 0.0F, 0.0F);
        bone7.addChild(bone25);

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0125F, 1.1F, 0.2F);
        setRotationAngle(bone24, 0.8901F, 0.0F, 0.0F);
        bone7.addChild(bone24);

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0125F, 1.1F, 0.2F);
        setRotationAngle(bone27, 0.8901F, 0.0F, 0.0F);
        bone7.addChild(bone27);

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.0125F, 1.1F, 0.2F);
        setRotationAngle(bone28, 0.8901F, 0.0F, 0.0F);
        bone7.addChild(bone28);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -5.4F, 0.4F);
        setRotationAngle(bone8, -0.3491F, 0.0F, 0.0F);
        bone7.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 11.0F, -2.5F, 0.4F, 4, 5, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -15.0F, -2.5F, 0.4F, 4, 5, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -11.0F, -2.5F, 0.4F, 6, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 5.0F, -2.5F, 0.4F, 6, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -5.0F, -2.5F, 0.4F, 5, 5, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 0.0F, -2.5F, 0.4F, 5, 5, 1, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, 19.4F, 27.1F);
        bone8.addChild(bone31);
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, -11.0F, -20.9F, -26.7F, 6, 4, 1, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, 5.0F, -20.9F, -26.7F, 6, 4, 1, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, -5.4F, 0.4F);
        setRotationAngle(bone9, -0.3491F, 0.0F, 0.0F);
        bone7.addChild(bone9);

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, -5.0F, 0.9F);
        setRotationAngle(bone10, -0.3142F, 0.0F, 0.0F);
        bone9.addChild(bone10);
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 12.0F, -0.4F, 0.3F, 3, 3, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 0.0F, 0.6F, 0.3F, 12, 2, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 216, 24, 0.0F, -0.4F, 0.6F, 12, 1, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -12.0F, 0.6F, 0.3F, 12, 2, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 216, 24, -12.0F, -0.4F, 0.6F, 12, 1, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -15.0F, -0.4F, 0.3F, 3, 3, 1, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, -1.9F, 0.8F);
        setRotationAngle(bone12, -0.2967F, 0.0F, 0.0F);
        bone10.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 12.0F, -1.4F, 0.0F, 3, 3, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -15.0F, -1.4F, 0.0F, 3, 3, 1, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, -1.9F, 0.8F);
        setRotationAngle(bone13, -0.2967F, 0.0F, 0.0F);
        bone10.addChild(bone13);

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, -2.9F, 0.4F);
        setRotationAngle(bone14, -0.576F, 0.0F, 0.0F);
        bone13.addChild(bone14);
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, 0.0F, -1.5F, 0.5F, 15, 3, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, -15.0F, -1.5F, 0.5F, 15, 3, 1, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, -2.9F, 0.4F);
        setRotationAngle(bone15, -0.576F, 0.0F, 0.0F);
        bone13.addChild(bone15);

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, -3.0F, 0.9F);
        setRotationAngle(bone16, -0.2793F, 0.0F, 0.0F);
        bone15.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, 0.0F, -1.4F, 0.0F, 15, 3, 1, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -15.0F, -1.4F, 0.0F, 15, 3, 1, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, -3.9F, 0.5F);
        setRotationAngle(bone17, -0.1745F, 0.0F, 0.0F);
        bone16.addChild(bone17);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -15.0F, -2.4F, 0.0F, 15, 5, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 0.0F, -2.4F, 0.0F, 15, 5, 1, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(14.5F, 11.5F, -25.5F);
        setRotationAngle(bone11, 0.6632F, 0.4363F, 0.0F);

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 3.5F, -15.5F);
        setRotationAngle(bone18, -0.9599F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 12.0F, -3.9F, 4.2F, 2, 8, 1, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -14.0F, -3.9F, 4.2F, 2, 8, 1, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 3.5F, -15.5F);
        setRotationAngle(bone19, -0.9599F, 0.0F, 0.0F);

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, -7.9F, 4.7F);
        setRotationAngle(bone20, -0.1745F, 0.0F, 0.0F);
        bone19.addChild(bone20);
        bone20.cubeList.add(new ModelBox(bone20, 0, 0, 12.0F, 0.1F, 0.2F, 2, 4, 1, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 0, 0, -14.0F, 0.1F, 0.2F, 2, 4, 1, 0.0F, false));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, -7.9F, 4.7F);
        setRotationAngle(bone21, -0.1745F, 0.0F, 0.0F);
        bone19.addChild(bone21);

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, -1.9F, 0.7F);
        setRotationAngle(bone22, -0.0873F, 0.0F, 0.0F);
        bone21.addChild(bone22);
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, 0.0F, -1.906F, -0.3342F, 14, 4, 1, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 138, 24, 0.0F, 2.094F, -0.3342F, 12, 1, 1, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 138, 24, -12.0F, 2.094F, -0.3342F, 12, 1, 1, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 0, -14.0F, -1.906F, -0.3342F, 14, 4, 1, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, -1.9F, 0.7F);
        setRotationAngle(bone23, -0.0873F, 0.0F, 0.0F);
        bone21.addChild(bone23);

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(0.0F, 17.5F, -32.5F);
        setRotationAngle(bone29, 0.5236F, 0.0F, 0.0F);
        bone29.cubeList.add(new ModelBox(bone29, 82, 32, -15.0F, 2.6F, -0.2F, 15, 1, 2, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 58, 45, -13.0F, 1.3F, 1.0F, 7, 1, 3, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 64, 18, -16.0F, 1.3F, 3.0F, 1, 1, 3, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 64, 18, 15.0F, 1.3F, 3.0F, 1, 1, 3, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 82, 32, 0.0F, 2.6F, -0.2F, 15, 1, 2, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 58, 45, 6.0F, 1.3F, 1.0F, 7, 1, 3, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, 9.6F, -16.5F);
        setRotationAngle(bone32, 0.3491F, 0.0F, 0.0F);
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, 10.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, 8.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, 6.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, 4.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, 2.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, 0.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, -1.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, -3.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, -5.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, -7.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, -9.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 226, 34, -11.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, 2.2F, 15.3F);
        setRotationAngle(bone33, -0.0873F, 0.0F, 0.0F);
        bone33.cubeList.add(new ModelBox(bone33, 0, 0, -14.0F, 0.0F, -6.1F, 14, 1, 4, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 0, 0, 0.0F, 0.0F, -6.1F, 14, 1, 4, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, 2.2F, 15.3F);
        setRotationAngle(bone34, -0.0873F, 0.0F, 0.0F);

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, 0.5F, -0.1F);
        setRotationAngle(bone35, -0.192F, 0.0F, 0.0F);
        bone34.addChild(bone35);
        bone35.cubeList.add(new ModelBox(bone35, 0, 0, -14.0F, -0.1F, -2.1F, 14, 1, 4, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 0, 0, 0.0F, -0.1F, -2.1F, 14, 1, 4, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.0F, 0.5F, -0.1F);
        setRotationAngle(bone36, -0.192F, 0.0F, 0.0F);
        bone34.addChild(bone36);

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.0F, 0.4F, 3.9F);
        setRotationAngle(bone37, -0.1396F, 0.0F, 0.0F);
        bone36.addChild(bone37);
        bone37.cubeList.add(new ModelBox(bone37, 0, 0, 12.0F, -0.2F, -2.1F, 2, 1, 4, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 0, 0, -14.0F, -0.2F, -2.1F, 2, 1, 4, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 149, 10, -12.0F, -0.2F, -2.1F, 12, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 149, 10, 0.0F, -0.2F, -2.1F, 12, 1, 1, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.0F, 0.4F, 3.9F);
        setRotationAngle(bone38, -0.1396F, 0.0F, 0.0F);
        bone36.addChild(bone38);

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, 0.3F, 3.9F);
        setRotationAngle(bone39, -0.2094F, 0.0F, 0.0F);
        bone38.addChild(bone39);
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, 12.0F, -0.1F, -2.1F, 2, 1, 10, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, -14.0F, -0.1F, -2.1F, 2, 1, 10, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, 19.5F, 11.0F);
        setRotationAngle(bone40, 1.4835F, 0.0F, 0.0F);
        bone40.cubeList.add(new ModelBox(bone40, 0, 0, 12.0F, 1.0F, 0.0F, 3, 1, 4, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 0, 0, -15.0F, 1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 19.5F, 11.0F);
        setRotationAngle(bone41, 1.4835F, 0.0F, 0.0F);

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, 1.5F, 6.0F);
        setRotationAngle(bone42, -0.4887F, 0.0F, 0.0F);
        bone41.addChild(bone42);
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, 0.5F, -2.0F, 3, 1, 4, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 12.0F, 0.5F, -2.0F, 3, 1, 4, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 1.5F, 6.0F);
        setRotationAngle(bone43, -0.8378F, 0.0F, 0.0F);
        bone41.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 0, 0, -15.0F, -0.2F, 2.0F, 3, 1, 4, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 0, 0, 12.0F, -0.2F, 2.0F, 3, 1, 4, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(0.0F, 1.5F, 6.0F);
        setRotationAngle(bone44, -1.4312F, 0.0F, 0.0F);
        bone41.addChild(bone44);
        bone44.cubeList.add(new ModelBox(bone44, 0, 0, -15.0F, -3.5F, 4.8F, 3, 1, 4, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 0, 0, 12.0F, -3.5F, 4.8F, 3, 1, 4, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(0.0F, 19.5F, 32.5F);
        setRotationAngle(bone45, 0.3491F, 0.0F, 0.0F);
        bone45.cubeList.add(new ModelBox(bone45, 0, 0, 0.0F, -2.4F, -5.5F, 14, 1, 3, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 0, 0, 0.0F, -2.4F, -2.5F, 12, 1, 3, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 0, 0, -14.0F, -2.4F, -5.5F, 14, 1, 3, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 0, 0, -14.0F, -2.4F, -2.5F, 14, 1, 3, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.0F, 7.5F, 30.0F);
        setRotationAngle(bone46, -0.2618F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 0, 0, 0.0F, 3.2F, -3.3F, 15, 2, 8, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 0, 0, -15.0F, 3.2F, -3.3F, 15, 2, 8, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, 4.2F, 8.2F);
        setRotationAngle(bone47, -0.4363F, 0.0F, 0.0F);
        bone46.addChild(bone47);
        bone47.cubeList.add(new ModelBox(bone47, 0, 0, -15.0F, 0.6F, -3.6F, 1, 2, 2, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 0, 0, -8.0F, 0.6F, -3.6F, 8, 2, 2, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 0, 0, -14.0F, 0.6F, -3.6F, 6, 2, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 0, 0, 8.0F, 0.6F, -3.6F, 6, 2, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 0, 0, 14.0F, 0.6F, -3.6F, 1, 2, 2, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 0, 0, 0.0F, 0.6F, -3.6F, 8, 2, 2, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(0.0F, 4.2F, 8.2F);
        setRotationAngle(bone48, -0.4363F, 0.0F, 0.0F);
        bone46.addChild(bone48);

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(0.0F, 1.6F, -0.6F);
        setRotationAngle(bone49, -0.4363F, 0.0F, 0.0F);
        bone48.addChild(bone49);
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, -15.0F, -0.5F, -1.3F, 1, 2, 2, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, -8.0F, -0.5F, -0.3F, 8, 2, 1, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, -7.0F, -0.2F, -1.3F, 14, 1, 1, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, -8.0F, -0.5F, -1.3F, 1, 2, 1, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, 7.0F, -0.5F, -1.3F, 1, 2, 1, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, 14.0F, -0.5F, -1.3F, 1, 2, 2, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, 0.0F, -0.5F, -0.3F, 8, 2, 1, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(0.0F, 10.2F, 26.1F);
        setRotationAngle(bone50, -0.1745F, 0.0F, 0.0F);
        bone50.cubeList.add(new ModelBox(bone50, 0, 0, 12.0F, -0.4F, -0.6F, 3, 1, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 0, 0, -15.0F, -0.4F, -0.6F, 3, 1, 1, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(0.0F, 8.3F, 31.0F);
        setRotationAngle(bone51, 0.0524F, 0.0F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, -15.0F, 0.1047F, -0.0027F, 15, 1, 4, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, 0.0F, 0.1047F, -0.0027F, 15, 1, 4, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 229, 53, 15.0F, -0.8953F, -1.0027F, 1, 3, 5, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 229, 53, -16.0F, -0.8953F, -1.0027F, 1, 3, 5, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(0.0F, 8.3F, 31.0F);
        setRotationAngle(bone52, 0.0524F, 0.0F, 0.0F);

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(0.0F, 0.5F, 3.0F);
        setRotationAngle(bone53, 0.1745F, 0.0F, 0.0F);
        bone52.addChild(bone53);
        bone53.cubeList.add(new ModelBox(bone53, 0, 0, 0.0F, -0.2501F, 0.8487F, 15, 1, 2, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 229, 53, 15.0F, -1.2501F, 0.6487F, 1, 3, 3, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 229, 53, -16.0F, -1.2501F, 0.6487F, 1, 3, 3, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 0, 0, -15.0F, -0.2501F, 0.8487F, 15, 1, 2, 0.0F, false));

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(0.0F, 14.0F, 19.0F);
        setRotationAngle(bone54, -0.1745F, 0.0F, 0.0F);

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(bone55, -0.7854F, 0.0F, 0.0F);

        bone56 = new ModelRenderer(this);
        bone56.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(bone56, -0.7854F, 0.0F, 0.0F);

        bone57 = new ModelRenderer(this);
        bone57.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(bone57, -0.7854F, 0.0F, 0.0F);

        bone58 = new ModelRenderer(this);
        bone58.setRotationPoint(0.0F, 17.5F, 33.1F);
        setRotationAngle(bone58, -0.5236F, 0.0F, 0.0F);
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, 7.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, 5.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, 3.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, 1.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, -0.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, -2.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, -4.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, -6.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 154, 21, -8.5F, -2.8F, -0.2F, 1, 3, 2, 0.0F, false));

        bone59 = new ModelRenderer(this);
        bone59.setRotationPoint(-4.0F, 0.46F, 0.3F);
        setRotationAngle(bone59, -0.1745F, 0.0F, 0.0F);

        bone60 = new ModelRenderer(this);
        bone60.setRotationPoint(4.0F, 0.9667F, 2.8333F);
        setRotationAngle(bone60, 0.0873F, 0.0F, 0.0F);
        bone59.addChild(bone60);
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 3.0F, -0.7267F, -4.8333F, 1, 1, 3, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 1.0F, -0.7267F, -4.8333F, 2, 1, 3, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -1.0F, -0.4267F, -4.8333F, 2, 1, 3, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -3.0F, -0.7267F, -4.8333F, 2, 1, 3, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -4.0F, -0.7267F, -4.8333F, 1, 1, 3, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -4.0F, -0.7267F, -1.8333F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -4.0F, -0.7267F, -0.8333F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -4.0F, -0.7267F, 0.1667F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -4.0F, -0.7267F, 1.1667F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -4.0F, -0.7267F, 2.1667F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -3.0F, -0.7267F, 2.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -3.0F, -0.7267F, 1.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -3.0F, -0.7267F, 0.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -3.0F, -0.7267F, -0.8333F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -3.0F, -0.7267F, -1.8333F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -1.0F, -0.4267F, -1.8333F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -1.0F, -0.4267F, -0.8333F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -1.0F, -0.4267F, 0.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -1.0F, -0.4267F, 1.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -1.0F, -0.4267F, 2.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 1.0F, -0.7267F, 2.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 1.0F, -0.7267F, 1.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 1.0F, -0.7267F, 0.1667F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 1.0F, -0.7267F, -0.8333F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 1.0F, -0.7267F, -1.8333F, 2, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 3.0F, -0.7267F, -1.8333F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 3.0F, -0.7267F, -0.8333F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 3.0F, -0.7267F, 0.1667F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 3.0F, -0.7267F, 1.1667F, 1, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, 3.0F, -0.7267F, 2.1667F, 1, 1, 1, 0.0F, false));

        bone61 = new ModelRenderer(this);
        bone61.setRotationPoint(15.5F, 20.0F, 1.75F);
        setRotationAngle(bone61, 0.0F, 0.0F, -0.6109F);
        bone61.cubeList.add(new ModelBox(bone61, 0, 0, -1.2F, -1.0F, 0.25F, 1, 1, 10, 0.0F, false));
        bone61.cubeList.add(new ModelBox(bone61, 0, 0, -1.2F, -1.0F, -10.75F, 1, 1, 11, 0.0F, false));

        bone62 = new ModelRenderer(this);
        bone62.setRotationPoint(-16.0F, 19.5F, 1.25F);
        setRotationAngle(bone62, 0.0F, 0.0F, -0.6109F);
        bone62.cubeList.add(new ModelBox(bone62, 0, 0, 0.3F, 0.5F, -10.25F, 1, 1, 10, 0.0F, false));
        bone62.cubeList.add(new ModelBox(bone62, 0, 0, 0.3F, 0.5F, -0.25F, 1, 1, 11, 0.0F, false));

        bone63 = new ModelRenderer(this);
        bone63.setRotationPoint(0.0F, 9.6F, 8.0F);
        setRotationAngle(bone63, -0.192F, 0.0F, 0.0F);
        bone63.cubeList.add(new ModelBox(bone63, 349, 45, 3.0F, -3.2F, -1.0F, 8, 7, 2, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 349, 45, -11.0F, -3.2F, -1.0F, 8, 7, 2, 0.0F, false));

        bone64 = new ModelRenderer(this);
        bone64.setRotationPoint(6.7F, 15.1F, -6.5F);
        setRotationAngle(bone64, 0.6981F, 0.0F, 0.0F);
        bone64.cubeList.add(new ModelBox(bone64, 341, 40, -2.5F, 0.0F, -1.5F, 1, 2, 1, 0.0F, false));
        bone64.cubeList.add(new ModelBox(bone64, 341, 40, -0.5F, 0.0F, -1.5F, 1, 2, 1, 0.0F, false));
        bone64.cubeList.add(new ModelBox(bone64, 341, 40, 1.5F, 0.0F, -1.5F, 1, 2, 1, 0.0F, false));

        bone65 = new ModelRenderer(this);
        bone65.setRotationPoint(7.5F, 10.6F, -3.5833F);
        setRotationAngle(bone65, 0.1745F, 0.0F, 0.0F);
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -3.5F, -2.5F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -2.5F, -3.5F, -0.6167F, 3, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, 0.5F, -2.5F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, 1.5F, -1.5F, -0.6167F, 1, 3, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, 0.5F, 1.5F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -2.5F, 2.5F, -0.6167F, 3, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -3.5F, 1.5F, -0.6167F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -4.5F, -1.5F, -0.6167F, 1, 3, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -3.5F, -0.5F, -0.6167F, 2, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -1.5F, -2.5F, -0.6167F, 1, 5, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -0.5F, -0.5F, -0.6167F, 2, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 349, 45, -1.5F, -0.5F, -1.6167F, 1, 1, 1, 0.0F, false));

        bone66 = new ModelRenderer(this);
        bone66.setRotationPoint(-1.5F, 13.1F, -1.0F);
        setRotationAngle(bone66, -0.1745F, 0.0F, 0.0F);
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, -0.5F, 1.0F, -6.0F, 4, 3, 2, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, -0.5F, 1.0F, -4.0F, 4, 3, 10, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 1.5F, -2.0F, 1.0F, 1, 2, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 1.5F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 0.5F, -2.0F, 1.0F, 1, 1, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 2.5F, -2.0F, 1.0F, 1, 1, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 1.5F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 1.5F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 1.5F, -1.0F, 4.0F, 1, 1, 4, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, 1.5F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 349, 45, -0.5F, 1.0F, 6.0F, 4, 3, 10, 0.0F, false));

        bone67 = new ModelRenderer(this);
        bone67.setRotationPoint(14.5F, 9.5F, -8.5F);
        setRotationAngle(bone67, 0.0F, 0.8727F, -0.8727F);
        bone67.cubeList.add(new ModelBox(bone67, 162, 32, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        bone68 = new ModelRenderer(this);
        bone68.setRotationPoint(-14.5F, 9.5F, -8.5F);
        setRotationAngle(bone68, 0.0F, -0.8727F, 0.8727F);
        bone68.cubeList.add(new ModelBox(bone68, 162, 32, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        bone69 = new ModelRenderer(this);
        bone69.setRotationPoint(-16.5F, 8.0F, -6.75F);
        setRotationAngle(bone69, 0.0F, 0.3491F, 0.0F);
        bone69.cubeList.add(new ModelBox(bone69, 369, 204, -0.9F, -0.5F, -0.25F, 2, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 0, 0, -1.4F, -1.0F, -0.35F, 3, 2, 1, 0.0F, false));

        bone70 = new ModelRenderer(this);
        bone70.setRotationPoint(16.5F, 8.0F, -6.75F);
        setRotationAngle(bone70, 0.0F, -0.2443F, 0.0F);
        bone70.cubeList.add(new ModelBox(bone70, 369, 204, -1.1F, -0.5F, -0.35F, 2, 1, 1, 0.0F, false));
        bone70.cubeList.add(new ModelBox(bone70, 0, 0, -1.6F, -1.0F, -0.45F, 3, 2, 1, 0.0F, false));

        bone71 = new ModelRenderer(this);
        bone71.setRotationPoint(0.0F, 1.2F, 12.3F);
        setRotationAngle(bone71, 0.4363F, 0.0F, 0.0F);
        bone71.cubeList.add(new ModelBox(bone71, 144, 21, -0.5F, -1.5F, -4.5F, 1, 1, 10, 0.0F, false));

        head_lights = new ModelRenderer(this);
        head_lights.setRotationPoint(0.0F, 10.7592F, -27.0036F);
        setRotationAngle(head_lights, -0.8901F, 0.0F, 0.0F);
        head_lights.cubeList.add(new ModelBox(head_lights, 394, 200, 8.5F, -0.1667F, 2.2F, 3, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 394, 200, 8.5F, 1.1333F, 2.2F, 3, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 394, 200, -11.5F, -0.1667F, 2.2F, 3, 1, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 394, 200, -11.5F, 1.1333F, 2.2F, 3, 1, 1, 0.0F, false));

        head_lights_right = new ModelRenderer(this);
        head_lights_right.setRotationPoint(0.0F, 10.7592F, -27.0036F);
        setRotationAngle(head_lights_right, -0.8901F, 0.0F, 0.0F);
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 440, 250, -12.8F, 1.1333F, 2.2F, 1, 1, 1, 0.0F, false));

        head_lights_left = new ModelRenderer(this);
        head_lights_left.setRotationPoint(0.0F, 10.7592F, -27.0036F);
        setRotationAngle(head_lights_left, -0.8901F, 0.0F, 0.0F);
        head_lights_left.cubeList.add(new ModelBox(head_lights_left, 440, 250, 11.8F, 1.1333F, 2.2F, 1, 1, 1, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 390, 228, -3.5F, -6.6F, -30.2F, 7, 2, 8, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(rear_lights, -0.7854F, 0.0F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -1.0F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -23.0F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -1.0F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -23.0F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -1.0F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -23.0F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -1.0F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -23.0F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -1.0F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -23.0F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, 0.2F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, 0.2F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, 0.2F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, 0.2F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, 0.2F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -24.2F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -24.2F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -24.2F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -24.2F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 429, 176, -24.2F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));

        rear_reverse = new ModelRenderer(this);
        rear_reverse.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(rear_reverse, -0.7854F, 0.0F, 0.0F);
        rear_reverse.cubeList.add(new ModelBox(rear_reverse, 399, 198, -20.6F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_reverse.cubeList.add(new ModelBox(rear_reverse, 399, 198, -20.6F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_reverse.cubeList.add(new ModelBox(rear_reverse, 399, 198, -20.6F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));
        rear_reverse.cubeList.add(new ModelBox(rear_reverse, 399, 198, -3.4F, 0.8929F, -1.4929F, 1, 1, 1, 0.0F, false));
        rear_reverse.cubeList.add(new ModelBox(rear_reverse, 399, 198, -3.4F, 1.1929F, -1.1929F, 1, 1, 1, 0.0F, false));
        rear_reverse.cubeList.add(new ModelBox(rear_reverse, 399, 198, -3.4F, 1.4929F, -0.8929F, 1, 1, 1, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(rear_lights_right, -0.7854F, 0.0F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 444, 249, -25.4F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 444, 249, -25.4F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 444, 249, -25.4F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 444, 249, -25.4F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 444, 249, -25.4F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(rear_lights_left, -0.7854F, 0.0F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 444, 249, 1.4F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 444, 249, 1.4F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 444, 249, 1.4F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 444, 249, 1.4F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 444, 249, 1.4F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(11.5F, 13.5F, 35.5F);
        setRotationAngle(rear_lights_brake, -0.7854F, 0.0F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 445, 179, -3.4F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 445, 179, -3.4F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -2.2F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -2.2F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -2.2F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -2.2F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -2.2F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -21.8F, 1.5F, -0.9F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -21.8F, 1.2F, -1.2F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -21.8F, 0.9F, -1.5F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -21.8F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 429, 176, -21.8F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 445, 179, -20.6F, 0.6F, -1.8F, 1, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 445, 179, -20.6F, 0.3F, -2.1F, 1, 1, 1, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 24.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 237, 208, 10.0F, -14.4F, -6.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 173, 224, 10.5F, -13.1F, -6.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 445, 237, 10.5F, -11.8F, -6.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 104, 146, 1.4F, -14.4F, -6.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 186, 221, 0.0F, -13.1F, -6.9F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 440, 248, 0.6F, -11.8F, -6.9F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 368, 138, -11.6F, -14.6F, -6.9F, 4, 4, 1, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, head_lights, rear_lights),
                new LightControllerEntry<>(0.5F, interier, plate),
                new BrakeLights<>(rear_lights_brake),
                new ReverseLights<>(rear_reverse),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, head_lights_right, rear_lights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left, rear_lights_left)
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
        bone11.render(1.0F);
        bone18.render(1.0F);
        bone19.render(1.0F);
        bone29.render(1.0F);
        bone32.render(1.0F);
        bone33.render(1.0F);
        bone34.render(1.0F);
        bone40.render(1.0F);
        bone41.render(1.0F);
        bone45.render(1.0F);
        bone46.render(1.0F);
        bone50.render(1.0F);
        bone51.render(1.0F);
        bone52.render(1.0F);
        bone54.render(1.0F);
        bone55.render(1.0F);
        bone56.render(1.0F);
        bone57.render(1.0F);
        bone58.render(1.0F);
        bone59.render(1.0F);
        bone61.render(1.0F);
        bone62.render(1.0F);
        bone63.render(1.0F);
        bone64.render(1.0F);
        bone65.render(1.0F);
        bone66.render(1.0F);
        bone67.render(1.0F);
        bone68.render(1.0F);
        bone69.render(1.0F);
        bone70.render(1.0F);
        bone71.render(1.0F);
    }
}
