package practice_6.Prototype;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Egor");
        Human human1 = human.copy();
        System.out.println(human);
        System.out.println(human1);
    }
}
