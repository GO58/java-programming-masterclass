public class Side {
    //side item has type and price
    private String type;
    private double price;

    public Side() {
        this("fries");
    }

    public Side(String type) {
        this.type = type.toLowerCase();
        price = setPrice(this.type);
    }

    private double setPrice(String type) {
        switch(type){
            case "fries" :
            case "tots" :
                return 2.0;
            case "salad":
                return 2.25;
            case "rings" :
                return 3.5;
            case "fruit" :
                return 1.89;
            default :
                return -1000;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n" + type + " = " + price;
    }

    public double getPrice() {
        return price;
    }
}
