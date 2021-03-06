package dev.toma.vehiclemod.racing.argument;

import dev.toma.vehiclemod.racing.Race;
import net.minecraft.nbt.NBTTagCompound;

import java.util.HashMap;
import java.util.Map;

public final class ArgumentMap {

    final Map<ArgumentType<?>, Argument<?>> argumentTypeMap;

    public ArgumentMap() {
        this(new HashMap<>());
    }

    public ArgumentMap(Map<ArgumentType<?>, Argument<?>> map) {
        this.argumentTypeMap = map;
    }

    public ArgumentMap copy() {
        return new ArgumentMap(this.argumentTypeMap);
    }

    @SuppressWarnings("unchecked")
    public <T> void load(NBTTagCompound nbt, Race race) {
        for (ArgumentType<?> type : argumentTypeMap.keySet()) {
            Argument<T> argument = (Argument<T>) getArgument(type);
            ArgumentType.Parse<T> parser = (ArgumentType.Parse<T>) type.parser;
            argument.setValue(parser.parse(nbt, race), race);
        }
    }

    public <T> void registerArgument(ArgumentType<T> type) {
        registerArgument(type, type.factory.get());
    }

    public <T> void registerArgument(ArgumentType<T> type, Argument<T> argument) {
        Argument<?> arg = argumentTypeMap.put(type, argument);
        if(arg != null) {
            throw new IllegalArgumentException("Duplicate argument for " + type.key + " key!");
        }
    }

    @SuppressWarnings("unchecked")
    public <T> Argument<T> getArgument(ArgumentType<T> type) {
        Argument<T> argument = (Argument<T>) argumentTypeMap.get(type);
        if(argument == null) {
            argument = type.factory.get();
        }
        return argument;
    }

    public <T> T getValue(ArgumentType<T> type) {
        return this.getArgument(type).getValue();
    }
}
