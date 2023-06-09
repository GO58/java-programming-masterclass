public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.0, -3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println("finished");
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        number1 *= 1000D;
        number2 *= 1000D;
        return ((int)(number1) == (int)(number2));
    }

}
