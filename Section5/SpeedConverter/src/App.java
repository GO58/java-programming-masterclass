public class App {
    public static void main(String[] args) throws Exception {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114 );
        printConversion(95.75 );
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour;
        if(kilometersPerHour < 0D){
            milesPerHour = -1L;
        }
        else{
            milesPerHour =  (Math.round(kilometersPerHour /1.609));
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}
