public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Test Flour Packer");
        System.out.println("Values 1, 0 , 4 expect false");
        System.out.println(canPack(1, 0, 4));
        System.out.println("Values 1, 0, 5 expected true");
        System.out.println(canPack(1, 0, 5));
        System.out.println("Values 0, 5, 4 expected true");
        System.out.println(canPack(0, 5, 4));
        System.out.println("Values 2, 2, 11 expected true");
        System.out.println(canPack(2, 2, 11));
        System.out.println("Values -3, 2, 12  expected false");
        System.out.println(canPack(-3, 2, 11));
        System.out.println("-------------finished test------------------\n");

        System.out.println("Test getLargestPrime");
        System.out.println("Value 21 expected 7");
        System.out.println(getLargestPrime(21));
        System.out.println("Value 217 expected 31");
        System.out.println(getLargestPrime(217));
        System.out.println("Value 0 expected -1");
        System.out.println(getLargestPrime(0));
        System.out.println("Value 45 expected 5");
        System.out.println(getLargestPrime(45));
        System.out.println("Value -1 expected -1");
        System.out.println(getLargestPrime(-1));
        System.out.println("Value 16 expected 2");
        System.out.println(getLargestPrime(16));
        System.out.println("Value 12 expected 3");
        System.out.println(getLargestPrime(12));
        System.out.println("-------------finished test------------------\n");

        System.out.println("Test printSquareStars");
        printSquareStar(1);
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(21);
        System.out.println("-------------finished test------------------\n");
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }
        else{
            String starBox = "";
            for(int row = 1; row <= number; row++){
                for(int col = 1; col <= number; col++){
                    if(row == 1 || row == number || col == 1 || col == number){
                        starBox = starBox + "*";
                    }
                    else if(row == col){
                        starBox = starBox + "*";
                    }
                    else if(col == number - row + 1){
                        starBox = starBox + "*";
                    }
                    else{
                        starBox = starBox + " ";
                    }
                }
                if(row < number)starBox = starBox + "\n";
            }
            System.out.println(starBox);
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        
        boolean enoughSmallBags = goal % 5 <= smallCount;
        boolean enoughFlour = 5 * bigCount + smallCount >= goal;

        return enoughFlour && enoughSmallBags;
    }

    public static int getLargestPrime(int number){
        if(number <= 1)return -1;
        int i;
        int workingNumber = number;
        for(i = 2; i < workingNumber; i++){
            if(workingNumber % i == 0){
                workingNumber /= i;
                i--;
            }
        }
        return i;
    }

}
