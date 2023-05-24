package practice_6.Builder;

public class Main {
    public static void main(String[] args) {
        Human human = new Human.HumanBuilder("Egor",20).set_has_car(true).set_has_iphone(false).build();
        System.out.println(human);
    }
}
