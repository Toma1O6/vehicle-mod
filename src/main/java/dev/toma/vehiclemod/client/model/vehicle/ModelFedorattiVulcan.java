package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.supersport.VehicleFedorattiVulcan;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFedorattiVulcan extends ModelVehicle<VehicleFedorattiVulcan> {

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
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone14;
    private final ModelRenderer bone13;
    private final ModelRenderer bone15;
    private final ModelRenderer bone33;
    private final ModelRenderer bone47;
    private final ModelRenderer bone49;
    private final ModelRenderer bone48;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer bone50;
    private final ModelRenderer bone25;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone29;
    private final ModelRenderer bone34;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone40;
    private final ModelRenderer bone46;
    private final ModelRenderer head_lights;
    private final ModelRenderer head_lights_left;
    private final ModelRenderer head_lights_right;
    private final ModelRenderer plate;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer rear_lights_reverse;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer interier;

    public ModelFedorattiVulcan() {
        textureWidth = 512;
        textureHeight = 512;

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -19.0F, 34.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -25.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -13.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -19.0F, 22.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -19.0F, -44.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -25.0F, -50.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -13.0F, -50.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -19.0F, -56.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -19.0F, 34.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -25.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -13.0F, 28.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -19.0F, 22.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -19.0F, -44.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -25.0F, -50.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -13.0F, -50.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -19.0F, -56.0F, 7, 8, 8, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(2.5F, -27.0F, 33.0F);
        bone21.addChild(bone22);
        setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 5.1924F, 9.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, -0.8076F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 5.1924F, -2.2218F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 11.1924F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 60.3467F, -45.3762F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 54.3467F, -51.3761F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 60.3467F, -57.3761F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 66.3467F, -51.3761F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 5.1924F, 9.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, -0.8076F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 5.1924F, -2.2218F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 11.1924F, 3.7782F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 60.3467F, -45.3762F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 54.3467F, -51.3761F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 60.3467F, -57.3761F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 66.3467F, -51.3761F, 7, 8, 8, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone41.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -17.0F, -47.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -16.0F, -48.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -15.0F, -47.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -16.0F, -46.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -17.0F, -47.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -16.0F, -48.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -15.0F, -47.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -16.0F, -46.0F, 17, 2, 2, 0.0F, false));
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
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -17.0F, -47.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, -48.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -15.0F, -47.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -16.0F, -46.0F, 16, 2, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(3.0F, -27.0F, -44.0F);
        bone43.addChild(bone44);
        setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 8.8995F, 5.0711F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 7.8995F, 6.0711F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 8.8995F, 7.0711F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 9.8995F, 6.0711F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 8.8995F, 5.0711F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 7.8995F, 6.0711F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 8.8995F, 7.0711F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 9.8995F, 6.0711F, 17, 2, 2, 0.0F, false));
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
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 7.8995F, 6.0711F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 9.8995F, 6.0711F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 8.8995F, 7.0711F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 8.8995F, 5.0711F, 16, 2, 2, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(-1.0F, 20.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -11.0F, -46.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -13.0F, -46.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -12.0F, -46.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -12.0F, -46.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -11.0F, -5.4F, 2, 2, 37, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -13.0F, -5.4F, 2, 2, 37, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -12.0F, -5.4F, 2, 2, 37, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -12.0F, -5.4F, 2, 2, 37, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(-20.0F, -23.0F, -27.9F);
        bone42.addChild(bone45);
        setRotationAngle(bone45, 0.0F, 0.0F, 0.7854F);
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -7.6568F, -18.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 20.6274F, -6.6568F, -18.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -5.6568F, -18.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 22.6274F, -6.6568F, -18.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -7.6568F, 22.5F, 2, 2, 37, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 20.6274F, -6.6568F, 22.5F, 2, 2, 37, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -5.6568F, 22.5F, 2, 2, 37, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 22.6274F, -6.6568F, 22.5F, 2, 2, 37, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -16.0F, 0.0F, 25, 5, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -16.0F, 0.0F, 25, 5, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -16.0F, -21.0F, 25, 5, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -16.0F, -21.0F, 25, 5, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -16.0F, -35.0F, 25, 5, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -16.0F, -35.0F, 25, 5, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -31.0F, -35.0F, 25, 15, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -31.0F, -35.0F, 25, 15, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 20.0F, -31.0F, -29.0F, 3, 15, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 20.0F, -31.0F, -21.0F, 3, 15, 20, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 20.0F, -31.0F, 0.0F, 3, 15, 18, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -25.0F, -31.0F, -29.0F, 3, 15, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -25.0F, -31.0F, 0.0F, 3, 15, 18, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -25.0F, -31.0F, -21.0F, 3, 15, 20, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -19.0F, -60.0F, 25, 8, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -19.0F, -60.0F, 25, 8, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -19.0F, -87.0F, 24, 8, 27, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -25.0F, -19.0F, -87.0F, 24, 8, 27, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -22.0F, -81.0F, 24, 3, 23, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -25.0F, -22.0F, -81.0F, 24, 3, 23, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -25.0F, -67.0F, 24, 3, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -25.0F, -25.0F, -67.0F, 24, 3, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -16.0F, -94.0F, 25, 5, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -16.0F, -94.0F, 25, 5, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 23.0F, -13.0F, -87.0F, 1, 2, 27, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -13.0F, -87.0F, 1, 2, 27, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 129, 25, -27.0F, -14.0F, -95.0F, 26, 2, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 124, 20, -1.0F, -14.0F, -95.0F, 26, 2, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 144, 6, -24.5F, -38.6F, -23.0F, 2, 8, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 144, 6, 20.5F, -38.6F, -23.0F, 2, 8, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 242, 27, 23.0F, -28.0F, -10.0F, 1, 1, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 242, 27, -26.0F, -28.0F, -10.0F, 1, 1, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 148, 28, -24.0F, -31.0F, -1.0F, 1, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 148, 16, 21.0F, -31.0F, -1.0F, 1, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 4, 22, 6.0F, -31.0F, 19.0F, 18, 6, 17, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -31.0F, 19.0F, 18, 6, 17, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -31.0F, 18.0F, 24, 1, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -25.0F, -31.0F, 18.0F, 24, 1, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 312, 24, -20.0F, -32.0F, 22.0F, 8, 2, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 312, 24, 10.0F, -32.0F, 22.0F, 8, 2, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -30.0F, 18.0F, 25, 14, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -26.0F, -30.0F, 18.0F, 25, 14, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -31.0F, 21.0F, 14, 6, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 321, 142, -8.0F, -28.0F, 25.0F, 14, 3, 25, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 56, 30, -23.0F, -31.0F, -1.0F, 1, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 56, 30, 20.0F, -31.0F, -1.0F, 1, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 131, 22, 5.5F, -26.0F, 54.0F, 19, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 131, 22, -26.5F, -26.0F, 54.0F, 19, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -19.3F, -18.0F, 14, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -19.3F, -10.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -22.3F, -10.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -22.3F, -18.0F, 14, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, 4.0F, -22.0F, -10.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, 4.0F, -22.0F, -18.0F, 14, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, 4.0F, -19.0F, -10.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, 4.0F, -19.0F, -18.0F, 14, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, 4.0F, -22.0F, 11.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, 4.0F, -22.0F, 3.0F, 14, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 111, 210, 4.0F, -19.0F, 11.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, 4.0F, -19.0F, 3.0F, 14, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -22.0F, 11.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -22.0F, 3.0F, 13, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -19.0F, 11.0F, 14, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -20.0F, -19.0F, 3.0F, 14, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -6.0F, -22.0F, 11.0F, 10, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -6.0F, -22.0F, 3.0F, 10, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 111, 210, -6.0F, -19.0F, 11.0F, 10, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -6.0F, -19.0F, 3.0F, 10, 3, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -2.5F, -21.3F, -18.0F, 3, 2, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -1.5F, -24.3F, -17.0F, 1, 3, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -1.5F, -24.3F, -16.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -1.5F, -24.3F, -18.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -0.5F, -24.3F, -17.0F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 171, 235, -2.5F, -24.3F, -17.0F, 1, 1, 1, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-25.5F, -10.5F, -9.3333F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.2618F);
        bone2.cubeList.add(new ModelBox(bone2, 136, 14, -0.5F, -3.5F, 9.2333F, 1, 5, 21, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 136, 14, -0.5F, -3.5F, -25.5667F, 1, 5, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 136, 14, -0.5F, -3.5F, -11.6667F, 1, 5, 21, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(23.5F, -10.5F, -9.3333F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -0.2618F);
        bone3.cubeList.add(new ModelBox(bone3, 132, 11, -0.5F, -3.5F, 9.2333F, 1, 5, 21, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 132, 11, -0.5F, -3.5F, -11.6667F, 1, 5, 21, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 132, 11, -0.5F, -3.5F, -25.5667F, 1, 5, 14, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-1.0F, -26.0F, -32.0F);
        bone.addChild(bone4);
        setRotationAngle(bone4, 0.6109F, 0.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, -2.0F, -6.4F, 25, 8, 6, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -25.0F, -2.0F, -6.4F, 25, 8, 6, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -6.0F, -3.4F);
        bone4.addChild(bone5);
        setRotationAngle(bone5, 0.4363F, 0.0F, 0.0F);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 0.0F, -3.2F, -5.0F, 25, 8, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -25.0F, -3.2F, -5.0F, 25, 8, 3, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -7.2F, -2.0F);
        bone5.addChild(bone6);
        setRotationAngle(bone6, 0.5236F, 0.0F, 0.0F);
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, 0.0F, -9.1F, -5.4F, 25, 20, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -25.0F, -9.1F, -5.4F, 25, 20, 2, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -8.1F, -2.4F);
        bone6.addChild(bone7);
        setRotationAngle(bone7, 0.5236F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, -4.7F, -4.1F, 25, 7, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -25.0F, -4.7F, -4.1F, 25, 7, 2, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, -6.2F, -3.1F);
        bone7.addChild(bone8);
        setRotationAngle(bone8, 0.4363F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 0.0F, -4.5F, -2.0F, 25, 6, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -25.0F, -4.5F, -2.0F, 25, 6, 2, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 0.9F, -1.4F);
        bone6.addChild(bone9);
        setRotationAngle(bone9, 0.1222F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, -10.0F, -3.6F, 25, 20, 4, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -25.0F, -10.0F, -3.6F, 25, 20, 4, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -23.0F, -8.1908F, -0.8146F, 1, 20, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 22.0F, -8.1908F, -0.8146F, 1, 20, 2, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone9.addChild(bone10);
        setRotationAngle(bone10, 0.0873F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -25.0F, -25.9F, -2.7F, 15, 16, 4, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 10.0F, -25.9F, -2.7F, 15, 16, 4, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -23.0F, -24.0292F, -0.0753F, 1, 16, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, 22.0F, -24.0292F, -0.0753F, 1, 16, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -7.0F, -25.9F, -2.7F, 14, 16, 4, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, -21.9F, -0.7F);
        bone10.addChild(bone11);
        setRotationAngle(bone11, 0.0873F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 0.0F, -16.4F, -1.6F, 25, 13, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -25.0F, -16.4F, -1.6F, 25, 13, 4, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -23.0F, -14.4819F, 0.8593F, 1, 13, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 22.0F, -14.4819F, 0.8593F, 1, 13, 2, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, -16.9F, 0.4F);
        bone11.addChild(bone12);
        setRotationAngle(bone12, 0.1745F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -25.0F, -12.0F, -2.1F, 25, 13, 4, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 0.0F, -12.0F, -2.1F, 25, 13, 4, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -23.0F, -10.0313F, 0.0192F, 1, 13, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 22.0F, -10.0313F, 0.0192F, 1, 13, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 348, 244, -1.5F, -8.0F, -1.7F, 3, 3, 4, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, -17.9F, -1.7F);
        bone10.addChild(bone14);
        setRotationAngle(bone14, 0.0698F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, -10.0F, -7.7F, -1.6F, 3, 16, 4, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, 7.0F, -7.7F, -1.6F, 3, 16, 4, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(-1.0F, -20.5F, -81.5F);
        bone.addChild(bone13);
        bone13.cubeList.add(new ModelBox(bone13, 166, 236, 12.0F, -2.5F, -5.5F, 8, 6, 13, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 166, 236, -20.0F, -2.5F, -5.5F, 8, 6, 13, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 50, 41, 11.5F, -3.5F, -6.5F, 9, 1, 14, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 50, 41, -20.5F, -3.5F, -6.5F, 9, 1, 14, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(-1.0F, -31.5F, -32.0F);
        bone.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, 0.0F, -0.5F, -1.0F, 23, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -24.0F, -0.5F, -1.0F, 24, 1, 2, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(19.5F, 0.0F, -2.0F);
        bone15.addChild(bone33);
        setRotationAngle(bone33, 0.4363F, 0.0F, 0.0F);
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, 0.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -1.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -3.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -5.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -11.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -13.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -7.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -9.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -37.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -39.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -33.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -35.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -31.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -29.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -27.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -25.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -37.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -39.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -33.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -35.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -31.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -29.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -27.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -25.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -23.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -21.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -19.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -17.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 242, 22, -15.5F, 0.3F, -0.8F, 1, 1, 2, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone15.addChild(bone47);


        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(28.9F, -1.0F, 3.1F);
        bone47.addChild(bone49);
        setRotationAngle(bone49, 0.0F, -0.2618F, 0.0F);
        bone49.cubeList.add(new ModelBox(bone49, 349, 194, -2.0F, -1.0F, 0.1F, 4, 2, 1, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, -2.5F, -1.5F, -1.0F, 5, 3, 2, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(-29.1F, -1.0F, 3.1F);
        bone15.addChild(bone48);
        setRotationAngle(bone48, 0.0F, 0.2618F, 0.0F);
        bone48.cubeList.add(new ModelBox(bone48, 349, 194, -2.0F, -1.0F, 0.0F, 4, 2, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 0, 0, -2.5F, -1.5F, -1.1F, 5, 3, 2, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(-1.0F, -32.0F, -28.0F);
        bone.addChild(bone16);
        setRotationAngle(bone16, 0.5236F, 0.0F, 0.0F);


        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, -1.5F, 8.85F);
        bone16.addChild(bone17);
        setRotationAngle(bone17, 0.0873F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 21.0F, -2.2F, -15.25F, 3, 2, 21, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -24.0F, -2.2F, -15.25F, 3, 2, 21, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -21.0F, -2.2F, 3.75F, 21, 2, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 0.0F, -2.2F, 3.75F, 21, 2, 2, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(-1.0F, -29.5F, 20.5F);
        bone.addChild(bone18);
        setRotationAngle(bone18, -0.6109F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -25.0F, 1.5F, 4.5F, 25, 8, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 0.0F, 1.5F, 4.5F, 25, 8, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 0.0F, 1.5F, 2.5F, 25, 4, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -25.0F, 1.5F, 2.5F, 25, 4, 2, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, -2.5F, 5.0F);
        bone18.addChild(bone19);
        setRotationAngle(bone19, -0.4363F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, 7.0F, -3.6F, 0.5F, 18, 8, 3, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, -25.0F, -3.6F, 0.5F, 18, 8, 3, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(-1.0F, -27.5F, 40.5F);
        bone.addChild(bone20);
        setRotationAngle(bone20, -0.1396F, 0.0F, 0.0F);


        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 7.7F, 0.2F);
        bone20.addChild(bone23);
        setRotationAngle(bone23, -0.5236F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, -25.0F, -7.5F, -5.0F, 18, 5, 11, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 4, 22, 7.0F, -7.5F, -5.0F, 18, 5, 11, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, -25.0F, -8.5F, 2.0F, 25, 2, 4, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 4, 22, 0.0F, -8.5F, 2.0F, 25, 2, 4, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, -0.5F, 6.0F);
        bone23.addChild(bone24);
        setRotationAngle(bone24, 0.9599F, 0.0F, 0.0F);
        bone24.cubeList.add(new ModelBox(bone24, 4, 22, 0.0F, -5.9123F, -0.7131F, 25, 8, 12, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, -25.0F, -5.9123F, -0.7131F, 25, 8, 12, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 132, 22, -5.5F, -3.4123F, 10.3869F, 11, 4, 1, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(0.0F, 3.0F, 5.5F);
        bone24.addChild(bone50);
        setRotationAngle(bone50, -0.3491F, 0.0F, 0.0F);
        bone50.cubeList.add(new ModelBox(bone50, 213, 18, 14.0F, -1.9F, -5.9F, 2, 2, 13, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 213, 18, 17.0F, -1.9F, -5.9F, 2, 2, 13, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 213, 18, -16.0F, -1.9F, -5.9F, 2, 2, 13, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 213, 18, -19.0F, -1.9F, -5.9F, 2, 2, 13, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone20.addChild(bone25);
        setRotationAngle(bone25, 0.0524F, 0.0F, 0.0F);
        bone25.cubeList.add(new ModelBox(bone25, 4, 22, 7.0F, -3.0128F, -5.7962F, 18, 6, 20, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, -25.0F, -3.1F, -4.8F, 18, 6, 19, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 312, 24, -19.0F, -4.081F, -5.2358F, 8, 2, 12, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 312, 24, 11.0F, -4.081F, -5.2358F, 8, 2, 12, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 0, 0, -7.0F, -3.1F, 7.2F, 14, 6, 6, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 140, 24, 11.0F, -2.4F, 13.3F, 13, 2, 1, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 140, 24, -24.0F, -2.4F, 13.3F, 13, 2, 1, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 146, 24, 7.0F, -8.1F, 9.2F, 2, 5, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 146, 24, -9.0F, -8.1F, 9.2F, 2, 5, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 144, 24, -7.0F, 0.0F, 12.4F, 14, 1, 1, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(3.0F, -7.6F, 10.2F);
        bone25.addChild(bone30);
        setRotationAngle(bone30, 0.0F, 0.0F, -0.2618F);


        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, -7.6F, 10.2F);
        bone25.addChild(bone31);
        setRotationAngle(bone31, 0.1047F, 0.0F, 0.0F);
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, -18.0F, -1.2998F, -2.9825F, 9, 1, 5, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, -27.0F, -1.2998F, -2.9825F, 9, 1, 5, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, -9.0F, -1.2998F, -2.9825F, 9, 1, 5, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, 0.0F, -1.2998F, -2.9825F, 9, 1, 5, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, 9.0F, -1.2998F, -2.9825F, 9, 1, 5, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, 18.0F, -1.2998F, -2.9825F, 9, 1, 5, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, 26.0F, -0.7999F, -2.9913F, 1, 1, 5, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 0, -27.0F, -0.7999F, -2.9913F, 1, 1, 5, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, 0.2F, 3.0F);
        bone31.addChild(bone32);
        setRotationAngle(bone32, 0.0873F, 0.0F, 0.0F);
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, -18.0F, -1.5945F, -0.9955F, 9, 1, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, -27.0F, -1.5945F, -0.9955F, 9, 1, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, -9.0F, -1.5945F, -0.9955F, 9, 1, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, 0.0F, -1.5945F, -0.9955F, 9, 1, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, 9.0F, -1.5945F, -0.9955F, 9, 1, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, 18.0F, -1.5945F, -0.9955F, 9, 1, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, 26.0F, -1.0973F, -1.0477F, 1, 1, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, -27.0F, -1.0973F, -1.0477F, 1, 1, 2, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(-1.0F, -23.5F, 54.5F);
        bone.addChild(bone26);
        setRotationAngle(bone26, 0.1571F, 0.0F, 0.0F);


        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0F, 6.5F, 1.0F);
        bone26.addChild(bone27);
        setRotationAngle(bone27, 0.3491F, 0.0F, 0.0F);
        bone27.cubeList.add(new ModelBox(bone27, 137, 20, 7.0F, -1.8546F, -0.9376F, 19, 4, 1, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 137, 20, -26.0F, -1.8546F, -0.9376F, 19, 4, 1, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 137, 20, -7.0F, -0.8546F, -0.9376F, 14, 3, 1, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(-1.0F, -34.5F, 23.0F);
        bone.addChild(bone28);
        setRotationAngle(bone28, -0.1745F, 0.0F, 0.0F);
        bone28.cubeList.add(new ModelBox(bone28, 139, 20, -7.0F, 3.0F, 2.7F, 14, 1, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 139, 20, -7.0F, 2.3F, 6.7F, 14, 1, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 139, 20, -7.0F, 1.7F, 10.7F, 14, 1, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 139, 20, -7.0F, 1.1F, 14.7F, 14, 1, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 139, 20, -7.0F, 0.8F, 18.7F, 14, 1, 2, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 139, 20, -7.0F, 0.5F, 22.5F, 14, 1, 2, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(-1.0F, -32.0F, 19.5F);
        bone.addChild(bone29);
        setRotationAngle(bone29, -0.2618F, 0.0F, 0.0F);
        bone29.cubeList.add(new ModelBox(bone29, 131, 19, 0.0F, 0.6F, -0.7F, 21, 2, 3, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 131, 19, -21.0F, 0.6F, -0.7F, 21, 2, 3, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(-1.0F, -28.0F, -27.0F);
        bone.addChild(bone34);
        setRotationAngle(bone34, 0.1047F, 0.0F, 0.0F);
        bone34.cubeList.add(new ModelBox(bone34, 314, 0, -21.0F, -4.0F, -3.0F, 21, 8, 6, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 314, 0, 0.0F, -4.0F, -3.0F, 21, 8, 6, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 314, 0, 10.0F, -3.0F, 3.0F, 5, 5, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 314, 0, 11.0F, -2.0F, -1.0F, 3, 3, 6, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 324, 4, 12.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 12.0F, -5.0F, 6.0F, 1, 9, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 347, 4, 13.0F, -1.0F, 6.0F, 4, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 347, 4, 8.0F, -1.0F, 6.0F, 4, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 16.0F, -2.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 14.0F, -4.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 8.0F, -2.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 10.0F, -4.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 11.0F, -5.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 13.0F, -5.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 16.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 15.0F, 1.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 13.0F, 3.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 11.0F, 3.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 9.0F, 1.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 8.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 9.0F, -3.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 15.0F, -3.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 10.0F, 2.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 14.0F, 2.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 13.0F, -2.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 11.0F, -2.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 11.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 333, 0, 13.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 84, 195, -20.0F, -3.0F, 2.1F, 5, 4, 1, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(12.0F, 11.0F, 0.5F);
        bone34.addChild(bone35);
        setRotationAngle(bone35, 0.6109F, 0.0F, 0.0F);
        bone35.cubeList.add(new ModelBox(bone35, 310, 59, -4.0F, -2.0F, -0.5F, 2, 4, 1, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 310, 59, 2.0F, -2.0F, -0.5F, 2, 4, 1, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 310, 59, -1.0F, -2.0F, -0.5F, 2, 4, 1, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(-13.0F, -26.5F, -5.0F);
        bone.addChild(bone36);
        setRotationAngle(bone36, -0.1745F, 0.0F, 0.0F);
        bone36.cubeList.add(new ModelBox(bone36, 171, 235, -7.0F, -6.3264F, -2.4848F, 14, 12, 4, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 171, 235, 17.0F, -6.3264F, -2.4848F, 14, 12, 4, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 171, 235, -7.0F, -10.5F, 18.5F, 14, 12, 4, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 171, 235, 17.0F, -10.5F, 18.5F, 14, 12, 4, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 171, 235, 7.0F, -10.5F, 18.5F, 10, 12, 4, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(-1.0F, -20.5F, -16.5F);
        bone.addChild(bone37);
        setRotationAngle(bone37, -0.1047F, 0.0F, 0.0F);
        bone37.cubeList.add(new ModelBox(bone37, 322, 0, -3.0F, 0.5F, -12.5F, 6, 5, 33, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(-1.0F, -20.8F, -10.0F);
        bone.addChild(bone38);
        setRotationAngle(bone38, -0.3491F, 0.0F, 0.0F);
        bone38.cubeList.add(new ModelBox(bone38, 171, 235, -0.5F, 0.4F, -3.0F, 1, 1, 8, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(-1.0F, -31.5F, -31.5F);
        bone.addChild(bone39);
        setRotationAngle(bone39, 0.6109F, 0.0F, 0.0F);


        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(-24.5F, 2.0F, 5.0F);
        bone39.addChild(bone40);
        setRotationAngle(bone40, 0.2618F, -1.1345F, 0.0F);
        bone40.cubeList.add(new ModelBox(bone40, 149, 34, -4.5F, -1.0F, -2.5F, 1, 1, 5, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(24.5F, 2.0F, 5.0F);
        bone39.addChild(bone46);
        setRotationAngle(bone46, 0.2618F, 1.1345F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 149, 34, 3.5F, -1.0F, -2.5F, 1, 1, 5, 0.0F, false));

        head_lights = new ModelRenderer(this);
        head_lights.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights.cubeList.add(new ModelBox(head_lights, 368, 204, -20.5F, -22.6F, -87.1F, 7, 3, 1, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 368, 204, 11.5F, -22.6F, -87.1F, 7, 3, 1, 0.0F, false));

        head_lights_left = new ModelRenderer(this);
        head_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_left.cubeList.add(new ModelBox(head_lights_left, 439, 250, 22.5F, -15.5F, -94.5F, 2, 1, 3, 0.0F, false));

        head_lights_right = new ModelRenderer(this);
        head_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 439, 250, -26.5F, -15.5F, -94.5F, 2, 1, 3, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(-1.0F, 2.2877F, 55.6869F);
        setRotationAngle(plate, 0.2967F, 0.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 414, 230, -5.0F, -1.3F, -1.5F, 10, 3, 1, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(-1.0F, -4.0F, 54.4F);
        setRotationAngle(rear_lights, -0.0873F, 0.0F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 426, 176, 16.5F, -0.3F, -0.4F, 2, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 426, 176, -18.5F, -0.3F, -0.4F, 2, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 426, 176, -21.0F, -0.3F, -0.4F, 2, 1, 1, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 426, 176, 19.0F, -0.3F, -0.4F, 2, 1, 1, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(-1.0F, -5.0F, 54.4F);
        setRotationAngle(rear_lights_brake, -0.0873F, 0.0F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 426, 176, 14.0F, 0.7F, -0.3F, 2, 1, 1, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 426, 176, -16.0F, 0.7F, -0.3F, 2, 1, 1, 0.0F, false));

        rear_lights_reverse = new ModelRenderer(this);
        rear_lights_reverse.setRotationPoint(-1.0F, -5.0F, 54.4F);
        setRotationAngle(rear_lights_reverse, -0.0873F, 0.0F, 0.0F);
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 426, 230, 11.5F, 0.7F, -0.3F, 2, 1, 1, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 426, 230, -13.5F, 0.7F, -0.3F, 2, 1, 1, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(21.5F, -5.0F, 54.4F);
        setRotationAngle(rear_lights_left, -0.0873F, 0.0F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 372, 244, -1.0F, 0.7F, -0.3F, 2, 1, 1, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(-23.5F, -5.0F, 54.4F);
        setRotationAngle(rear_lights_right, -0.0873F, 0.0F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 372, 244, -1.0F, 0.7F, -0.3F, 2, 1, 1, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(12.0833F, -4.5F, -24.4F);
        setRotationAngle(interier, 0.0873F, 0.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 160, 228, -8.0833F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 224, 201, -6.0833F, -2.5F, -0.5F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 434, 246, -6.0833F, 1.5F, -0.5F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 356, 237, 4.9167F, 1.5F, -0.5F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 187, 224, 4.9167F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 228, 210, 4.9167F, -2.5F, -0.5F, 2, 1, 1, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, head_lights, rear_lights),
                new LightControllerEntry<>(0.6F, plate, interier),
                new BrakeLights<>(rear_lights_brake),
                new ReverseLights<>(rear_lights_reverse),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT,  head_lights_right, rear_lights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left, rear_lights_left)
        );
    }

    @Override
    protected void renderModel() {
        bone21.render(1.0F);
        bone41.render(1.0F);
        bone42.render(1.0F);
        bone.render(1.0F);
    }
}
