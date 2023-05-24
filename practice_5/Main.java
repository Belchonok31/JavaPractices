package practice_5;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstSingleton.getFirstSingleton().toString());
        System.out.println(FirstSingleton.getFirstSingleton().toString());
        System.out.println(SecondSingleton.singleton.toString());
        System.out.println(SecondSingleton.singleton.toString());
        System.out.println(ThirdSingleton.getInstance().toString());
        System.out.println(ThirdSingleton.getInstance().toString());
    }
}
