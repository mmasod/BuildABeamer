package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class Amytrix_Exhaust extends PerformanceMod {

    @Override
    public int getId() {
        return 9;
    }

    @Override
    public String getName() {
        return "Amytrix Exhaust";
    }

    @Override
    public String getDescription() {
        return "Loud pops! Sounds like rockets! 11/10 (0 quiet, 10 loudest)";
    }

    @Override
    public ModType getModType() {
        return ModType.EXHAUST;
    }

    @Override
    public int getPrice() {
        return 3100;
    }

    @Override
    public int getHpAdded() {
        return 5;
    }

    @Override
    public boolean isRisky() {
        return false;
    }

}
