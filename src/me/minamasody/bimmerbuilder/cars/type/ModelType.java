package me.minamasody.bimmerbuilder.cars.type;

import me.minamasody.bimmerbuilder.cars.engine.EngineType;

public enum ModelType {

    //B58
    BMW_340(0, 4.8,"BMW 340i", "4 door sedan featuring the iconic B58 engine (3.0L I-6 engine) with stock output of 320 hp.", EngineType.B58, true, 40000),
    BMW_440(1, 4.8,"BMW 440i", "2 door coupe featuring the iconic B58 engine (3.0L I-6 engine) with stock output of 320 hp.", EngineType.B58, true, 40000),
    BMW_540(2, 4.8,"BMW 540i", "4 door big-sedan featuring the iconic B58 engine (3.0L I-6 engine) with stock output of 320 hp.", EngineType.B58, true, 40000),

    //S55
    BMW_F80_M3(3, 4.3,"BMW M3 F80", "The M Competition M3 with the S55 engine producing over 430 hp stock. Insane tunability.", EngineType.S55, true, 50000),
    BMW_F82_M4(4, 4.3,"BMW M4 F82", "The M Competition M4 with the S55 engine producing over 430 hp stock. Insane tunability.", EngineType.S55, true, 50000),

    //S58
    BMW_G80_M3(5, 3.4,"BMW M3 G80", "The newest M Competition 4 door sedan with the monsterous S58 engine. Produces 503 hp stock.", EngineType.S58, true, 80000),
    BMW_G82_M4(6, 3.4,"BMW M4 G82", "The newest M Competition 2 door coupe with the monsterous S58 engine. Produces 503 hp stock.", EngineType.S58, true, 80000),

    //S68
    BMW_F90_M5(7, 2.8,"BMW M5cs", "The fastest production car ever by BMW. Powered by a 4.4L V8 twin-turbo, producing 617 horsepower stock.", EngineType.S68, false, 130000),

    //N55
    BMW_F07_335(8, 4.5,"BMW 335i", "Good tunability to over 500 horsepower. 4 door sedan.", EngineType.N55, true, 12000);

    private int id;
    private String model;
    private String description;
    private EngineType engine;
    private boolean M;
    private int price;
    private double stock_0_60;

    public double getStockAccel(){
        return stock_0_60;
    }

    ModelType(int id, double stock_0_60,String model, String description, EngineType engine, boolean m, int price) {
        this.id = id;
        this.model = model;
        this.description = description;
        this.engine = engine;
        this.stock_0_60 = stock_0_60;
        M = m;
        this.price = price;
    }

    public static ModelType getType(int id){
        for (ModelType type: ModelType.values()){
            if(type.getId()==id){
                return type;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public EngineType getEngine() {
        return engine;
    }

    public boolean isM() {
        return M;
    }

    public int getPrice() {
        return price;
    }
}
