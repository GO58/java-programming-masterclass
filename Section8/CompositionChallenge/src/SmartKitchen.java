
public class SmartKitchen {
    /*
         * Smart kitchen
         * Has: a brewMaster CoffeeMaker
         * a dishWasher DishWasher
         * a iceBox Refrigerator
         * 
         * It can do:
         * addWater
         * pourMilk
         * loadDishwasher
         * setKitchenState(bool, bool, bool)
         * doKitchenWork
         */
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void addWater(){
        brewMaster.turnOn();
    }    

    public void pourMilk(){
        iceBox.turnOn();
    }

    public void loadDishwasher(){
        dishWasher.turnOn();
    }

    public void setKitchenState(boolean coffee, boolean dishes, boolean fridge){
        if(coffee){brewMaster.turnOn();}
        else{brewMaster.turnOff();}

        if(dishes){dishWasher.turnOn();}
        else{dishWasher.turnOff();}

        if(fridge){iceBox.turnOn();}
        else{iceBox.turnOff();}
    }

}
