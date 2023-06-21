import javax.rmi.ssl.SslRMIClientSocketFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Tests");
        /*Create a default meal with no args
         *Create custom meal with 3 xtra toppings 
         *Create deluxe burger meal with 5 toppings

         For each order
         Add additional toppings
         change size of the drink
         Print an itemized list
            including price and extra toppings
        Total price of the meal
         */
        Drink myDrink = new Drink();
        Drink otheDrink = new Drink("Root Beer", "Large");
        System.out.println(myDrink);
        System.out.println(otheDrink);

        Side side1 = new Side();
        Side side2 = new Side("Rings");
        System.out.println(side1);
        System.out.println(side2);

        Burger plain = new Burger();
        Burger goodBurger = new Burger("double beef", 8.99);
        goodBurger.addTopping("cheese");
        goodBurger.addTopping("bacon");
        goodBurger.addTopping("egg");
        goodBurger.addTopping("avacado");
        System.out.println(plain);
        System.out.println(goodBurger);

         System.out.println("---------end tests-----------");
    }
}
