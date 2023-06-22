import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Tests");

        int[] intArray = readIntegers();
        System.out.println(Arrays.toString(intArray));
        int smallestInt = findMin(intArray);
        System.out.println(smallestInt);

        System.out.println("------------end tests---------------");
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

    private static int[] readIntegers() {
        //read comma delimited list of numbers from user using Scanner
        //return array of ints
        Scanner scanner = new Scanner(System.in);
        String enteredNumbers = scanner.nextLine().trim();
        char[] rawNumbers = enteredNumbers.toCharArray();
        int numberOfNumbers = 1;
        for (char c : rawNumbers) {
            if(c == ','){
                numberOfNumbers++;
            }
        }
        int[] integers = new int[numberOfNumbers];
        int numberIndex = 0;
        String currentNumber = "";
        for(int i = 0; i < rawNumbers.length; i++){
            if(rawNumbers[i] != ','){
                currentNumber = currentNumber + rawNumbers[i];
            }
            else{
                try {
                    integers[numberIndex] = Integer.parseInt(currentNumber);
                    numberIndex++;
                    currentNumber = "";
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
        try {
            integers[numberIndex] = Integer.parseInt(currentNumber);
            numberIndex++;
            currentNumber = "";
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        scanner.close();
        return integers;
    }
}
