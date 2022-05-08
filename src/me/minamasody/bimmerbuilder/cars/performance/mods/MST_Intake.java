package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class MST_Intake extends PerformanceMod {

    @Override
    public int getId() {
        return 4;
    }

    @Override
    public String getName() {
        return "MST Intake";
    }

    @Override
    public String getDescription() {
        return "Converts all air intake to cold air for the turbo. Increases fuel economy, and is the base of all modifications. Loud noise.";
    }

    @Override
    public ModType getModType() {
        return ModType.TURBO;
    }

    @Override
    public int getPrice() {
        return 500;
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
