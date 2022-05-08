package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class JB4_Tune extends PerformanceMod {

    @Override
    public int getId() {
        return 2;
    }

    @Override
    public String getName() {
        return "JB4 Tune";
    }

    @Override
    public String getDescription() {
        return "Focuses on Turbo PSI increase, safer for blown engine risk.";
    }

    @Override
    public ModType getModType() {
        return ModType.TUNE;
    }

    @Override
    public int getPrice() {
        return 700;
    }

    @Override
    public int getHpAdded() {
        return 85;
    }

    @Override
    public boolean isRisky() {
        return false;
    }
}
