package practice_6.Factory_Method;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italian_CoffeeShop = new ItalianCoffeeShop();
        italian_CoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop american_CoffeeShop = new AmericanCoffeeShop();
        american_CoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
    }
}
