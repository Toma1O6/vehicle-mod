package dev.toma.vehiclemod.client.model.vehicle;

import dev.toma.vehiclemod.client.lights.BrakeLights;
import dev.toma.vehiclemod.client.lights.LightControllerEntry;
import dev.toma.vehiclemod.client.lights.ReverseLights;
import dev.toma.vehiclemod.client.lights.TurnIndicatorLights;
import dev.toma.vehiclemod.common.entity.vehicle.LightController;
import dev.toma.vehiclemod.common.entity.vehicle.sport.VehicleProtonP9X;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelProtonP9XT extends ModelVehicle<VehicleProtonP9X.VehicleProtonP9XT> {

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
    private final ModelRenderer bone39;
    private final ModelRenderer bone42;
    private final ModelRenderer bone38;
    private final ModelRenderer bone43;
    private final ModelRenderer bone45;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer bone41;
    private final ModelRenderer bone51;
    private final ModelRenderer bone35;
    private final ModelRenderer bone34;
    private final ModelRenderer bone46;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone40;
    private final ModelRenderer bone44;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone52;
    private final ModelRenderer bone53;
    private final ModelRenderer bone54;
    private final ModelRenderer bone55;
    private final ModelRenderer bone56;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone59;
    private final ModelRenderer headlights;
    private final ModelRenderer bone60;
    private final ModelRenderer headlights_left;
    private final ModelRenderer bone61;
    private final ModelRenderer headlights_right;
    private final ModelRenderer bone62;
    private final ModelRenderer rearlights;
    private final ModelRenderer bone63;
    private final ModelRenderer rearlights_brake;
    private final ModelRenderer bone64;
    private final ModelRenderer rearlights_left;
    private final ModelRenderer bone66;
    private final ModelRenderer rearlights_right;
    private final ModelRenderer bone67;
    private final ModelRenderer rearlights_reverse;
    private final ModelRenderer bone65;
    private final ModelRenderer plate;
    private final ModelRenderer interier;
    private final ModelRenderer bone69;
    private final ModelRenderer bone70;
    private final ModelRenderer bone68;
    private final ModelRenderer bb_main;

    public ModelProtonP9XT() {
        textureWidth = 512;
        textureHeight = 512;

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(12.0F, 12.0F, 0.0F);
        setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -16.2635F, 23.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -16.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -16.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 19.799F, -12.3137F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 19.799F, -12.3137F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -17.2635F, 22.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -17.2635F, 22.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -17.2635F, 22.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 18.799F, -13.3137F, 5, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, 2.0F, 18.799F, -13.3137F, 6, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -18.2635F, 23.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -18.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -18.2635F, 23.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 17.799F, -12.3137F, 5, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, 2.0F, 17.799F, -12.3137F, 6, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -21.0F, -17.2635F, 24.7487F, 18, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -3.0F, -17.2635F, 24.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, -17.2635F, 24.7487F, 11, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -32.0F, 18.799F, -11.3137F, 10, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 202, 6, -2.0F, 18.799F, -11.3137F, 10, 2, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-23.5F, 16.0F, -35.0F);
        setRotationAngle(bone3, -0.7854F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -14.7782F, 7.6066F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -50.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -50.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -14.7782F, 7.6066F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -5.7782F, 7.6066F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -41.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -41.8406F, 43.669F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -5.7782F, 7.6066F, 4, 5, 6, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -10.7782F, 3.6066F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -46.8406F, 39.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -46.8406F, 39.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -10.7782F, 3.6066F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -10.7782F, 12.6066F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 4.5F, -46.8406F, 48.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -46.8406F, 48.669F, 4, 6, 5, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 142, 6, 38.5F, -10.7782F, 12.6066F, 4, 6, 5, 0.0F, false));

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
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, -1.0F, 0.0F, -26.75F, 2, 2, 16, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 206, 17, 0.0F, -1.0F, -26.75F, 2, 2, 16, 0.0F, false));

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
        bone7.cubeList.add(new ModelBox(bone7, 45, 68, 15.0F, -7.0431F, 0.5936F, 5, 1, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 18, 45, -20.0F, -6.9446F, 0.5762F, 5, 1, 2, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone8);
        setRotationAngle(bone8, 0.2618F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 45, 68, 15.0F, -6.9872F, -0.7244F, 5, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 45, 68, 15.0F, -56.0493F, 12.8359F, 5, 1, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 18, 45, -20.0F, -6.8906F, -0.7503F, 5, 1, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 18, 45, -20.0F, -56.0493F, 12.8359F, 5, 1, 3, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone9);
        setRotationAngle(bone9, 0.4363F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 45, 68, 15.0F, -7.0267F, -1.512F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 45, 68, 15.0F, -52.9888F, 20.3618F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 18, 45, -20.0F, -6.9361F, -1.5543F, 5, 1, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 18, 45, -20.0F, -52.9888F, 20.3618F, 5, 1, 2, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone10);
        setRotationAngle(bone10, 0.6109F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 45, 68, 15.0F, -7.1801F, -2.1966F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 45, 68, 15.0F, -48.6455F, 27.3261F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 18, 45, -20.0F, -7.0982F, -2.2539F, 5, 1, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 18, 45, -20.0F, -48.6455F, 27.3261F, 5, 1, 2, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, -50.9505F, 29.6618F);
        bone10.addChild(bone33);
        setRotationAngle(bone33, -0.1222F, 0.0F, 0.0F);


        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone11);
        setRotationAngle(bone11, 0.8727F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 45, 68, 15.0F, -7.5054F, -2.2215F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 45, 68, 15.0F, -39.9169F, 37.0273F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 18, 45, -20.0F, -7.4411F, -2.2981F, 5, 1, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 18, 45, -20.0F, -39.9169F, 37.0273F, 5, 1, 2, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone12);
        setRotationAngle(bone12, 1.0472F, 0.0F, 0.0F);
        bone12.cubeList.add(new ModelBox(bone12, 45, 68, 15.0F, -7.7902F, -2.8744F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 45, 68, 15.0F, -32.8938F, 41.4063F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 18, 45, -20.0F, -7.7402F, -2.961F, 5, 1, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 18, 45, -20.0F, -32.8938F, 41.4063F, 5, 1, 2, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone13);
        setRotationAngle(bone13, 1.2217F, 0.0F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 45, 68, 15.0F, -8.178F, -3.4135F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 45, 68, 15.0F, -25.211F, 44.5536F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 18, 45, -20.0F, -8.1438F, -3.5075F, 5, 1, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 18, 45, -20.0F, -25.211F, 44.5536F, 5, 1, 2, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone14);
        setRotationAngle(bone14, 1.3963F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 45, 68, 15.0F, -8.7027F, -3.9527F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 45, 68, 15.0F, -17.1475F, 46.2434F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 18, 45, -20.0F, -8.6854F, -4.0512F, 5, 1, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 18, 45, -20.0F, -17.1475F, 46.2434F, 5, 1, 2, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone15);
        setRotationAngle(bone15, 1.5708F, 0.0F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 45, 68, 15.0F, -9.3F, -4.4F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 45, 68, 15.0F, -8.9F, 46.5F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 18, 45, -20.0F, -9.3F, -4.5F, 5, 1, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 18, 45, -20.0F, -8.9F, 46.5F, 5, 1, 2, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone16);
        setRotationAngle(bone16, 1.7453F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 45, 68, 15.0F, -9.9064F, -4.5569F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 45, 68, 15.0F, -0.6738F, 45.5003F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 18, 45, -20.0F, -9.9238F, -4.6554F, 5, 1, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 18, 45, -20.0F, -0.6738F, 45.5003F, 5, 1, 2, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone17);
        setRotationAngle(bone17, 1.9199F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 45, 68, 15.0F, -10.5582F, -4.7187F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 45, 68, 15.0F, 7.2265F, 42.9748F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 18, 45, -20.0F, -10.5924F, -4.8127F, 5, 1, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 18, 45, -20.0F, 7.2265F, 42.9748F, 5, 1, 2, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone18);
        setRotationAngle(bone18, 2.0944F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 45, 68, 15.0F, -11.1902F, -4.7744F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 45, 68, 15.0F, 14.6062F, 39.1063F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 18, 45, -20.0F, -11.2402F, -4.861F, 5, 1, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 18, 45, -20.0F, 14.6062F, 39.1063F, 5, 1, 2, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone19);
        setRotationAngle(bone19, 2.2689F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 45, 68, 15.0F, -11.835F, -4.7071F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 45, 68, 15.0F, 21.1894F, 34.0274F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 18, 45, -20.0F, -11.8992F, -4.7837F, 5, 1, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 18, 45, -20.0F, 21.1894F, 34.0274F, 5, 1, 2, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone20);
        setRotationAngle(bone20, 2.5307F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 45, 68, 15.0F, -12.6758F, -3.3881F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 45, 68, 15.0F, 29.2485F, 25.4793F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 18, 45, -20.0F, -12.7577F, -3.4454F, 5, 1, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 18, 45, -20.0F, 29.2485F, 25.4793F, 5, 1, 2, 0.0F, false));

        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone21);
        setRotationAngle(bone21, 2.7227F, 0.0F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 45, 68, 15.0F, -13.0745F, -2.7676F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 45, 68, 15.0F, 33.5876F, 17.5699F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 18, 45, -20.0F, -13.1659F, -2.8083F, 5, 1, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 18, 45, -20.0F, 33.5876F, 17.5699F, 5, 1, 2, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone22);
        setRotationAngle(bone22, 2.8972F, 0.0F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 45, 68, 15.0F, -13.3324F, -2.4218F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 45, 68, 15.0F, 36.1524F, 9.5039F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 18, 45, -20.0F, -13.4294F, -2.446F, 5, 1, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 18, 45, -20.0F, 36.1524F, 9.5039F, 5, 1, 2, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone23);
        setRotationAngle(bone23, 2.9845F, 0.0F, 0.0F);
        bone23.cubeList.add(new ModelBox(bone23, 45, 68, 15.0F, -13.438F, -4.1169F, 5, 1, 3, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 45, 68, -20.0F, -13.438F, -4.1169F, 5, 1, 3, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 45, 68, 15.0F, 36.7979F, 4.4505F, 5, 1, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 18, 45, -20.0F, -13.5368F, -2.1326F, 5, 1, 1, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 18, 45, -20.0F, 36.7979F, 4.4505F, 5, 1, 2, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, 1.0F, -1.0F);
        bone6.addChild(bone24);
        setRotationAngle(bone24, -3.1241F, 0.0F, 0.0F);


        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(0.0F, 10.0F, 26.5F);
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 5.0F, -0.5F, -1.5F, 11, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 132, 14, 0.0F, -0.5F, -11.5F, 15, 10, 10, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 15.0F, -0.5F, -10.5F, 1, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 15.0F, -0.5F, -52.5F, 1, 8, 14, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 15.0F, 0.5F, -58.5F, 1, 7, 6, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 15.0F, 1.5F, 7.3F, 1, 2, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 6.0F, 1.5F, 7.3F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 15.0F, 3.5F, 7.3F, 1, 6, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 7.0F, 4.5F, 7.3F, 8, 2, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 141, 13, 7.0F, 1.5F, 14.9F, 8, 3, 1, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -15.0F, 4.5F, 7.3F, 8, 2, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 322, 29, -14.0F, 9.7F, 8.3F, 3, 3, 7, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 352, 27, -13.5F, 10.7F, 13.3F, 2, 2, 4, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 141, 13, -15.0F, 1.5F, 14.9F, 8, 3, 1, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 4.0F, 5.5F, 7.3F, 3, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 17, 6.0F, 8.5F, 14.3F, 14, 2, 3, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -16.0F, -0.5F, -1.5F, 11, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 132, 14, -15.0F, -0.5F, -11.5F, 15, 10, 10, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -4.0F, -0.5F, -1.5F, 1, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 3.0F, -0.5F, -1.5F, 1, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 142, 14, 4.0F, -0.5F, -1.5F, 1, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 142, 14, -5.0F, -0.5F, -1.5F, 1, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 142, 14, -3.0F, -0.5F, -1.5F, 6, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -16.0F, -0.5F, -10.5F, 1, 8, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -16.0F, -0.5F, -52.5F, 1, 8, 14, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -16.0F, 0.5F, -58.5F, 1, 7, 6, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -16.0F, 1.5F, 7.3F, 1, 2, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -7.0F, 1.5F, 7.3F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -16.0F, 3.5F, 7.3F, 1, 6, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, -14.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, 7.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, -12.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, 9.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, -10.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, 11.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, -8.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 5, 13.5F, 5.5F, 6.7F, 1, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -7.0F, 5.5F, 7.3F, 3, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -7.0F, 9.2F, 7.2F, 2, 1, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -3.0F, 9.2F, 7.2F, 2, 1, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 1.0F, 9.2F, 7.2F, 2, 1, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, 5.0F, 9.2F, 7.2F, 2, 1, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 27, 18, -4.0F, 5.5F, 7.3F, 8, 1, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 137, 20, -6.0F, 1.5F, 6.7F, 12, 4, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 142, 17, -4.0F, 6.5F, 7.2F, 8, 3, 9, 0.0F, false));
        bone25.cubeList.add(new ModelBox(bone25, 145, 17, -20.0F, 8.5F, 14.3F, 14, 2, 3, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.0F, 1.6F, 12.0F);
        bone25.addChild(bone39);
        setRotationAngle(bone39, -0.0524F, 0.0F, 0.0F);
        bone39.cubeList.add(new ModelBox(bone39, 27, 18, -16.0F, -1.9034F, -4.7216F, 11, 2, 9, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 27, 18, -4.0F, -1.9034F, -4.7216F, 1, 2, 9, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 27, 18, 3.0F, -1.9034F, -4.7216F, 1, 2, 9, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 142, 14, 4.0F, -1.9034F, -4.7216F, 1, 2, 9, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 142, 14, -5.0F, -1.9034F, -4.7216F, 1, 2, 9, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 142, 14, -3.0F, -1.9034F, -4.7216F, 6, 2, 9, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 27, 18, 5.0F, -1.9034F, -4.7216F, 11, 2, 9, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(0.0F, -0.4034F, 4.2784F);
        bone39.addChild(bone42);
        setRotationAngle(bone42, -0.6109F, 0.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 145, 17, -15.0F, -0.4F, -2.0F, 8, 1, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 145, 17, 7.0F, -0.4F, -2.0F, 8, 1, 2, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(0.0F, 9.8F, 11.8F);
        bone25.addChild(bone38);
        setRotationAngle(bone38, 0.3142F, 0.0F, 0.0F);
        bone38.cubeList.add(new ModelBox(bone38, 17, 23, -16.0F, -2.8518F, -2.6264F, 16, 4, 7, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 17, 23, 0.0F, -2.8518F, -2.6264F, 16, 4, 7, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(-0.25F, -4.0F, 10.5F);
        bone25.addChild(bone43);
        setRotationAngle(bone43, 0.0349F, 0.0F, 0.0F);
        bone43.cubeList.add(new ModelBox(bone43, 27, 18, 0.25F, -0.1F, -3.0F, 19, 1, 5, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 139, 14, 0.25F, -0.1F, 2.0F, 19, 1, 1, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 27, 18, -18.75F, -0.1F, -3.0F, 19, 1, 5, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 139, 14, -18.75F, -0.1F, 2.0F, 19, 1, 1, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(0.0F, 0.0F, 15.8F);
        bone25.addChild(bone45);
        setRotationAngle(bone45, -0.7854F, 0.0F, 0.0F);


        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(0.0F, 10.0F, 26.5F);
        setRotationAngle(bone26, -0.1745F, 0.0F, 0.0F);


        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(0.0F, -0.4F, 13.4F);
        bone26.addChild(bone27);
        setRotationAngle(bone27, -0.192F, 0.0F, 0.0F);


        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(0.0F, 2.4F, 1.9F);
        bone27.addChild(bone28);
        setRotationAngle(bone28, -0.576F, 0.0F, 0.0F);


        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(0.0F, 0.6F, -0.5072F);
        bone28.addChild(bone29);
        setRotationAngle(bone29, -0.5236F, 0.0F, 0.0F);


        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(0.0F, 0.05F, 4.5722F);
        bone29.addChild(bone30);
        setRotationAngle(bone30, -0.1222F, 0.0F, 0.0F);
        bone30.cubeList.add(new ModelBox(bone30, 27, 18, 16.0F, 1.1F, -0.1F, 4, 1, 2, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 27, 18, -20.0F, 1.1F, -0.1F, 4, 1, 2, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, 11.0F, 35.5F);
        setRotationAngle(bone31, 0.192F, 0.0F, 0.0F);


        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, 10.5F, -31.0F);
        setRotationAngle(bone32, -1.4486F, 0.0F, 0.0F);
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, -19.0F, -2.9019F, -0.5284F, 11, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, -8.0F, -2.9019F, -0.5284F, 3, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, -4.0F, -2.9019F, -0.5284F, 1, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, 3.0F, -2.9019F, -0.5284F, 1, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 136, 17, 4.0F, -2.9019F, -0.5284F, 1, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 136, 17, -5.0F, -2.9019F, -0.5284F, 1, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 136, 17, -3.0F, -2.9019F, -0.5284F, 6, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, 5.0F, -2.9019F, -0.5284F, 2, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, -19.0F, -10.9019F, -0.5284F, 8, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, -8.0F, -10.9019F, -0.5284F, 3, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, -4.0F, -10.9019F, -0.5284F, 1, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, 3.0F, -10.9019F, -0.5284F, 1, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 136, 17, 4.0F, -10.9019F, -0.5284F, 1, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 136, 17, -5.0F, -10.9019F, -0.5284F, 1, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 136, 17, -3.0F, -10.9019F, -0.5284F, 6, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, 5.0F, -10.9019F, -0.5284F, 2, 8, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, 7.0F, -2.9019F, -0.5284F, 12, 14, 2, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 142, 17, 16.0F, 8.0981F, -0.8284F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 142, 17, -12.0F, 8.0981F, -0.8284F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 142, 17, 11.0F, 8.0981F, -0.8284F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 142, 17, -17.0F, 8.0981F, -0.8284F, 1, 1, 1, 0.0F, false));
        bone32.cubeList.add(new ModelBox(bone32, 27, 18, 10.0F, -10.9019F, -0.5284F, 9, 8, 1, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.0F, 10.5981F, 0.4716F);
        bone32.addChild(bone41);
        setRotationAngle(bone41, 0.733F, 0.0F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 27, 18, 5.0F, -0.3F, -1.1F, 14, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 27, 18, -19.0F, -0.3F, -1.1F, 14, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 27, 18, -4.0F, -0.3F, -1.1F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 27, 18, 3.0F, -0.3F, -1.1F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 165, 29, 4.0F, -0.3F, -1.1F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 165, 29, -5.0F, -0.3F, -1.1F, 1, 1, 2, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 165, 29, -3.0F, -0.3F, -1.1F, 6, 1, 2, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(-0.5F, -6.9019F, -0.0284F);
        bone32.addChild(bone51);
        setRotationAngle(bone51, 0.0698F, 0.0F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 27, 18, -10.5F, -4.0F, -0.2F, 3, 8, 1, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 27, 18, 7.5F, -4.0F, -0.2F, 3, 8, 1, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(0.0F, -14.4019F, 0.6716F);
        bone32.addChild(bone35);
        setRotationAngle(bone35, -0.0524F, 0.0F, 0.0F);
        bone35.cubeList.add(new ModelBox(bone35, 27, 18, -19.0F, -4.386F, -0.9995F, 11, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 27, 18, -8.0F, -4.386F, -0.9995F, 3, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 27, 18, -4.0F, -4.386F, -0.9995F, 1, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 27, 18, 3.0F, -4.386F, -0.9995F, 1, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 136, 17, 4.0F, -4.386F, -0.9995F, 1, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 136, 17, -5.0F, -4.386F, -0.9995F, 1, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 136, 17, -3.0F, -4.386F, -0.9995F, 6, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 27, 18, 5.0F, -4.386F, -0.9995F, 2, 8, 2, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 27, 18, 7.0F, -4.386F, -0.9995F, 12, 8, 2, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, 19.5F, -34.0F);
        setRotationAngle(bone34, 1.5184F, 0.0F, 0.0F);
        bone34.cubeList.add(new ModelBox(bone34, 27, 18, 0.0F, -7.9F, -1.0F, 18, 10, 4, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 136, 5, 8.0F, -8.9F, -2.0F, 11, 10, 2, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 136, 5, -19.0F, -8.9F, -2.0F, 11, 10, 2, 0.0F, false));
        bone34.cubeList.add(new ModelBox(bone34, 27, 18, -18.0F, -7.9F, -1.0F, 18, 10, 4, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.0F, -7.4F, 2.0F);
        bone34.addChild(bone46);
        setRotationAngle(bone46, 0.6981F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 29, 37, 0.0F, -0.5F, -0.9F, 17, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 145, 23, 7.0F, -1.2F, -2.2F, 10, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 29, 37, 0.0F, 1.4F, 0.7F, 10, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 29, 37, 0.0F, 0.7F, -0.2F, 10, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 23, 29, -17.0F, -0.5F, -0.9F, 17, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 145, 23, -17.0F, -1.2F, -2.2F, 10, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 23, 29, -10.0F, 1.4F, 0.7F, 10, 1, 2, 0.0F, false));
        bone46.cubeList.add(new ModelBox(bone46, 23, 29, -10.0F, 0.7F, -0.2F, 10, 1, 2, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(0.0F, 5.0F, -12.0F);
        setRotationAngle(bone36, -0.9599F, 0.0F, 0.0F);
        bone36.cubeList.add(new ModelBox(bone36, 27, 18, -19.0F, -8.7F, 2.1F, 3, 12, 2, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 136, 17, -16.0F, -8.7F, 2.1F, 16, 1, 2, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 27, 18, 16.0F, -8.7F, 2.1F, 3, 12, 2, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 136, 17, 0.0F, -8.7F, 2.1F, 16, 1, 2, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(0.0F, 6.0F, 21.5F);
        setRotationAngle(bone37, 1.0297F, 0.0F, 0.0F);
        bone37.cubeList.add(new ModelBox(bone37, 27, 18, 16.0F, -8.2F, -2.0F, 3, 14, 2, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 139, 17, 0.0F, -8.2F, -2.0F, 16, 1, 2, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 142, 20, 0.0F, 4.8F, -2.0F, 16, 2, 2, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 27, 18, -19.0F, -8.2F, -2.0F, 3, 14, 2, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 139, 17, -16.0F, -8.2F, -2.0F, 16, 1, 2, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 142, 20, -16.0F, 4.8F, -2.0F, 16, 2, 2, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(0.0F, 13.5F, -41.1F);
        setRotationAngle(bone40, -0.384F, 0.0F, 0.0F);
        bone40.cubeList.add(new ModelBox(bone40, 136, 5, 11.0F, -0.5F, -0.9F, 6, 1, 2, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 136, 5, -17.0F, -0.5F, -0.9F, 6, 1, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(32.5F, 19.5F, 1.75F);
        setRotationAngle(bone44, 0.0F, 0.0F, 0.7854F);
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -9.3F, 9.3F, -0.75F, 1, 1, 17, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -36.6F, 36.7F, -0.75F, 1, 1, 17, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -9.5F, 8.9F, -0.75F, 1, 1, 17, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -9.5F, 9.1F, -0.75F, 1, 1, 17, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -37.0F, 36.5F, -0.75F, 1, 1, 17, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -9.3F, 9.3F, -13.75F, 1, 1, 13, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -36.6F, 36.7F, -13.75F, 1, 1, 13, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -9.5F, 9.1F, -13.75F, 1, 1, 13, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -9.5F, 8.9F, -13.75F, 1, 1, 13, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 139, 14, -37.0F, 36.5F, -13.75F, 1, 1, 13, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(-18.0F, 10.5F, 14.5F);
        setRotationAngle(bone47, 0.0F, -0.7854F, 0.0F);
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, 2.7F, 0.5F, 2.5F, 2, 4, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, 26.9F, 0.5F, -22.8F, 2, 4, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, 1.7F, 0.5F, 1.5F, 2, 4, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, 25.9F, 0.5F, -23.8F, 2, 4, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, 0.7F, 0.5F, 0.5F, 2, 4, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, 24.9F, 0.5F, -24.8F, 2, 4, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, -0.3F, 0.5F, -0.5F, 2, 4, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 160, 14, 23.9F, 0.5F, -25.8F, 2, 4, 1, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(14.5F, 15.5F, -43.5F);
        setRotationAngle(bone48, 0.7854F, 0.0F, 0.0F);


        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(-19.5F, 21.5F, 1.75F);
        setRotationAngle(bone49, 0.0F, 0.0F, 0.3491F);
        bone49.cubeList.add(new ModelBox(bone49, 27, 18, -0.6F, -1.3F, -0.75F, 1, 2, 18, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 27, 18, -0.6F, -1.3F, -14.75F, 1, 2, 14, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(19.5F, 22.0F, 2.0F);
        setRotationAngle(bone50, 0.0F, 0.0F, -0.3491F);
        bone50.cubeList.add(new ModelBox(bone50, 27, 18, -0.2F, -1.8F, -1.0F, 1, 2, 18, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 27, 18, -0.2F, -1.8F, -15.0F, 1, 2, 14, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(0.0F, 11.6F, 10.5F);
        setRotationAngle(bone52, -0.1222F, 0.0F, 0.0F);
        bone52.cubeList.add(new ModelBox(bone52, 325, 32, 4.0F, -4.1909F, -1.6042F, 10, 8, 3, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 325, 32, -14.0F, -4.1909F, -1.6042F, 10, 8, 3, 0.0F, false));

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(19.5F, 8.5F, -9.5F);
        setRotationAngle(bone53, 0.6109F, 0.7854F, 0.0F);
        bone53.cubeList.add(new ModelBox(bone53, 165, 22, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(-19.5F, 8.5F, -9.5F);
        setRotationAngle(bone54, 0.6109F, -0.7854F, 0.0F);
        bone54.cubeList.add(new ModelBox(bone54, 165, 22, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(21.5F, 7.0F, -8.05F);
        setRotationAngle(bone55, 0.0F, -0.2618F, 0.0F);
        bone55.cubeList.add(new ModelBox(bone55, 377, 203, -1.0F, -0.5F, -0.25F, 2, 1, 1, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 11, 8, -1.5F, -1.0F, -0.35F, 3, 2, 1, 0.0F, false));

        bone56 = new ModelRenderer(this);
        bone56.setRotationPoint(-21.5F, 7.0F, -8.05F);
        setRotationAngle(bone56, 0.0F, 0.2618F, 0.0F);
        bone56.cubeList.add(new ModelBox(bone56, 377, 203, -1.0F, -0.5F, -0.25F, 2, 1, 1, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 11, 8, -1.5F, -1.0F, -0.35F, 3, 2, 1, 0.0F, false));

        bone57 = new ModelRenderer(this);
        bone57.setRotationPoint(9.0F, 18.5F, -5.5F);
        setRotationAngle(bone57, -0.6109F, 0.0F, 0.0F);
        bone57.cubeList.add(new ModelBox(bone57, 322, 52, -4.4F, -0.5F, -1.9F, 2, 1, 4, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 322, 52, 1.6F, -0.5F, -1.9F, 2, 1, 4, 0.0F, false));
        bone57.cubeList.add(new ModelBox(bone57, 322, 52, -1.4F, -0.5F, -1.9F, 2, 1, 4, 0.0F, false));

        bone58 = new ModelRenderer(this);
        bone58.setRotationPoint(9.5F, 9.5F, -1.7353F);
        setRotationAngle(bone58, 0.1745F, 0.0F, 0.0F);
        bone58.cubeList.add(new ModelBox(bone58, 328, 20, -2.5F, -0.5F, -4.2647F, 3, 3, 3, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 20, -1.5F, 0.5F, -1.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -4.5F, 1.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 337, 8, -4.5F, 0.5F, -0.2647F, 3, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -4.5F, -0.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -3.5F, -1.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -2.5F, -2.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 331, 30, -1.5F, -2.5F, -0.2647F, 1, 7, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -0.5F, -2.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, 0.5F, -1.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, 1.5F, -0.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 337, 8, -0.5F, 0.5F, -0.2647F, 3, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, 1.5F, 1.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, 0.5F, 2.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -0.5F, 3.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -2.5F, 3.5F, -0.2647F, 1, 1, 1, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 328, 32, -3.5F, 2.5F, -0.2647F, 1, 1, 1, 0.0F, false));

        bone59 = new ModelRenderer(this);
        bone59.setRotationPoint(0.0F, 13.8F, 0.5F);
        setRotationAngle(bone59, -0.0698F, 0.0F, 0.0F);
        bone59.cubeList.add(new ModelBox(bone59, 308, 27, -1.5F, -1.6985F, 1.4651F, 1, 1, 1, 0.0F, false));
        bone59.cubeList.add(new ModelBox(bone59, 308, 27, -0.5F, -1.6985F, 0.4651F, 1, 1, 3, 0.0F, false));
        bone59.cubeList.add(new ModelBox(bone59, 308, 27, 0.5F, -1.6985F, 1.4651F, 1, 1, 1, 0.0F, false));
        bone59.cubeList.add(new ModelBox(bone59, 308, 27, -0.5F, -0.6985F, 1.4651F, 1, 2, 1, 0.0F, false));
        bone59.cubeList.add(new ModelBox(bone59, 308, 27, -1.5F, 1.3015F, 0.4651F, 3, 1, 3, 0.0F, false));

        headlights = new ModelRenderer(this);
        headlights.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone60 = new ModelRenderer(this);
        bone60.setRotationPoint(11.0F, -9.5F, -41.4F);
        headlights.addChild(bone60);
        setRotationAngle(bone60, 0.7854F, 0.0F, 0.0F);
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, 0.4F, -0.4F, -0.2F, 4, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, -26.5F, -0.4F, -0.2F, 4, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, 0.4F, -0.1F, -0.5F, 4, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, -26.5F, -0.1F, -0.5F, 4, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, 0.4F, 0.2F, -0.8F, 4, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, -26.5F, 0.2F, -0.8F, 4, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, 0.4F, 0.5F, -1.1F, 4, 1, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 225, 177, -26.5F, 0.5F, -1.1F, 4, 1, 1, 0.0F, false));

        headlights_left = new ModelRenderer(this);
        headlights_left.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone61 = new ModelRenderer(this);
        bone61.setRotationPoint(11.0F, -9.5F, -41.4F);
        headlights_left.addChild(bone61);
        setRotationAngle(bone61, 0.7854F, 0.0F, 0.0F);
        bone61.cubeList.add(new ModelBox(bone61, 374, 246, 4.6F, -0.4F, -0.2F, 1, 1, 1, 0.0F, false));
        bone61.cubeList.add(new ModelBox(bone61, 374, 246, 4.6F, -0.1F, -0.5F, 1, 1, 1, 0.0F, false));
        bone61.cubeList.add(new ModelBox(bone61, 374, 246, 4.6F, 0.2F, -0.8F, 1, 1, 1, 0.0F, false));
        bone61.cubeList.add(new ModelBox(bone61, 374, 246, 4.6F, 0.5F, -1.1F, 1, 1, 1, 0.0F, false));

        headlights_right = new ModelRenderer(this);
        headlights_right.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone62 = new ModelRenderer(this);
        bone62.setRotationPoint(11.0F, -9.5F, -41.4F);
        headlights_right.addChild(bone62);
        setRotationAngle(bone62, 0.7854F, 0.0F, 0.0F);
        bone62.cubeList.add(new ModelBox(bone62, 374, 246, -27.7F, -0.4F, -0.2F, 1, 1, 1, 0.0F, false));
        bone62.cubeList.add(new ModelBox(bone62, 374, 246, -27.7F, -0.1F, -0.5F, 1, 1, 1, 0.0F, false));
        bone62.cubeList.add(new ModelBox(bone62, 374, 246, -27.7F, 0.2F, -0.8F, 1, 1, 1, 0.0F, false));
        bone62.cubeList.add(new ModelBox(bone62, 374, 246, -27.7F, 0.5F, -1.1F, 1, 1, 1, 0.0F, false));

        rearlights = new ModelRenderer(this);
        rearlights.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone63 = new ModelRenderer(this);
        bone63.setRotationPoint(0.0F, -10.5F, 42.5F);
        rearlights.addChild(bone63);
        setRotationAngle(bone63, -0.7854F, 0.0F, 0.0F);
        bone63.cubeList.add(new ModelBox(bone63, 423, 182, 11.2F, -0.6F, -1.4F, 2, 1, 1, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 423, 182, 11.2F, 0.0F, -0.8F, 2, 1, 1, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 423, 182, -13.2F, -0.6F, -1.4F, 2, 1, 1, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 423, 182, -13.2F, 0.0F, -0.8F, 2, 1, 1, 0.0F, false));

        rearlights_brake = new ModelRenderer(this);
        rearlights_brake.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone64 = new ModelRenderer(this);
        bone64.setRotationPoint(0.0F, -10.5F, 42.5F);
        rearlights_brake.addChild(bone64);
        setRotationAngle(bone64, -0.7854F, 0.0F, 0.0F);
        bone64.cubeList.add(new ModelBox(bone64, 423, 182, 8.8F, -0.6F, -1.4F, 2, 1, 1, 0.0F, false));
        bone64.cubeList.add(new ModelBox(bone64, 423, 182, 8.8F, 0.0F, -0.8F, 2, 1, 1, 0.0F, false));
        bone64.cubeList.add(new ModelBox(bone64, 423, 182, -10.8F, -0.6F, -1.4F, 2, 1, 1, 0.0F, false));
        bone64.cubeList.add(new ModelBox(bone64, 423, 182, -10.8F, 0.0F, -0.8F, 2, 1, 1, 0.0F, false));

        rearlights_left = new ModelRenderer(this);
        rearlights_left.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone66 = new ModelRenderer(this);
        bone66.setRotationPoint(0.0F, -10.5F, 42.5F);
        rearlights_left.addChild(bone66);
        setRotationAngle(bone66, -0.7854F, 0.0F, 0.0F);
        bone66.cubeList.add(new ModelBox(bone66, 445, 248, 13.6F, -0.6F, -1.4F, 1, 1, 1, 0.0F, false));
        bone66.cubeList.add(new ModelBox(bone66, 445, 248, 13.6F, 0.0F, -0.8F, 1, 1, 1, 0.0F, false));

        rearlights_right = new ModelRenderer(this);
        rearlights_right.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone67 = new ModelRenderer(this);
        bone67.setRotationPoint(0.0F, -10.5F, 42.5F);
        rearlights_right.addChild(bone67);
        setRotationAngle(bone67, -0.7854F, 0.0F, 0.0F);
        bone67.cubeList.add(new ModelBox(bone67, 445, 248, -14.6F, -0.6F, -1.4F, 1, 1, 1, 0.0F, false));
        bone67.cubeList.add(new ModelBox(bone67, 445, 248, -14.6F, 0.0F, -0.8F, 1, 1, 1, 0.0F, false));

        rearlights_reverse = new ModelRenderer(this);
        rearlights_reverse.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone65 = new ModelRenderer(this);
        bone65.setRotationPoint(0.0F, -10.5F, 42.5F);
        rearlights_reverse.addChild(bone65);
        setRotationAngle(bone65, -0.7854F, 0.0F, 0.0F);
        bone65.cubeList.add(new ModelBox(bone65, 425, 216, 7.4F, -0.6F, -1.4F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 425, 216, 7.4F, 0.0F, -0.8F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 425, 216, -8.4F, -0.6F, -1.4F, 1, 1, 1, 0.0F, false));
        bone65.cubeList.add(new ModelBox(bone65, 425, 216, -8.4F, 0.0F, -0.8F, 1, 1, 1, 0.0F, false));

        plate = new ModelRenderer(this);
        plate.setRotationPoint(0.0F, 24.0F, 0.0F);
        plate.cubeList.add(new ModelBox(plate, 396, 230, -3.0F, -7.2F, 41.8F, 6, 2, 1, 0.0F, false));
        plate.cubeList.add(new ModelBox(plate, 402, 227, -4.0F, -5.5F, -42.1F, 8, 3, 1, 0.0F, false));

        interier = new ModelRenderer(this);
        interier.setRotationPoint(0.0F, 24.0F, 0.0F);
        interier.cubeList.add(new ModelBox(interier, 100, 176, -1.7F, -15.0F, -4.8F, 4, 3, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 346, 211, -15.7F, -22.1F, -4.0F, 16, 1, 1, 0.0F, false));
        interier.cubeList.add(new ModelBox(interier, 346, 211, -0.3F, -22.1F, -4.0F, 16, 1, 1, 0.0F, false));

        bone69 = new ModelRenderer(this);
        bone69.setRotationPoint(13.5F, -13.5F, -4.4F);
        interier.addChild(bone69);
        setRotationAngle(bone69, -0.7854F, 0.0F, 0.0F);
        bone69.cubeList.add(new ModelBox(bone69, 222, 205, -0.9F, -1.5F, -1.5F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 194, 213, 0.5F, -1.5F, -1.5F, 1, 1, 1, 0.0F, false));
        bone69.cubeList.add(new ModelBox(bone69, 164, 224, -10.5F, -1.5F, -1.5F, 2, 1, 1, 0.0F, false));

        bone70 = new ModelRenderer(this);
        bone70.setRotationPoint(13.5F, -13.5F, -4.4F);
        interier.addChild(bone70);
        setRotationAngle(bone70, -0.7854F, 0.0F, 0.0F);
        bone70.cubeList.add(new ModelBox(bone70, 222, 205, -0.9F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        bone70.cubeList.add(new ModelBox(bone70, 194, 213, 0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        bone70.cubeList.add(new ModelBox(bone70, 346, 242, -10.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        bone70.cubeList.add(new ModelBox(bone70, 353, 208, -10.5F, -15.5F, 14.0F, 11, 1, 1, 0.0F, false));
        bone70.cubeList.add(new ModelBox(bone70, 353, 208, -27.5F, -15.5F, 14.0F, 11, 1, 1, 0.0F, false));
        bone70.cubeList.add(new ModelBox(bone70, 400, 245, -10.5F, 0.5F, 0.5F, 2, 1, 1, 0.0F, false));

        bone68 = new ModelRenderer(this);
        bone68.setRotationPoint(-0.5F, 0.3F, 5.4F);
        setRotationAngle(bone68, 0.4363F, 0.0F, 0.0F);
        bone68.cubeList.add(new ModelBox(bone68, 139, 8, 0.0F, 0.5F, -3.0F, 1, 1, 10, 0.0F, false));

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 206, 17, -1.0F, -6.0F, -29.0F, 2, 2, 16, 0.0F, false));
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
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -22.0F, 5, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -8.0F, -23.0F, 5, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -7.0F, -24.0F, 5, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, -20.0F, -6.0F, -23.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 14.0F, -7.0F, -22.0F, 6, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 14.0F, -8.0F, -23.0F, 6, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 14.0F, -7.0F, -24.0F, 6, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 202, 6, 10.0F, -6.0F, -23.0F, 10, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, -20.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, -29.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -4.0F, -25.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -13.0F, -25.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, 22.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -4.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -13.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, 22.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -4.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, 31.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -13.0F, 26.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, -29.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -4.0F, -25.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -9.0F, -20.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, 15.0F, -13.0F, -25.0F, 4, 5, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 6, -19.0F, -9.0F, 31.0F, 4, 6, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 0.0F, -5.0F, -13.0F, 20, 2, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -20.0F, -5.0F, -13.0F, 20, 2, 14, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -20.0F, -5.0F, 18.0F, 20, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -15.0F, -4.5F, 19.0F, 15, 1, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 0.0F, -4.5F, 19.0F, 15, 1, 15, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 0.0F, -7.0F, -32.0F, 15, 3, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -15.0F, -7.0F, -32.0F, 15, 3, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -20.0F, -5.0F, 1.0F, 20, 2, 17, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 0.0F, -5.0F, 1.0F, 20, 2, 17, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -15.0F, -7.0F, -22.0F, 15, 3, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 0.0F, -7.0F, -22.0F, 15, 3, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -18.0F, -15.0F, -6.0F, 2, 10, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -18.0F, -15.0F, 1.0F, 2, 10, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, -6.0F, 2, 10, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 1.0F, 2, 10, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 12.0F, 3, 2, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 12.0F, 3, 2, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 19.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 19.0F, 3, 7, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 20.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 20.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 21.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 21.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 22.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 23.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 24.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.2F, 25.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.2F, 25.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 26.0F, 3, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 31.0F, 3, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.3F, 33.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.0F, 34.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, -12.0F, 3, 10, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, -12.0F, 3, 10, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 17.0F, -12.0F, -42.0F, 2, 5, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -12.0F, -42.0F, 2, 5, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 5.0F, -22.2F, -3.6F, 14, 2, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -22.2F, -3.6F, 14, 2, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 14, -18.0F, -21.0F, 12.0F, 2, 6, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 14, 16.0F, -21.0F, 12.0F, 2, 6, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.0F, 35.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.1F, 36.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 0.0F, -5.0F, 18.0F, 20, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 26.0F, 3, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.3F, 33.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 31.0F, 3, 2, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.0F, 35.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.1F, 36.0F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.5F, 37.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.5F, 37.0F, 3, 6, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.5F, 38.0F, 3, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.5F, 38.0F, 3, 9, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 39.0F, 1, 11, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.0F, 34.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 33.0F, 3, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -15.0F, 33.0F, 3, 1, 6, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.4F, -13.0F, 3, 8, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.4F, -13.0F, 3, 8, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.1F, -14.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.1F, -14.0F, 3, 5, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -13.8F, -15.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -13.8F, -15.0F, 3, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -13.8F, -16.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -13.8F, -16.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.2F, -17.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.2F, -17.0F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -14.1F, -18.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -14.1F, -18.0F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -13.7F, -28.1F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -13.7F, -28.1F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -12.7F, -30.1F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -12.7F, -30.1F, 3, 1, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -12.4F, -31.1F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -12.4F, -31.1F, 3, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -12.4F, -32.1F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -12.4F, -32.1F, 3, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -16.0F, -15.0F, -14.0F, 16, 8, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 0.0F, -15.0F, -14.0F, 16, 8, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 162, 17, -15.0F, -18.0F, 35.5F, 1, 4, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 162, 17, 14.0F, -18.0F, 35.5F, 1, 4, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -11.0F, -12.0F, -42.0F, 1, 5, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 10.0F, -12.0F, -42.0F, 1, 5, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 11.0F, -12.0F, -42.0F, 6, 2, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 11.0F, -8.0F, -42.0F, 6, 1, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -17.0F, -12.0F, -42.0F, 6, 2, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -17.0F, -8.0F, -42.0F, 6, 1, 10, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 150, 13, -17.0F, -10.0F, -41.7F, 6, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 150, 13, 11.0F, -10.0F, -41.7F, 6, 2, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 148, 26, -10.0F, -11.0F, -41.7F, 10, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 148, 26, 0.0F, -11.0F, -41.7F, 10, 3, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 148, 32, -5.0F, -6.0F, -42.0F, 10, 4, 1, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -17.0F, -15.0F, 39.0F, 1, 11, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -18.0F, -15.0F, 39.0F, 1, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -18.0F, -7.0F, 39.0F, 1, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -15.0F, 39.0F, 1, 11, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 17.0F, -15.0F, 39.0F, 1, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 18.0F, -15.0F, 39.0F, 1, 11, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 17.0F, -7.0F, 39.0F, 1, 2, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 23, -18.0F, -13.0F, 38.6F, 1, 6, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 142, 23, 17.0F, -13.0F, 38.6F, 1, 6, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 154, 17, 18.6F, -9.0F, -41.0F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 154, 17, 18.6F, -10.7F, -41.0F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 154, 17, -19.6F, -9.0F, -41.0F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 154, 17, -19.6F, -10.7F, -41.0F, 1, 1, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 3.0F, -22.2F, -3.6F, 1, 1, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -4.0F, -22.2F, -3.6F, 1, 1, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 8, -5.0F, -22.2F, -3.6F, 1, 1, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 8, 4.0F, -22.2F, -3.6F, 1, 1, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 139, 8, -3.0F, -22.2F, -3.6F, 6, 1, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -9.0F, 12.0F, 3, 4, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -9.0F, 12.0F, 3, 4, 7, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -13.0F, 12.0F, 3, 4, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -19.0F, -13.0F, 12.0F, 3, 4, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, 16.0F, -13.0F, 14.0F, 2, 4, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 27, 18, -18.0F, -13.0F, 14.0F, 2, 4, 5, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 32, 36, -5.0F, -21.2F, -3.6F, 10, 1, 18, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 137, 9, 16.5F, -13.0F, 6.0F, 2, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 137, 9, -18.5F, -13.0F, 6.0F, 2, 1, 3, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 325, 32, -16.0F, -16.0F, -13.0F, 16, 5, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 325, 32, 0.0F, -16.0F, -13.0F, 16, 5, 9, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 325, 32, -14.0F, -9.0F, 1.0F, 10, 4, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 325, 32, 4.0F, -9.0F, 1.0F, 10, 4, 11, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 308, 27, -3.5F, -8.0F, -14.0F, 7, 3, 29, 0.0F, false));

        registerLightEntries(
                new LightControllerEntry<>(1.0F, headlights, rearlights),
                new LightControllerEntry<>(0.8F, interier),
                new LightControllerEntry<>(0.6F, plate),
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
        bone25.render(1.0F);
        bone26.render(1.0F);
        bone31.render(1.0F);
        bone32.render(1.0F);
        bone34.render(1.0F);
        bone36.render(1.0F);
        bone37.render(1.0F);
        bone40.render(1.0F);
        bone44.render(1.0F);
        bone47.render(1.0F);
        bone48.render(1.0F);
        bone49.render(1.0F);
        bone50.render(1.0F);
        bone52.render(1.0F);
        bone53.render(1.0F);
        bone54.render(1.0F);
        bone55.render(1.0F);
        bone56.render(1.0F);
        bone57.render(1.0F);
        bone58.render(1.0F);
        bone59.render(1.0F);
        bone68.render(1.0F);
        bb_main.render(1.0F);
    }
}
