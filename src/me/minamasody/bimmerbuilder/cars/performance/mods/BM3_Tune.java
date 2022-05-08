package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class BM3_Tune extends PerformanceMod {

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "BM3 Tune";
    }

    @Override
    public String getDescription() {
        return "Tune that adds 80 horsepower, boosts reliability safely.";
    }

    @Override
    public ModType getModType() {
        return ModType.TUNE;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public int getHpAdded() {
        return 80;
    }

    @Override
    public boolean isRisky() {
        return false;
    }
}
