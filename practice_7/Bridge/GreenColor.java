package practice_7.Bridge;

public class GreenColor implements Color{
    @Override
    public void fillColor(){
        System.out.println("Зарисовка зеленным цветом");
    }
}
