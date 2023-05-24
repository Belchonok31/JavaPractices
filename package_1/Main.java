package package_1;

public class Main {

    public static void main(String[] args) {
        // ООП: классы и объекты
//        Car bmw = new Car(123.67f, 3400,"Gray",new byte[] {10,34,19});
        Truck truck = new Truck( 5600, new byte[] {100,0,100}, false);
        truck.setValues(123.67f,3400,"Gray",new byte[]{10,34,19},true);
//        truck.setLoaded(true);
//        truck.getLoaded();
//        Transport trans = new Transport();

        System.out.println(truck.getValues());
//        System.out.println(bmw.getValues());
    }
}
