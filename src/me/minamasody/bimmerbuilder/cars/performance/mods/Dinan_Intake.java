package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class Dinan_Intake extends PerformanceMod {

    @Override
    public int getId() {
        return 5;
    }

    @Override
    public String getName() {
        return "Dinan Cold Intake";
    }

    @Override
    public String getDescription() {
        return "Converts all air intake to cold air for the turbo. Increases fuel economy, and is the base of all modifications. Lower noise.";
    }

    @Override
    public ModType getModType() {
        return ModType.TURBO;
    }

    @Override
    public int getPrice() {
        return 400;
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
