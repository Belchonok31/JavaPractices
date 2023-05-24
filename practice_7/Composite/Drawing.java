package practice_7.Composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Car{
    private List<Car> cars = new ArrayList<>();
    @Override
    public void draw(String color){
        for(Car car: cars){
            car.draw(color);
        }
    }
    public void add(Car car){
        cars.add(car);
    }
    public void clear(){
        cars.clear();
        System.out.println("Массив из машин отчистен");
    }
}
