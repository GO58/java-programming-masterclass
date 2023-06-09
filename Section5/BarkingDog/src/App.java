public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("finished");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return (barking && ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23));
    }
}
