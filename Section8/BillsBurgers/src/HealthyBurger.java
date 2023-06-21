public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price = 0;
    private String healthyExtra2Name;
    private double healthyExtra2Price = 0;
    
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double total = super.itemizeHamburger();
        StringBuilder s = new StringBuilder();
        if(healthyExtra1Price != 0){
            s.append("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            total += healthyExtra1Price;
        }
        if(healthyExtra2Price != 0){
            s.append("\nAdded " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
            total += healthyExtra2Price;
        }
        System.out.println(s);
        return total;
    }
   
}
