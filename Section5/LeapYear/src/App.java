public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isLeapYear(-1699));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(0));

        System.out.println("finished");
    }
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){return false;}
        if(year % 4 == 0){
            if(year % 100 == 0){
                return (year % 400 == 0);
            }
            else{
                return true;
            }
        }
       return false;
    }
}
