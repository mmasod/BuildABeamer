package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class M_Performance_Exhaust extends PerformanceMod {

    @Override
    public int getId() {
        return 8;
    }

    @Override
    public String getName() {
        return "M Performance Exhaust";
    }

    @Override
    public String getDescription() {
        return "Increases the noise of the exhaust, lowers the tone deeply. 5/10 (0 quiet, 10 loudest)";
    }

    @Override
    public ModType getModType() {
        return ModType.EXHAUST;
    }

    @Override
    public int getPrice() {
        return 2400;
    }

    @Override
    public int getHpAdded() {
        return 3;
    }

    @Override
    public boolean isRisky() {
        return false;
    }
}
