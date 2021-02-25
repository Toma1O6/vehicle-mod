package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.muscles.VehicleTracerJester;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTracerJesterT extends ModelVehicle<VehicleTracerJester.VehicleTracerJesterT> {

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
    private final ModelRenderer bone25;
    private final ModelRenderer bone28;
    private final ModelRenderer bone34;
    private final ModelRenderer bone36;
    private final ModelRenderer bone35;
    private final ModelRenderer bone38;
    private final ModelRenderer bone40;
    private final ModelRenderer bone44;
    private final ModelRenderer bone39;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer bone45;
    private final ModelRenderer bone54;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone52;
    private final ModelRenderer headlights;
    private final ModelRenderer bone53;
    private final ModelRenderer headlights_left;
    private final ModelRenderer headlights_right;
    private final ModelRenderer rearlights;
    private final ModelRenderer rearlights_left;
    private final ModelRenderer rearlights_right;
    private final ModelRenderer rearlights_reverse;
    private final ModelRenderer rearlights_brake;
    private final ModelRenderer plates;
    private final ModelRenderer interier;
    private final ModelRenderer bone55;
    private final ModelRenderer bb_main;

    public ModelTracerJesterT() {
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
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -22.0F, 24.7487F, -17.2635F, 20, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -17.2635F, 22.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -17.2635F, 22.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -17.2635F, 22.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 23.7487F, -18.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 23.7487F, -18.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 224, 35, -22.0F, 23.7487F, -18.2635F, 20, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -18.2635F, 23.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -18.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -18.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 22.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 22.7487F, -17.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -22.0F, 22.7487F, -17.2635F, 20, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -17.2635F, 24.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -17.2635F, 24.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -17.2635F, 24.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 23.7487F, -16.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 23.7487F, -16.2635F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -22.0F, 23.7487F, -16.2635F, 20, 2, 2, 0.0F, false));

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
        bone4.cubeList.add(new ModelBox(bone4, 200, 17, -2.0F, -1.0F, -26.75F, 2, 2, 20, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, -2.0F, -26.75F, 2, 2, 20, 0.0F, false));
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
        bone7.cubeList.add(new ModelBox(bone7, 150, 25, 15.0F, -0.1494F, -0.6219F, 5, 1, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 153, 19, -20.0F, -0.0509F, -0.6393F, 5, 1, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -19.0F, -60.0548F, 10.3472F, 4, 1, 0, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone8);
        setRotationAngle(bone8, 0.2618F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 150, 25, 15.0F, -0.2258F, -2.5361F, 5, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 153, 32, 15.0F, -56.0493F, 12.8359F, 5, 1, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 153, 25, -20.0F, -0.1292F, -2.562F, 5, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 150, 9, -20.0F, -56.0493F, 12.8359F, 5, 1, 3, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone9);
        setRotationAngle(bone9, 0.4363F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 150, 25, 15.0F, -0.6826F, -4.4704F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 153, 32, 15.0F, -52.9888F, 20.3618F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 153, 25, -20.0F, -0.592F, -4.5126F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 150, 9, -20.0F, -52.9888F, 20.3618F, 5, 1, 2, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone10);
        setRotationAngle(bone10, 0.6109F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 150, 25, 15.0F, -1.446F, -6.2116F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 153, 32, 15.0F, -48.6455F, 27.3261F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 153, 25, -20.0F, -1.3641F, -6.269F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 150, 9, -20.0F, -48.6455F, 27.3261F, 5, 1, 2, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, -50.9505F, 29.6618F);
        bone10.addChild(bone33);
        setRotationAngle(bone33, -0.1222F, 0.0F, 0.0F);


        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone11);
        setRotationAngle(bone11, 0.8727F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 150, 25, 15.0F, -3.0059F, -7.5838F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 153, 32, 15.0F, -39.9169F, 37.0273F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 153, 25, -20.0F, -2.9416F, -7.6604F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 150, 9, -20.0F, -39.9169F, 37.0273F, 5, 1, 2, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone12);
        setRotationAngle(bone12, 1.0472F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 150, 25, 15.0F, -4.2902F, -8.9366F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 153, 32, 15.0F, -32.8938F, 41.4063F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 153, 25, -20.0F, -4.2402F, -9.0232F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 150, 9, -20.0F, -32.8938F, 41.4063F, 5, 1, 2, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone13);
        setRotationAngle(bone13, 1.2217F, 0.0F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 150, 25, 15.0F, -5.7839F, -9.9914F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 153, 32, 15.0F, -25.211F, 44.5536F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 153, 25, -20.0F, -5.7497F, -10.0853F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 150, 9, -20.0F, -25.211F, 44.5536F, 5, 1, 2, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone14);
        setRotationAngle(bone14, 1.3963F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 150, 25, 15.0F, -7.4872F, -10.8464F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 153, 32, 15.0F, -17.1475F, 46.2434F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 153, 25, -20.0F, -7.4698F, -10.9449F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 150, 9, -20.0F, -17.1475F, 46.2434F, 5, 1, 2, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone15);
        setRotationAngle(bone15, 1.5708F, 0.0F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 150, 25, 15.0F, -9.3F, -11.4F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 153, 32, 15.0F, -8.9F, 46.5F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 153, 25, -20.0F, -9.3F, -11.5F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 150, 9, -20.0F, -8.9F, 46.5F, 5, 1, 2, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone16);
        setRotationAngle(bone16, 1.7453F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 150, 25, 15.0F, -11.1219F, -11.4506F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 153, 32, 15.0F, -0.6738F, 45.5003F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 153, 25, -20.0F, -11.1393F, -11.5491F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 150, 9, -20.0F, -0.6738F, 45.5003F, 5, 1, 2, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone17);
        setRotationAngle(bone17, 1.9199F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 150, 25, 15.0F, -12.9523F, -11.2966F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 153, 32, 15.0F, 7.2265F, 42.9748F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 153, 25, -20.0F, -12.9865F, -11.3905F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 150, 9, -20.0F, 7.2265F, 42.9748F, 5, 1, 2, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone18);
        setRotationAngle(bone18, 2.0944F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 150, 25, 15.0F, -14.6902F, -10.8366F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 153, 32, 15.0F, 14.6062F, 39.1063F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 153, 25, -20.0F, -14.7402F, -10.9232F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 150, 9, -20.0F, 14.6062F, 39.1063F, 5, 1, 2, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone19);
        setRotationAngle(bone19, 2.2689F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 150, 25, 15.0F, -16.3345F, -10.0694F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 153, 32, 15.0F, 21.1894F, 34.0274F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 153, 25, -20.0F, -16.3987F, -10.146F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 150, 9, -20.0F, 21.1894F, 34.0274F, 5, 1, 2, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone20);
        setRotationAngle(bone20, 2.5307F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 150, 25, 15.0F, -18.4098F, -7.4031F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 153, 32, 15.0F, 29.2485F, 25.4793F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 153, 25, -20.0F, -18.4918F, -7.4605F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 150, 9, -20.0F, 29.2485F, 25.4793F, 5, 1, 2, 0.0F, false));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone21);
        setRotationAngle(bone21, 2.7227F, 0.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 150, 25, 15.0F, -19.4693F, -5.6147F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 153, 32, 15.0F, 33.5876F, 17.5699F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 153, 25, -20.0F, -19.5607F, -5.6554F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 150, 9, -20.0F, 33.5876F, 17.5699F, 5, 1, 2, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone22);
        setRotationAngle(bone22, 2.8972F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 150, 25, 15.0F, -20.1245F, -4.1153F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 153, 32, 15.0F, 36.1524F, 9.5039F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 153, 25, -20.0F, -20.2215F, -4.1395F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 150, 9, -20.0F, 36.1524F, 9.5039F, 5, 1, 2, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone23);
        setRotationAngle(bone23, 2.9845F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 150, 25, 15.0F, -20.4518F, -4.2119F, 5, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 153, 32, 15.0F, 36.7979F, 4.4505F, 5, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 153, 25, -20.0F, -20.5506F, -3.2276F, 5, 1, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 150, 9, -20.0F, 36.7979F, 4.4505F, 5, 1, 2, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone24);
        setRotationAngle(bone24, -3.1241F, 0.0F, 0.0F);


        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, 17.0F, 35.5F);
        bone30.cubeList.add(new ModelBox(bone30, 217, 12, -15.0F, 0.0F, -14.5F, 15, 3, 18, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 217, 12, -4.0F, 0.0F, 11.5F, 8, 4, 2, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 217, 12, -4.0F, -2.0F, -88.5F, 8, 4, 2, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 336, 48, -14.0F, 1.0F, -89.5F, 2, 2, 3, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 336, 48, 15.0F, 1.0F, -89.5F, 2, 2, 3, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 326, 38, 11.5F, 0.4F, -87.5F, 6, 3, 8, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 326, 38, -17.5F, 0.4F, -87.5F, 6, 3, 8, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 336, 48, -17.0F, 1.0F, -89.5F, 2, 2, 3, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 336, 48, 12.0F, 1.0F, -89.5F, 2, 2, 3, 0.0F, false));
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
        bone29.cubeList.add(new ModelBox(bone29, 131, 22, -19.8F, -0.7F, -4.1F, 15, 2, 11, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 306, 59, -17.8F, -11.6825F, -1.1002F, 18, 6, 6, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 305, 33, -17.8F, -3.6825F, -1.1002F, 18, 2, 6, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -17.8F, -6.7F, -4.1F, 18, 3, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 6, 236, -17.8F, -6.8F, -4.0F, 18, 1, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -19.8F, -11.7F, -4.1F, 2, 8, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 6, 233, -18.7F, -11.8F, -4.0F, 1, 6, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -19.8F, -3.7F, -4.1F, 2, 3, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -17.8F, -1.7F, -4.1F, 18, 1, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 131, 22, 4.9F, -0.7F, -4.1F, 15, 2, 11, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 306, 59, -0.1F, -11.6825F, -1.1002F, 18, 6, 6, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 305, 33, -0.1F, -3.6825F, -1.1002F, 18, 2, 6, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -0.1F, -6.7F, -4.1F, 18, 3, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 6, 236, -0.1F, -6.8F, -4.0F, 18, 1, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, 17.9F, -11.7F, -4.1F, 2, 8, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 6, 233, 17.8F, -11.8F, -4.0F, 1, 6, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, 17.9F, -3.7F, -4.1F, 2, 3, 10, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 19, 60, -0.1F, -1.7F, -4.1F, 18, 1, 10, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.05F, -10.2F, 3.5F);
        bone29.addChild(bone31);
        setRotationAngle(bone31, -0.7854F, 0.0F, 0.0F);
        bone31.cubeList.add(new ModelBox(bone31, 0, 226, -0.15F, -1.4947F, -0.2807F, 18, 1, 1, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 0, 226, -17.85F, -1.4947F, -0.2807F, 18, 1, 1, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.05F, -10.2F, 3.5F);
        bone29.addChild(bone32);
        setRotationAngle(bone32, -0.7854F, 0.0F, 0.0F);
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -0.15F, 1.0053F, 2.2193F, 18, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -0.15F, 0.2053F, 1.4193F, 11, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -0.15F, -0.6947F, 0.5193F, 11, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -0.15F, 4.7053F, 5.8193F, 18, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -0.15F, 4.3053F, 5.4193F, 18, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -0.15F, 3.9053F, 5.0193F, 18, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -17.85F, 1.0053F, 2.2193F, 18, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -10.85F, 0.2053F, 1.4193F, 11, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -10.85F, -0.6947F, 0.5193F, 11, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -17.85F, 4.7053F, 5.8193F, 18, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -17.85F, 4.3053F, 5.4193F, 18, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 0, 226, -17.85F, 3.9053F, 5.0193F, 18, 1, 1, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.05F, -4.8F, 5.5F);
        bone29.addChild(bone37);
        setRotationAngle(bone37, -0.7854F, 0.0F, 0.0F);
        bone37.cubeList.add(new ModelBox(bone37, 137, 19, -17.85F, -0.5F, -0.5F, 18, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 137, 19, -0.15F, -0.5F, -0.5F, 18, 1, 1, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 18.5F, -41.3F);
        setRotationAngle(bone25, -0.0524F, 0.0F, 0.0F);
        bone25.cubeList.add(new ModelBox(bone25, 131, 9, -20.0F, -1.5F, -4.5F, 20, 3, 7, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 131, 9, -20.0F, -1.5F, -11.5F, 2, 3, 7, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 131, 9, 0.0F, -1.5F, -4.5F, 20, 3, 7, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 131, 9, 18.0F, -1.5F, -11.5F, 2, 3, 7, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.05F, 6.5F, 29.0F);
        setRotationAngle(bone28, -0.0349F, 0.0F, 0.0F);
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -0.15F, -2.0F, -11.2F, 20, 5, 24, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -0.15F, -2.0F, -13.2F, 20, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, 15.85F, -2.0F, -12.2F, 4, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 355, 44, -0.15F, -1.8F, -12.2F, 16, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -0.15F, -2.0F, 12.3F, 20, 2, 7, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 3, 240, -0.25F, -0.9F, 18.4F, 19, 1, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, -11.2F, 20, 5, 24, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, -13.2F, 20, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, -12.2F, 4, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 355, 44, -15.85F, -1.8F, -12.2F, 16, 5, 1, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 0, 0, -19.85F, -2.0F, 12.3F, 20, 2, 7, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 3, 240, -18.75F, -0.9F, 18.4F, 19, 1, 1, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, -2.5F, 4.8F);
        bone28.addChild(bone34);
        bone34.cubeList.add(new ModelBox(bone34, 133, 14, -0.15F, 0.2345F, -6.975F, 6, 1, 19, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 133, 14, -5.85F, 0.2345F, -6.975F, 6, 1, 19, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 133, 14, -14.85F, 0.2345F, 11.025F, 3, 5, 1, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 133, 14, 12.15F, 0.2345F, 11.025F, 3, 5, 1, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.15F, 2.0F, -3.0F);
        bone34.addChild(bone36);
        setRotationAngle(bone36, 0.0F, 0.7854F, 0.0F);
        bone36.cubeList.add(new ModelBox(bone36, 133, 14, 2.0894F, -1.7655F, 0.4106F, 9, 1, 5, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 133, 14, -5.7106F, -1.7655F, -11.2894F, 5, 1, 9, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, -2.5F, 4.8F);
        bone28.addChild(bone35);
        bone35.cubeList.add(new ModelBox(bone35, 133, 14, -0.15F, 0.2345F, -13.975F, 12, 1, 7, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 133, 14, -11.85F, 0.2345F, -13.975F, 12, 1, 7, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.05F, -2.5F, 13.5F);
        setRotationAngle(bone38, 0.6981F, 0.0F, 0.0F);
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, 16.85F, -6.5F, -4.8F, 3, 14, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, -0.15F, -6.5F, -4.8F, 17, 2, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 133, 17, -0.15F, -4.5F, -4.8F, 17, 1, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, -19.85F, -6.5F, -4.8F, 3, 14, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 0, 0, -16.85F, -6.5F, -4.8F, 17, 2, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 133, 17, -16.85F, -4.5F, -4.8F, 17, 1, 3, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, 0.5F, 20.7F);
        bone38.addChild(bone40);
        setRotationAngle(bone40, 2.0071F, 0.0F, 0.0F);


        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(-2.35F, -10.5F, -2.3F);
        bone38.addChild(bone44);
        setRotationAngle(bone44, 0.2618F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 147, 16, 1.5F, -12.0F, -6.5F, 1, 10, 1, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.05F, -2.5F, 13.5F);
        setRotationAngle(bone39, 0.6981F, 0.0F, 0.0F);


        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.05F, -1.5F, -14.5F);
        setRotationAngle(bone41, -1.1345F, 0.0F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -19.85F, 0.3252F, -5.3905F, 9, 25, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 160, 14, -18.85F, 2.3252F, -3.3905F, 1, 16, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 160, 14, -18.85F, 3.3252F, -0.3905F, 1, 11, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 160, 14, -18.85F, 4.3252F, 2.6095F, 1, 3, 1, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -10.85F, 0.3252F, -5.3905F, 11, 3, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 150, 28, -10.85F, 3.3252F, -5.3905F, 11, 1, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, 10.85F, 0.3252F, -5.3905F, 9, 25, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 160, 14, 17.85F, 2.3252F, -3.3905F, 1, 16, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 160, 14, 17.85F, 3.3252F, -0.3905F, 1, 11, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 160, 14, 17.85F, 4.3252F, 2.6095F, 1, 3, 1, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 0, 0, -0.15F, 0.3252F, -5.3905F, 11, 3, 3, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 150, 28, -0.15F, 3.3252F, -5.3905F, 11, 1, 3, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, 16.8252F, -5.8905F);
        bone41.addChild(bone42);
        setRotationAngle(bone42, -0.0698F, 0.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 28, 41, -16.85F, -14.5F, -0.1F, 3, 30, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 28, 41, 13.85F, -14.5F, -0.1F, 3, 30, 2, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.2F, 5.5F, -52.3F);
        setRotationAngle(bone43, 0.7854F, 0.0F, 0.0F);
        bone43.cubeList.add(new ModelBox(bone43, 140, 25, 0.0F, -0.7F, -0.1F, 14, 1, 1, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 140, 25, -14.0F, -0.7F, -0.1F, 14, 1, 1, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(0.0F, 12.0F, -6.5F);
        setRotationAngle(bone45, 0.0349F, 0.0F, 0.0F);
        bone45.cubeList.add(new ModelBox(bone45, 309, 68, -15.0F, 0.0F, -4.8F, 11, 2, 11, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 326, 13, -15.0F, -2.0F, -4.8F, 11, 2, 11, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 309, 68, 4.0F, 0.0F, -4.8F, 11, 2, 11, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 311, 17, -3.5F, 0.0F, -7.8F, 7, 2, 25, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 311, 17, -1.5F, -1.0F, 7.2F, 3, 2, 3, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 311, 17, -0.5F, -4.0F, 8.2F, 1, 3, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 311, 17, -1.5F, -4.0F, 8.2F, 1, 1, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 311, 17, 0.5F, -4.0F, 8.2F, 1, 1, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 311, 17, -0.5F, -4.0F, 7.2F, 1, 1, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 311, 17, -0.5F, -4.0F, 9.2F, 1, 1, 1, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 326, 13, 4.0F, -2.0F, -4.8F, 11, 2, 11, 0.0F, false));

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(0.0F, 0.0F, 1.2F);
        bone45.addChild(bone54);
        setRotationAngle(bone54, 0.2618F, 0.0F, 0.0F);
        bone54.cubeList.add(new ModelBox(bone54, 311, 17, -1.0F, -1.0F, -4.0F, 1, 1, 7, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 311, 17, 0.0F, -1.0F, -4.0F, 1, 1, 7, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.0F, 5.5F, -10.5F);
        setRotationAngle(bone46, 0.1222F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 309, 68, -15.0F, -5.5F, -1.5F, 11, 11, 3, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 309, 68, 4.0F, -5.5F, -1.5F, 11, 11, 3, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(-7.8F, 4.5F, 5.0F);
        setRotationAngle(bone47, 0.7854F, 0.0F, 0.0F);
        bone47.cubeList.add(new ModelBox(bone47, 304, 8, 0.0F, 8.0F, -5.9F, 2, 1, 4, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 304, 8, -3.0F, 8.0F, -5.9F, 2, 1, 4, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 304, 8, -6.0F, 8.0F, -5.9F, 2, 1, 4, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(-8.3F, 4.5F, 5.7353F);
        setRotationAngle(bone48, -0.1745F, 0.0F, 0.0F);
        bone48.cubeList.add(new ModelBox(bone48, 350, 18, -1.8F, -2.0F, -0.7353F, 1, 7, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -0.8F, 1.0F, -0.7353F, 3, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 347, 12, -4.8F, 1.0F, -0.7353F, 3, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -4.8F, 0.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -3.8F, -1.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -2.8F, -2.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -0.8F, -2.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, 0.2F, -1.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, 1.2F, 0.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, 1.2F, 2.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, 0.2F, 3.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -0.8F, 4.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -2.8F, 4.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -3.8F, 3.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 370, 17, -4.8F, 2.0F, -0.7353F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 331, 2, -1.8F, 1.0F, 0.2647F, 1, 1, 1, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 331, 2, -2.8F, 0.0F, 1.2647F, 3, 3, 3, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(-19.8F, 3.5F, 17.5F);
        setRotationAngle(bone49, 0.0F, 1.4835F, 0.5236F);
        bone49.cubeList.add(new ModelBox(bone49, 137, 22, 3.8F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(19.9F, 3.5F, 17.5F);
        setRotationAngle(bone50, 0.0F, 1.8326F, -0.5236F);
        bone50.cubeList.add(new ModelBox(bone50, 137, 22, 3.7F, -0.5F, -0.5F, 1, 1, 5, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(23.4F, 2.5F, 12.45F);
        setRotationAngle(bone51, 0.0F, 0.5236F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 370, 210, -1.3F, -1.5F, -1.45F, 2, 2, 1, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 0, -1.8F, -2.0F, -1.35F, 3, 3, 1, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(-22.3F, 1.5F, 12.45F);
        setRotationAngle(bone52, 0.0F, -0.2618F, 0.0F);
        bone52.cubeList.add(new ModelBox(bone52, 365, 212, -1.0F, -0.4F, -0.55F, 2, 2, 1, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 0, 0, -1.5F, -0.9F, -0.45F, 3, 3, 1, 0.0F, false));

        headlights = new ModelRenderer(this);
        headlights.setRotationPoint(0.0F, 24.0F, 0.0F);
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -14.7F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 12.6F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -11.9F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 15.4F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -15.5F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 11.8F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -12.7F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 14.6F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -16.3F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 11.0F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -13.5F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 13.8F, -15.1F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -15.5F, -15.9F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 11.8F, -15.9F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -12.7F, -15.9F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 14.6F, -15.9F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -15.5F, -14.3F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 11.8F, -14.3F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, -12.7F, -14.3F, 46.5F, 1, 1, 1, 0.0F, false));
        headlights.cubeList.add(new ModelBox(headlights, 346, 215, 14.6F, -14.3F, 46.5F, 1, 1, 1, 0.0F, false));

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(-14.4F, -14.6F, 47.0F);
        headlights.addChild(bone53);
        setRotationAngle(bone53, 0.0F, 0.0F, -0.7854F);
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, -0.9243F, -1.7243F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 18.3798F, 17.5798F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 1.0556F, 0.2556F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 20.3597F, 19.5597F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, -1.7243F, -0.9243F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 17.5798F, 18.3798F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 0.2556F, 1.0556F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 19.5597F, 20.3597F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, -0.9243F, -0.1243F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 18.3798F, 19.1798F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 1.0556F, 1.8556F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 20.3597F, 21.1597F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, -0.1243F, -0.9243F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 19.1798F, 18.3798F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 1.8556F, 1.0556F, -0.5F, 1, 1, 1, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 346, 215, 21.1597F, 20.3597F, -0.5F, 1, 1, 1, 0.0F, false));

        headlights_left = new ModelRenderer(this);
        headlights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        headlights_left.cubeList.add(new ModelBox(headlights_left, 443, 249, -17.5F, -16.1F, 46.4F, 1, 3, 1, 0.0F, false));
        headlights_left.cubeList.add(new ModelBox(headlights_left, 440, 249, -20.1F, -16.5F, 41.4F, 1, 1, 4, 0.0F, false));

        headlights_right = new ModelRenderer(this);
        headlights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        headlights_right.cubeList.add(new ModelBox(headlights_right, 443, 249, 16.6F, -16.1F, 46.4F, 1, 3, 1, 0.0F, false));
        headlights_right.cubeList.add(new ModelBox(headlights_right, 443, 249, 19.1F, -16.5F, 41.6F, 1, 1, 4, 0.0F, false));

        rearlights = new ModelRenderer(this);
        rearlights.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights.cubeList.add(new ModelBox(rearlights, 427, 180, -17.3F, -16.5F, -52.0F, 6, 1, 1, 0.0F, false));
        rearlights.cubeList.add(new ModelBox(rearlights, 427, 180, 4.4F, -16.5F, -52.0F, 6, 1, 1, 0.0F, false));
        rearlights.cubeList.add(new ModelBox(rearlights, 427, 180, -11.3F, -16.5F, -52.0F, 7, 1, 1, 0.0F, false));
        rearlights.cubeList.add(new ModelBox(rearlights, 427, 180, 10.4F, -16.5F, -52.0F, 7, 1, 1, 0.0F, false));

        rearlights_left = new ModelRenderer(this);
        rearlights_left.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_left.cubeList.add(new ModelBox(rearlights_left, 427, 180, -17.3F, -15.3F, -52.0F, 3, 2, 1, 0.0F, false));

        rearlights_right = new ModelRenderer(this);
        rearlights_right.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_right.cubeList.add(new ModelBox(rearlights_right, 427, 180, 14.4F, -15.3F, -52.0F, 3, 2, 1, 0.0F, false));

        rearlights_reverse = new ModelRenderer(this);
        rearlights_reverse.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_reverse.cubeList.add(new ModelBox(rearlights_reverse, 408, 231, 8.4F, -8.5F, -52.8F, 2, 1, 1, 0.0F, false));
        rearlights_reverse.cubeList.add(new ModelBox(rearlights_reverse, 408, 231, -10.3F, -8.5F, -52.8F, 2, 1, 1, 0.0F, false));

        rearlights_brake = new ModelRenderer(this);
        rearlights_brake.setRotationPoint(0.0F, 24.0F, 0.0F);
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 427, 180, 10.4F, -15.3F, -52.0F, 4, 1, 1, 0.0F, false));
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 427, 180, 8.4F, -14.3F, -52.0F, 6, 1, 1, 0.0F, false));
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 427, 180, 4.4F, -15.3F, -52.0F, 6, 1, 1, 0.0F, false));
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 427, 180, -11.3F, -15.3F, -52.0F, 7, 1, 1, 0.0F, false));
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 427, 180, -14.3F, -15.3F, -52.0F, 3, 1, 1, 0.0F, false));
        rearlights_brake.cubeList.add(new ModelBox(rearlights_brake, 427, 180, -14.3F, -14.3F, -52.0F, 6, 1, 1, 0.0F, false));

        plates = new ModelRenderer(this);
        plates.setRotationPoint(0.0F, 24.0F, 0.0F);
        plates.cubeList.add(new ModelBox(plates, 417, 231, -3.0F, -8.5F, -53.2F, 6, 3, 1, 0.0F, false));
        plates.cubeList.add(new ModelBox(plates, 409, 217, -3.0F, -6.5F, 48.2F, 6, 3, 1, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 24.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 101, 177, -15.0F, -19.0F, 7.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 230, 210, -6.0F, -18.2F, 7.9F, 2, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 224, 177, -15.0F, -17.8F, 7.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 430, 180, -15.0F, -16.6F, 7.9F, 1, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 183, 219, -6.0F, -16.9F, 7.9F, 2, 1, 1, 0.0F, false));

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(1.5F, -19.7F, 8.4F);
        interier.addChild(bone55);
        setRotationAngle(bone55, 0.7854F, 0.0F, 0.0F);
        bone55.cubeList.add(new ModelBox(bone55, 288, 133, -7.5F, 0.0F, -0.6F, 6, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 288, 133, -1.5F, 0.0F, -0.6F, 6, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 279, 142, 4.5F, 0.0F, -0.6F, 10, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 279, 142, -1.9F, -20.6F, -22.2F, 15, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 279, 142, -16.9F, -20.6F, -22.2F, 15, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 288, 133, -7.5F, 0.3F, -0.9F, 6, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 288, 133, -1.5F, 0.3F, -0.9F, 6, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 279, 142, 4.5F, 0.3F, -0.9F, 10, 1, 1, 0.0F, false));

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, -29.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, -29.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, -29.0F, 2, 2, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, -29.0F, 2, 2, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 200, 17, -2.0F, -7.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -8.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, 0.0F, -7.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, 16.0F, 2, 2, 13, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -7.0F, 29.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -7.0F, 27.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -8.0F, 28.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -9.0F, -6.0F, 28.0F, 18, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -8.0F, -30.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -7.0F, -31.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -6.0F, -30.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -10.0F, -7.0F, -29.0F, 20, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -7.0F, 29.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -8.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -7.0F, 27.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 9.0F, -6.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, 29.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -8.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, 27.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -6.0F, 28.0F, 11, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -29.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -8.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -31.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -6.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -7.0F, -29.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -8.0F, -30.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -7.0F, -31.0F, 10, 2, 2, 0.0F, false));
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
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, 0.0F, -7.0F, -8.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, -20.0F, -7.0F, -8.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, -20.0F, -7.0F, 10.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, 0.0F, -7.0F, 10.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, -20.0F, -7.0F, -19.8F, 20, 3, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, 0.0F, -7.0F, -19.8F, 20, 3, 12, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 217, 12, -15.0F, -7.0F, 19.0F, 15, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 217, 12, 0.0F, -7.0F, 19.0F, 15, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 16, 0.0F, -7.0F, -39.0F, 15, 3, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 16, -15.0F, -7.0F, -39.0F, 15, 3, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, 12.0F, 3, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -19.8F, 3, 13, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -18.8F, -20.0F, -11.0F, 2, 13, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, 12.0F, 3, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -19.8F, 3, 13, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -11.0F, 2, 13, 23, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.1F, 19.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -15.1F, 19.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.0F, 20.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -15.0F, 20.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.0F, 21.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -15.0F, 21.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.0F, 22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -15.0F, 22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.8F, 23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.8F, 23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -15.0F, 24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.0F, 24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -15.2F, 25.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.2F, 25.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.7F, 26.0F, 3, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.7F, 26.0F, 3, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -20.0F, 12.0F, 17, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -20.0F, 12.0F, 17, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.1F, 16.0F, 3, 9, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -15.1F, 16.0F, 3, 9, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 249, 19, -20.0F, -17.0F, 41.0F, 2, 2, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 249, 19, 18.0F, -17.0F, 41.0F, 2, 2, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, 31.0F, 3, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, 31.0F, 3, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, 33.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, 33.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.3F, 34.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.3F, 34.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, 36.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, 36.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, 35.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, 35.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.5F, 37.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.5F, 37.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.2F, 38.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, 38.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 133, 14, 18.0F, -10.0F, 40.0F, 2, 2, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 133, 14, 18.0F, -13.0F, 40.0F, 2, 2, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 133, 14, -20.0F, -13.0F, 40.0F, 2, 2, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 133, 14, -20.0F, -10.0F, 40.0F, 2, 2, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.5F, -39.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, -38.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, -37.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.2F, -36.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.4F, -34.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.2F, -35.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.5F, -27.0F, 3, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.0F, -25.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.6F, -24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.0F, -23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.5F, -22.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -14.1F, -21.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, -19.8F, -15.0F, -20.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.5F, -39.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, -38.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, -37.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, -36.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.4F, -34.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.2F, -35.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.8F, -25.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.6F, -24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.0F, -23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.0F, -22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.1F, -21.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 18, 27, 16.9F, -14.0F, -20.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -38.8F, 3, 6, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -38.8F, 3, 6, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -20.0F, -43.8F, 3, 14, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -43.8F, 3, 14, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 201, 22, 14.0F, -15.0F, -39.0F, 1, 8, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, -20.0F, -7.0F, 1.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, 0.0F, -7.0F, 1.0F, 20, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 16, 0.0F, -7.0F, -29.0F, 15, 3, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 16, -15.0F, -7.0F, -29.0F, 15, 3, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 201, 22, -15.3F, -15.0F, -39.0F, 1, 8, 20, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.9F, -20.0F, -52.8F, 2, 13, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -52.8F, 2, 13, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -20.0F, -19.8F, 17, 13, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -20.0F, -19.8F, 17, 13, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -30.3F, -17.1F, 20, 3, 25, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -30.3F, -17.1F, 20, 3, 25, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -29.8F, -17.8F, 3, 10, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 16.9F, -29.8F, -17.8F, 3, 10, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -16.8F, -20.0F, -43.8F, 17, 14, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -17.8F, -20.0F, -52.8F, 18, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -20.0F, -52.8F, 18, 1, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -20.0F, -43.8F, 17, 14, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -17.8F, -13.0F, -52.8F, 18, 4, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -13.0F, -52.8F, 18, 4, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 12, -17.8F, -18.0F, -51.9F, 18, 6, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 12, -0.1F, -18.0F, -51.9F, 18, 6, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.8F, -14.0F, -52.8F, 8, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -14.0F, -52.8F, 8, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -19.0F, -52.8F, 18, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -17.8F, -19.0F, -52.8F, 18, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -19.8F, -20.0F, -44.8F, 2, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -17.8F, -20.0F, -44.8F, 18, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -20.0F, -44.8F, 18, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 17.9F, -20.0F, -44.8F, 2, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, -19.8F, -20.0F, -50.8F, 2, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, -17.8F, -20.0F, -50.8F, 18, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, -0.1F, -20.0F, -50.8F, 18, 1, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, 17.9F, -20.0F, -50.8F, 2, 13, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, -19.8F, -20.0F, -45.8F, 2, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, -17.8F, -20.0F, -45.8F, 18, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, -0.1F, -20.0F, -45.8F, 18, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 11, 17.9F, -20.0F, -45.8F, 2, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 73, 38, -19.8F, -20.0F, -46.8F, 2, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 73, 38, -17.8F, -20.0F, -46.8F, 18, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 73, 38, -0.1F, -20.0F, -46.8F, 18, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 73, 38, 17.9F, -20.0F, -46.8F, 2, 13, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, -18.8F, -12.0F, -53.3F, 15, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, 3.9F, -12.0F, -53.3F, 15, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, -0.1F, -13.0F, -53.8F, 7, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, -6.8F, -13.0F, -53.8F, 7, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, 18.9F, -13.0F, -54.0F, 2, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, -20.8F, -13.0F, -54.0F, 2, 5, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, 4.9F, -10.0F, -54.4F, 2, 4, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 9, 243, -6.8F, -10.0F, -54.4F, 2, 4, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 119, 8, -16.8F, -19.2F, -38.8F, 17, 3, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 119, 8, -0.1F, -19.2F, -38.8F, 17, 3, 19, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 235, 49, -19.3F, -18.0F, -9.0F, 2, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 235, 49, 17.5F, -18.0F, -9.0F, 2, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, 0.0F, -10.0F, -15.8F, 17, 3, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, 0.0F, -10.0F, -8.0F, 17, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, 0.0F, -10.0F, 1.0F, 17, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, 0.0F, -10.0F, 10.0F, 17, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, -17.0F, -10.0F, 1.0F, 17, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, -17.0F, -10.0F, -8.0F, 17, 3, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 131, 12, -17.0F, -10.0F, -15.8F, 17, 3, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 6, -17.0F, -10.0F, 10.0F, 17, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 331, 2, -0.1F, -20.0F, 8.0F, 17, 6, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 331, 2, -16.8F, -20.0F, 8.0F, 17, 6, 4, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 12, 7.9F, -9.0F, -52.7F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 10.9F, -9.0F, -52.8F, 7, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -17.8F, -9.0F, -52.8F, 7, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.1F, -9.0F, -52.8F, 8, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.8F, -9.0F, -52.8F, 8, 2, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 134, 12, -10.8F, -9.0F, -52.7F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.8F, -9.0F, -51.8F, 3, 2, 8, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 7.9F, -9.0F, -51.8F, 3, 2, 8, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0f, headlights, rearlights),
                new LightControllerEntry<>(0.8f, interier),
                new LightControllerEntry<>(0.6f, plates),
                new BrakeLights<>(rearlights_brake),
                new ReverseLights<>(rearlights_reverse),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.RIGHT, headlights_right, rearlights_right),
                new TurnIndicatorLights<>(1000, LightController.TurnLightStatus.LEFT, headlights_left, rearlights_left)
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
        bone41.render(1.0F);
        bone43.render(1.0F);
        bone45.render(1.0F);
        bone46.render(1.0F);
        bone47.render(1.0F);
        bone48.render(1.0F);
        bone49.render(1.0F);
        bone50.render(1.0F);
        bone51.render(1.0F);
        bone52.render(1.0F);
        bb_main.render(1.0F);
    }
}
