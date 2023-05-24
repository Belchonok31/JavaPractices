package practice_7.Bridge;

public class Main {
    public static void main(String[] args) {
        Color green = new GreenColor();
        Shape triangle = new Triangle(green);
        triangle.draw();
        Color gray = new GrayColor();
        Shape rectangle = new Rectangle(gray);
        rectangle.draw();
    }
}
