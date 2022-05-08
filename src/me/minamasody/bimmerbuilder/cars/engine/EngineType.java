package me.minamasody.bimmerbuilder.cars.engine;

public enum EngineType {
    B58("B58", 320, 6, 3.0, true),
    S55("S55", 430, 6, 3.0, true),
    S58("S58", 503, 6, 3.0, true),
    S68("S68", 617, 8, 4.4, false),
    N55("N55", 400, 6, 3.0, true),
    ;

    private String name;
    private int stockHP;
    private int cylinders;
    private double liter;
    private boolean inline;

    EngineType(String name, int stockHP, int cylinders, double liter,boolean inline) {
        this.name = name;
        this.stockHP = stockHP;
        this.cylinders = cylinders;
        this.inline = inline;
        this.liter = liter;
    }

    public double getLiter() {
        return liter;
    }

    public String getName() {
        return name;
    }

    public int getStockHP() {
        return stockHP;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isInline() {
        return inline;
    }
}
