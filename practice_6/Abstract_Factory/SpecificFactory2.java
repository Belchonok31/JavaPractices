package practice_6.Abstract_Factory;

public class SpecificFactory2 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        System.out.println("Создание продукта A завода номер 2");
        return new SpecificProductA2();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("Создание продукта B завода номер 2");
        return new SpecificProductB2();
    }
}
