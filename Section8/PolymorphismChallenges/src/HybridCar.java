
public class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = batterySize;
    }

}
