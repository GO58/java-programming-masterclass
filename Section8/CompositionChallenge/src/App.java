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
        Bed myBed = new Bed("Standard bed", 2, 28, 2, 1);
        System.out.println("The be is style " + myBed.getStyle());
        System.out.printf("is %d inches high, has %d pillows, %d sheets and %d quilts.%n", myBed.getHeight(), myBed.getPillows(), myBed.getSheets(), myBed.getQuilt());
        Ceiling myCeiling = new Ceiling(10, 256);
        System.out.printf("The ceiling is %d feet high and color number is %d.%n", myCeiling.getHeight(), myCeiling.getPaintedColor());
        Wall myWall = new Wall("North");
        System.out.println("my wall faces " + myWall.getDirection());
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Bedroom myBedroom = new Bedroom("Greg's Bedroom", myWall, wall2, wall3, wall4, myCeiling, myBed, myLamp);
        myBedroom.makeBed();
        myBedroom.getLamp().turnOn();
        System.out.println("----------end tests-----------");
    }
}
