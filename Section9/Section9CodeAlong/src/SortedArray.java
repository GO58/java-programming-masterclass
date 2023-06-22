import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.parser.Element;
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

    public static void printArray(int[] array2Print){
        for(int i = 0; i < array2Print.length; i++){
            if(i == 0){
                System.out.printf("Element %d contents %d", i, array2Print[i]);
            }
            else{
                System.out.printf("%nElement %d contents %d", i, array2Print[i]);
            }
        }
    }

    public static int[] sortIntegers(int[] array2Sort){
        int[] sortedArray = Arrays.copyOf(array2Sort, array2Sort.length);
        Arrays.sort(array2Sort);
        int[] returnArray = new int[sortedArray.length];
        for(int i = 0; i < sortedArray.length; i++){
            returnArray[i] = sortedArray[sortedArray.length - 1 - i];
        }
        return returnArray;
    }
}
