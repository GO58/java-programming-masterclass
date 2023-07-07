import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    //this is a test method and not included in the udemy code 
    public static void runTests(){
        System.out.println("readInteger() will be tested");
        int testNumber = readInteger();
        System.out.println("The number entered was " + testNumber);

        System.out.println(testNumber + " is being sent to readElements()");
        int[] arrayInts = readElements(testNumber);
        System.out.println("The following array was entered:");
        System.out.println(Arrays.toString(arrayInts));

        System.out.println("The array is being sent to findMin()");
        int min = findMin(arrayInts);
        System .out.println("The min number in the array is " + min);
    }
    
    private static int[] readElements(int elements) {
        int[] returnNumbers = new int[elements];
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        do{
            returnNumbers[count] = scanner.nextInt();
            scanner.nextLine();
            count++;
        }while( count < elements);

        scanner.close();
        return returnNumbers;
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many numbers are you going to enter?");
        String userInput = scanner.nextLine();
        int returnNumber;
        try {
            returnNumber = Integer.parseInt(userInput.trim());
            
        } catch (Exception e) {
            returnNumber = -1;
            System.out.println("Bad input:" + userInput);
        }
        scanner.close();
        return returnNumber;
    }

    private static int findMin(int[] intArray) {
        //return the smallest int found in the array
        if(intArray.length == 1){return intArray[0];}
        if(intArray.length == 2){return Math.min(intArray[0], intArray[1]);}
        int smallest = intArray[0];
        for(int i = 1; i < intArray.length; i++){
            smallest = Math.min(smallest, intArray[i]);
        }
        return smallest;
    }
}
