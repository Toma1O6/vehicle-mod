package dev.toma.vehiclemod.vehicle;

import java.util.function.Function;

public enum SpeedDisplayUnit {

    BLOCK_PER_SECOND("bps", s -> s),
    KILOMETRES_PER_HOUR("km/h", s -> s * 3.6D),
    MILES_PER_HOUR("mph", s -> s * 2.23693629D);

    private final Function<Double, Double> convertFunction;
    private final String unitName;

    SpeedDisplayUnit(String displayName, Function<Double, Double> convertFunction) {
        this.unitName = displayName;
        this.convertFunction = convertFunction;
    }

    public double getSpeed(double vehicleSpeed) {
        return convertFunction.apply(vehicleSpeed);
    }

    public String getDisplayString(double speed) {
        return Math.round(convertFunction.apply(speed)) + " " + unitName;
    }
}
