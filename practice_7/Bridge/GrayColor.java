package practice_7.Bridge;

public class GrayColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Зарисовка серым цветом");
    }
}
