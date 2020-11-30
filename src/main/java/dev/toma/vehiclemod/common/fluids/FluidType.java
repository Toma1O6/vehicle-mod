package dev.toma.vehiclemod.common.fluids;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.function.Supplier;

public class FluidType extends IForgeRegistryEntry.Impl<FluidType> {

    private ITextComponent displayName;
    /** Color in RGB format */
    private final int fluidColor;
    private final FluidProcessResult result;
    private final FluidItemBehavior fluidItemBehavior;

    FluidType(Builder builder) {
        this.fluidColor = builder.color;
        this.result = builder.result;
        this.fluidItemBehavior = builder.fluidItemBehavior;
    }

    public ITextComponent getDisplayName() {
        if(displayName == null)
            displayName = new TextComponentTranslation("fluid." + this.getRegistryName().toString());
        return displayName;
    }

    public boolean hasFluidHolder() {
        return fluidItemBehavior != null && fluidItemBehavior.getFluidItem() != null;
    }

    public boolean hasFluidItemBehavior() {
        return fluidItemBehavior != null;
    }

    public FluidItemBehavior getBehavior() {
        return fluidItemBehavior;
    }

    public boolean hasResult() {
        return result != null;
    }

    public int getFluidColor() {
        return fluidColor;
    }

    public FluidProcessResult getProcessResult() {
        return result;
    }

    public static class Builder {

        private int color;
        private FluidProcessResult result;
        private FluidItemBehavior fluidItemBehavior;

        public Builder fluidColor(int colorRGB) {
            this.color = colorRGB;
            return this;
        }

        public Builder processInto(Supplier<FluidType> type, int resultAmount, int requiredAmount, int processTime) {
            this.result = new FluidProcessResult(type, resultAmount, requiredAmount, processTime);
            return this;
        }

        public Builder behavior(FluidItemBehavior behavior) {
            this.fluidItemBehavior = behavior;
            return this;
        }

        public FluidType build() {
            return new FluidType(this);
        }
    }
}
