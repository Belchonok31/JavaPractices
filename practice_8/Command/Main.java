package practice_8.Command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnON = new Command_TurnON(light);
        Command turnOFF = new Command_TurnOFF(light);
        Invoker invoker = new Invoker(turnON,turnOFF);
        invoker.Turn_on();
        invoker.Turn_off();
    }
}
