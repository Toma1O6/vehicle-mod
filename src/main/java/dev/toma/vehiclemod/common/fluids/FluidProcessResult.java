package dev.toma.vehiclemod.common.fluids;

import java.util.function.Supplier;

public class FluidProcessResult {

    private final Supplier<FluidType> type;
    private final int resultAmount;
    private final int requiredAmount;

    public FluidProcessResult(Supplier<FluidType> type, int resultAmount, int requiredAmount) {
        this.type = type;
        this.resultAmount = resultAmount;
        this.requiredAmount = requiredAmount;
    }

    public FluidType getType() {
        return type.get();
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public int getResultAmount() {
        return resultAmount;
    }
}
