package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleBeamerS320RS;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelBeamerS320RS extends ModelVehicle<VehicleBeamerS320RS> {

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
    private final ModelRenderer bone10;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone52;
    private final ModelRenderer bone55;
    private final ModelRenderer bone56;
    private final ModelRenderer bone82;
    private final ModelRenderer bone84;
    private final ModelRenderer bone53;
    private final ModelRenderer bone59;
    private final ModelRenderer bone60;
    private final ModelRenderer bone61;
    private final ModelRenderer bone62;
    private final ModelRenderer bone63;
    private final ModelRenderer bone73;
    private final ModelRenderer bone83;
    private final ModelRenderer bone9;
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
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone23;
    private final ModelRenderer bone29;
    private final ModelRenderer bone35;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone64;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone40;
    private final ModelRenderer bone46;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone54;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone65;
    private final ModelRenderer bone66;
    private final ModelRenderer bone67;
    private final ModelRenderer bone68;
    private final ModelRenderer bone70;
    private final ModelRenderer bone69;
    private final ModelRenderer bone71;
    private final ModelRenderer bone72;
    private final ModelRenderer bone74;
    private final ModelRenderer bone75;
    private final ModelRenderer bone76;
    private final ModelRenderer bone77;
    private final ModelRenderer bone78;
    private final ModelRenderer bone79;
    private final ModelRenderer bone80;
    private final ModelRenderer bone81;
    private final ModelRenderer head_lights;
    private final ModelRenderer head_lights_right;
    private final ModelRenderer head_lights_left;
    private final ModelRenderer plate;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer rear_lights_reverse;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer interier;

    public ModelBeamerS320RS() {
        textureWidth = 512;
        textureHeight = 512;

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -11.0F, -34.0F, 7, 6, 5, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -15.0F, -39.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -6.0F, -39.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -11.0F, -43.0F, 7, 6, 5, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -6.0F, -39.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -11.0F, -34.0F, 7, 6, 5, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -15.0F, -39.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -11.0F, -43.0F, 7, 6, 5, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -6.0F, 29.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -11.0F, 34.0F, 7, 6, 5, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -15.0F, 29.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, -24.9F, -11.0F, 25.0F, 7, 6, 5, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -6.0F, 29.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -11.0F, 34.0F, 7, 6, 5, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -15.0F, 29.0F, 7, 5, 6, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 144, 16, 16.1F, -11.0F, 25.0F, 7, 6, 5, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(2.5F, -27.0F, 33.0F);
        bone21.addChild(bone22);
        setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 59.2254F, -33.3553F, 7, 6, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 55.2254F, -38.3553F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 59.2254F, -42.3553F, 7, 6, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 64.2254F, -38.3553F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 64.2254F, -38.3553F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 59.2254F, -33.3553F, 7, 6, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 55.2254F, -38.3553F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 59.2254F, -42.3553F, 7, 6, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 16.1421F, 9.7279F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 11.1421F, 14.7279F, 7, 6, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 7.1421F, 9.7279F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, -27.4F, 11.1421F, 5.7279F, 7, 6, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 16.1421F, 9.7279F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 11.1421F, 14.7279F, 7, 6, 5, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 7.1421F, 9.7279F, 7, 5, 6, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 144, 16, 13.6F, 11.1421F, 5.7279F, 7, 6, 5, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone41.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -10.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -9.0F, -38.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -8.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -9.0F, -36.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -10.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -9.0F, -38.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -8.0F, -37.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -9.0F, -36.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -10.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -9.0F, 30.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -8.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -9.0F, 32.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -10.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -9.0F, 30.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -8.0F, 31.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -9.0F, 32.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -10.0F, 31.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -9.0F, 30.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -8.0F, 31.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -9.0F, 32.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -10.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -9.0F, -38.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -8.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -9.0F, -36.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -10.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -9.0F, -38.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -8.0F, -37.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -9.0F, -36.0F, 16, 2, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(3.0F, -27.0F, -44.0F);
        bone43.addChild(bone44);
        setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 6.7782F, 17.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 5.7782F, 18.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 6.7782F, 19.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 7.7782F, 18.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 6.7782F, 17.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 5.7782F, 18.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 6.7782F, 19.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 7.7782F, 18.0919F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -41.3051F, 65.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -42.3051F, 66.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -41.3051F, 67.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -40.3051F, 66.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -41.3051F, 65.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -42.3051F, 66.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -41.3051F, 67.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -40.3051F, 66.1751F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -42.3051F, 66.1751F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -41.3051F, 65.1751F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -40.3051F, 66.1751F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -41.3051F, 67.1751F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 5.7782F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 6.7782F, 17.0919F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 7.7782F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 6.7782F, 19.0919F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 5.7782F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 6.7782F, 17.0919F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 7.7782F, 18.0919F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 6.7782F, 19.0919F, 16, 2, 2, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(-1.0F, 20.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -4.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -6.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -5.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -5.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -4.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -6.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -5.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -5.0F, 4.6F, 2, 2, 27, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(-20.0F, -23.0F, -27.9F);
        bone42.addChild(bone45);
        setRotationAngle(bone45, 0.0F, 0.0F, 0.7854F);
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 26.5772F, -2.7071F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 25.5772F, -1.7071F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 26.5772F, -0.7071F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 27.5772F, -1.7071F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 26.5772F, -2.7071F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 25.5772F, -1.7071F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 26.5772F, -0.7071F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 27.5772F, -1.7071F, 32.5F, 2, 2, 27, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -1.0F, -9.0F, -7.0F, 24, 3, 28, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -9.0F, -7.0F, 24, 3, 28, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -1.0F, -9.0F, -27.0F, 24, 3, 20, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -25.0F, -9.0F, -27.0F, 24, 3, 20, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -21.0F, -28.0F, 3, 12, 7, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -21.0F, 12.0F, 3, 12, 9, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -21.0F, 12.0F, 3, 12, 9, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -21.0F, -28.0F, 3, 12, 7, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -21.0F, 21.0F, 3, 7, 6, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -21.0F, 21.0F, 3, 7, 6, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 2.0F, -33.0F, -26.0F, 18, 2, 34, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -33.0F, -26.0F, 18, 2, 34, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -31.0F, -6.0F, 3, 10, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -31.0F, -6.0F, 3, 10, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 389, 133, -19.0F, -11.0F, -27.0F, 18, 1, 20, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 389, 133, -19.0F, -11.0F, -7.0F, 18, 1, 28, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 389, 133, -1.0F, -11.0F, -27.0F, 18, 1, 20, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 389, 133, -1.0F, -11.0F, -7.0F, 18, 1, 28, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -21.0F, -32.0F, 3, 6, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -21.0F, -32.0F, 3, 6, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 154, 23, -21.0F, -30.0F, 13.0F, 1, 9, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 154, 23, 18.0F, -30.0F, 13.0F, 1, 9, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -21.0F, -7.0F, 3, 12, 5, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -21.0F, -7.0F, 3, 12, 5, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -21.0F, -21.0F, -21.0F, 2, 12, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -21.0F, -21.0F, -2.0F, 2, 12, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -21.0F, -2.0F, 2, 12, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -21.0F, -21.0F, 2, 12, 14, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 222, 35, -21.5F, -19.0F, 0.0F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 222, 35, -21.5F, -19.0F, -19.0F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 222, 35, 18.5F, -19.0F, -19.0F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 222, 35, 18.5F, -19.0F, 0.0F, 1, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 17.0F, -31.0F, -25.0F, 3, 10, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.0F, -31.0F, -25.0F, 3, 10, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 217, 32, 14.2F, -11.0F, -49.0F, 1, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 217, 32, 15.7F, -11.0F, -49.0F, 1, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 217, 32, -17.4F, -11.0F, -49.0F, 1, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 217, 32, -18.9F, -11.0F, -49.0F, 1, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -4.0F, -33.0F, -26.0F, 6, 2, 20, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -4.0F, -33.0F, 3.0F, 6, 2, 5, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-1.0F, -11.0F, 22.0F);
        bone2.addChild(bone3);
        setRotationAngle(bone3, 0.9599F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -24.0F, -2.6F, -4.8F, 24, 4, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, 0.0F, -2.6F, -4.8F, 24, 4, 6, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -0.6F, 3.7F);
        bone3.addChild(bone4);
        setRotationAngle(bone4, -0.2618F, 0.0F, 0.0F);


        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 0.7F, -0.5F);
        bone4.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -24.0F, -2.0F, -2.5F, 24, 4, 7, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 0.0F, -2.0F, -2.5F, 24, 4, 7, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 0.0F, 5.0F);
        bone5.addChild(bone6);
        setRotationAngle(bone6, -0.2618F, 0.0F, 0.0F);


        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, 0.0F, 7.0F);
        bone5.addChild(bone7);
        setRotationAngle(bone7, -0.2618F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, -1.3F, -3.1F, 24, 4, 4, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -24.0F, -1.3F, -3.1F, 24, 4, 4, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone7.addChild(bone8);
        setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 21.0F, -1.5F, 0.2F, 3, 4, 5, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -24.0F, -1.5F, 0.2F, 3, 4, 5, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, -5.5F, 9.2F);
        bone8.addChild(bone10);
        setRotationAngle(bone10, 0.4363F, 0.0F, 0.0F);


        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(0.0F, 0.6667F, 7.7F);
        bone8.addChild(bone49);
        setRotationAngle(bone49, -0.2618F, 0.0F, 0.0F);
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, -24.0F, -1.4667F, -3.1F, 3, 4, 6, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, 21.0F, -1.4667F, -3.1F, 3, 4, 6, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(0.0F, 0.7F, 5.9F);
        bone49.addChild(bone50);
        setRotationAngle(bone50, 0.1396F, 0.0F, 0.0F);
        bone50.cubeList.add(new ModelBox(bone50, 0, 0, -24.0F, -2.5667F, -3.0F, 3, 4, 3, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 0, 0, 21.0F, -2.5667F, -3.0F, 3, 4, 3, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(0.0F, 2.4333F, -3.0F);
        bone50.addChild(bone51);
        setRotationAngle(bone51, -0.6981F, 0.0F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, -24.0F, -2.0F, -3.0F, 11, 3, 7, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, 13.0F, -2.1F, -3.2F, 11, 3, 7, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, -13.0F, -2.0F, -3.0F, 26, 3, 7, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(0.0F, 3.0F, 9.2F);
        bone8.addChild(bone52);
        setRotationAngle(bone52, -0.1745F, 0.0F, 0.0F);
        bone52.cubeList.add(new ModelBox(bone52, 341, 141, -10.0F, -5.1777F, 3.287F, 20, 5, 1, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 0, 0, -21.0F, -3.7F, -9.0F, 7, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 0, 0, 14.0F, -3.7F, -9.0F, 7, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, 12.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, 10.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, 8.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, 6.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, -1.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, 4.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, 2.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, 0.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, -9.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, -3.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, -5.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, -7.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, -11.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 384, 8, -13.5F, -3.7F, -9.0F, 1, 2, 2, 0.0F, false));

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(0.0F, -0.2F, -1.5F);
        bone52.addChild(bone55);
        setRotationAngle(bone55, -0.1745F, 0.0F, 0.0F);


        bone56 = new ModelRenderer(this);
        bone56.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone55.addChild(bone56);
        setRotationAngle(bone56, 0.1745F, 0.0F, 0.0F);


        bone82 = new ModelRenderer(this);
        bone82.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone52.addChild(bone82);
        setRotationAngle(bone82, 0.1745F, 0.0F, 0.0F);
        bone82.cubeList.add(new ModelBox(bone82, 0, 0, -22.0F, -4.7F, -4.0F, 11, 7, 7, 0.0F, false));
        bone82.cubeList.add(new ModelBox(bone82, 0, 0, -6.0F, -4.7F, -4.0F, 12, 7, 7, 0.0F, false));
        bone82.cubeList.add(new ModelBox(bone82, 0, 0, 11.0F, -4.7F, -4.0F, 11, 7, 7, 0.0F, false));
        bone82.cubeList.add(new ModelBox(bone82, 0, 0, 0.0F, -4.7F, -7.0F, 22, 2, 3, 0.0F, false));
        bone82.cubeList.add(new ModelBox(bone82, 0, 0, -22.0F, -4.7F, -7.0F, 22, 2, 3, 0.0F, false));
        bone82.cubeList.add(new ModelBox(bone82, 325, 37, -11.0F, -3.7F, -5.0F, 5, 5, 10, 0.0F, false));
        bone82.cubeList.add(new ModelBox(bone82, 325, 37, 6.0F, -3.7F, -5.0F, 5, 5, 10, 0.0F, false));

        bone84 = new ModelRenderer(this);
        bone84.setRotationPoint(0.0F, -4.7F, 4.0F);
        bone52.addChild(bone84);
        setRotationAngle(bone84, 0.4363F, 0.0F, 0.0F);
        bone84.cubeList.add(new ModelBox(bone84, 384, 8, -15.5F, -0.9F, -1.0F, 1, 2, 2, 0.0F, false));
        bone84.cubeList.add(new ModelBox(bone84, 384, 8, 14.5F, -0.9F, -1.0F, 1, 2, 2, 0.0F, false));

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(0.0F, 3.1818F, 20.4727F);
        bone8.addChild(bone53);
        setRotationAngle(bone53, -0.0698F, 0.0F, 0.0F);
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, -20.0F, 0.6605F, -4.8109F, 8, 1, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, -12.0F, -3.3395F, -4.8109F, 1, 5, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, -20.0F, -3.3395F, -4.8109F, 8, 1, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, 12.0F, -3.3395F, -4.8109F, 8, 1, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, 11.0F, -3.3395F, -4.8109F, 1, 5, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, 12.0F, 0.6605F, -4.8109F, 8, 1, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 349, 45, -10.0F, -1.3395F, -3.8109F, 20, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 349, 45, -10.0F, -3.1395F, -3.8109F, 20, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 349, 45, -10.0F, 0.4605F, -3.8109F, 20, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, -21.0F, -3.3395F, -4.8109F, 1, 5, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, 20.0F, -3.3395F, -4.8109F, 1, 5, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, -18.0F, -2.3395F, -4.8109F, 1, 3, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 152, 16, 17.0F, -2.3395F, -4.8109F, 1, 3, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 77, 40, 10.0F, -4.3395F, -4.9109F, 1, 7, 4, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 61, 8, -11.0F, -4.3395F, -4.9109F, 1, 7, 4, 0.0F, false));

        bone59 = new ModelRenderer(this);
        bone59.setRotationPoint(0.0F, -3.3151F, 0.7273F);
        bone53.addChild(bone59);
        setRotationAngle(bone59, 0.0873F, 0.0F, 0.0F);


        bone60 = new ModelRenderer(this);
        bone60.setRotationPoint(0.0F, 0.3333F, -3.0F);
        bone59.addChild(bone60);
        setRotationAngle(bone60, 0.1047F, 0.0F, 0.0F);
        bone60.cubeList.add(new ModelBox(bone60, 40, 16, -4.0F, -2.5987F, -5.1187F, 8, 1, 4, 0.0F, false));

        bone61 = new ModelRenderer(this);
        bone61.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone53.addChild(bone61);


        bone62 = new ModelRenderer(this);
        bone62.setRotationPoint(-22.6F, 0.0182F, -0.2727F);
        bone61.addChild(bone62);
        setRotationAngle(bone62, 0.0F, 0.0F, 0.2618F);
        bone62.cubeList.add(new ModelBox(bone62, 142, 23, -0.979F, -0.8877F, -5.638F, 2, 1, 4, 0.0F, false));
        bone62.cubeList.add(new ModelBox(bone62, 142, 23, -1.279F, -2.7877F, -5.638F, 2, 1, 4, 0.0F, false));

        bone63 = new ModelRenderer(this);
        bone63.setRotationPoint(22.4F, 0.0182F, -0.2727F);
        bone61.addChild(bone63);
        setRotationAngle(bone63, 0.0F, 0.0F, -0.2618F);
        bone63.cubeList.add(new ModelBox(bone63, 142, 23, -1.021F, -0.4877F, -5.638F, 2, 1, 4, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 142, 23, -0.521F, -2.5877F, -5.638F, 2, 1, 4, 0.0F, false));

        bone73 = new ModelRenderer(this);
        bone73.setRotationPoint(0.0F, -2.9818F, -4.2727F);
        bone53.addChild(bone73);
        setRotationAngle(bone73, 0.5236F, 0.0F, 0.0F);


        bone83 = new ModelRenderer(this);
        bone83.setRotationPoint(0.0F, -2.2681F, -4.8109F);
        bone53.addChild(bone83);
        setRotationAngle(bone83, 0.0349F, 0.0F, 0.0F);
        bone83.cubeList.add(new ModelBox(bone83, 0, 0, -21.0F, -2.1714F, -4.0F, 11, 1, 8, 0.0F, false));
        bone83.cubeList.add(new ModelBox(bone83, 0, 0, -10.0F, -2.1714F, -4.0F, 20, 1, 8, 0.0F, false));
        bone83.cubeList.add(new ModelBox(bone83, 0, 0, 10.0F, -2.1714F, -4.0F, 11, 1, 8, 0.0F, false));
        bone83.cubeList.add(new ModelBox(bone83, 0, 0, -22.0F, -2.1714F, 0.0F, 1, 7, 4, 0.0F, false));
        bone83.cubeList.add(new ModelBox(bone83, 0, 0, -22.0F, -2.1714F, -4.0F, 12, 6, 4, 0.0F, false));
        bone83.cubeList.add(new ModelBox(bone83, 0, 0, 10.0F, -2.1714F, -4.0F, 12, 6, 4, 0.0F, false));
        bone83.cubeList.add(new ModelBox(bone83, 0, 0, 21.0F, -2.1714F, 0.0F, 1, 7, 4, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-1.0F, -12.0F, 38.0F);
        bone2.addChild(bone9);
        setRotationAngle(bone9, -0.2618F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -24.0F, -3.4048F, 2.0492F, 24, 4, 8, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, -3.4048F, 2.0492F, 24, 4, 8, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(-1.0F, -19.5F, 28.5F);
        bone2.addChild(bone11);
        setRotationAngle(bone11, -0.6109F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 19.0F, -1.2F, -2.7F, 2, 3, 6, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -21.0F, -1.2F, -2.7F, 2, 3, 6, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 18.0F, -1.2F, -13.7F, 3, 2, 11, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -21.0F, -1.2F, -13.7F, 3, 2, 11, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 0.0F, -1.2F, -1.7F, 18, 3, 6, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -18.0F, -1.2F, -1.7F, 18, 3, 6, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 18.0F, -1.2F, -2.7F, 1, 2, 5, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -19.0F, -1.2F, -2.7F, 1, 2, 5, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, -0.2F, -19.2F);
        bone11.addChild(bone12);
        setRotationAngle(bone12, 0.1745F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 0.0F, 0.0F, -5.4F, 18, 2, 3, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -21.0F, 0.0F, -5.4F, 3, 2, 11, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 18.0F, 0.0F, -5.4F, 3, 2, 11, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -18.0F, 0.0F, -5.4F, 18, 2, 3, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 138, 25, 0.0F, 0.0F, -2.4F, 18, 2, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 138, 25, -18.0F, 0.0F, -2.4F, 18, 2, 1, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(-1.0F, -7.0F, -25.5F);
        bone2.addChild(bone13);
        setRotationAngle(bone13, -0.7854F, 0.0F, 0.0F);


        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, -2.4F, -0.3F);
        bone13.addChild(bone14);
        setRotationAngle(bone14, -0.1745F, 0.0F, 0.0F);


        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, -3.4F, -10.4F);
        bone13.addChild(bone15);
        setRotationAngle(bone15, 0.4363F, 0.0F, 0.0F);


        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(-1.0F, -7.0F, -27.0F);
        bone2.addChild(bone16);
        setRotationAngle(bone16, -1.2217F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -24.0F, -3.4F, -4.1F, 24, 4, 6, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, 0.0F, -3.4F, -4.1F, 24, 4, 6, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, -1.4F, -7.1F);
        bone16.addChild(bone17);
        setRotationAngle(bone17, 0.2618F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 18.0F, -1.2F, -3.5F, 4, 4, 7, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -22.0F, -1.2F, -3.5F, 4, 4, 7, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -18.0F, -1.2F, -6.5F, 18, 4, 10, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 0.0F, -1.2F, -6.5F, 18, 4, 10, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -24.0F, -1.2F, -3.5F, 1, 4, 7, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 23.0F, -1.2F, -3.5F, 1, 4, 7, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, 22.0F, -0.9F, 2.1F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, 22.0F, -0.9F, 0.8F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, 22.0F, -0.9F, -0.5F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, 22.0F, -0.9F, -1.8F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, 22.0F, -0.9F, -3.1F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, -23.0F, -0.9F, 2.1F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, -23.0F, -0.9F, 0.8F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, -23.0F, -0.9F, -0.5F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, -23.0F, -0.9F, -1.8F, 1, 1, 1, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 136, 27, -23.0F, -0.9F, -3.1F, 1, 1, 1, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 0.8F, -5.0F);
        bone17.addChild(bone18);
        setRotationAngle(bone18, 0.6981F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 18.0F, -0.5F, -4.4F, 6, 4, 7, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -24.0F, -0.5F, -4.4F, 6, 4, 7, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(-1.0F, -17.4F, -41.7F);
        bone2.addChild(bone19);
        setRotationAngle(bone19, 0.3491F, 0.0F, 0.0F);


        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 0.8F, -4.9F);
        bone19.addChild(bone20);
        setRotationAngle(bone20, 0.5236F, 0.0F, 0.0F);


        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, 1.5F, -3.3F);
        bone20.addChild(bone24);
        setRotationAngle(bone24, 0.6109F, 0.0F, 0.0F);
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, 18.0F, -0.6F, -3.3F, 6, 4, 3, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, -24.0F, -0.6F, -3.3F, 6, 4, 3, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 0.8F, 0.1F);
        bone19.addChild(bone25);
        setRotationAngle(bone25, 0.2618F, 0.0F, 0.0F);


        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.0F, 0.7F, 0.4F);
        bone25.addChild(bone26);
        setRotationAngle(bone26, -0.0349F, 0.0F, 0.0F);
        bone26.cubeList.add(new ModelBox(bone26, 0, 0, 18.0F, -1.8F, -1.8F, 6, 4, 4, 0.0F, false));
        bone26.cubeList.add(new ModelBox(bone26, 0, 0, -24.0F, -1.8F, -1.8F, 6, 4, 4, 0.0F, false));

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone26.addChild(bone27);
        setRotationAngle(bone27, 0.192F, 0.0F, 0.0F);
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, 18.0F, -2.1F, -5.0F, 1, 4, 4, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, -19.0F, -2.1F, -5.0F, 1, 4, 4, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, -24.0F, -2.1F, -5.0F, 1, 4, 4, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 0, 0, 23.0F, -2.1F, -5.0F, 1, 4, 4, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 161, 26, 19.0F, -1.3359F, -4.2087F, 4, 4, 4, 0.0F, false));
        bone27.cubeList.add(new ModelBox(bone27, 170, 19, -23.0F, -1.3359F, -4.2087F, 4, 4, 4, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.0F, -0.4F, -7.0F);
        bone27.addChild(bone28);
        setRotationAngle(bone28, 0.2618F, 0.0F, 0.0F);
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, 18.0F, -1.1F, -1.5F, 1, 4, 4, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.0F, -1.1F, -1.5F, 1, 4, 4, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -24.0F, -1.1F, -1.5F, 1, 4, 4, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, 23.0F, -1.1F, -1.5F, 1, 4, 4, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 149, 19, 19.0F, -0.1571F, -0.9335F, 4, 4, 4, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 158, 19, -23.0F, -0.1571F, -0.9335F, 4, 4, 4, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(-1.0F, -18.0F, -38.5F);
        bone2.addChild(bone23);
        setRotationAngle(bone23, 0.1745F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, 18.0F, -1.1F, 0.9F, 3, 6, 6, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, -21.0F, -1.1F, 0.9F, 3, 6, 6, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(-1.0F, -11.0F, -48.0F);
        bone2.addChild(bone29);
        setRotationAngle(bone29, 0.5236F, 0.0F, 0.0F);
        bone29.cubeList.add(new ModelBox(bone29, 0, 0, 11.0F, -0.4F, 1.6F, 7, 3, 16, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 0, 0, -18.0F, -0.4F, 1.6F, 7, 3, 16, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 328, 56, 10.0F, -4.4F, 9.6F, 1, 4, 1, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 328, 56, 10.0F, -6.9F, 6.6F, 1, 7, 1, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 328, 56, -11.0F, -4.4F, 9.6F, 1, 4, 1, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 328, 56, -11.0F, -6.9F, 6.6F, 1, 7, 1, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 0, 0, -11.0F, -0.4F, 10.6F, 22, 3, 7, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 24, 34, -14.0F, 2.6F, 1.6F, 28, 6, 16, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 0, 0, -11.0F, -0.4F, 1.6F, 22, 3, 3, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 0, 0, -11.0F, -0.4F, 4.6F, 4, 3, 6, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 0, 0, 7.0F, -0.4F, 4.6F, 4, 3, 6, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, 1.1F, 25.6F);
        bone29.addChild(bone35);
        setRotationAngle(bone35, 0.4363F, 0.0F, 0.0F);


        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone29.addChild(bone47);
        setRotationAngle(bone47, 0.2618F, 0.0F, 0.0F);


        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone47.addChild(bone48);
        setRotationAngle(bone48, 0.2618F, 0.0F, 0.0F);
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, -8.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, -6.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, -4.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, -2.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, -0.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, 1.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, 3.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, 5.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 365, 37, 7.5F, 1.6F, -2.4F, 1, 6, 4, 0.0F, false));

        bone64 = new ModelRenderer(this);
        bone64.setRotationPoint(0.0F, 1.1F, 7.6F);
        bone29.addChild(bone64);
        setRotationAngle(bone64, -0.6981F, 0.0F, 0.0F);
        bone64.cubeList.add(new ModelBox(bone64, 0, 0, -7.0F, -3.5F, -3.0F, 14, 5, 6, 0.0F, false));
        bone64.cubeList.add(new ModelBox(bone64, 315, 49, -6.4F, -3.1F, -3.1F, 13, 4, 1, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(-1.0F, -17.4F, -37.7F);
        bone2.addChild(bone30);
        setRotationAngle(bone30, 0.0873F, 0.0F, 0.0F);
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, 18.0F, -1.8F, -1.9F, 6, 4, 4, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, -24.0F, -1.8F, -1.9F, 6, 4, 4, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(-1.0F, -8.5F, -48.0F);
        bone2.addChild(bone31);
        setRotationAngle(bone31, 0.0873F, 0.0F, 0.0F);


        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, 1.0F, 2.0F);
        bone31.addChild(bone32);
        setRotationAngle(bone32, -0.6109F, 0.0F, 0.0F);


        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, 1.7F, -1.0F);
        bone32.addChild(bone33);
        setRotationAngle(bone33, -0.4363F, 0.0F, 0.0F);
        bone33.cubeList.add(new ModelBox(bone33, 138, 16, -25.0F, -3.8F, -2.4F, 15, 5, 3, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 133, 18, 10.0F, -3.8F, -2.4F, 15, 5, 3, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(-0.1F, -1.0F, 2.0F);
        bone31.addChild(bone34);
        setRotationAngle(bone34, -0.2618F, 0.0F, 0.0F);
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, -24.1F, -2.5F, -2.0F, 13, 1, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, -24.1F, 0.5F, -2.0F, 13, 1, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, -24.1F, -1.5F, -2.0F, 6, 2, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, -15.1F, -1.5F, -2.0F, 4, 2, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, 17.9F, -1.5F, -2.0F, 6, 2, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, 10.9F, -2.5F, -2.0F, 13, 1, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, 10.9F, -1.5F, -2.0F, 4, 2, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 0, 0, 10.9F, 0.5F, -2.0F, 13, 1, 4, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, -10.0F, 2.0F);
        bone34.addChild(bone40);
        setRotationAngle(bone40, 0.1745F, 0.0F, 0.0F);
        bone40.cubeList.add(new ModelBox(bone40, 134, 26, -19.9F, -1.5F, -2.0F, 20, 1, 4, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 134, 26, -0.1F, -1.5F, -2.0F, 20, 1, 4, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.0F, -1.0F, -3.0F);
        bone40.addChild(bone46);
        setRotationAngle(bone46, -0.384F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 134, 26, -19.9F, -0.9F, -0.9F, 17, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 134, 26, 2.9F, -0.9F, -0.9F, 17, 1, 2, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(18.5F, -32.0F, -34.0F);
        bone2.addChild(bone36);
        setRotationAngle(bone36, 0.3491F, 0.0F, 0.0F);


        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.0F, 4.8F, 1.6F);
        bone36.addChild(bone37);
        setRotationAngle(bone37, 0.3665F, 0.0F, 0.0F);


        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.0F, 4.8F, 9.6F);
        bone36.addChild(bone38);
        setRotationAngle(bone38, 0.3491F, 0.0F, 0.0F);


        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone38.addChild(bone39);
        setRotationAngle(bone39, 0.3491F, 0.0F, 0.0F);
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, -1.5F, -3.6F, -14.4F, 3, 2, 15, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, -40.5F, -3.6F, -14.4F, 3, 2, 15, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, -37.5F, -3.6F, -1.4F, 36, 2, 2, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 0, 0, -37.5F, -3.6F, -15.4F, 36, 2, 3, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 149, 23, -37.5F, -3.6F, -2.4F, 18, 1, 1, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 149, 23, -19.5F, -3.6F, -2.4F, 18, 1, 1, 0.0F, false));

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(-1.0F, -8.0F, 46.0F);
        bone2.addChild(bone54);
        setRotationAngle(bone54, -0.0873F, 0.0F, 0.0F);
        bone54.cubeList.add(new ModelBox(bone54, 0, 0, -23.0F, -3.0F, -6.0F, 23, 6, 7, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 0, 0, 0.0F, -3.0F, -6.0F, 23, 6, 7, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 130, 10, -25.0F, -2.7957F, -4.5701F, 2, 4, 7, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 130, 10, 0.0F, -2.7957F, 0.4299F, 23, 4, 2, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 130, 10, -23.0F, -2.7957F, 0.4299F, 23, 4, 2, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 130, 10, 23.0F, -2.7957F, -4.5701F, 2, 4, 7, 0.0F, false));

        bone57 = new ModelRenderer(this);
        bone57.setRotationPoint(-24.5F, -5.0F, -5.0F);
        bone2.addChild(bone57);
        setRotationAngle(bone57, 0.0F, 0.0F, 0.8727F);
        bone57.cubeList.add(new ModelBox(bone57, 130, 14, -0.9F, -1.4F, 1.0F, 1, 2, 26, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 131, 14, -0.9F, -1.4F, -23.0F, 1, 2, 24, 0.0F, false));

        bone58 = new ModelRenderer(this);
        bone58.setRotationPoint(22.5F, -5.0F, -3.5F);
        bone2.addChild(bone58);
        setRotationAngle(bone58, 0.0F, 0.0F, -0.8727F);
        bone58.cubeList.add(new ModelBox(bone58, 129, 16, 0.2F, -1.4F, -0.5F, 1, 2, 26, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 131, 16, 0.2F, -1.4F, -24.5F, 1, 2, 24, 0.0F, false));

        bone65 = new ModelRenderer(this);
        bone65.setRotationPoint(-23.5F, -8.5F, -3.7F);
        bone2.addChild(bone65);
        setRotationAngle(bone65, 0.0F, 0.0F, -0.7854F);
        bone65.cubeList.add(new ModelBox(bone65, 136, 9, -0.5F, -0.5F, -20.5F, 1, 1, 20, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 131, 9, -0.5F, -0.5F, -0.5F, 1, 1, 22, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 136, 9, 31.5F, 31.5F, -20.5F, 1, 1, 20, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 131, 9, 31.5F, 31.5F, -0.5F, 1, 1, 22, 0.0F, false));

        bone66 = new ModelRenderer(this);
        bone66.setRotationPoint(-1.0F, -17.5F, 22.0F);
        bone2.addChild(bone66);
        bone66.cubeList.add(new ModelBox(bone66, 304, 40, -18.0F, -3.5F, -6.0F, 36, 7, 12, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 304, 40, -13.0F, -4.5F, -6.0F, 7, 1, 4, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 409, 177, 13.6F, -3.1F, -6.1F, 4, 5, 1, 0.0F, false));

        bone67 = new ModelRenderer(this);
        bone67.setRotationPoint(-10.0F, 6.0F, -6.0F);
        bone66.addChild(bone67);
        setRotationAngle(bone67, 0.6981F, 0.0F, 0.0F);
        bone67.cubeList.add(new ModelBox(bone67, 324, 38, -4.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 324, 38, 2.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 324, 38, -1.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F, false));

        bone68 = new ModelRenderer(this);
        bone68.setRotationPoint(0.0F, 4.5F, -15.0F);
        bone66.addChild(bone68);
        setRotationAngle(bone68, 0.1745F, 0.0F, 0.0F);
        bone68.cubeList.add(new ModelBox(bone68, 304, 40, -3.0F, -2.0F, -23.0F, 5, 4, 34, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 304, 40, -2.0F, -3.0F, 2.0F, 3, 1, 3, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 304, 40, -1.0F, -6.0F, 3.0F, 1, 3, 1, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 304, 40, -1.0F, -6.0F, 2.0F, 1, 1, 1, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 304, 40, -1.0F, -6.0F, 4.0F, 1, 1, 1, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 304, 40, 0.0F, -6.0F, 3.0F, 1, 1, 1, 0.0F, false));
        bone68.cubeList.add(new ModelBox(bone68, 304, 40, -2.0F, -6.0F, 3.0F, 1, 1, 1, 0.0F, false));

        bone70 = new ModelRenderer(this);
        bone70.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone68.addChild(bone70);
        setRotationAngle(bone70, 0.2618F, 0.0F, 0.0F);
        bone70.cubeList.add(new ModelBox(bone70, 304, 40, -1.0F, -4.0F, -7.0F, 1, 1, 7, 0.0F, false));

        bone69 = new ModelRenderer(this);
        bone69.setRotationPoint(-9.5F, -3.0F, -7.5F);
        bone66.addChild(bone69);
        setRotationAngle(bone69, -0.1745F, 0.0F, 0.0F);
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -1.5F, -1.5F, -0.5F, 3, 3, 3, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -0.5F, -3.5F, -2.5F, 1, 7, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -3.5F, -0.5F, -2.5F, 3, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, 0.5F, -0.5F, -2.5F, 3, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, 2.5F, -1.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, 2.5F, 0.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, 0.5F, -3.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -1.5F, -3.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -3.5F, -1.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -3.5F, 0.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -1.5F, 2.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, 0.5F, 2.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, 1.5F, 1.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, 1.5F, -2.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -2.5F, -2.5F, -2.5F, 1, 1, 2, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 332, 28, -2.5F, 1.5F, -2.5F, 1, 1, 2, 0.0F, false));

        bone71 = new ModelRenderer(this);
        bone71.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(bone71);


        bone72 = new ModelRenderer(this);
        bone72.setRotationPoint(-11.0F, -13.0F, 1.5F);
        bone71.addChild(bone72);
        setRotationAngle(bone72, 0.0873F, 0.0F, 0.0F);
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 0.0F, -2.0F, -5.5F, 6, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, -7.0F, -2.0F, -5.5F, 7, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 0.0F, -11.0F, -5.5F, 6, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, -7.0F, -11.0F, -5.5F, 7, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 20.0F, -2.0F, -5.5F, 7, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 14.0F, -2.0F, -5.5F, 6, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 14.0F, -11.0F, -5.5F, 6, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 20.0F, -11.0F, -5.5F, 7, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, -7.0F, -3.6F, -25.5F, 7, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, -7.0F, -12.6F, -25.5F, 7, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 0.0F, -3.6F, -25.5F, 6, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 0.0F, -12.6F, -25.5F, 6, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 14.0F, -3.6F, -25.5F, 7, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 14.0F, -12.6F, -25.5F, 7, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 21.0F, -3.6F, -25.5F, 6, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 21.0F, -12.6F, -25.5F, 6, 9, 3, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 6.0F, -3.6F, -25.5F, 8, 4, 11, 0.0F, false));
        bone72.cubeList.add(new ModelBox(bone72, 108, 206, 6.0F, -12.6F, -25.5F, 8, 9, 3, 0.0F, false));

        bone74 = new ModelRenderer(this);
        bone74.setRotationPoint(-1.0F, -34.5F, -1.0F);
        bone2.addChild(bone74);


        bone75 = new ModelRenderer(this);
        bone75.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone74.addChild(bone75);
        setRotationAngle(bone75, 0.1571F, 0.0F, 0.0F);
        bone75.cubeList.add(new ModelBox(bone75, 0, 0, -4.0F, 1.6F, -6.0F, 1, 1, 12, 0.0F, false));
        bone75.cubeList.add(new ModelBox(bone75, 0, 0, 3.0F, 1.6F, -6.0F, 1, 1, 12, 0.0F, false));
        bone75.cubeList.add(new ModelBox(bone75, 0, 0, -4.0F, 0.6F, -6.0F, 8, 1, 12, 0.0F, false));

        bone76 = new ModelRenderer(this);
        bone76.setRotationPoint(-1.0F, -32.0F, -26.5F);
        bone2.addChild(bone76);
        setRotationAngle(bone76, -0.2618F, 0.0F, 0.0F);


        bone77 = new ModelRenderer(this);
        bone77.setRotationPoint(0.0F, -0.5F, 1.4F);
        bone76.addChild(bone77);
        setRotationAngle(bone77, 0.0175F, 0.0F, 0.0F);
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, 17.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, 13.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, 9.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, 5.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, 1.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, -2.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, -6.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, -10.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, -14.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));
        bone77.cubeList.add(new ModelBox(bone77, 146, 36, -18.5F, -1.0F, -1.6F, 1, 2, 3, 0.0F, false));

        bone78 = new ModelRenderer(this);
        bone78.setRotationPoint(-22.5F, -20.5F, 25.5F);
        bone2.addChild(bone78);
        setRotationAngle(bone78, 0.0F, 0.7854F, 0.4363F);
        bone78.cubeList.add(new ModelBox(bone78, 144, 18, -0.5F, -1.5F, -3.5F, 1, 1, 6, 0.0F, false));

        bone79 = new ModelRenderer(this);
        bone79.setRotationPoint(20.5F, -20.5F, 25.5F);
        bone2.addChild(bone79);
        setRotationAngle(bone79, -0.4363F, -0.7854F, 0.0F);
        bone79.cubeList.add(new ModelBox(bone79, 144, 18, -1.0F, -1.1F, -3.9F, 1, 1, 6, 0.0F, false));

        bone80 = new ModelRenderer(this);
        bone80.setRotationPoint(-25.0F, -22.5F, 22.75F);
        bone2.addChild(bone80);
        setRotationAngle(bone80, 0.0F, -0.1745F, 0.0F);
        bone80.cubeList.add(new ModelBox(bone80, 248, 180, -1.5F, -0.5F, -0.55F, 3, 1, 1, 0.0F, false));
        bone80.cubeList.add(new ModelBox(bone80, 0, 0, -2.0F, -1.0F, -0.45F, 4, 2, 1, 0.0F, false));

        bone81 = new ModelRenderer(this);
        bone81.setRotationPoint(23.0F, -22.5F, 22.75F);
        bone2.addChild(bone81);
        setRotationAngle(bone81, 0.0F, 0.4363F, 0.0F);
        bone81.cubeList.add(new ModelBox(bone81, 248, 180, -1.5F, -0.5F, -0.75F, 3, 1, 1, 0.0F, false));
        bone81.cubeList.add(new ModelBox(bone81, 0, 0, -2.0F, -1.0F, -0.65F, 4, 2, 1, 0.0F, false));

        head_lights = new ModelRenderer(this);
        head_lights.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights.cubeList.add(new ModelBox(head_lights, 346, 210, 11.0F, -17.3577F, 44.1618F, 5, 3, 4, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 346, 210, -18.0F, -17.3577F, 44.1618F, 5, 3, 4, 0.0F, false));

        head_lights_right = new ModelRenderer(this);
        head_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 439, 247, 16.5F, -17.3577F, 44.3618F, 3, 3, 4, 0.0F, false));

        head_lights_left = new ModelRenderer(this);
        head_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_left.cubeList.add(new ModelBox(head_lights_left, 439, 247, -21.5F, -17.2577F, 44.4618F, 3, 3, 4, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(-0.9F, 7.9F, -43.2F);
        setRotationAngle(plate, -0.1745F, 0.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 351, 178, -6.0F, -0.9F, -0.5F, 12, 3, 1, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(-1.0F, 8.5641F, -44.1087F);
        setRotationAngle(rear_lights, -0.7854F, 0.0F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 500, 250, 19.4F, -1.0F, 0.4F, 3, 2, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 500, 250, -22.6F, -1.0F, 0.4F, 3, 2, 2, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(-1.1F, 7.8429F, -46.5335F);
        setRotationAngle(rear_lights_brake, 1.0297F, 0.0F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 424, 178, -20.5F, 2.5F, -2.8F, 1, 1, 2, 0.0F, false));
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 432, 179, 19.5F, 2.5F, -2.8F, 1, 1, 2, 0.0F, false));

        rear_lights_reverse = new ModelRenderer(this);
        rear_lights_reverse.setRotationPoint(-1.1F, 7.8429F, -46.5335F);
        setRotationAngle(rear_lights_reverse, 1.0297F, 0.0F, 0.0F);
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 410, 198, 20.5F, 2.4F, -2.8F, 1, 1, 2, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 410, 198, -21.5F, 2.4F, -2.8F, 1, 1, 2, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(20.9F, 7.8429F, -46.5335F);
        setRotationAngle(rear_lights_right, 1.0297F, 0.0F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 440, 250, -0.5F, 2.4F, -2.8F, 1, 1, 2, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(-23.1F, 7.8429F, -46.5335F);
        setRotationAngle(rear_lights_left, 1.0297F, 0.0F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 440, 250, -0.5F, 2.4F, -2.8F, 1, 1, 2, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 24.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 361, 156, -3.4F, -20.6F, 15.9F, 4, 3, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 236, 240, -7.0F, -17.0F, 15.9F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 344, 244, -6.6F, -18.5F, 15.9F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 182, 198, -7.0F, -20.5F, 15.9F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 171, 220, -18.0F, -16.3F, 15.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 188, 219, -18.0F, -17.6F, 15.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 187, 220, -18.0F, -18.9F, 15.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 228, 209, -18.0F, -20.5F, 15.9F, 2, 1, 1, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, head_lights, rear_lights),
                new LightControllerEntry<>(0.8F, interier),
                new LightControllerEntry<>(0.6F, plate),
                new BrakeLights<>(rear_lights_brake),
                new ReverseLights<>(rear_lights_reverse),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, head_lights_right, rear_lights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, head_lights_left, rear_lights_left)
        );
    }

    @Override
    protected void renderModel() {
        bone21.render(1.0F);
        bone41.render(1.0F);
        bone42.render(1.0F);
        bone.render(1.0F);
        bone2.render(1.0F);
    }
}
