public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Smart kitchen
         * Has: a brewMaster CoffeyMaker
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
        System.out.println("Start Tests");
        SmartKitchen myKitchen = new SmartKitchen();
        myKitchen.doKitchenWork();
        System.out.println("--------------next test-------------");
        myKitchen.loadDishwasher();
        myKitchen.doKitchenWork();
        System.out.println("--------------next test-------------");
        myKitchen.setKitchenState(true, true, true);
        myKitchen.doKitchenWork();
        System.out.println("--------------next test-------------");
        myKitchen.setKitchenState(true, true, false);
        myKitchen.doKitchenWork();
        System.out.println("----------end tests-----------");
    }
}
