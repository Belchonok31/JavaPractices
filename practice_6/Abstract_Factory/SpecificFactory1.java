package practice_6.Abstract_Factory;

public class SpecificFactory1 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        System.out.println("Создание продукта A завода номер 1");
        return new SpecificProductA1();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("Создание продукта B завода номер 1");
        return new SpecificProductB1();
    }
}
