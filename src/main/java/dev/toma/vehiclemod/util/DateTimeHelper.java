package dev.toma.vehiclemod.util;

import java.time.LocalDate;

public class DateTimeHelper {

    public static boolean isAprilFools() {
        LocalDate date = LocalDate.now();
        return date.getDayOfMonth() == 1 && date.getMonthValue() == 4;
    }
}
