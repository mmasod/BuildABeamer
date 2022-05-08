package me.minamasody.bimmerbuilder.cars.performance;

public abstract class PerformanceMod {

    public abstract int getId();
    public abstract String getName();
    public abstract String getDescription();
    public abstract ModType getModType();
    public abstract int getPrice();
    public abstract int getHpAdded();
    public abstract boolean isRisky();
}
