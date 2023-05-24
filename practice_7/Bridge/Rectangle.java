package practice_7.Bridge;

public class Rectangle extends Shape{
    public Rectangle(Color color){
        super(color);
    }
    @Override
    public void draw(){
        System.out.println("Рисуем прямоугольник");
        color.fillColor();
    }
}
