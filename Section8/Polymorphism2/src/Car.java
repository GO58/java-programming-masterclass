
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return (this.getClass().getSimpleName() + "'s engine is starting");
    }

    public String accelerate(){
        return (this.getClass().getSimpleName() + " is accelerating");
    }

    public String brake(){
        return (this.getClass().getSimpleName() + " is braking");
    }
}
