public class App {
    public static void main(String[] args) throws Exception {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        System.out.println("finished");
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = kiloBytes / 1024;
            int remainderKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }
    }
}
