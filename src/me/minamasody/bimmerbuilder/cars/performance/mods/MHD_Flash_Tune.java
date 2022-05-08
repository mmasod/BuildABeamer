package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class MHD_Flash_Tune extends PerformanceMod {

    @Override
    public int getId() {
        return 3;
    }

    @Override
    public String getName() {
        return "MHD Flash";
    }

    @Override
    public String getDescription() {
        return "Tune that is only good for M cars! Extremely risky on non-M cars.";
    }

    @Override
    public ModType getModType() {
        return ModType.TUNE;
    }

    @Override
    public int getPrice() {
        return 350;
    }

    @Override
    public int getHpAdded() {
        return 130;
    }

    @Override
    public boolean isRisky() {
        return true;
    }
}
