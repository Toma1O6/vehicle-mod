package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.standart.VehicleSputnik2000L;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSputnik2000L extends ModelVehicle<VehicleSputnik2000L> {

    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone41;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer bone42;
    private final ModelRenderer bone45;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone11;
    private final ModelRenderer bone15;
    private final ModelRenderer bone12;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer bone10;
    private final ModelRenderer head_lights;
    private final ModelRenderer head_lights_left_a;
    private final ModelRenderer head_lights_left_b;
    private final ModelRenderer head_lights_right_a;
    private final ModelRenderer head_lights_right_b;
    private final ModelRenderer plate;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer rear_lights_reverse;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer interier;
    private final ModelRenderer bb_main;

    public ModelSputnik2000L() {
        textureWidth = 512;
        textureHeight = 512;

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -19.0F, 34.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -25.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -13.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -19.0F, 22.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -19.0F, -34.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -25.0F, -40.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -13.0F, -40.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -19.0F, -46.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -19.0F, 34.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -25.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -13.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -19.0F, 22.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -19.0F, -34.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -25.0F, -40.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -13.0F, -40.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -19.0F, -46.0F, 7, 8, 8, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(2.5F, -27.0F, 33.0F);
        bone21.addChild(bone22);
        setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 5.1924F, 9.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, -0.8076F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 5.1924F, -2.2218F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 11.1924F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 53.2756F, -38.3051F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 47.2756F, -44.3051F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 53.2756F, -50.3051F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 59.2756F, -44.3051F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 5.1924F, 9.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, -0.8076F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 5.1924F, -2.2218F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 11.1924F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 53.2756F, -38.3051F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 47.2756F, -44.3051F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 53.2756F, -50.3051F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 59.2756F, -44.3051F, 7, 8, 8, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone41.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -17.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -16.0F, -38.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -15.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -16.0F, -36.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -17.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -16.0F, -38.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -15.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -16.0F, -36.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -17.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -16.0F, 30.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -15.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -16.0F, 32.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -17.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -16.0F, 30.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -15.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -16.0F, 32.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -17.0F, 31.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, 30.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -15.0F, 31.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, 32.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -17.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, -38.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -15.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, -36.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -17.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, -38.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -15.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, -36.0F, 16, 2, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(3.0F, -27.0F, -44.0F);
        bone43.addChild(bone44);
        setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 1.8284F, 12.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 0.8284F, 13.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 1.8284F, 14.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 2.8284F, 13.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 1.8284F, 12.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 0.8284F, 13.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 1.8284F, 14.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 2.8284F, 13.1421F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -46.2548F, 60.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -47.2548F, 61.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -46.2548F, 62.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -45.2548F, 61.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -46.2548F, 60.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -47.2548F, 61.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -46.2548F, 62.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -45.2548F, 61.2254F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -47.2548F, 61.2254F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -46.2548F, 60.2254F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -45.2548F, 61.2254F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -46.2548F, 62.2254F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 0.8284F, 13.1421F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 1.8284F, 12.1421F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 2.8284F, 13.1421F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 1.8284F, 14.1421F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 0.8284F, 13.1421F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 1.8284F, 12.1421F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 2.8284F, 13.1421F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 1.8284F, 14.1421F, 16, 2, 2, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(-1.0F, 20.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -11.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -13.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -12.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -12.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -11.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -13.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -12.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -12.0F, 4.6F, 2, 2, 27, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(-20.0F, -23.0F, -27.9F);
        bone42.addChild(bone45);
        setRotationAngle(bone45, 0.0F, 0.0F, 0.7854F);
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -7.6569F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 20.6274F, -6.6569F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -5.6569F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 22.6274F, -6.6569F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -7.6569F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 20.6274F, -6.6569F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -5.6569F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 22.6274F, -6.6569F, 32.5F, 2, 2, 27, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-1.0F, -15.5F, 57.0F);
        bone.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -18.5F, -11.0F, 17, 18, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 9.0F, -18.5F, -11.0F, 16, 18, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -18.5F, -12.3F, 25, 22, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -18.5F, -12.3F, 25, 22, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 9, 27, 0.0F, -19.5F, -25.0F, 26, 4, 30, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 9, 27, -26.0F, -19.5F, -25.0F, 26, 4, 30, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 16.0F, -19.6F, -36.3F, 10, 8, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -19.6F, -36.3F, 10, 8, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -16.0F, -19.6F, -36.3F, 16, 21, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -19.6F, -36.3F, 16, 21, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -19.6F, -40.3F, 3, 24, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -19.6F, -40.3F, 3, 24, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -6.6F, -81.3F, 3, 11, 6, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -6.6F, -81.3F, 3, 11, 6, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -23.0F, -13.6F, -37.3F, 10, 12, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 13.0F, -13.6F, -37.3F, 10, 12, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -19.6F, -40.3F, 23, 24, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -23.0F, -19.6F, -40.3F, 23, 24, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -16.0F, -12.6F, -23.3F, 3, 14, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 13.0F, -12.6F, -23.3F, 3, 14, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -0.6F, -36.3F, 13, 2, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, 1.4F, -23.3F, 13, 0, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -13.0F, -0.6F, -36.3F, 13, 2, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -13.0F, 1.4F, -23.3F, 13, 0, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 22.0F, 4.4F, -58.3F, 4, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 22.0F, 4.4F, -82.3F, 4, 1, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -27.0F, 4.4F, -82.3F, 4, 1, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -27.0F, 4.4F, -58.3F, 4, 1, 23, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, 4.4F, -82.3F, 4, 1, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, 4.4F, -58.3F, 4, 1, 23, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, 2.4F, -82.3F, 27, 2, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, 2.4F, -58.3F, 27, 2, 23, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -27.0F, 2.4F, -58.3F, 27, 2, 23, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -27.0F, 2.4F, -82.3F, 27, 2, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -19.6F, -75.3F, 2, 24, 30, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -19.6F, -75.3F, 2, 24, 30, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -19.6F, -45.3F, 3, 24, 5, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -19.6F, -45.3F, 3, 24, 5, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -18.5F, -16.3F, 25, 10, 6, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -18.5F, -16.3F, 25, 10, 6, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -18.5F, -20.3F, 25, 8, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -18.5F, -20.3F, 25, 8, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -18.5F, -23.3F, 25, 6, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -18.5F, -23.3F, 25, 6, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 25.0F, -8.5F, -13.0F, 1, 9, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -8.5F, -13.0F, 1, 9, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -3.6F, -82.3F, 26, 8, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -3.6F, -82.3F, 26, 8, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -19.6F, -83.3F, 3, 14, 8, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -19.6F, -83.3F, 3, 14, 8, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -19.6F, -85.3F, 3, 12, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -20.6F, -85.3F, 26, 13, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -1.6F, -58.3F, 23, 2, 23, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -1.6F, -82.3F, 23, 2, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -23.0F, -1.6F, -58.3F, 23, 2, 23, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -23.0F, -1.6F, -82.3F, 23, 2, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -19.6F, -85.3F, 3, 12, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -20.6F, -85.3F, 26, 13, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -15.0F, -13.6F, -105.3F, 1, 15, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 14.0F, -13.6F, -105.3F, 1, 15, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -0.6F, -130.3F, 27, 6, 26, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -27.0F, -0.6F, -130.3F, 27, 6, 26, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -26.0F, -20.6F, -28.3F, 3, 2, 34, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 23.0F, -20.6F, -28.3F, 3, 2, 34, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -23.0F, -20.6F, -28.3F, 23, 2, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, -20.6F, -28.3F, 23, 2, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 389, 73, 18.0F, -14.5F, 2.2F, 5, 9, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 389, 73, -23.0F, -14.5F, 2.2F, 5, 9, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 384, 71, -4.0F, -19.0F, 4.2F, 8, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -8.0F, -18.5F, -11.0F, 17, 7, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -8.0F, -5.5F, -11.0F, 17, 4, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -8.0F, -11.5F, -11.0F, 17, 6, 13, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 346, 75, -8.0F, -11.5F, 1.2F, 17, 6, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 242, 43, 25.0F, -13.6F, -53.3F, 1, 1, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 242, 43, -26.0F, -13.6F, -53.3F, 1, 1, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -31.0F, -23.6F, -82.3F, 4, 4, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 27.0F, -23.6F, -82.3F, 4, 4, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 244, 179, -30.5F, -23.2F, -81.2F, 3, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 244, 179, 27.5F, -23.2F, -81.2F, 3, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 107, 204, 13.0F, -7.6F, -66.3F, 8, 6, 15, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 107, 204, 5.0F, -7.6F, -66.3F, 8, 6, 15, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 107, 204, -13.0F, -7.6F, -64.3F, 8, 6, 15, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 107, 204, -21.0F, -7.6F, -64.3F, 8, 6, 15, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 0.1522F, -3.6469F);
        bone2.addChild(bone3);
        setRotationAngle(bone3, 0.1222F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 9, 27, -26.0F, -1.5F, -9.5F, 26, 4, 19, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 9, 27, 0.0F, -1.5F, -9.5F, 26, 4, 19, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bone13);


        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 3.5F, 8.5F);
        bone13.addChild(bone14);
        setRotationAngle(bone14, 1.5708F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 204, 44, 0.0F, -2.1F, 0.4F, 27, 4, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 204, 44, -27.0F, -2.1F, 0.4F, 27, 4, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(bone4);
        setRotationAngle(bone4, -0.4363F, 0.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, -2.9378F, -29.5357F, 26, 2, 16, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -26.0F, -2.9378F, -29.5357F, 26, 2, 16, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -7.6F, -36.8F);
        bone2.addChild(bone5);
        setRotationAngle(bone5, -0.7854F, 0.0F, 0.0F);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -25.0F, -9.0F, -3.5F, 9, 12, 5, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 16.0F, -9.0F, -3.5F, 9, 12, 5, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 16.0F, 40.0F, -50.5F, 9, 12, 5, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -25.0F, 40.0F, -50.5F, 9, 12, 5, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -30.6F, -24.8F);
        bone2.addChild(bone6);
        setRotationAngle(bone6, 0.6981F, 0.0F, 0.0F);
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, 23.0F, -16.0F, -11.5F, 3, 24, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -26.0F, -16.0F, -11.5F, 3, 24, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, 0.0F, -16.0F, -10.5F, 23, 4, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -23.0F, -16.0F, -10.5F, 23, 4, 2, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -7.6F, -81.3F);
        bone2.addChild(bone7);
        setRotationAngle(bone7, 0.6109F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -26.0F, -7.6F, -3.1F, 26, 11, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, -7.6F, -3.1F, 26, 11, 2, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -15.1F, -90.3F);
        bone2.addChild(bone8);
        setRotationAngle(bone8, 0.0524F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -26.0F, -4.1F, -16.0F, 26, 9, 23, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 0.0F, -4.1F, -16.0F, 26, 9, 23, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 7.4F, -25.5F);
        bone8.addChild(bone9);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 12.0F, -11.5F, -12.5F, 13, 18, 22, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -25.0F, -11.5F, -12.5F, 13, 18, 22, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 25.0F, -11.5F, 7.5F, 1, 18, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -26.0F, -11.5F, 7.5F, 1, 18, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 329, 138, -12.0F, -11.5F, -9.5F, 12, 18, 18, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 329, 138, 0.0F, -11.5F, -9.5F, 12, 18, 18, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 33, 40, -12.0F, -11.5F, -11.5F, 1, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 11.0F, -11.5F, -11.5F, 1, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 252, 43, -10.0F, -11.5F, -11.5F, 2, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 252, 43, 8.0F, -11.5F, -11.5F, 2, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 252, 43, 5.0F, -11.5F, -11.5F, 2, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 252, 43, 2.0F, -11.5F, -11.5F, 2, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 252, 43, -7.0F, -11.5F, -11.5F, 2, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 252, 43, -4.0F, -11.5F, -11.5F, 2, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 252, 43, -1.0F, -11.5F, -11.5F, 2, 18, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 171, 238, 13.0F, -7.5F, -12.8F, 11, 6, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 171, 238, -24.0F, -7.5F, -12.8F, 11, 6, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 171, 238, 13.0F, -0.5F, -12.8F, 11, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 171, 238, -24.0F, -0.5F, -12.8F, 11, 3, 1, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 171, 238, 25.1F, -8.5F, 23.2F, 1, 2, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 171, 238, -26.2F, -8.5F, 23.2F, 1, 2, 3, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, -8.0F, 4.5F);
        bone9.addChild(bone11);
        setRotationAngle(bone11, 0.0175F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 0, 27, 0.0F, -4.0F, -17.0F, 24, 4, 40, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 27, -24.0F, -4.0F, -17.0F, 24, 4, 40, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 27, 23.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 27, -24.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -23.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -21.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -19.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -17.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -15.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -13.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -11.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -9.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -7.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -5.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 22.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 20.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 18.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 16.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 14.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 12.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 10.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 8.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 6.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 4.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -3.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 2.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, 0.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 244, 36, -1.0F, -4.0F, 23.0F, 1, 2, 4, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 1.0F, 89.0F);
        bone11.addChild(bone15);
        setRotationAngle(bone15, -0.3491F, 0.0F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -21.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -19.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -17.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -15.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -13.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -11.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -9.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -7.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -5.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -3.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -1.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 0.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 4.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 6.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 8.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 10.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 12.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 14.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 16.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 18.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 20.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, -23.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 244, 36, 22.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 4.4F, -129.3F);
        bone2.addChild(bone12);
        setRotationAngle(bone12, -1.5708F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 209, 30, -1.0F, -3.0F, -1.3F, 29, 5, 3, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 209, 30, -28.0F, -3.0F, -1.3F, 29, 5, 3, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(26.5F, -19.1F, -83.3F);
        bone2.addChild(bone16);
        setRotationAngle(bone16, 0.4363F, 0.6981F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, 0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-26.5F, -19.1F, -83.3F);
        bone2.addChild(bone17);
        setRotationAngle(bone17, 0.4363F, -0.6981F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -1.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, -12.6F, -47.8F);
        bone2.addChild(bone18);
        setRotationAngle(bone18, -0.1745F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 107, 204, 13.0F, -11.8264F, -3.4848F, 8, 23, 6, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 107, 204, 5.0F, -11.8264F, -3.4848F, 8, 23, 6, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 107, 204, -13.0F, -11.8264F, -3.4848F, 8, 23, 6, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 107, 204, -21.0F, -11.8264F, -3.4848F, 8, 23, 6, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, -14.1F, -79.3F);
        bone2.addChild(bone19);
        setRotationAngle(bone19, 0.1745F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, -23.0F, -6.5F, -3.0F, 23, 13, 4, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 0.0F, -6.5F, -3.0F, 23, 13, 4, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 11.0F, -4.5F, -2.0F, 5, 5, 4, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 12.0F, -3.5F, 2.0F, 3, 3, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 13.0F, -2.5F, 4.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 10.0F, -2.5F, 5.0F, 7, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 13.0F, -5.5F, 5.0F, 1, 3, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 13.0F, -1.5F, 5.0F, 1, 3, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 17.0F, -3.5F, 5.0F, 1, 3, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 12.0F, -6.5F, 5.0F, 3, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 12.0F, 1.5F, 5.0F, 3, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 9.0F, -3.5F, 5.0F, 1, 3, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 10.0F, -4.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 11.0F, -5.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 15.0F, -5.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 16.0F, -4.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 16.0F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 15.0F, 0.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 11.0F, 0.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 328, 45, 10.0F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 80, 204, -21.0F, -4.5F, 0.3F, 3, 3, 1, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(13.5F, 11.0F, 0.5F);
        bone19.addChild(bone20);
        setRotationAngle(bone20, 0.4363F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 328, 45, 2.5F, -2.5F, -0.5F, 3, 7, 1, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 328, 45, -1.5F, -2.5F, -0.5F, 3, 7, 1, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 328, 45, -5.5F, -2.5F, -0.5F, 3, 7, 1, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 13.0F, 12.0F);
        bone19.addChild(bone23);
        setRotationAngle(bone23, 1.2217F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 340, 20, -5.0F, -14.5F, -2.0F, 10, 40, 5, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 340, 20, -2.0F, -7.5F, 3.0F, 5, 5, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 340, 20, -1.0F, -6.5F, 4.0F, 3, 3, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 340, 20, 0.0F, -5.5F, 5.0F, 1, 1, 3, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 338, 17, 0.0F, -6.5F, 7.0F, 1, 1, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 338, 17, 0.0F, -4.5F, 7.0F, 1, 1, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 338, 17, 1.0F, -5.5F, 7.0F, 1, 1, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 338, 17, -1.0F, -5.5F, 7.0F, 1, 1, 1, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, -0.5F, 1.0F);
        bone23.addChild(bone24);
        setRotationAngle(bone24, -0.2967F, 0.0F, 0.0F);
        bone24.cubeList.add(new ModelBox(bone24, 340, 20, 0.0F, 1.0F, 4.0F, 1, 9, 1, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(-1.0F, -27.5F, -25.4F);
        setRotationAngle(bone10, 0.9599F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 23.0F, 6.5F, -15.8F, 3, 3, 22, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -26.0F, 6.5F, -15.8F, 3, 3, 22, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 0.0F, 6.5F, 3.2F, 23, 2, 3, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -23.0F, 6.5F, 3.2F, 23, 2, 3, 0.0F, false));

        head_lights = new ModelRenderer(this);
        head_lights.setRotationPoint(-1.0F, -0.95F, -71.2F);
        setRotationAngle(head_lights, 0.0524F, 0.0F, 0.0F);
        head_lights.cubeList.add(new ModelBox(head_lights, 346, 213, -23.5F, -3.35F, -0.3F, 10, 5, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 346, 213, 13.5F, -3.35F, -0.3F, 10, 5, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 221, 188, 13.5F, 3.65F, -0.3F, 6, 2, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 221, 188, -19.5F, 3.65F, -0.3F, 6, 2, 1, 0.0F, false));

        head_lights_left_a = new ModelRenderer(this);
        head_lights_left_a.setRotationPoint(21.0F, 1.8F, -71.2F);
        setRotationAngle(head_lights_left_a, 0.0524F, 0.0F, 0.0F);
        head_lights_left_a.cubeList.add(new ModelBox(head_lights_left_a, 442, 251, -1.5F, 0.9F, -0.2F, 3, 2, 1, 0.0F, false));

        head_lights_left_b = new ModelRenderer(this);
        head_lights_left_b.setRotationPoint(24.7F, -6.7F, -34.1F);
        setRotationAngle(head_lights_left_b, 0.0524F, 0.0F, 0.0F);
        head_lights_left_b.cubeList.add(new ModelBox(head_lights_left_b, 438, 248, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        head_lights_right_a = new ModelRenderer(this);
        head_lights_right_a.setRotationPoint(-23.0F, 1.8F, -71.2F);
        setRotationAngle(head_lights_right_a, 0.0524F, 0.0F, 0.0F);
        head_lights_right_a.cubeList.add(new ModelBox(head_lights_right_a, 442, 251, -1.5F, 0.9F, -0.2F, 3, 2, 1, 0.0F, false));

        head_lights_right_b = new ModelRenderer(this);
        head_lights_right_b.setRotationPoint(-26.8F, -6.7F, -34.1F);
        setRotationAngle(head_lights_right_b, 0.0524F, 0.0F, 0.0F);
        head_lights_right_b.cubeList.add(new ModelBox(head_lights_right_b, 438, 248, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 336, 167, -7.5F, -26.5F, 58.5F, 14, 5, 1, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 440, 209, -23.5F, -29.5F, 59.5F, 4, 4, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 440, 209, 17.5F, -29.5F, 59.5F, 4, 4, 1, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 437, 208, -4.5F, -34.0F, 61.5F, 7, 2, 1, 0.0F, false));

        rear_lights_reverse = new ModelRenderer(this);
        rear_lights_reverse.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 392, 199, -23.5F, -23.5F, 59.5F, 4, 2, 1, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 392, 199, 17.5F, -23.5F, 59.5F, 4, 2, 1, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 444, 248, 17.5F, -25.0F, 59.5F, 4, 1, 1, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 444, 248, -23.5F, -25.0F, 59.5F, 4, 1, 1, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(7.0F, -6.225F, -21.5F);
        setRotationAngle(interier, 0.1745F, 0.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 441, 251, 11.0F, 1.125F, -0.6F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 180, 221, 11.0F, -2.875F, -0.6F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 187, 192, -2.0F, -3.875F, -0.6F, 3, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 424, 177, -3.0F, -0.875F, -0.6F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 237, 211, -3.0F, 1.125F, -0.6F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 353, 242, 0.0F, 3.125F, -0.6F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 174, 219, -13.0F, 0.125F, -0.6F, 6, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 75, 196, -13.0F, -2.875F, -0.6F, 6, 3, 1, 0.0F, false));

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -52.8F, -16.4F, 26, 3, 32, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -27.0F, -52.8F, -16.4F, 26, 3, 32, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 22.0F, -49.8F, 12.6F, 3, 15, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -27.0F, -49.8F, 12.6F, 3, 15, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 23.0F, -49.8F, -16.4F, 1, 1, 32, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -26.0F, -49.8F, -16.4F, 1, 1, 32, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, head_lights, rear_lights),
                new LightControllerEntry<>(0.8F, interier),
                new LightControllerEntry<>(0.6F, plate),
                new BrakeLights<>(rear_lights_brake),
                new ReverseLights<>(rear_lights_reverse),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, head_lights_right_a, head_lights_right_b, rear_lights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left_a, head_lights_left_b, rear_lights_left)
        );
    }

    @Override
    protected void renderModel() {
        bone21.render(1.0F);
        bone41.render(1.0F);
        bone42.render(1.0F);
        bone.render(1.0F);
        bone10.render(1.0F);
        bb_main.render(1.0F);
    }
}
