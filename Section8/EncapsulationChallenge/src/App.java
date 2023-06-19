public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Tests");
        Printer myPrinter = new Printer(50, true);
        System.out.println(myPrinter.addToner(75));
        System.out.println(myPrinter.addToner(20));
        System.out.println(myPrinter.printPages(9));
        myPrinter = new Printer(50, false);
        System.out.println(myPrinter.printPages(9));
        System.out.println(myPrinter.getPagesPrinted());
        System.out.println("");

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

        System.out.println("-----------------end tests---------------------");
    }
}
