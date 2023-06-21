public class Meal{
    /*composed of 1 burger, 1 drink, 1 side item
     * most common meal should be created w/o arguments (reg burger, small coke, fries)
     * create other meals by specifying other burgers, drinks and sides
     * drinks have type, size and price
     * side item has type and price
     * burger has type, price and up to 3 xtra toppings
     *  burger constructor only type and price
     *  xtra toppings are added in a diffrent manner
     * 
     * deluxe burger bonus
     * deluxe burger meal has set price so any additional toppings do not change the price
     * deluxe burger has room for an additional two toppings
     */
    private Burger burger;
    private Side side;
    private Drink drink;

    public Meal(){
        this(new Burger(), new Side(), new Drink());
        }

    public Meal(Burger burger, Side side, Drink drink){
        this.burger = burger;
        this.side = side;
        this.drink = drink;
    }

    public double getPrice(){
        return burger.getPrice() + side.getPrice() + drink.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("Your Meal Includes:\n");
        returnString.append(burger);
        returnString.append(side);
        returnString.append(drink);
        returnString.append("\n=====Grand Total=====\nTotal = ");
        returnString.append(getPrice());
        return returnString.toString();
    }
    
}