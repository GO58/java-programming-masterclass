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
    public Double itemizeHamburger() {
        StringBuilder s = new StringBuilder(super.name + " hamburger on a ");
        s.append(super.breadRollType + " roll with ");
        s.append(super.meat + ", price is ");
        s.append(super.price);
        if(super.addition1Price != 0){
            s.append("\nAdded " + super.addition1Name + " for an extra " + super.addition1Price);
        }
        if(super.addition2Price != 0){
            s.append("\nAdded " + super.addition2Name + " for an extra " + super.addition2Price);
        }
        if(super.addition3Price != 0){
            s.append("\nAdded " + super.addition3Name + " for an extra " + super.addition3Price);
        }
        if(super.addition4Price != 0){
            s.append("\nAdded " + super.addition4Name + " for an extra " + super.addition4Price);
        }
        if(healthyExtra1Price != 0){
            s.append("\nAdded " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if(healthyExtra2Price != 0){
            s.append("\nAdded " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        System.out.println(s);
        return super.price + super.addition1Price + super.addition2Price + super.addition3Price + super.addition4Price + healthyExtra1Price + healthyExtra2Price;
    }
   
}
