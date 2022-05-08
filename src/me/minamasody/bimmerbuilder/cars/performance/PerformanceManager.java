package me.minamasody.bimmerbuilder.cars.performance;

import me.minamasody.bimmerbuilder.cars.performance.mods.*;

import java.util.ArrayList;
import java.util.List;

public class PerformanceManager {

    private static List<PerformanceMod> mods = new ArrayList<>();

    public static List<PerformanceMod> getMods() {
        return mods;
    }

    public static void loadMods(){
        mods.add(new BM3_Tune());
        mods.add(new Dyno_Tune());
        mods.add(new JB4_Tune());
        mods.add(new MHD_Flash_Tune());

        mods.add(new Amytrix_Exhaust());
        mods.add(new Dinan_Exhaust());
        mods.add(new Dinan_Intake());
        mods.add(new ER_Downpipe());
        mods.add(new M_Performance_Exhaust());
        mods.add(new M_Suspension());
        mods.add(new MST_Intake());
        mods.add(new VRSF_Downpipe());
    }

    public static PerformanceMod getMod(int id){
        for(PerformanceMod mod : getMods()){
            if(mod.getId() == id){
                return mod;
            }
        }
        return null;
    }


}
