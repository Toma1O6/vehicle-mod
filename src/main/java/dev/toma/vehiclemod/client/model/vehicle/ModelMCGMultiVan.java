package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.internals.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.special.VehicleMCGMultiVan;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelMCGMultiVan extends ModelVehicle<VehicleMCGMultiVan> {

    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone41;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer bone42;
    private final ModelRenderer bone45;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone;
    private final ModelRenderer head_lights;
    private final ModelRenderer head_lights_left;
    private final ModelRenderer head_lights_right;
    private final ModelRenderer plate;
    private final ModelRenderer rear_lights;
    private final ModelRenderer rear_lights_brake;
    private final ModelRenderer rear_lights_right;
    private final ModelRenderer rear_lights_left;
    private final ModelRenderer rear_lights_reverse;
    private final ModelRenderer interier;

    public ModelMCGMultiVan() {
        textureWidth = 512;
        textureHeight = 512;

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -14.0F, 44.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -20.0F, 38.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -8.0F, 38.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.3F, -14.0F, 32.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -14.0F, -40.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -20.0F, -46.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -8.0F, -46.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, 16.1F, -14.0F, -52.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -14.0F, 44.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -20.0F, 38.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -8.0F, 38.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.3F, -14.0F, 32.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -14.0F, -40.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -20.0F, -46.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -8.0F, -46.0F, 7, 8, 8, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 27, -25.2F, -14.0F, -52.0F, 7, 8, 8, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(2.5F, -27.0F, 33.0F);
        bone21.addChild(bone22);
        setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 1.6568F, 20.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, -4.3432F, 14.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 1.6568F, 8.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.8F, 7.6568F, 14.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 61.0538F, -39.0122F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 55.0538F, -45.0122F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 61.0538F, -51.0122F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, 13.6F, 67.0538F, -45.0122F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 1.6568F, 20.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, -4.3432F, 14.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 1.6568F, 8.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.8F, 7.6568F, 14.3848F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 61.0538F, -39.0122F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 55.0538F, -45.0122F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 61.0538F, -51.0122F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 27, -27.7F, 67.0538F, -45.0122F, 7, 8, 8, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone41.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -12.0F, -43.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -11.0F, -44.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -10.0F, -43.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -11.0F, -42.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -12.0F, -43.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -11.0F, -44.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -10.0F, -43.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -11.0F, -42.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -12.0F, 41.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -11.0F, 40.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -10.0F, 41.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, 7.0F, -11.0F, 42.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -12.0F, 41.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -11.0F, 40.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -10.0F, 41.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -26.0F, -11.0F, 42.0F, 17, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -12.0F, 41.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -11.0F, 40.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -10.0F, 41.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -11.0F, 42.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -12.0F, -43.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -11.0F, -44.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -10.0F, -43.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 237, 32, -9.0F, -11.0F, -42.0F, 16, 2, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(3.0F, -27.0F, -44.0F);
        bone43.addChild(bone44);
        setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 9.6066F, 11.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 8.6066F, 12.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 9.6066F, 13.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, 10.6066F, 12.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 9.6066F, 11.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 8.6066F, 12.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 9.6066F, 13.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, 10.6066F, 12.435F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -49.7904F, 70.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -50.7904F, 71.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -49.7904F, 72.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, 4.0F, -48.7904F, 71.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -49.7904F, 70.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -50.7904F, 71.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -49.7904F, 72.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -29.0F, -48.7904F, 71.832F, 17, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -50.7904F, 71.832F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -49.7904F, 70.832F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -48.7904F, 71.832F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, -49.7904F, 72.832F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 9.6066F, 11.435F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 10.6066F, 12.435F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 9.6066F, 13.435F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 237, 32, -12.0F, 8.6066F, 12.435F, 16, 2, 2, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(-1.0F, 25.0F, 10.0F);
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -11.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -13.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -12.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -12.0F, -36.4F, 2, 2, 41, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -11.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -13.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -12.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -12.0F, 4.6F, 2, 2, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, 0.0F, -12.0F, -52.4F, 2, 2, 16, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -13.0F, -52.4F, 2, 2, 16, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -2.0F, -12.0F, -52.4F, 2, 2, 16, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 187, 27, -1.0F, -11.0F, -52.4F, 2, 2, 16, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -14.0F, -39.0F, 15, 7, 29, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -14.0F, -39.0F, 15, 7, 29, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 205, 9, -24.0F, -12.0F, -41.0F, 9, 5, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 205, 9, 15.0F, -12.0F, -41.0F, 9, 5, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 205, 9, 15.0F, -12.0F, -10.0F, 9, 5, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 205, 9, -24.0F, -12.0F, -10.0F, 9, 5, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -14.0F, -10.0F, 15, 7, 29, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -14.0F, -10.0F, 15, 7, 29, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 20.0F, -26.0F, -14.0F, 3, 12, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 20.0F, -45.0F, -23.0F, 3, 31, 9, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -45.0F, -23.0F, 3, 31, 9, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -26.0F, -14.0F, 3, 12, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -14.0F, 19.0F, 15, 7, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -14.0F, 19.0F, 15, 7, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 196, 36, -25.0F, -12.0F, 44.0F, 25, 5, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 196, 36, 0.0F, -12.0F, 44.0F, 25, 5, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 361, 150, -7.0F, -15.9F, -63.5F, 15, 7, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 10, 12, -15.0F, -14.0F, -63.0F, 15, 7, 24, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.0F, -31.0F, -23.0F, 40, 17, 3, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.0F, -45.0F, -23.0F, 40, 7, 3, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 9.0F, -40.0F, -23.0F, 11, 9, 3, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.0F, -40.0F, -23.0F, 11, 9, 3, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 20.0F, -26.0F, 21.0F, 3, 4, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -26.0F, 21.0F, 3, 4, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.0F, -23.0F, 21.0F, 5, 1, 23, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.0F, -23.0F, 44.0F, 5, 9, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.0F, -23.0F, 20.0F, 5, 9, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 15.0F, -23.0F, 20.0F, 5, 9, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 15.0F, -23.0F, 44.0F, 5, 9, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 15.0F, -23.0F, 21.0F, 5, 1, 23, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -23.0F, 20.0F, 1, 9, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 14.0F, -23.0F, 20.0F, 1, 9, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -22.0F, 44.0F, 3, 8, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 20.0F, -22.0F, 43.0F, 3, 8, 3, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -47.0F, -10.0F, 15, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -24.0F, -47.0F, -10.0F, 9, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -47.0F, -10.0F, 15, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 15.0F, -47.0F, -10.0F, 9, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -24.0F, -47.0F, 21.0F, 9, 2, 28, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 15.0F, -47.0F, 21.0F, 9, 2, 28, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -47.0F, 21.0F, 15, 2, 28, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -47.0F, 21.0F, 15, 2, 28, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -24.0F, -47.0F, -23.0F, 9, 2, 13, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -47.0F, -23.0F, 15, 2, 13, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -47.0F, -23.0F, 15, 2, 13, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 15.0F, -47.0F, -23.0F, 9, 2, 13, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, -13.0F, -14.2F, 19.0F, 1, 1, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, -13.0F, -14.2F, -15.0F, 1, 1, 34, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, 12.0F, -14.2F, 19.0F, 1, 1, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, 12.0F, -14.2F, -15.0F, 1, 1, 34, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, 4.0F, -14.2F, 19.0F, 1, 1, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, 4.0F, -14.2F, -15.0F, 1, 1, 34, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, -5.0F, -14.2F, 19.0F, 1, 1, 25, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 329, 4, -5.0F, -14.2F, -15.0F, 1, 1, 34, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.1F, -31.0F, 45.7F, 20, 17, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.1F, -31.0F, 45.7F, 20, 17, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.1F, -44.0F, 45.7F, 20, 3, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.1F, -44.0F, 45.7F, 20, 3, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.1F, -41.0F, 45.7F, 6, 10, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 14.1F, -41.0F, 45.7F, 6, 10, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.1F, -41.0F, 45.7F, 4, 10, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -4.1F, -41.0F, 45.7F, 4, 10, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 315, 18, -0.1F, -45.0F, 46.5F, 1, 31, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 32, 36, -25.0F, -14.0F, 44.0F, 25, 2, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 32, 36, 0.0F, -14.0F, 44.0F, 25, 2, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 32, 36, -24.0F, -14.0F, -41.0F, 9, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 32, 36, -24.0F, -14.0F, -10.0F, 9, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 32, 36, 15.0F, -14.0F, -10.0F, 9, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 32, 36, 15.0F, -14.0F, -41.0F, 9, 2, 31, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, 15.0F, -47.0F, 49.0F, 10, 3, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, 0.0F, -47.0F, 49.0F, 15, 3, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, -15.0F, -47.0F, 49.0F, 15, 3, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, -25.0F, -47.0F, 49.0F, 10, 3, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, 2.0F, -26.0F, 47.0F, 4, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, -6.0F, -26.0F, 47.0F, 4, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -20.0F, -45.0F, 46.0F, 20, 1, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -45.0F, 46.0F, 20, 1, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 19.0F, -41.0F, -27.0F, 3, 27, 4, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -22.0F, -41.0F, -27.0F, 3, 27, 4, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -45.0F, 21.0F, 3, 4, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 20.0F, -45.0F, 21.0F, 3, 4, 27, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -41.0F, 43.0F, 3, 15, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 20.0F, -41.0F, 43.0F, 3, 15, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 20.0F, -45.0F, -14.0F, 3, 4, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -45.0F, -14.0F, 3, 4, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 13, 21.5F, -41.0F, -14.0F, 1, 15, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 13, 21.5F, -41.0F, 21.0F, 1, 15, 22, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 9, -22.5F, -41.0F, 21.0F, 1, 15, 22, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 9, -22.5F, -41.0F, -14.0F, 1, 15, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 7.0F, -11.0F, -68.0F, 16, 4, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -11.0F, -68.0F, 16, 4, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -21.0F, -68.0F, 16, 4, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 7.0F, -21.0F, -68.0F, 16, 4, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -17.0F, -68.0F, 1, 6, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 22.0F, -17.0F, -68.0F, 1, 6, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 359, 53, 18.0F, -16.0F, -67.4F, 1, 4, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 359, 53, -19.0F, -16.0F, -67.4F, 1, 4, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -13.0F, -17.0F, -68.0F, 6, 6, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 7.0F, -17.0F, -68.0F, 6, 6, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 10, 12, -7.0F, -16.0F, -63.0F, 14, 4, 0, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -7.0F, -9.0F, -68.0F, 14, 2, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -27.2F, -56.1F, 23, 6, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -27.2F, -56.1F, 23, 6, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 19.0F, -23.0F, -65.0F, 3, 15, 3, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -22.0F, -23.0F, -65.0F, 3, 15, 3, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 0.0F, -43.0F, -55.0F, 23, 2, 32, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -23.0F, -43.0F, -55.0F, 23, 2, 32, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, 0.0F, -43.0F, -56.0F, 23, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 224, 32, -23.0F, -43.0F, -56.0F, 23, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 36, 36, -21.5F, -41.0F, -14.0F, 1, 15, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 36, 36, -21.5F, -41.0F, 21.0F, 1, 15, 22, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 36, 27, 20.5F, -41.0F, -14.0F, 1, 15, 35, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 36, 27, 20.5F, -41.0F, 21.0F, 1, 15, 22, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -22.0F, -29.0F, -55.0F, 3, 8, 14, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 19.0F, -29.0F, -55.0F, 3, 8, 14, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 19.0F, -29.0F, -41.0F, 3, 15, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -22.0F, -29.0F, -41.0F, 3, 15, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -21.5F, -29.0F, -40.0F, 2, 15, 13, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 19.5F, -29.0F, -40.0F, 2, 15, 13, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 19.0F, -42.0F, -42.0F, 3, 13, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -22.0F, -42.0F, -42.0F, 3, 13, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 14.0F, -21.0F, -63.0F, 1, 7, 23, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 14.0F, -22.0F, -55.0F, 5, 1, 15, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 15.0F, -21.0F, -41.0F, 4, 7, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -15.0F, -21.0F, -63.0F, 1, 7, 23, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -19.0F, -21.0F, -41.0F, 4, 7, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -19.0F, -22.0F, -55.0F, 5, 1, 15, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 205, 9, 21.0F, -25.0F, -30.0F, 1, 1, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 205, 9, -22.0F, -25.0F, -30.0F, 1, 1, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, -22.0F, -21.0F, -46.0F, 3, 7, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 0, 19.0F, -21.0F, -46.0F, 3, 7, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, 13.0F, -17.0F, -67.4F, 9, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, 13.0F, -12.0F, -67.4F, 9, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, 21.0F, -16.0F, -67.4F, 1, 4, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, 13.0F, -16.0F, -67.4F, 1, 4, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, -22.0F, -16.0F, -67.4F, 1, 4, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, -14.0F, -16.0F, -67.4F, 1, 4, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, -22.0F, -12.0F, -67.4F, 9, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 258, 44, -22.0F, -17.0F, -67.4F, 9, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 216, 17, 0.0F, -8.0F, -69.2F, 24, 2, 6, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 216, 17, -24.0F, -8.0F, -69.2F, 24, 2, 6, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 246, 28, 4.0F, -19.0F, -66.0F, 1, 10, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 10, 12, 0.0F, -14.0F, -63.0F, 15, 7, 24, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 246, 28, -5.0F, -19.0F, -66.0F, 1, 10, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 246, 28, -2.0F, -19.0F, -66.0F, 1, 10, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 246, 28, 1.0F, -19.0F, -66.0F, 1, 10, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 314, 26, 20.0F, -22.0F, 46.0F, 3, 8, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 314, 26, -23.0F, -22.0F, 46.0F, 3, 8, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 321, 40, -19.0F, -27.2F, -54.1F, 19, 8, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 321, 40, 0.0F, -27.2F, -54.1F, 19, 8, 5, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, 11.0F, -16.0F, -39.0F, 4, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, 11.0F, -18.0F, -39.0F, 4, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, 5.0F, -16.0F, -39.0F, 6, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, 5.0F, -18.0F, -39.0F, 6, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, -16.0F, -16.0F, -39.0F, 4, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, -16.0F, -18.0F, -39.0F, 4, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, -12.0F, -16.0F, -39.0F, 6, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, -12.0F, -18.0F, -39.0F, 6, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, -6.0F, -16.0F, -39.0F, 6, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, -6.0F, -18.0F, -39.0F, 6, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, 0.0F, -16.0F, -39.0F, 5, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 130, 144, 0.0F, -18.0F, -39.0F, 5, 2, 12, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 406, 184, -18.0F, -26.8F, -50.0F, 5, 4, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 216, 17, -6.0F, -8.9F, -69.7F, 12, 5, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 216, 17, -6.0F, -11.4F, 48.3F, 12, 5, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 360, 71, -3.0F, -46.5F, 50.1F, 6, 2, 1, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(-20.0F, -23.0F, -27.9F);
        bone42.addChild(bone45);
        setRotationAngle(bone45, 0.0F, 0.0F, 0.7854F);
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -7.6568F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 20.6274F, -6.6568F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -5.6568F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 22.6274F, -6.6568F, -8.5F, 2, 2, 41, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -7.6568F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 20.6274F, -6.6568F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -5.6568F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 22.6274F, -6.6568F, 32.5F, 2, 2, 27, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -7.6568F, -24.5F, 2, 2, 16, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 21.6274F, -5.6568F, -24.5F, 2, 2, 16, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 22.6274F, -6.6568F, -24.5F, 2, 2, 16, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 187, 27, 20.6274F, -6.6568F, -24.5F, 2, 2, 16, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -18.0F, 23.5F);
        bone42.addChild(bone2);
        setRotationAngle(bone2, -0.6981F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 20.9F, -6.0F, -5.5F, 2, 10, 5, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -22.9F, -6.0F, -5.5F, 2, 10, 5, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, -18.0F, 42.5F);
        bone42.addChild(bone3);
        setRotationAngle(bone3, 0.6981F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -22.9F, -7.0F, -1.2F, 2, 11, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, 20.9F, -7.0F, -1.2F, 2, 11, 5, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -24.5F, -66.0F);
        bone42.addChild(bone4);
        setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, -3.1F, 1.1F, 23, 7, 7, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -23.0F, -3.1F, 1.1F, 23, 7, 7, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -25.5F, -59.5F);
        bone42.addChild(bone5);
        setRotationAngle(bone5, -1.3788F, 0.0F, 0.0F);


        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone5.addChild(bone6);
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -23.0F, -3.6F, -1.0F, 9, 7, 6, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, 14.0F, -3.6F, -1.0F, 9, 7, 6, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -14.0F, -3.6F, 0.0F, 28, 2, 5, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 0.9F, 2.0F);
        bone6.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -14.0F, -2.5F, -3.0F, 28, 5, 6, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -1.0F, -4.5F, -3.0F, 2, 2, 1, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, -3.5F, -2.5F);
        bone12.addChild(bone13);
        setRotationAngle(bone13, 0.1745F, 0.0F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, 12.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, 10.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, 8.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, 6.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, 4.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, 2.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, -3.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, -5.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, -7.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, -9.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, -11.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, -13.0F, -1.1F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, -13.0F, 7.9F, -0.4F, 1, 2, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 329, 56, 12.0F, 7.9F, -0.4F, 1, 2, 1, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -25.25F, -53.25F);
        bone42.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 19.0F, -0.75F, -8.75F, 3, 18, 7, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -22.0F, -0.75F, -8.75F, 3, 18, 7, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 0.0F, 1.75F);
        bone7.addChild(bone8);
        setRotationAngle(bone8, -0.0873F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 19.0F, -1.75F, -4.8F, 3, 19, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -22.0F, -1.75F, -4.8F, 3, 19, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -22.0F, -16.75F, -4.8F, 3, 16, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 19.0F, -16.75F, -4.8F, 3, 16, 3, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(22.5F, -7.75F, -4.3F);
        bone8.addChild(bone14);


        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 4.0F, 0.0F);
        bone14.addChild(bone15);
        setRotationAngle(bone15, 0.0F, 0.0F, 0.8727F);
        bone15.cubeList.add(new ModelBox(bone15, 242, 37, -0.5F, -4.0F, 0.5F, 1, 5, 1, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, -4.0F, 0.0F);
        bone14.addChild(bone16);
        setRotationAngle(bone16, 0.0F, 0.0F, 0.8727F);
        bone16.cubeList.add(new ModelBox(bone16, 242, 37, -0.5F, -4.0F, 0.3F, 1, 5, 1, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-22.5F, -3.75F, -4.3F);
        bone8.addChild(bone17);
        setRotationAngle(bone17, 0.0F, 0.0F, -0.8727F);
        bone17.cubeList.add(new ModelBox(bone17, 242, 37, -0.5F, -4.0F, 0.5F, 1, 7, 1, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(-22.5F, -11.75F, -3.3F);
        bone8.addChild(bone18);
        setRotationAngle(bone18, 0.0F, 0.0F, -0.8727F);
        bone18.cubeList.add(new ModelBox(bone18, 242, 37, -0.5F, -4.0F, -0.7F, 1, 7, 1, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-0.4167F, -25.0F, -29.0F);
        bone42.addChild(bone9);
        setRotationAngle(bone9, -0.1745F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 144, 133, 11.4167F, -8.0F, -1.0F, 4, 17, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 144, 133, 5.4167F, -8.0F, -1.0F, 6, 17, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 144, 133, 0.4167F, -8.0F, -1.0F, 5, 17, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 144, 133, -5.5833F, -8.0F, -1.0F, 6, 17, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 144, 133, -11.5833F, -8.0F, -1.0F, 6, 17, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 144, 133, -15.5833F, -8.0F, -1.0F, 4, 17, 3, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(9.0F, -15.2F, -49.6F);
        bone42.addChild(bone10);
        setRotationAngle(bone10, 0.7854F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 321, 40, -4.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 321, 40, -1.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 321, 40, 2.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 321, 40, -11.0F, -6.0F, -0.5F, 5, 13, 5, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 321, 40, -9.0F, -1.0F, 2.5F, 1, 1, 6, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 321, 40, -9.0F, -2.0F, 7.5F, 1, 1, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 321, 40, -9.0F, 0.0F, 7.5F, 1, 1, 1, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(9.5F, -25.7F, -47.6F);
        bone42.addChild(bone11);
        setRotationAngle(bone11, 0.2618F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -0.5F, -3.5F, 0.5F, 1, 7, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -1.5F, -1.5F, -2.5F, 3, 3, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, 0.5F, -0.5F, 0.5F, 3, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -3.5F, -0.5F, 0.5F, 3, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, 0.5F, -3.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -1.5F, -3.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -3.5F, -1.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -3.5F, 0.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -1.5F, 2.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, 0.5F, 2.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, 2.5F, 0.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, 2.5F, -1.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, 1.5F, -2.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -2.5F, -2.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, -2.5F, 1.5F, 0.5F, 1, 1, 1, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 321, 40, 1.5F, 1.5F, 0.5F, 1, 1, 1, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(-25.5F, -35.025F, -53.7F);
        bone42.addChild(bone19);
        setRotationAngle(bone19, 0.0F, 0.1745F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, -1.5F, -5.275F, -1.3F, 3, 10, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 234, 34, -1.5F, -5.275F, -0.3F, 3, 10, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 234, 178, -1.0F, 1.525F, -0.2F, 2, 2, 1, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 234, 178, -1.0F, -4.975F, -0.2F, 2, 6, 1, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(25.5F, -35.025F, -53.7F);
        bone42.addChild(bone20);
        setRotationAngle(bone20, 0.0F, -0.1745F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 234, 34, -1.5F, -5.275F, -0.3F, 3, 10, 1, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 0, 0, -1.5F, -5.275F, -1.3F, 3, 10, 1, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 234, 178, -1.0F, 1.525F, -0.2F, 2, 2, 1, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 234, 178, -1.0F, -4.975F, -0.2F, 2, 6, 1, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);


        head_lights = new ModelRenderer(this);
        head_lights.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights.cubeList.add(new ModelBox(head_lights, 372, 206, 13.0F, -15.0F, -57.0F, 4, 4, 2, 0.0F, false));
        head_lights.cubeList.add(new ModelBox(head_lights, 372, 206, -19.0F, -15.0F, -57.0F, 4, 4, 2, 0.0F, false));

        head_lights_left = new ModelRenderer(this);
        head_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_left.cubeList.add(new ModelBox(head_lights_left, 441, 249, 18.0F, -15.0F, -57.0F, 2, 4, 2, 0.0F, false));

        head_lights_right = new ModelRenderer(this);
        head_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        head_lights_right.cubeList.add(new ModelBox(head_lights_right, 441, 249, -22.0F, -15.0F, -57.0F, 2, 4, 2, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 178, 144, -6.5F, -7.4F, -59.8F, 11, 4, 1, 0.0F, false));
        plate.cubeList.add(new ModelBox(plate, 167, 142, -6.5F, -10.0F, 58.4F, 11, 4, 1, 0.0F, false));

        rear_lights = new ModelRenderer(this);
        rear_lights.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights.cubeList.add(new ModelBox(rear_lights, 499, 250, 19.5F, -20.5F, 56.2F, 2, 3, 2, 0.0F, false));
        rear_lights.cubeList.add(new ModelBox(rear_lights, 499, 250, -23.5F, -20.5F, 56.2F, 2, 3, 2, 0.0F, false));

        rear_lights_brake = new ModelRenderer(this);
        rear_lights_brake.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_brake.cubeList.add(new ModelBox(rear_lights_brake, 494, 245, -3.5F, -45.0F, 60.2F, 5, 1, 1, 0.0F, false));

        rear_lights_right = new ModelRenderer(this);
        rear_lights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_right.cubeList.add(new ModelBox(rear_lights_right, 443, 248, -23.5F, -17.0F, 56.2F, 2, 1, 2, 0.0F, false));

        rear_lights_left = new ModelRenderer(this);
        rear_lights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_left.cubeList.add(new ModelBox(rear_lights_left, 443, 248, 19.5F, -17.0F, 56.2F, 2, 1, 2, 0.0F, false));

        rear_lights_reverse = new ModelRenderer(this);
        rear_lights_reverse.setRotationPoint(0.0F, 24.0F, 0.0F);
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 409, 214, -23.5F, -15.5F, 56.2F, 2, 1, 2, 0.0F, false));
        rear_lights_reverse.cubeList.add(new ModelBox(rear_lights_reverse, 409, 214, 19.5F, -15.5F, 56.2F, 2, 1, 2, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 24.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 376, 137, -3.0F, -25.8F, -40.0F, 5, 5, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 375, 251, 4.0F, -21.8F, -40.0F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 188, 222, 3.0F, -23.8F, -40.0F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 102, 151, 13.0F, -25.2F, -40.0F, 3, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 178, 224, 13.0F, -23.2F, -40.0F, 3, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 228, 209, 3.0F, -25.2F, -40.0F, 2, 1, 1, 0.0F, false));

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
    }
}
