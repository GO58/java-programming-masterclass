public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Tests");
        Printer myPrinter = new Printer(50, true);
        System.out.println(myPrinter.addToner(75));
        System.out.println(myPrinter.addToner(20));
        System.out.println(myPrinter.printPages(9));
        myPrinter = new Printer(50, false);
        System.out.println(myPrinter.printPages(9));
        System.out.println("-----------------end tests---------------------");
    }
}
