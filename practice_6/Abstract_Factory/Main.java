package practice_6.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new SpecificFactory1();
        factory1.createProductA();
        factory1.createProductB();
        AbstractFactory factory2 = new SpecificFactory2();
        factory2.createProductA();
        factory2.createProductB();
    }
}
