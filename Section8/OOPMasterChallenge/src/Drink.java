public class Drink {
    //drinks have type, size and price
    private String type; //coke as default
    private String size; //small, medium, large
    private double price;// 1.50, 2.35, 2.79
    
    public Drink(String type, String size) {
        this.type = type;
        this.size = size.toLowerCase();
        price = setPrice(this.size);
    }

    public Drink() {
        this("Coke", "medium");
    }

    private double setPrice(String size) {
        switch(size){
            case "small" :
                return 1.5;
            case "medium" :
                return 2.35;
            case "large" :
                return 2.79;
            default :
                return -1000;

        }
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }
    
    public double getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
        price = setPrice(size);
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return size + " " + type + " = " + price;
    }
}
