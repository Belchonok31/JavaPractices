package practice_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Создание несколько Human
        Human human_1 = new Human(20, "Egor","Belosludtsev", LocalDate.of(2003,2,4),70);
        Human human_2 = new Human(21, "Vasya","Pypkin", LocalDate.of(2002,4,29),81);
        Human human_3 = new Human(25, "Mario","Martines", LocalDate.of(1998,1,27),78);
        Human human_4 = new Human(16, "Mikola","Tesla", LocalDate.of(2007,11,8),43);
        Human human_5 =  new Human(25, "Mario_2","Martines", LocalDate.of(1998,1,27),74);
        Human human_6 =  new Human(25, "Mario_3","Martines", LocalDate.of(1998,1,28),79);
        // Создание массива
        List <Human> humans = new ArrayList<>();
        // Заполнение массива
        humans.add(human_1);
        humans.add(human_2);
        humans.add(human_3);
        humans.add(human_4);
        humans.add(human_5);
        humans.add(human_6);
        // Сортировка
        int max_age = 50;
        List<String> list_firstName = new ArrayList<>();
        Stream<Human> stream = humans.stream();
        stream.filter(str -> str.age < max_age).sorted().forEach(w -> list_firstName.add(w.firstName));
        System.out.println(list_firstName.stream().reduce((a,b)->a+" "+b));
    }
}
