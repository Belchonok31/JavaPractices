package practice_6.Factory_Method;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type){
        Coffee coffee = createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
        System.out.println("Получите, распишитесь, ваше кофе");
        return coffee;
    }
    protected abstract Coffee createCoffee(CoffeeType type);
}
