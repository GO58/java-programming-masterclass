public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Tests");
        GasPoweredCar gasCar = new GasPoweredCar("Ford Mustang", 18.7, 6);
        ElectricCar eCar = new ElectricCar("Tesla", 300, 18);
        HybridCar hybrid = new HybridCar("Formula 1", 4.2, 6);

        gasCar.startEngine();
        gasCar.runEngine();
        gasCar.drive();
        
        eCar.startEngine();
        eCar.runEngine();
        eCar.drive();

        hybrid.startEngine();
        hybrid.runEngine();
        hybrid.drive();
        System.out.println("-----------------end tests------------------");
    }
}
