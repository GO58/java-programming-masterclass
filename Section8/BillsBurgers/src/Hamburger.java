public class Hamburger {
    protected String name;
    protected String meat;
    protected double price;
    protected String breadRollType;
    protected String addition1Name;
    protected double addition1Price = 0.0;
    protected String addition2Name;
    protected double addition2Price = 0.0;
    protected String addition3Name;
    protected double addition3Price = 0.0;
    protected String addition4Name;
    protected double addition4Price = 0.0;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public Double itemizeHamburger() {
        StringBuilder s = new StringBuilder(name + " hamburger on a ");
        s.append(breadRollType + " roll with ");
        s.append(meat + ", price is ");
        s.append(price);
        if(addition1Price != 0){
            s.append("\nAdded " + addition1Name + " for an extra " + addition1Price);
        }
        if(addition2Price != 0){
            s.append("\nAdded " + addition2Name + " for an extra " + addition2Price);
        }
        if(addition3Price != 0){
            s.append("\nAdded " + addition3Name + " for an extra " + addition3Price);
        }
        if(addition4Price != 0){
            s.append("\nAdded " + addition4Name + " for an extra " + addition4Price);
        }
        System.out.println(s);
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
