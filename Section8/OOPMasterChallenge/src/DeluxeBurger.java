public class DeluxeBurger extends Burger {

    public DeluxeBurger(){
        super("Deluxe Burger", 9.99, 5);
    }

    @Override
    public double getTotalPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder(super.getType());
        returnString.append(" = ");
        returnString.append(super.getPrice());
        for (Topping topping : super.getToppings()) {
            returnString.append("\n\t**add ");
            returnString.append(topping.getType());
            returnString.append("**");
        }
        returnString.append("\n================================\nTotal = ");
        returnString.append(super.getPrice());
        return returnString.toString();
    }
}
