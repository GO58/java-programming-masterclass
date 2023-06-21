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

        Burger deluxe = new DeluxeBurger();
        deluxe.addTopping("cheese");
        deluxe.addTopping("onions");
        deluxe.addTopping("mushrooms");
        deluxe.addTopping("bacon");
        deluxe.addTopping("avacado");
        System.out.println(deluxe);

        Meal defaultMeal = new Meal();
        System.out.println(defaultMeal);
        Meal yummy = new Meal(goodBurger, side2, otheDrink);
        System.out.println(yummy);
        Drink anotheDrink = new Drink("Cherry Coke", "large");
        Side salad = new Side("salad");
        Meal deluxeMeal = new Meal(deluxe, salad, anotheDrink);
        System.out.println(deluxeMeal);
         System.out.println("---------end tests-----------");
    }
}
