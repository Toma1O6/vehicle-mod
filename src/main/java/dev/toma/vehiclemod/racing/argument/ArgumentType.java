package dev.toma.vehiclemod.racing.argument;

import dev.toma.vehiclemod.racing.Race;
import net.minecraft.nbt.NBTTagCompound;

import java.util.function.Supplier;

public class ArgumentType<T> {

    final String key;
    final Supplier<Argument<T>> factory;
    final Parse<T> parser;

    public ArgumentType(String key, Supplier<Argument<T>> factory, Parse<T> parser) {
        this.key = key;
        this.factory = factory;
        this.parser = parser;
    }

    public String getKey() {
        return key;
    }

    public interface Parse<T> {
        T parse(NBTTagCompound nbt, Race race);
    }
}
