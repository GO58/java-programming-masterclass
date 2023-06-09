public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int width, int length) {
        this.length = (length < 0) ? 0 : length;
        this.width = (width < 0) ? 0 : width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return length * width;
    }
}
