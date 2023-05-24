package practice_7.Composite;

public class Main {
    public static void main(String[] args) {
        Car sportcar = new SportCar();
        Car supercar = new SuperCar();
        Drawing cars = new Drawing();
        cars.add(sportcar);
        cars.add(supercar);
        cars.draw("�������");
        cars.clear();
        cars.add(supercar);
        cars.draw("�������");
        sportcar.draw("������");
    }
}
