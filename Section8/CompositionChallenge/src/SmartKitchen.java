
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

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return iceBox;
    }

    public CoffeeMaker getCoffeeMaker() {
        return brewMaster;
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }    

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffee, boolean dishes, boolean fridge){
        brewMaster.setHasWorkToDo(coffee);
        dishWasher.setHasWorkToDo(dishes);
        iceBox.setHasWorkToDo(fridge);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

}
