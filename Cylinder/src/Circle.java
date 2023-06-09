public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = checker(radius);
    }
    
    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    protected double checker(double num){
        return (num < 0) ? 0.0 : num;
    }
}
