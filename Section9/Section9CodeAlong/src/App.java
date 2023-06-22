import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Tests");
        arrayChallenge();
        System.out.println("\n--------end tests----------");
    }

    private static void arrayChallenge(){
        int[] randomArray = new int[22];
        Random random = new Random();
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(randomArray));
        int[] sortedArray = randomArray.clone();
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
        int[] reversedArray = new int[sortedArray.length];
        for(int i = 0; i < sortedArray.length; i++){
            reversedArray[i] = sortedArray[sortedArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedArray));

        testSortedArray();
    }

    private static void testSortedArray() {
        int lengthOfTestArray = 5;
        System.out.println("Enter " + lengthOfTestArray + " integers:");
        int[] myArray = SortedArray.getIntegers(lengthOfTestArray);
        SortedArray.printArray(myArray);
        int[] reversedArray = SortedArray.sortIntegers(myArray);
        SortedArray.printArray(reversedArray);
    }
}
