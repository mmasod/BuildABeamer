package me.minamasody.bimmerbuilder;

import me.minamasody.bimmerbuilder.cars.CarBuild;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceManager;
import me.minamasody.bimmerbuilder.cars.performance.PerformanceMod;
import me.minamasody.bimmerbuilder.cars.type.ModelType;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static CarBuild build;

    public static CarBuild getBuild() {
        return build;
    }

    public static void main(String[] args){
        PerformanceManager.loadMods();
        boolean running = false;
        Scanner scanner = new Scanner(System.in);
        int currentIndex =0;
        CarBuild build = null;
        while(true){
            if(!running){
                printMainScreen();
                running = true;
            }

            if(currentIndex == 2){
                String nextInput = scanner.next();
                if(nextInput.startsWith("addmod")){
                    String[] add = nextInput.split("\\|");
                    if(add[0].equalsIgnoreCase("addmod")){
                        int modID = Integer.parseInt(add[1]);
                        build.getMods().add(PerformanceManager.getMod(modID));
                        print("Successfully added " + PerformanceManager.getMod(modID).getName() + "!");
                    }
                    continue;
                }
                else if(nextInput.equalsIgnoreCase("page1")){
                    printModifications(1);
                    continue;
                }
                else if(nextInput.equalsIgnoreCase("page2")){
                    printModifications(2);
                    continue;
                }
                else if(nextInput.equalsIgnoreCase("finish")){
                    print("**************************************");
                    print("Finished your " + build.getName() + "!");

                    {
                        int hp = build.getModel().getEngine().getStockHP();
                        for(PerformanceMod mod : build.getMods()){
                            hp = hp + mod.getHpAdded();
                        }
                        print("HP: " + hp);
                    }
                    {
                        int price = build.getModel().getPrice();
                        for(PerformanceMod mod : build.getMods()){
                            price = price + mod.getPrice();
                        }
                        print("Price: " + price);
                    }
                    print("Engine: " + build.getModel().getEngine().getName());
                    print("Mods:");
                    for(PerformanceMod mod : build.getMods()){
                        print("- " + mod.getName());
                    }
                    print("**************************************");
                    return;
                }
            }

            //1
            if(!scanner.nextLine().equalsIgnoreCase("start") && currentIndex==0) {
                System.out.println("Please input 'start' to start!");
                printMainScreen();
            }
            else{
                if(currentIndex == 0) {
                    currentIndex = currentIndex+1;
                    System.out.println("Ready to build your car?");
                    print("Enter the 'id' from one of the models below for your model:");
                    clearLine();
                    printCarList();
                    print("Enter the 'id' from one of the models below for your model:");
                }

                int id = 0;
                if(currentIndex!=2){
                    id = scanner.nextInt();
                }
                if(ModelType.getType(id)==null && currentIndex==1){
                    System.out.println("Please input a correct ID for the car build!");
                    printCarList();
                }else if(ModelType.getType(id) !=null && currentIndex==1){
                    build = new CarBuild("bimmer-" + new Random().nextInt(99));
                    build.setModel(ModelType.getType(id));
                    build.setHp(ModelType.getType(id).getEngine().getStockHP());
                    build.setMods(new ArrayList<>());
                    build.setSafety(10);
                    build.setPrice(ModelType.getType(id).getPrice());
                    build.setAccel_0_60(ModelType.getType(id).getStockAccel());
                    print("Great choice! Let's build your " + build.getModel().getModel() + "!");
                    print("Enter 'ok' to continue.");
                    currentIndex = currentIndex + 1; //2
                    String nextLine = scanner.next();
                    if(nextLine.equalsIgnoreCase("ok")){

                        print("Choose from a list of modifications below.");
                        print("You can finish at anytime by saying 'finish'.");
                        print("To view pages of modifications, enter 'page<number> ex: page1, page2'");
                        print("To apply modifications, enter 'addmod|(number)");


                        continue;

                    }

                }

            }
        }
    }

    public static void printMainScreen(){
        System.out.println("*******************************************");
        System.out.println("Welcome to BimmerBuilder!");
        System.out.println(" ");
        System.out.println("Build your dream BMW race car!");
        System.out.println(" ");
        System.out.println("Enter 'start' to start the build!");
        System.out.println("*******************************************");
    }

    public static void printModifications(int page){
        switch(page){
            case 1:
                for(int i = 0; i <= 5; i++){
                    print("****************************************");
                    print("ID: " + PerformanceManager.getMod(i).getId());
                    print("Modification: " + PerformanceManager.getMod(i).getName());
                    print("" + PerformanceManager.getMod(i).getDescription());
                    print("Type: " + PerformanceManager.getMod(i).getModType().name());
                    print("Power Gained: " + PerformanceManager.getMod(i).getHpAdded());
                    print("Price: " + PerformanceManager.getMod(i).getPrice());
                    print("****************************************");
                }
                break;
            case 2:
                for(int i = 5; i <= 11; i++){
                    print("****************************************");
                    print("ID: " + PerformanceManager.getMod(i).getId());
                    print("Modification: " + PerformanceManager.getMod(i).getName());
                    print("" + PerformanceManager.getMod(i).getDescription());
                    print("Type: " + PerformanceManager.getMod(i).getModType().name());
                    print("Power Gained: " + PerformanceManager.getMod(i).getHpAdded());
                    print("Price: " + PerformanceManager.getMod(i).getPrice());
                    print("****************************************");
                }
                break;
        }
    }

    public static void printCarList(){
        for (ModelType types : ModelType.values()){
            print("**********************************************");
            print("ID: " + types.getId() + " | Model: " + types.getModel());
            print("Engine: " + types.getEngine().getName() + " " + types.getEngine().getLiter() + "L " + (types.getEngine().isInline() ? "I-" + types.getEngine().getCylinders() : "V" + types.getEngine().getCylinders()));
            print(types.getDescription() + " \n Price: $" + types.getPrice());
            print("**********************************************");
        }
    }

    public static void print(String msg){
        System.out.println(msg);
    }

    public static void clearLine(){
        for(int i =0; i < 50; i ++){
            print(" ");
        }
    }

}
