package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class M_Suspension extends PerformanceMod {

    @Override
    public int getId() {
        return 11;
    }

    @Override
    public String getName() {
        return "M Suspension";
    }

    @Override
    public String getDescription() {
        return "Go around curves at over 80mph, handle your car like a beast";
    }

    @Override
    public ModType getModType() {
        return ModType.DRIVETRAIN;
    }

    @Override
    public int getPrice() {
        return 1800;
    }

    @Override
    public int getHpAdded() {
        return 2;
    }

    @Override
    public boolean isRisky() {
        return false;
    }
}
