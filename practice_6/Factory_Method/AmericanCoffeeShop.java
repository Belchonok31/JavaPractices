package practice_6.Factory_Method;

public class AmericanCoffeeShop extends CoffeeShop{
    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type){
            case AMERICANO:
                coffee = new American_Americano();
                break;
            case ESPRESSO:
                coffee = new American_Espresso();
                break;
            case CAPPUCCINO:
                coffee = new American_Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new American_CaffeLatte();
                break;
        }
        return coffee;
    }
}
