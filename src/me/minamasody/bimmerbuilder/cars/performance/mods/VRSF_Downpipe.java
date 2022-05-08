package me.minamasody.bimmerbuilder.cars.performance.mods;

import me.minamasody.bimmerbuilder.cars.performance.ModType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

public class VRSF_Downpipe extends PerformanceMod {

    @Override
    public int getId() {
        return 7;
    }

    @Override
    public String getName() {
        return "VRSF Downpipe";
    }

    @Override
    public String getDescription() {
        return "Takes away the WHOLE catalytic converter, increasing airflow by 40-50 horsepower.";
    }

    @Override
    public ModType getModType() {
        return ModType.EXHAUST;
    }

    @Override
    public int getPrice() {
        return 190;
    }

    @Override
    public int getHpAdded() {
        return 45;
    }

    @Override
    public boolean isRisky() {
        return false;
    }
}
