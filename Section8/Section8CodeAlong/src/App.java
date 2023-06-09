public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tests for Composition");
        testProductAndChildren();
        System.out.println("------------end tests-----------\n");
    }

    private static void testProductAndChildren() {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27 ,"2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(10,10, "red");
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }
}
