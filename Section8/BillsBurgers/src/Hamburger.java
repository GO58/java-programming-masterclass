
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price = 0.0;
    private String addition2Name;
    private double addition2Price = 0.0;
    private String addition3Name;
    private double addition3Price = 0.0;
    private String addition4Name;
    private double addition4Price = 0.0;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        StringBuilder s = new StringBuilder(name + " ");
        s.append(this.getClass().getSimpleName() + " on a ");
        s.append(breadRollType + " roll with ");
        s.append(meat + ", price is ");
        s.append(price);
        System.out.println(s);
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
        System.out.printf("Added %s for an extra %.2f%n", addition1Name, addition1Price);
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
        System.out.printf("Added %s for an extra %.2f%n", addition2Name, addition2Price);
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
        System.out.printf("Added %s for an extra %.2f%n", addition3Name, addition3Price);
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
        System.out.printf("Added %s for an extra %.2f%n", addition4Name, addition4Price);
    }

    public Double itemizeHamburger() {

        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }

}
