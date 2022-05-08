package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class Dyno_Tune extends PerformanceMod {

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String getName() {
        return "Dyno Tune";
    }

    @Override
    public String getDescription() {
        return "EXTREMELY RISKY. Only for cars capable(New M models F90 and G8X).";
    }

    @Override
    public ModType getModType() {
        return ModType.TUNE;
    }

    @Override
    public int getPrice() {
        return 1600;
    }

    @Override
    public int getHpAdded() {
        return 300;
    }

    @Override
    public boolean isRisky() {
        return true;
    }
}
