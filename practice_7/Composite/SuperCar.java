package practice_7.Composite;

public class SuperCar implements Car{
    @Override
    public void draw(String color){
        System.out.println("Суперкар имеет "+color+" цвет");
    }
}
