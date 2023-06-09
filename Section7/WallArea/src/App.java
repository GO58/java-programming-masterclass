public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Test WallArea");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        System.out.println("---------end tests-------------");
    }
}
