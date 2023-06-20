import java.util.ArrayList;

public class Burger {
    /** burger has type, price and up to 3 xtra toppings
     *  burger constructor only type and price
     *  xtra toppings are added in a diffrent manner
     * 
     * deluxe burger bonus
     * deluxe burger meal has set price so any additional toppings do not change the price
     * deluxe burger has room for an additional two toppings */
    private String type;
    private double price;
    private ArrayList<Topping> toppings;
    private int maxToppings;
    

    private int toppingCount;


    public Burger() {
        this("regular", 5.89);
    }


    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
        toppings = new ArrayList<Topping>();
        maxToppings = 3;
    }

    public void addTopping(String toppingType){
        if (toppings.size() < maxToppings){
            switch (toppingType.toLowerCase()){
                case "cheese" :
                    toppings.add(Topping.cheese());
                    break;
                case "bacon" :
                    toppings.add(Topping.bacon());
                    break;
                case "egg" :
                    toppings.add(Topping.egg());
                    break;
                case "onions" :
                    toppings.add(Topping.onions());
                    break;
                case "mushrooms" :
                    toppings.add(Topping.mushrooms());
                    break;
                case "avacado" :
                    toppings.add(Topping.avacado());
                    break;
                case "ham" :
                    toppings.add(Topping.ham());
                    break;
                default:
                    System.out.println("we don't have that");
                    break;
            }
        }
        else{
            System.out.println("too many toppings");
        }
    }


    
}
