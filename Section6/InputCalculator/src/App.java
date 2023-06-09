import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Test inputThenPrintSumAndAverage");
        inputThenPrintSumAndAverage();
        System.out.println("----------------End Test----------------");
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        double count = 0;
        boolean looping = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT:");
        int workingNum;
        while (looping){
            try {
                workingNum = Integer.parseInt(scanner.nextLine());
                sum += workingNum;
                count++;
            } catch (Exception e) {
                looping = false;
            }
        }
        long average = Math.round( sum / count);
        System.out.println("OUTPUT:");
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
