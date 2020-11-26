package dev.toma.vehiclemod.client.model.vehicle;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTracerT1 extends ModelVehicle{

    private final ModelRenderer Wheels;
    private final ModelRenderer Chasis;
    private final ModelRenderer bone;

    public ModelTracerT1() {
        textureWidth = 512;
        textureHeight = 512;

        Wheels = new ModelRenderer(this);
        Wheels.setRotationPoint(-19.7882F, -0.8471F, 0.9412F);
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 14.0882F, -5.5529F, 34.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 14.0882F, -11.5529F, 28.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 14.0882F, 0.4471F, 28.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 14.0882F, -5.5529F, 22.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 13.8882F, -5.5529F, -29.9412F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 13.8882F, -11.5529F, -35.9412F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 13.8882F, 0.4471F, -35.9412F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, 13.8882F, -5.5529F, -41.9412F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.5118F, -5.5529F, 34.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.5118F, -11.5529F, 28.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.5118F, 0.4471F, 28.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.5118F, -5.5529F, 22.0588F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.4118F, -5.5529F, -29.9412F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.4118F, -11.5529F, -35.9412F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.4118F, 0.4471F, -35.9412F, 7, 8, 8, 0.0F, false));
        Wheels.cubeList.add(new ModelBox(Wheels, 137, 13, -23.4118F, -5.5529F, -41.9412F, 7, 8, 8, 0.0F, false));

        ModelRenderer bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(22.2882F, -2.1529F, 32.0588F);
        setRotationAngle(bone22, -0.7854F, 0.0F, 0.0F);
        Wheels.addChild(bone22);
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.2F, -3.5757F, 2.4243F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.2F, -9.5757F, -3.5757F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.2F, -3.5757F, -9.5757F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.2F, 2.4243F, -3.5757F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.4F, 41.6791F, -42.8306F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.4F, 35.6791F, -48.8306F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.4F, 41.6791F, -54.8306F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -8.4F, 47.6791F, -48.8306F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.8F, -3.5757F, 2.4243F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.8F, -9.5757F, -3.5757F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.8F, -3.5757F, -9.5757F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.8F, 2.4243F, -3.5757F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.7F, 41.6791F, -42.8306F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.7F, 35.6791F, -48.8306F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.7F, 41.6791F, -54.8306F, 7, 8, 8, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 137, 13, -45.7F, 47.6791F, -48.8306F, 7, 8, 8, 0.0F, false));

        Chasis = new ModelRenderer(this);
        Chasis.setRotationPoint(0.0F, 24.0F, 0.0F);

        ModelRenderer bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
        Chasis.addChild(bone43);
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -28.4F, -32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -27.4F, -33.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -26.4F, -32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -27.4F, -31.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -28.4F, -32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -27.4F, -33.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -26.4F, -32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -27.4F, -31.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -28.4F, 32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -27.4F, 31.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -26.4F, 32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -13.0F, -27.4F, 33.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -28.4F, 32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -27.4F, 31.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -26.4F, 32.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -44.0F, -27.4F, 33.0F, 15, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -28.4F, 32.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -27.4F, 31.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -26.4F, 32.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -27.4F, 33.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -28.4F, -32.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -27.4F, -33.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -26.4F, -32.0F, 16, 2, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 195, 0, -29.0F, -27.4F, -31.0F, 16, 2, 2, 0.0F, false));

        ModelRenderer bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(3.0F, -27.0F, -44.0F);
        setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
        bone43.addChild(bone44);
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -9.7681F, 7.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -10.7681F, 8.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -9.7681F, 9.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -8.7681F, 8.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -9.7681F, 7.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -10.7681F, 8.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -9.7681F, 9.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -8.7681F, 8.6167F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -55.023F, 52.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -56.023F, 53.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -55.023F, 54.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -16.0F, -54.023F, 53.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -55.023F, 52.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -56.023F, 53.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -55.023F, 54.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -47.0F, -54.023F, 53.8715F, 15, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -56.023F, 53.8715F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -55.023F, 52.8715F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -54.023F, 53.8715F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -55.023F, 54.8715F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -10.7681F, 8.6167F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -9.7681F, 7.6167F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -8.7681F, 8.6167F, 16, 2, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 195, 0, -32.0F, -9.7681F, 9.6167F, 16, 2, 2, 0.0F, false));

        ModelRenderer bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(-1.0F, -4.0F, 0.0F);
        Chasis.addChild(bone42);
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -21.0F, -22.4F, -31.4F, 2, 2, 39, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -21.0F, -24.4F, -31.4F, 2, 2, 39, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -22.0F, -23.4F, -32.4F, 2, 2, 40, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -20.0F, -23.4F, -32.4F, 2, 2, 40, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -21.0F, -22.4F, 7.6F, 2, 2, 26, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -21.0F, -24.4F, 7.6F, 2, 2, 26, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -22.0F, -23.4F, 7.6F, 2, 2, 26, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 195, 0, -20.0F, -23.4F, 7.6F, 2, 2, 26, 0.0F, false));

        ModelRenderer bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(-20.0F, -23.0F, -27.9F);
        setRotationAngle(bone45, 0.0F, 0.0F, 0.7854F);
        bone42.addChild(bone45);
        bone45.cubeList.add(new ModelBox(bone45, 195, 0, -0.5757F, -1.5757F, -3.5F, 2, 2, 39, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 195, 0, -1.5757F, -0.5757F, -3.5F, 2, 2, 39, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 195, 0, -0.5757F, 0.4243F, -3.5F, 2, 2, 39, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 197, 0, 0.4243F, -0.5757F, -3.5F, 2, 2, 39, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 195, 0, -0.5757F, -1.5757F, 35.5F, 2, 2, 26, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 195, 0, -1.5757F, -0.5757F, 35.5F, 2, 2, 26, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 195, 0, -0.5757F, 0.4243F, 35.5F, 2, 2, 26, 0.0F, false));
        bone45.cubeList.add(new ModelBox(bone45, 195, 0, 0.4243F, -0.5757F, 35.5F, 2, 2, 26, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -30.0F, -21.0F, 20, 3, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -34.0F, -21.0F, 2, 11, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -41.0F, -30.0F, -21.0F, 20, 3, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -34.0F, -21.0F, 2, 11, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -34.0F, 12.0F, 3, 11, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -45.0F, -23.0F, 3.0F, 2, 1, 20, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -30.0F, 3.0F, 20, 3, 20, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -34.0F, 12.0F, 3, 11, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -36.0F, 23.0F, 16, 9, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -37.0F, -36.0F, 23.0F, 16, 9, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.1F, -30.0F, 44.0F, 23, 8, 13, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.7F, -30.0F, 44.0F, 11, 8, 13, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -31.4F, -66.0F, 20, 8, 25, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -41.0F, -31.4F, -66.0F, 20, 8, 25, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -23.4F, -70.0F, 23, 1, 28, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -23.4F, -70.0F, 23, 1, 28, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -41.0F, -30.0F, 3.0F, 20, 3, 20, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -45.0F, -23.0F, -21.0F, 2, 1, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -23.0F, -21.0F, 2, 1, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -23.0F, 3.0F, 2, 1, 20, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -38.8F, -21.0F, 22, 9, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -38.8F, -21.0F, 22, 9, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -39.0F, -21.0F, 3, 5, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -39.0F, 12.0F, 3, 5, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -39.0F, -21.0F, 3, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -39.0F, 12.0F, 3, 5, 11, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -52.2F, -2.0F, 23, 3, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -52.2F, -2.0F, 23, 3, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -39.0F, 23.0F, 3, 2, 17, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -39.0F, 23.0F, 3, 2, 17, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -41.0F, -39.0F, 18.0F, 4, 2, 22, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.0F, -39.0F, 18.0F, 4, 2, 22, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -39.0F, 15.0F, 22, 12, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -39.0F, 15.0F, 22, 12, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -34.0F, 44.0F, 23, 4, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -34.0F, 44.0F, 23, 4, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -37.0F, -37.0F, 23.0F, 16, 9, 16, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -37.0F, 23.0F, 16, 9, 16, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -39.0F, 4.0F, 2, 5, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -34.0F, 4.0F, 2, 11, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -34.0F, 4.0F, 2, 11, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -39.0F, 4.0F, 2, 5, 8, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -34.0F, -10.0F, 2, 11, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -39.0F, -10.0F, 2, 5, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -34.0F, -11.0F, 2, 11, 15, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -39.0F, -11.0F, 2, 5, 15, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 381, 174, -37.0F, -38.0F, 18.0F, 16, 1, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 381, 174, -21.0F, -38.0F, 18.0F, 16, 1, 21, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -30.0F, 57.0F, 4, 5, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -30.0F, 57.0F, 4, 5, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 236, 32, 1.0F, -36.0F, 6.0F, 1, 1, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 236, 32, -44.0F, -36.0F, 6.0F, 1, 1, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -34.0F, -21.0F, 1, 11, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -34.0F, -13.0F, 1, 12, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -34.0F, -19.0F, 1, 2, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -26.0F, -19.0F, 1, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -34.0F, -13.0F, 1, 12, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -34.0F, -19.0F, 1, 2, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -34.0F, -21.0F, 1, 11, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -44.0F, -26.0F, -19.0F, 1, 3, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -49.2F, -2.0F, 1, 1, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -49.2F, -2.0F, 1, 1, 24, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 424, 140, -1.5F, -29.5F, 59.3F, 3, 4, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 424, 140, -43.5F, -29.5F, 59.3F, 3, 4, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 439, 247, -1.0F, -29.3F, 59.5F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 501, 250, -1.0F, -28.0F, 59.5F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 501, 250, -1.0F, -26.7F, 59.5F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 501, 250, -43.0F, -26.7F, 59.5F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 501, 250, -43.0F, -28.0F, 59.5F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 439, 247, -43.0F, -29.3F, 59.5F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -29.0F, -30.0F, 44.0F, 8, 8, 13, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -43.0F, -37.0F, 17.0F, 22, 10, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, -37.0F, 17.0F, 22, 10, 6, 0.0F, false));

        ModelRenderer bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-21.0F, -30.5F, -56.0F);
        setRotationAngle(bone2, 0.1745F, 0.0F, 0.0F);
        bone.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -20.0F, -4.1558F, -9.9583F, 16, 7, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 4.0F, -4.1558F, -9.9583F, 16, 7, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 18.0F, -3.1558F, -9.9583F, 0, 5, 25, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -18.0F, -3.1558F, -8.9583F, 0, 5, 24, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -4.0F, -4.1558F, -9.9583F, 8, 7, 7, 0.0F, false));

        ModelRenderer bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(bone6, -0.0873F, 0.0F, 0.0F);
        bone2.addChild(bone6);
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, 0.0F, -5.3558F, 13.6417F, 17, 6, 23, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -17.0F, -5.3558F, 13.6417F, 17, 6, 23, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -23.0F, -5.3558F, 13.6417F, 6, 1, 26, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, 17.0F, -5.3558F, 13.6417F, 6, 1, 26, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 16.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 14.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 12.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 10.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 8.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 6.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 4.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 2.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, 0.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -2.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -4.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -6.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -8.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -10.3F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -12.7F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -14.9F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 423, 156, -17.0F, -5.3558F, 36.7417F, 1, 1, 3, 0.0F, false));

        ModelRenderer bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(-18.5F, -3.6558F, -0.4583F);
        setRotationAngle(bone7, 0.0F, -0.0698F, 0.0F);
        bone2.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -3.5F, -0.5F, -9.2F, 3, 1, 24, 0.0F, false));

        ModelRenderer bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(18.0F, -3.6558F, -0.4583F);
        setRotationAngle(bone8, 0.0F, 0.0698F, 0.0F);
        bone2.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 1.0F, -0.5F, -9.2F, 3, 1, 24, 0.0F, false));

        ModelRenderer bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(bone32, 0.0524F, 0.0F, 0.0F);
        bone2.addChild(bone32);
        bone32.cubeList.add(new ModelBox(bone32, 0, 0, -4.0F, -3.3558F, -2.5583F, 8, 7, 17, 0.0F, false));

        ModelRenderer bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-21.0F, -21.9F, -56.0F);
        setRotationAngle(bone3, -0.0873F, 0.0F, 0.0F);
        bone.addChild(bone3);

        ModelRenderer bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(1.5F, -24.4F, -57.0F);
        setRotationAngle(bone4, 0.0F, 0.0F, -0.2618F);
        bone.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -3.5F, -7.0F, -9.0F, 3, 8, 24, 0.0F, false));

        ModelRenderer bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(-43.5F, -24.4F, -57.0F);
        setRotationAngle(bone5, 0.0F, 0.0F, 0.2618F);
        bone.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, 0.5F, -7.0F, -9.0F, 3, 8, 24, 0.0F, false));

        ModelRenderer bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-21.0F, -27.4F, -72.0F);
        setRotationAngle(bone9, -0.1745F, 0.0F, 0.0F);
        bone.addChild(bone9);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, -5.0F, 5.0F, 20, 8, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -20.0F, -5.0F, 5.0F, 20, 8, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 472, 133, -18.0F, -4.0F, 4.8F, 11, 5, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 472, 133, 7.0F, -4.0F, 4.8F, 11, 5, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 357, 200, 7.5F, -2.5F, 4.7F, 9, 3, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 357, 200, -16.5F, -2.5F, 4.7F, 9, 3, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 371, 243, 16.5F, -2.5F, 4.7F, 1, 3, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 371, 243, -17.5F, -2.5F, 4.7F, 1, 3, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 439, 184, -2.5F, -2.5F, 4.7F, 1, 3, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 439, 184, 1.5F, -2.5F, 4.7F, 1, 3, 3, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 439, 184, -0.5F, -1.5F, 4.7F, 1, 3, 3, 0.0F, false));

        ModelRenderer bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(0.0F, -3.5F, 4.3F);
        setRotationAngle(bone31, 0.4363F, 0.0F, 0.0F);
        bone9.addChild(bone31);
        bone31.cubeList.add(new ModelBox(bone31, 472, 133, 7.0F, 0.2879F, -0.0326F, 11, 1, 1, 0.0F, false));
        bone31.cubeList.add(new ModelBox(bone31, 472, 133, -18.0F, 0.2879F, -0.0326F, 11, 1, 1, 0.0F, false));

        ModelRenderer bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(-21.25F, -26.0F, 57.5F);
        setRotationAngle(bone10, 0.1745F, 0.0F, 0.0F);
        bone.addChild(bone10);

        ModelRenderer bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(-21.0F, -40.5F, -9.0F);
        setRotationAngle(bone11, 0.6981F, 0.0F, 0.0F);
        bone.addChild(bone11);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 20.0F, -4.5F, -8.0F, 3, 3, 21, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -23.0F, -4.5F, -8.0F, 3, 3, 21, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 44, 56, 0.0F, -4.5F, 11.0F, 20, 3, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 19.9F, 23.0F, 20.0F, 3, 2, 5, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -22.9F, 23.0F, 20.0F, 3, 2, 5, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 16.8F, -17.4F, -32.7F, 3, 2, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -19.8F, -17.4F, -32.7F, 3, 2, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, 20.1F, -11.388F, -23.9661F, 3, 0, 0, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 44, 56, -20.0F, -4.5F, 11.0F, 20, 3, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 44, 56, -20.0F, -4.5F, -8.0F, 20, 3, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 44, 56, 0.0F, -4.5F, -8.0F, 20, 3, 2, 0.0F, false));

        ModelRenderer bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 9.0F, 26.5F);
        setRotationAngle(bone14, 0.8727F, 0.0F, 0.0F);
        bone11.addChild(bone14);
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, -23.0F, 3.5F, -12.1F, 3, 3, 11, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, 20.0F, 3.5F, -12.1F, 3, 3, 11, 0.0F, false));

        ModelRenderer bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(1.5F, -3.0F, 23.5F);
        setRotationAngle(bone35, -0.3491F, 0.0F, 0.0F);
        bone11.addChild(bone35);
        bone35.cubeList.add(new ModelBox(bone35, 318, 32, -1.5F, 3.5F, -8.5F, 1, 1, 13, 0.0F, false));

        ModelRenderer bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(-21.0F, -50.7F, 34.0F);
        setRotationAngle(bone12, -0.4363F, 0.0F, 0.0F);
        bone.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -23.0F, 3.8F, -11.5F, 5, 3, 22, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 18.0F, 3.8F, -11.5F, 5, 3, 22, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -18.0F, 3.8F, -11.5F, 18, 3, 6, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 0.0F, 3.8F, -11.5F, 18, 3, 6, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -22.8F, 34.8002F, -46.1727F, 5, 1, 3, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 17.9F, 34.8002F, -46.1727F, 5, 1, 3, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, -22.0F, 6.8F, -8.5F, 2, 2, 19, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 20.0F, 6.8F, -8.5F, 2, 2, 19, 0.0F, false));

        ModelRenderer bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 5.2F, 21.5F);
        setRotationAngle(bone13, -0.1745F, 0.0F, 0.0F);
        bone12.addChild(bone13);
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -23.0F, 0.5F, -11.1F, 5, 6, 22, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 18.0F, 0.5F, -11.1F, 5, 6, 22, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 40, 0.0F, 5.5F, -11.0F, 20, 2, 22, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 40, -20.0F, 5.5F, -11.0F, 20, 2, 22, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -23.0F, 6.5F, -1.0F, 1, 2, 5, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 21.0F, 6.5F, -1.0F, 2, 2, 5, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -20.0F, 1.5F, -11.1F, 20, 5, 10, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 0.0F, 1.5F, -11.1F, 20, 5, 10, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -2.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -5.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -8.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -11.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -14.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -17.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 16.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 13.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 10.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 7.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 4.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 1.0F, 1.5F, -1.0F, 1, 3, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 0.0F, 1.5F, 4.9F, 20, 5, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -20.0F, 1.5F, 4.9F, 20, 5, 6, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -17.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -14.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -11.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -8.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -5.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, -2.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 1.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 4.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 7.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 10.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 13.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 410, 147, 16.0F, 1.5F, 10.9F, 1, 3, 1, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 132, 12, -20.0F, 4.5F, -11.0F, 20, 1, 22, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 132, 12, 0.0F, 4.5F, -11.0F, 20, 1, 22, 0.0F, false));

        ModelRenderer bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(bone33, -0.6981F, 0.0F, 0.0F);
        bone13.addChild(bone33);
        bone33.cubeList.add(new ModelBox(bone33, 21, 39, 0.0F, 3.3F, -6.5F, 18, 5, 1, 0.0F, false));
        bone33.cubeList.add(new ModelBox(bone33, 21, 39, -18.0F, 3.3F, -6.5F, 18, 5, 1, 0.0F, false));

        ModelRenderer bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(bone34, -0.4363F, 0.0F, 0.0F);
        bone13.addChild(bone34);
        bone34.cubeList.add(new ModelBox(bone34, 21, 39, -1.0F, 2.3F, -7.1F, 2, 3, 6, 0.0F, false));

        ModelRenderer bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(2.5F, -22.5F, 50.5F);
        setRotationAngle(bone16, 0.0F, -0.0873F, 0.0F);
        bone.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -0.9F, -0.5F, -6.5F, 1, 1, 13, 0.0F, false));

        ModelRenderer bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(-44.5F, -22.5F, 50.5F);
        setRotationAngle(bone15, 0.0F, 0.0873F, 0.0F);
        bone.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, 0.0F, -0.5F, -6.5F, 1, 1, 13, 0.0F, false));

        ModelRenderer bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-21.0F, -24.5F, 57.5F);
        setRotationAngle(bone17, -1.0472F, 0.0F, 0.0F);
        bone.addChild(bone17);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -23.0F, -2.3F, -1.1F, 11, 4, 3, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, 0.0F, -2.3F, -1.1F, 23, 4, 3, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -8.0F, -2.3F, -1.1F, 8, 4, 3, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -13.0F, -2.3F, -1.1F, 5, 4, 1, 0.0F, false));

        ModelRenderer bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(-21.0F, -30.0F, -31.5F);
        bone.addChild(bone18);
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, 9.0F, -6.0F, -10.5F, 7, 6, 21, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 0, -16.0F, -6.0F, -10.5F, 7, 6, 21, 0.0F, false));

        ModelRenderer bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(bone19, 0.0873F, 0.0F, 0.0F);
        bone18.addChild(bone19);
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, 9.0F, -7.8F, -10.5F, 7, 3, 22, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, -16.0F, -7.8F, -10.5F, 7, 3, 22, 0.0F, false));

        ModelRenderer bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(2.5F, -38.5F, -13.0F);
        setRotationAngle(bone20, 0.5236F, 0.5236F, 0.0F);
        bone.addChild(bone20);
        bone20.cubeList.add(new ModelBox(bone20, 84, 88, 0.5F, -2.5F, -5.0F, 2, 1, 9, 0.0F, false));

        ModelRenderer bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(-44.5F, -38.5F, -13.0F);
        setRotationAngle(bone21, 0.5236F, -0.5236F, 0.0F);
        bone.addChild(bone21);
        bone21.cubeList.add(new ModelBox(bone21, 84, 88, -2.5F, -2.5F, -6.0F, 2, 1, 10, 0.0F, false));

        ModelRenderer bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(5.5F, -42.5F, -12.0F);
        setRotationAngle(bone23, 0.0F, -0.1745F, 0.0F);
        bone.addChild(bone23);
        bone23.cubeList.add(new ModelBox(bone23, 0, 0, -2.5F, -1.5F, -0.7F, 5, 3, 2, 0.0F, false));
        bone23.cubeList.add(new ModelBox(bone23, 237, 173, -2.0F, -1.0F, 0.4F, 4, 2, 1, 0.0F, false));

        ModelRenderer bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(-47.5F, -42.5F, -12.0F);
        setRotationAngle(bone24, 0.0F, 0.1745F, 0.0F);
        bone.addChild(bone24);
        bone24.cubeList.add(new ModelBox(bone24, 0, 0, -2.5F, -1.5F, -0.7F, 5, 3, 2, 0.0F, false));
        bone24.cubeList.add(new ModelBox(bone24, 228, 173, -2.0F, -1.0F, 0.4F, 4, 2, 1, 0.0F, false));

        ModelRenderer bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(2.0F, -29.0F, -13.5F);
        setRotationAngle(bone25, 0.0F, 0.8727F, 0.0F);
        bone.addChild(bone25);
        bone25.cubeList.add(new ModelBox(bone25, 312, 58, -1.0F, -3.0F, -1.5F, 2, 6, 1, 0.0F, false));

        ModelRenderer bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(2.0F, -29.0F, -15.5F);
        setRotationAngle(bone26, 0.0F, 0.8727F, 0.0F);
        bone.addChild(bone26);
        bone26.cubeList.add(new ModelBox(bone26, 312, 58, -1.0F, -3.0F, -1.5F, 2, 6, 1, 0.0F, false));

        ModelRenderer bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(2.0F, -29.0F, -17.5F);
        setRotationAngle(bone27, 0.0F, 0.8727F, 0.0F);
        bone.addChild(bone27);
        bone27.cubeList.add(new ModelBox(bone27, 312, 58, -1.0F, -3.0F, -1.5F, 2, 6, 1, 0.0F, false));

        ModelRenderer bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(-44.0F, -29.0F, -17.5F);
        setRotationAngle(bone28, 0.0F, -0.8727F, 0.0F);
        bone.addChild(bone28);
        bone28.cubeList.add(new ModelBox(bone28, 316, 56, -1.0F, -3.0F, -1.5F, 2, 6, 1, 0.0F, false));

        ModelRenderer bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(-44.0F, -29.0F, -15.5F);
        setRotationAngle(bone29, 0.0F, -0.8727F, 0.0F);
        bone.addChild(bone29);
        bone29.cubeList.add(new ModelBox(bone29, 316, 56, -1.0F, -3.0F, -1.5F, 2, 6, 1, 0.0F, false));

        ModelRenderer bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(-44.0F, -29.0F, -13.5F);
        setRotationAngle(bone30, 0.0F, -0.8727F, 0.0F);
        bone.addChild(bone30);
        bone30.cubeList.add(new ModelBox(bone30, 316, 56, -1.0F, -3.0F, -1.5F, 2, 6, 1, 0.0F, false));

        ModelRenderer bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(-31.0F, -22.5F, 54.5F);
        setRotationAngle(bone36, 0.0873F, 0.0F, 0.0F);
        bone.addChild(bone36);
        bone36.cubeList.add(new ModelBox(bone36, 416, 144, -1.5F, -2.1F, -6.5F, 3, 3, 13, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 416, 144, -3.5F, -2.1F, -13.5F, 7, 3, 7, 0.0F, false));

        ModelRenderer bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(-21.0F, -36.5F, -13.0F);
        setRotationAngle(bone37, 0.1745F, 0.0F, 0.0F);
        bone.addChild(bone37);
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 0.0F, -3.5F, -3.0F, 20, 7, 6, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, -20.0F, -3.5F, -3.0F, 20, 7, 6, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 9.0F, -3.5F, 2.0F, 5, 5, 3, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 10.0F, -2.5F, 5.0F, 3, 3, 2, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 11.0F, -1.5F, 7.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 8.0F, -1.5F, 8.0F, 7, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 11.0F, -4.5F, 8.0F, 1, 3, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 11.0F, -0.5F, 8.0F, 1, 3, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 12.0F, 1.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 14.0F, -0.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 13.0F, 0.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 13.0F, -3.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 14.0F, -2.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 12.0F, -4.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 10.0F, -4.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 9.0F, -3.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 8.0F, -2.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 8.0F, -0.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 9.0F, 0.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 320, 45, 10.0F, 1.5F, 8.0F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 438, 178, 17.0F, 1.5F, 2.2F, 2, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 246, 224, 17.0F, -2.5F, 2.2F, 2, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 80, 246, 18.0F, -0.5F, 2.2F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 448, 230, 16.0F, -0.5F, 2.2F, 1, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 222, 206, 6.0F, -2.5F, 2.2F, 2, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 280, 166, 5.0F, -0.5F, 2.2F, 2, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 176, 188, 6.0F, 1.5F, 2.2F, 2, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 174, 219, -3.0F, 0.5F, 2.2F, 6, 1, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 401, 179, -3.0F, -2.5F, 2.2F, 6, 3, 1, 0.0F, false));
        bone37.cubeList.add(new ModelBox(bone37, 404, 182, -19.0F, -2.5F, 2.2F, 4, 4, 1, 0.0F, false));

        ModelRenderer bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(-21.0F, -37.0F, 11.5F);
        setRotationAngle(bone38, -0.1745F, 0.0F, 0.0F);
        bone.addChild(bone38);
        bone38.cubeList.add(new ModelBox(bone38, 113, 202, -11.0F, -7.0F, -1.5F, 7, 14, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 113, 202, -18.0F, -7.0F, -1.5F, 7, 14, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 113, 202, 4.0F, -7.0F, -1.5F, 7, 14, 3, 0.0F, false));
        bone38.cubeList.add(new ModelBox(bone38, 113, 202, 11.0F, -7.0F, -1.5F, 7, 14, 3, 0.0F, false));

        ModelRenderer bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(-21.0F, -32.0F, 4.5F);
        setRotationAngle(bone39, -0.0873F, 0.0F, 0.0F);
        bone.addChild(bone39);
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, 11.0F, -1.3F, -5.5F, 7, 2, 11, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, 4.0F, -1.3F, -5.5F, 7, 2, 11, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, 11.0F, 0.7F, -5.5F, 7, 2, 11, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, 4.0F, 0.7F, -5.5F, 7, 2, 11, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, -11.0F, -1.3F, -5.5F, 7, 2, 11, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, -11.0F, 0.7F, -5.5F, 7, 2, 11, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, -18.0F, -1.3F, -5.5F, 7, 2, 11, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 113, 202, -18.0F, 0.7F, -5.5F, 7, 2, 11, 0.0F, false));

        ModelRenderer bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(-21.0F, -31.0F, -0.5F);
        setRotationAngle(bone40, -0.1745F, 0.0F, 0.0F);
        bone.addChild(bone40);
        bone40.cubeList.add(new ModelBox(bone40, 312, 36, -4.0F, -2.0F, -12.5F, 8, 4, 24, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 312, 36, 8.0F, 1.0F, -14.5F, 2, 1, 6, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 312, 36, 11.0F, 1.0F, -14.5F, 2, 1, 6, 0.0F, false));
        bone40.cubeList.add(new ModelBox(bone40, 312, 36, 14.0F, 1.0F, -14.5F, 2, 1, 6, 0.0F, false));

        ModelRenderer bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(0.2F, -6.5F, -0.5F);
        setRotationAngle(bone41, -0.2094F, 0.0F, 0.0F);
        bone40.addChild(bone41);
        bone41.cubeList.add(new ModelBox(bone41, 168, 241, -0.5F, 2.3F, 2.4F, 1, 1, 9, 0.0F, false));

        bone.offsetX = 22;
        Wheels.offsetX = 22;
        Chasis.offsetX = 22;
    }

    @Override
    public void renderModel() {
        Wheels.render(1f);
        Chasis.render(1f);
        bone.render(1f);
    }
}
