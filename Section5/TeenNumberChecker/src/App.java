public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 034));
        System.out.println(hasTeen(17, 10, 43));

        System.out.println("finished");
    }
    
    public static boolean isTeen(int age){
        return age > 12 && age < 20;
    }

    public static boolean hasTeen(int p1, int p2, int p3){
        return isTeen(p1) || isTeen(p2) || isTeen(p3);
    }
}
