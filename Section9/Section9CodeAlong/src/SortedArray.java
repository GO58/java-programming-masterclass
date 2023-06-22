import java.util.Scanner;
public class SortedArray {
    

    public static int[] getIntegers(int numbers){
        int[] returnInts = new int[numbers];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < numbers; i++){
            returnInts[i] = scanner.nextInt();
        }
        scanner.close();
        return returnInts;
    }
}
