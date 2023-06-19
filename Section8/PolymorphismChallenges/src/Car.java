import org.w3c.dom.TypeInfo;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void startEngine(){
        System.out.println("the " + this.getClass() + " engine starts");
    }

    public void drive(){
        System.out.println("the " + description + " drives forward");
    }

    protected void runEngine(){
        System.out.println("The " + description + " runs its engine.");
    }
}
