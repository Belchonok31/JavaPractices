package package_1;

public class Car extends Transport{
    public Car(float speed, int weight, String color, byte[] coordinate){
       super(speed, weight, color, coordinate);
    }
    public Car(int weight, byte[] coordinate){
        super(weight,coordinate);
    }
}
