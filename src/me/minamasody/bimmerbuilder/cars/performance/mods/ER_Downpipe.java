package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class ER_Downpipe  extends PerformanceMod {

    @Override
    public int getId() {
        return 6;
    }

    @Override
    public String getName() {
        return "Evolution Racewerks Downpipe";
    }

    @Override
    public String getDescription() {
        return "Takes away the Catalytic filters, increasing airflow by 20-40 horsepower.";
    }

    @Override
    public ModType getModType() {
        return ModType.EXHAUST;
    }

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public int getHpAdded() {
        return 30;
    }

    @Override
    public boolean isRisky() {
        return false;
    }
}
