package practice_6.Factory_Method;

public class ItalianCoffeeShop extends CoffeeShop{
    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type){
            case AMERICANO:
                coffee = new Italian_Americano();
                break;
            case ESPRESSO:
                coffee = new Italian_Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Italian_Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new Italian_CaffeLatte();
                break;
        }
        return coffee;
    }
}
