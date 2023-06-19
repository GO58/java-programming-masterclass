public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Start Tests on SmartKitchen");
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

        System.out.println("Start Tests on Bedroom");
        Lamp myLamp = new Lamp("70's yellow stick lamp",false, 60);
        System.out.println("Lamp type is " + myLamp.getStyle());
        System.out.println("Lamps has a battery? " + myLamp.isBattery());
        System.out.println("Lamps glob rating is " + myLamp.getGlobRating());
        myLamp.turnOn();
        System.out.println("----------end tests-----------");
    }
}
