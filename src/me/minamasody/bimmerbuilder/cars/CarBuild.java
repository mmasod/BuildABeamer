package me.minamasody.bimmerbuilder.cars;

import me.minamasody.bimmerbuilder.cars.type.ModelType;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;

import java.util.List;

public class CarBuild {

    private String name;
    private ModelType model;
    private List<PerformanceMod> mods;
    private int hp;
    private int price;
    private int safety;
    private double accel_0_60;

    public CarBuild(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelType getModel() {
        return model;
    }

    public void setModel(ModelType model) {
        this.model = model;
    }

    public List<PerformanceMod> getMods() {
        return mods;
    }

    public void setMods(List<PerformanceMod> mods) {
        this.mods = mods;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSafety() {
        return safety;
    }

    public void setSafety(int safety) {
        this.safety = safety;
    }

    public double getAccel_0_60() {
        return accel_0_60;
    }

    public void setAccel_0_60(double accel_0_60) {
        this.accel_0_60 = accel_0_60;
    }
}
