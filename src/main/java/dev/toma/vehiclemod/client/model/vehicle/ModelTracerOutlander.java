package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.suv.VehicleTracerOutlander;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTracerOutlander extends ModelVehicle<VehicleTracerOutlander> {

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
    private final ModelRenderer bone30;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone29;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer bone37;
    private final ModelRenderer bone42;
    private final ModelRenderer bone25;
    private final ModelRenderer bone28;
    private final ModelRenderer bone44;
    private final ModelRenderer bone34;
    private final ModelRenderer bone36;
    private final ModelRenderer bone35;
    private final ModelRenderer bone41;
    private final ModelRenderer bone38;
    private final ModelRenderer bone40;
    private final ModelRenderer bone39;
    private final ModelRenderer zadni;
    private final ModelRenderer bone43;
    private final ModelRenderer bone45;
    private final ModelRenderer bone53;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone52;
    private final ModelRenderer headlights;
    private final ModelRenderer headlights_left;
    private final ModelRenderer headlights_right;
    private final ModelRenderer rearlights;
    private final ModelRenderer rearlights_brake;
    private final ModelRenderer rearlights_left;
    private final ModelRenderer rearlights_right;
    private final ModelRenderer rearlights_reverse;
    private final ModelRenderer plate;
    private final ModelRenderer interier;
    private final ModelRenderer bone55;
    private final ModelRenderer bone54;
    private final ModelRenderer bb_main;

    public ModelTracerOutlander() {
        textureWidth = 512;
        textureHeight = 512;

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(12.0F, 12.0F, 0.0F);
        setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -16.2635F, 23.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -16.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -16.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 24.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 24.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -17.2635F, 22.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -17.2635F, 22.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -17.2635F, 22.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 23.7487F, -18.2635F, 5, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, 2.0F, 23.7487F, -18.2635F, 6, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -18.2635F, 23.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -18.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -18.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 22.7487F, -17.2635F, 5, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, 2.0F, 22.7487F, -17.2635F, 6, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -17.2635F, 24.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -17.2635F, 24.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -17.2635F, 24.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 23.7487F, -16.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 23.7487F, -16.2635F, 10, 2, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-23.5F, 16.0F, -35.0F);
        setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -9.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -50.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -50.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -9.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -0.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -41.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -41.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -0.8284F, 2.6569F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -5.8284F, -1.3431F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -46.8406F, 39.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -46.8406F, 39.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -5.8284F, -1.3431F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -5.8284F, 7.6569F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -46.8406F, 48.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -46.8406F, 48.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -5.8284F, 7.6569F, 4, 6, 5, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 18.0F, 0.75F);
        setRotationAngle(bone, 0.0F, 0.0F, 0.7854F);


        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 18.0F, -2.25F);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, 19.25F, 2, 2, 12, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, -2.0F, 18.25F, 2, 2, 13, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 200, 17, -2.0F, -1.0F, 18.25F, 2, 2, 13, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, 19.25F, 2, 2, 12, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, -26.75F, 2, 2, 19, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, -26.75F, 2, 2, 19, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 19.5F, -18.0F);
        setRotationAngle(bone5, -1.5708F, 0.0F, 0.0F);


        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 19.5F, -18.0F);
        setRotationAngle(bone6, -1.5708F, 0.0F, 0.0F);


        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone7);
        setRotationAngle(bone7, 0.1745F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 233, 45, 15.0F, -0.1494F, -0.6219F, 5, 1, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 233, 45, -20.0F, -0.0509F, -0.6393F, 5, 1, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -19.0F, -60.0548F, 10.3472F, 4, 1, 0, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone8);
        setRotationAngle(bone8, 0.2618F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 233, 45, 15.0F, -0.2258F, -2.5361F, 5, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 233, 45, 15.0F, -56.0493F, 12.8359F, 5, 1, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 233, 45, -20.0F, -0.1292F, -2.562F, 5, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 233, 45, -20.0F, -56.0493F, 12.8359F, 5, 1, 3, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone9);
        setRotationAngle(bone9, 0.4363F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 233, 45, 15.0F, -0.6826F, -4.4704F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 233, 45, 15.0F, -52.9888F, 20.3618F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 233, 45, -20.0F, -0.592F, -4.5126F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 233, 45, -20.0F, -52.9888F, 20.3618F, 5, 1, 2, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone10);
        setRotationAngle(bone10, 0.6109F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 233, 45, 15.0F, -1.446F, -6.2116F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 233, 45, 15.0F, -48.6455F, 27.3261F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 233, 45, -20.0F, -1.3641F, -6.269F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 233, 45, -20.0F, -48.6455F, 27.3261F, 5, 1, 2, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, -50.9505F, 29.6618F);
        bone10.addChild(bone33);
        setRotationAngle(bone33, -0.1222F, 0.0F, 0.0F);


        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone11);
        setRotationAngle(bone11, 0.8727F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 233, 45, 15.0F, -3.0059F, -7.5838F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 233, 45, 15.0F, -39.9169F, 37.0273F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 233, 45, -20.0F, -2.9416F, -7.6604F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 233, 45, -20.0F, -39.9169F, 37.0273F, 5, 1, 2, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone12);
        setRotationAngle(bone12, 1.0472F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 233, 45, 15.0F, -4.2902F, -8.9366F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 233, 45, 15.0F, -32.8938F, 41.4063F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 233, 45, -20.0F, -4.2402F, -9.0232F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 233, 45, -20.0F, -32.8938F, 41.4063F, 5, 1, 2, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone13);
        setRotationAngle(bone13, 1.2217F, 0.0F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 233, 45, 15.0F, -5.7839F, -9.9914F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 233, 45, 15.0F, -25.211F, 44.5536F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 233, 45, -20.0F, -5.7497F, -10.0853F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 233, 45, -20.0F, -25.211F, 44.5536F, 5, 1, 2, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone14);
        setRotationAngle(bone14, 1.3963F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 233, 45, 15.0F, -7.4872F, -10.8464F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 233, 45, 15.0F, -17.1475F, 46.2434F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 233, 45, -20.0F, -7.4698F, -10.9449F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 233, 45, -20.0F, -17.1475F, 46.2434F, 5, 1, 2, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone15);
        setRotationAngle(bone15, 1.5708F, 0.0F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 233, 45, 15.0F, -9.3F, -11.4F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 233, 45, 15.0F, -8.9F, 46.5F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 233, 45, -20.0F, -9.3F, -11.5F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 233, 45, -20.0F, -8.9F, 46.5F, 5, 1, 2, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone16);
        setRotationAngle(bone16, 1.7453F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 233, 45, 15.0F, -11.1219F, -11.4506F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 233, 45, 15.0F, -0.6738F, 45.5003F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 233, 45, -20.0F, -11.1393F, -11.5491F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 233, 45, -20.0F, -0.6738F, 45.5003F, 5, 1, 2, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone17);
        setRotationAngle(bone17, 1.9199F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 233, 45, 15.0F, -12.9523F, -11.2966F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 233, 45, 15.0F, 7.2265F, 42.9748F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 233, 45, -20.0F, -12.9865F, -11.3905F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 233, 45, -20.0F, 7.2265F, 42.9748F, 5, 1, 2, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone18);
        setRotationAngle(bone18, 2.0944F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 233, 45, 15.0F, -14.6902F, -10.8366F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 233, 45, 15.0F, 14.6062F, 39.1063F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 233, 45, -20.0F, -14.7402F, -10.9232F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 233, 45, -20.0F, 14.6062F, 39.1063F, 5, 1, 2, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone19);
        setRotationAngle(bone19, 2.2689F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 233, 45, 15.0F, -16.3345F, -10.0694F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 233, 45, 15.0F, 21.1894F, 34.0274F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 233, 45, -20.0F, -16.3987F, -10.146F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 233, 45, -20.0F, 21.1894F, 34.0274F, 5, 1, 2, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone20);
        setRotationAngle(bone20, 2.5307F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 233, 45, 15.0F, -18.4098F, -7.4031F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 233, 45, 15.0F, 29.2485F, 25.4793F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 233, 45, -20.0F, -18.4918F, -7.4605F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 233, 45, -20.0F, 29.2485F, 25.4793F, 5, 1, 2, 0.0F, false));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone21);
        setRotationAngle(bone21, 2.7227F, 0.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 233, 45, 15.0F, -19.4693F, -5.6147F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 233, 45, 15.0F, 33.5876F, 17.5699F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 233, 45, -20.0F, -19.5607F, -5.6554F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 233, 45, -20.0F, 33.5876F, 17.5699F, 5, 1, 2, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone22);
        setRotationAngle(bone22, 2.8972F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 233, 45, 15.0F, -20.1245F, -4.1153F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 233, 45, 15.0F, 36.1524F, 9.5039F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 233, 45, -20.0F, -20.2215F, -4.1395F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 233, 45, -20.0F, 36.1524F, 9.5039F, 5, 1, 2, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone23);
        setRotationAngle(bone23, 2.9845F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 233, 45, 15.0F, -20.4518F, -4.2119F, 5, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 233, 45, 15.0F, 36.7979F, 4.4505F, 5, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 233, 45, -20.0F, -20.5506F, -3.2276F, 5, 1, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 233, 45, -20.0F, 36.7979F, 4.4505F, 5, 1, 2, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone24);
        setRotationAngle(bone24, -3.1241F, 0.0F, 0.0F);


        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, 17.0F, 35.5F);
        bone30.cubeList.add(new ModelBox(bone30, 217, 12, -15.0F, 0.0F, -14.5F, 15, 3, 18, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 217, 12, -15.0F, -8.0F, -19.5F, 1, 8, 22, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 217, 12, 14.0F, -8.0F, -19.5F, 1, 8, 22, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 217, 12, 0.0F, 0.0F, -14.5F, 15, 3, 18, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(-0.25F, 1.0F, 7.5F);
        bone30.addChild(bone26);
        setRotationAngle(bone26, 0.0175F, 0.0F, 0.0F);


        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0F, 0.0F, 1.0F);
        bone26.addChild(bone27);
        setRotationAngle(bone27, 0.0349F, 0.0F, 0.0F);


        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(0.0F, 1.5F, 7.0F);
        bone30.addChild(bone29);
        setRotationAngle(bone29, 0.0175F, 0.0F, 0.0F);
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -19.8F, -7.7F, -4.1F, 6, 4, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 146, 22, -19.6F, -11.7F, -3.1F, 9, 4, 2, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 146, 22, 10.7F, -11.7F, -3.1F, 9, 4, 2, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 32, 59, 10.9F, -11.7F, -4.4F, 9, 4, 2, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 32, 59, -19.8F, -11.7F, -4.4F, 9, 4, 2, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -19.8F, -3.7F, -4.1F, 4, 3, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -15.8F, -1.7F, -4.1F, 16, 1, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 168, 252, -15.8F, -5.7F, -1.8F, 16, 4, 1, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -13.8F, -7.7F, -4.1F, 14, 2, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 210, 22, -10.8F, -11.7F, -4.9F, 11, 4, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, 13.9F, -7.7F, -4.1F, 6, 4, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, 15.9F, -3.7F, -4.1F, 4, 3, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -0.1F, -1.7F, -4.1F, 16, 1, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 168, 252, -0.1F, -5.7F, -1.8F, 16, 4, 1, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -0.1F, -7.7F, -4.1F, 14, 2, 4, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 210, 22, -0.1F, -11.7F, -4.9F, 11, 4, 4, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.05F, -10.2F, 3.5F);
        bone29.addChild(bone31);
        setRotationAngle(bone31, -0.7854F, 0.0F, 0.0F);


        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.05F, -10.2F, 3.5F);
        bone29.addChild(bone32);
        setRotationAngle(bone32, -0.7854F, 0.0F, 0.0F);


        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.05F, -4.8F, 5.5F);
        bone29.addChild(bone37);
        setRotationAngle(bone37, -0.7854F, 0.0F, 0.0F);


        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.05F, -9.2F, 7.9F);
        bone29.addChild(bone42);
        setRotationAngle(bone42, -0.7854F, 0.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 18, 237, -10.35F, 4.8F, -8.4F, 10, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 18, 237, -10.35F, 6.2F, -7.0F, 10, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 18, 237, -10.35F, 5.5F, -7.7F, 10, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 86, -19.85F, 6.8F, -8.6F, 20, 2, 4, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 18, 237, -0.65F, 4.8F, -8.4F, 11, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 18, 237, -0.65F, 6.2F, -7.0F, 11, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 18, 237, -0.65F, 5.5F, -7.7F, 11, 1, 1, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 0, 86, -0.15F, 6.8F, -8.6F, 20, 2, 4, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 18.5F, -41.3F);
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, -20.0F, -1.5F, -4.5F, 20, 3, 7, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, -20.0F, -1.5F, -13.5F, 20, 3, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, -4.0F, -0.5F, -13.6F, 8, 4, 1, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, -2.0F, -11.5F, -12.2F, 4, 1, 1, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, -20.5F, -0.5F, -14.1F, 16, 3, 16, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 0.0F, -1.5F, -4.5F, 20, 3, 7, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 0.0F, -1.5F, -13.5F, 20, 3, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 15.5F, -0.5F, -14.1F, 5, 3, 16, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 12.0F, 1.2F, -13.1F, 3, 2, 8, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 12.4F, 1.7F, -15.1F, 1, 1, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 13.6F, 1.7F, -15.1F, 1, 1, 2, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 4.5F, -0.5F, -14.1F, 7, 3, 16, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 214, 22, 11.5F, -0.5F, -14.1F, 4, 1, 16, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.05F, 6.5F, 29.0F);
        setRotationAngle(bone28, -0.0349F, 0.0F, 0.0F);
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -0.15F, -2.0F, -11.2F, 20, 5, 22, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -0.15F, -2.0F, -13.2F, 20, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, 16.85F, -2.0F, -12.2F, 3, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -0.15F, -2.0F, 10.8F, 20, 2, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, -11.2F, 20, 5, 22, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, -13.2F, 20, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, -12.2F, 3, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, 10.8F, 20, 2, 1, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(0.0F, 0.5F, -11.7F);
        bone28.addChild(bone44);
        setRotationAngle(bone44, -0.1571F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 320, 24, -16.85F, -2.3F, -0.9F, 17, 5, 1, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 320, 24, -0.15F, -2.3F, -0.9F, 17, 5, 1, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, -2.5F, 4.8F);
        bone28.addChild(bone34);


        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.15F, 2.0F, -3.0F);
        bone34.addChild(bone36);
        setRotationAngle(bone36, 0.0F, 0.7854F, 0.0F);


        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, -2.5F, 4.8F);
        bone28.addChild(bone35);


        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, -1.0F, 12.8F);
        bone28.addChild(bone41);
        setRotationAngle(bone41, 0.7854F, 0.0F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -0.15F, -1.4F, -4.0F, 20, 2, 4, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -19.85F, -1.4F, -4.0F, 20, 2, 4, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.05F, -2.5F, 13.5F);
        setRotationAngle(bone38, 0.6981F, 0.0F, 0.0F);
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, 16.85F, -8.9F, -4.8F, 3, 16, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, -0.15F, -8.9F, -4.8F, 17, 1, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, -19.85F, -8.9F, -4.8F, 3, 16, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, -16.85F, -8.9F, -4.8F, 17, 1, 3, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, 0.5F, 20.7F);
        bone38.addChild(bone40);
        setRotationAngle(bone40, 2.0071F, 0.0F, 0.0F);


        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.05F, -2.5F, 13.5F);
        setRotationAngle(bone39, 0.6981F, 0.0F, 0.0F);


        zadni = new ModelRenderer(this);
        zadni.setRotationPoint(12.5F, 13.4F, -46.0F);
        setRotationAngle(zadni, 0.0F, 0.0F, -0.7854F);
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -4.5F, 1.3F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -6.5F, -0.7F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -8.5F, -2.7F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -10.5F, -4.7F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -12.5F, -6.7F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -14.5F, -8.7F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -16.5F, -10.7F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -18.5F, -12.7F, -4.0F, 1, 1, 32, 0.0F, false));
        zadni.cubeList.add(new ModelBox(zadni, 210, 27, -20.5F, -14.7F, -4.0F, 1, 1, 32, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.05F, 3.4F, -10.5F);
        setRotationAngle(bone43, 0.1047F, 0.0F, 0.0F);
        bone43.cubeList.add(new ModelBox(bone43, 318, 54, -15.85F, -4.006F, -1.615F, 12, 11, 3, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 318, 54, 3.85F, -4.006F, -1.615F, 12, 11, 3, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(-10.8F, 15.0F, 9.5F);
        setRotationAngle(bone45, -0.8727F, 0.0F, 0.0F);
        bone45.cubeList.add(new ModelBox(bone45, 315, 35, -3.0F, -2.0F, 1.5F, 2, 4, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 315, 35, 3.0F, -2.0F, 1.5F, 2, 4, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 315, 35, 0.0F, -2.0F, 1.5F, 2, 4, 1, 0.0F, false));

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(0.05F, -6.7F, -15.6F);
        setRotationAngle(bone53, -0.8727F, 0.0F, 0.0F);
        bone53.cubeList.add(new ModelBox(bone53, 0, 0, -0.15F, 0.1F, -0.3F, 20, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 0, 0, -19.85F, 0.1F, -0.3F, 20, 1, 1, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(-9.3F, 4.8F, 5.7941F);
        setRotationAngle(bone46, -0.1745F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, 1.7F, 0.1046F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, 0.7F, 1.1046F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -0.3F, 2.1046F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -1.3F, -3.8954F, -1.1462F, 1, 7, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -2.3F, 2.1046F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -3.3F, 1.1046F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -4.3F, 0.1046F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -4.3F, -0.8954F, -1.1462F, 3, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -4.3F, -1.8954F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -3.3F, -2.8954F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -2.3F, -3.8954F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -0.3F, -3.8954F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, 0.7F, -2.8954F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, 1.7F, -1.8954F, -1.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -0.3F, -0.8954F, -1.1462F, 3, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -1.3F, -0.8954F, -0.1462F, 1, 1, 1, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 315, 35, -2.3F, -1.8954F, 0.8538F, 3, 3, 6, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(0.0F, 13.5F, -3.0F);
        setRotationAngle(bone47, 0.1047F, 0.0F, 0.0F);
        bone47.cubeList.add(new ModelBox(bone47, 312, 36, -2.5F, -1.5F, -10.0F, 5, 7, 28, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(0.0F, -4.5F, -4.0F);
        bone47.addChild(bone48);
        setRotationAngle(bone48, 0.1745F, 0.0F, 0.0F);
        bone48.cubeList.add(new ModelBox(bone48, 315, 22, -0.5F, 2.0F, -4.0F, 1, 1, 8, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(-18.8F, -9.5F, 15.0F);
        setRotationAngle(bone49, -0.6109F, 0.7854F, 0.0F);
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, 0.0F, 11.0F, 2.0F, 1, 1, 6, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(28.4F, 4.5F, 15.0F);
        setRotationAngle(bone50, -0.6109F, -0.7854F, 0.0F);
        bone50.cubeList.add(new ModelBox(bone50, 0, 0, -7.5F, -4.5F, -1.0F, 1, 1, 6, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(-22.75F, 0.45F, 11.15F);
        setRotationAngle(bone51, 0.0F, -0.1745F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 240, 179, -1.45F, -0.45F, -0.75F, 3, 2, 1, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, -2.05F, -0.85F, -0.65F, 4, 3, 1, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(22.85F, 0.45F, 11.15F);
        setRotationAngle(bone52, 0.0F, 0.4363F, 0.0F);
        bone52.cubeList.add(new ModelBox(bone52, 240, 179, -1.45F, -0.45F, -0.85F, 3, 2, 1, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 0, 0, -2.05F, -0.85F, -0.75F, 4, 3, 1, 0.0F, false));

        headlights = new ModelRenderer(this);
        headlights.setRotationPoint(0.0F, 24.0F, 0.0F);
        headlights.cubeList.add(new ModelBox(headlights, 350, 212, -17.3F, -17.0F, 40.3F, 6, 3, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 350, 212, 11.4F, -17.0F, 40.3F, 6, 3, 1, 0.0F, false));

        headlights_left = new ModelRenderer(this);
        headlights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        headlights_left.cubeList.add(new ModelBox(headlights_left, 374, 248, -19.7F, -17.0F, 39.3F, 2, 3, 2, 0.0F, false));
        headlights_left.cubeList.add(new ModelBox(headlights_left, 374, 248, -20.1F, -17.5F, 19.5F, 2, 1, 2, 0.0F, false));

        headlights_right = new ModelRenderer(this);
        headlights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        headlights_right.cubeList.add(new ModelBox(headlights_right, 374, 248, 18.2F, -17.5F, 19.5F, 2, 1, 2, 0.0F, false));
        headlights_right.cubeList.add(new ModelBox(headlights_right, 374, 248, 17.8F, -17.0F, 39.3F, 2, 3, 2, 0.0F, false));

        rearlights = new ModelRenderer(this);
        rearlights.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights.cubeList.add(new ModelBox(rearlights, 425, 172, -19.2F, -15.3F, -54.0F, 2, 1, 1, 0.0F, false));
        rearlights.cubeList.add(new ModelBox(rearlights, 425, 172, 17.3F, -15.3F, -54.0F, 2, 1, 1, 0.0F, false));

        rearlights_brake = new ModelRenderer(this);
        rearlights_brake.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 425, 172, -19.2F, -17.7F, -54.0F, 2, 2, 1, 0.0F, false));
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 425, 172, 17.3F, -17.7F, -54.0F, 2, 2, 1, 0.0F, false));
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 425, 172, -1.8F, -31.0F, -16.8F, 4, 1, 1, 0.0F, false));

        rearlights_left = new ModelRenderer(this);
        rearlights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_left.cubeList.add(new ModelBox(rearlights_left, 446, 249, -19.2F, -13.9F, -54.0F, 2, 1, 1, 0.0F, false));

        rearlights_right = new ModelRenderer(this);
        rearlights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_right.cubeList.add(new ModelBox(rearlights_right, 446, 249, 17.3F, -13.9F, -54.0F, 2, 1, 1, 0.0F, false));

        rearlights_reverse = new ModelRenderer(this);
        rearlights_reverse.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_reverse.cubeList.add(new ModelBox(rearlights_reverse, 427, 216, 17.3F, -12.5F, -54.0F, 2, 1, 1, 0.0F, false));
        rearlights_reverse.cubeList.add(new ModelBox(rearlights_reverse, 427, 216, -19.2F, -12.5F, -54.0F, 2, 1, 1, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 414, 228, -3.5F, -5.5F, -55.0F, 7, 3, 1, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(-15.0F, -16.5F, 9.4F);
        interier.addChild(bone55);
        setRotationAngle(bone55, 2.5307F, 0.0F, 0.0F);
        bone55.cubeList.add(new ModelBox(bone55, 0, 0, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 375, 248, 9.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 163, 224, -1.0F, 0.5F, 0.2F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 102, 176, 9.0F, 0.5F, 0.2F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 228, 209, -1.0F, 1.4F, 0.8F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 401, 249, 9.0F, 1.4F, 0.8F, 2, 1, 1, 0.0F, false));

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(-2.8F, -8.2F, -11.1F);
        setRotationAngle(bone54, -0.6109F, 0.0F, 0.0F);
        bone54.cubeList.add(new ModelBox(bone54, 147, 17, 2.4F, -3.0F, -3.6F, 1, 1, 9, 0.0F, false));

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, -29.0F, 2, 2, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -7.0F, 29.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -7.0F, 27.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -8.0F, 28.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -6.0F, 28.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -7.0F, 29.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -8.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -7.0F, 27.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -6.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, 29.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -8.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, 27.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -6.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -29.0F, 5, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -8.0F, -30.0F, 5, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -31.0F, 5, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -6.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 14.0F, -7.0F, -29.0F, 6, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 14.0F, -8.0F, -30.0F, 6, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 14.0F, -7.0F, -31.0F, 6, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -6.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, -27.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, -36.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -4.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -13.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, 22.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -4.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -13.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, 22.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -4.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, 31.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -13.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, -36.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -4.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, -27.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -13.0F, -32.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, 31.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -7.0F, -8.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -20.0F, -7.0F, -8.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -20.0F, -7.0F, 10.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -7.0F, 10.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -20.0F, -7.0F, -19.8F, 20, 3, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -7.0F, -19.8F, 20, 3, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 217, 12, -15.0F, -7.0F, 19.0F, 15, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 217, 12, 0.0F, -7.0F, 19.0F, 15, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -7.0F, -39.0F, 15, 3, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -15.0F, -7.0F, -39.0F, 15, 3, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, 12.0F, 3, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -19.8F, 3, 13, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 4, 0, -18.8F, -20.0F, -11.0F, 2, 13, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, 12.0F, 3, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -19.8F, 3, 13, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -11.0F, 2, 13, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -15.1F, 19.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -15.1F, 19.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.9F, 20.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -15.0F, 20.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -15.0F, 21.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -15.0F, 21.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.8F, 22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.8F, 22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.8F, 23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.8F, 23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.8F, 24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.8F, 24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.7F, 25.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.7F, 25.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.6F, 26.0F, 3, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -20.0F, 15.0F, 17, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -20.0F, 15.0F, 17, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -15.0F, 16.0F, 3, 9, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -15.0F, 16.0F, 3, 9, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.5F, 31.0F, 3, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.5F, 31.0F, 3, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.4F, 33.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.4F, 33.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.4F, 34.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.4F, 34.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.4F, 36.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.3F, 36.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.3F, 35.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.3F, 35.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.5F, 37.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.5F, 37.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -13.6F, 38.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.6F, 38.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.5F, -39.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.4F, -38.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.4F, -37.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.2F, -36.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.2F, -34.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.0F, -35.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.8F, -27.0F, 3, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.0F, -25.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.6F, -24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.8F, -23.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.8F, -22.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.0F, -21.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -14.0F, -20.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.3F, -39.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.2F, -38.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.3F, -37.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.1F, -36.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.2F, -34.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.0F, -35.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.8F, -27.0F, 3, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.0F, -25.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.6F, -24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.0F, -23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.0F, -22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.1F, -21.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -14.0F, -20.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -38.8F, 3, 6, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -38.8F, 3, 6, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -43.8F, 3, 14, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -43.8F, 3, 14, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -20.0F, -7.0F, 1.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -7.0F, 1.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -15.0F, -7.0F, -29.0F, 15, 3, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 201, 22, 13.9F, -16.0F, -41.0F, 3, 9, 22, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -53.8F, 3, 2, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -53.8F, 3, 2, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -20.0F, -16.8F, 17, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -20.0F, -16.8F, 17, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -32.2F, -16.6F, 20, 2, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -32.2F, -16.6F, 20, 2, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -32.0F, -16.0F, 3, 13, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -32.0F, -16.0F, 3, 13, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 201, 22, -17.3F, -16.0F, -41.0F, 3, 9, 22, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -7.0F, -29.0F, 15, 3, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -22.0F, -15.8F, 17, 15, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -22.0F, -15.8F, 17, 15, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -31.0F, -15.8F, 17, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -31.0F, -15.8F, 17, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 14.9F, -29.0F, -15.8F, 2, 7, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -29.0F, -15.8F, 2, 7, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -21.0F, -6.0F, 38.0F, 21, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -6.0F, 38.0F, 21, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 233, 18, -19.9F, -18.0F, 19.0F, 2, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 233, 18, 18.0F, -18.0F, 19.0F, 2, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -11.0F, -53.8F, 3, 4, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -11.0F, -53.8F, 3, 4, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -18.0F, -52.8F, 3, 7, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -18.0F, -52.8F, 3, 7, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 44, 35, -14.8F, -18.0F, -52.9F, 15, 11, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 68, 46, -0.1F, -19.0F, -53.1F, 17, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 68, 46, -16.8F, -19.0F, -53.1F, 17, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 68, 46, -0.1F, -8.0F, -53.1F, 17, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 68, 46, -16.8F, -8.0F, -53.1F, 17, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 68, 46, 14.9F, -18.0F, -53.1F, 2, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 68, 46, -16.8F, -18.0F, -53.1F, 2, 10, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 203, 33, -16.8F, -19.9F, -16.9F, 17, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 203, 33, -0.1F, -19.9F, -16.9F, 17, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 196, 25, 16.8F, -19.9F, -35.8F, 1, 13, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 196, 25, 16.8F, -19.9F, -50.8F, 1, 14, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 196, 25, -17.7F, -19.9F, -50.8F, 1, 14, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 196, 25, -17.7F, -19.9F, -35.8F, 1, 13, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 228, 30, -16.8F, -18.9F, -51.8F, 17, 12, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 228, 30, -0.1F, -18.9F, -51.8F, 17, 12, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 217, 16, -19.2F, -17.0F, -7.0F, 1, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 217, 16, 18.4F, -17.0F, -7.0F, 1, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 315, 35, -0.1F, -20.0F, 9.0F, 17, 7, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 315, 35, -16.8F, -20.0F, 9.0F, 17, 7, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 326, 40, 3.9F, -14.0F, -12.0F, 12, 7, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 326, 40, -15.8F, -14.0F, -12.0F, 12, 7, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 336, 16, -1.5F, -14.0F, -1.0F, 3, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 336, 16, -0.5F, -16.0F, 0.0F, 1, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 336, 16, -1.5F, -17.0F, 0.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, -21.0F, -5.0F, 37.6F, 21, 2, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 214, 22, 0.0F, -5.0F, 37.6F, 21, 2, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, -21.0F, -6.0F, 10.0F, 1, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, -21.0F, -6.0F, 1.0F, 1, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, -21.0F, -6.0F, -8.0F, 1, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, -21.0F, -6.0F, -19.8F, 1, 2, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, 20.0F, -6.0F, -19.8F, 1, 2, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, 20.0F, -6.0F, -8.0F, 1, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, 20.0F, -6.0F, 1.0F, 1, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 225, 35, 20.0F, -6.0F, 10.0F, 1, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 158, 12, -19.7F, -18.0F, -53.8F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 158, 12, 16.8F, -18.0F, -53.8F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 44, 35, -0.1F, -18.0F, -52.9F, 15, 11, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 129, 8, -2.3F, -31.5F, -16.7F, 5, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -15.0F, 26.0F, 3, 1, 5, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, headlights, rearlights),
                new LightControllerEntry<>(0.8F, interier),
                new LightControllerEntry<>(0.6F, plate),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, headlights_right, rearlights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, headlights_left, rearlights_left),
                new BrakeLights<>(rearlights_brake),
                new ReverseLights<>(rearlights_reverse)
        );
    }

    @Override
    protected void renderModel() {
        bone2.render(1.0F);
        bone3.render(1.0F);
        bone.render(1.0F);
        bone4.render(1.0F);
        bone5.render(1.0F);
        bone6.render(1.0F);
        bone30.render(1.0F);
        bone25.render(1.0F);
        bone28.render(1.0F);
        bone38.render(1.0F);
        bone39.render(1.0F);
        zadni.render(1.0F);
        bone43.render(1.0F);
        bone45.render(1.0F);
        bone53.render(1.0F);
        bone46.render(1.0F);
        bone47.render(1.0F);
        bone49.render(1.0F);
        bone50.render(1.0F);
        bone51.render(1.0F);
        bone52.render(1.0F);
        bone54.render(1.0F);
        bb_main.render(1.0F);
    }
}
