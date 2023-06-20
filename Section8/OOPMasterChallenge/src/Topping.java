
public class Topping {
    private String type;
    private double price;

    public Topping(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public static Topping cheese(){
        return new Topping("cheese", 1.5);
    }

    public static Topping bacon(){
        return new Topping("bacon", 2.0);
    }

    public static Topping ham(){
        return new Topping("ham", 2.35);
    }

    public static Topping egg(){
        return new Topping("egg", 1.25);
    }

    public static Topping avacado(){
        return new Topping("avacado", 2.35);
    }

    public static Topping onions(){
        return new Topping("bacon", 0.75);
    }

    public static Topping mushrooms(){
        return new Topping("Mushrooms", 0.75);
    }
    
    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
