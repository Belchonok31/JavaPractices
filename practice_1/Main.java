package practice_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {
    @FunctionalInterface
    public interface Function<T,R>{
        R apply (T t);
    }

    public static void main(String[] args) {
        // Студенты
        Student student_1 = new Student("Egor Belosludtsev","IKBO-16-21");
        Student student_2 = new Student("Ivan Ivanov","IKBO-15-21");
        Student student_3 = new Student("Vanya Pidorkov","IKBO-16-21");
        Student student_4 = new Student("Nikita Volos","IKBO-8-21");
        Student student_5 = new Student("Vasya Globol","IKBO-8-21");
        Student student_6 = new Student("Renat Charkov","IKBO-9-21");
        // Создание массива
        List<Student> list = new ArrayList<>();
        // Добавление студентов
        list.add(student_1);
        list.add(student_2);
        list.add(student_3);
        list.add(student_4);
        list.add(student_5);
        list.add(student_6);
        // Лямбда фукнция
        Function<List<Student>,Map<String,List<Student>>> function  = list_students ->{
            Map<String, List<Student>> map_students = new HashMap<>();
            // Распределение
            for(Student student: list_students){
                String group = student.group;
                if (map_students.containsKey(group)){
                    List<Student> list_2 = map_students.get(group);
                    list_2.add(student);
                    map_students.remove(group);
                    map_students.put(group,list_2);
                }
                else {
                    List<Student> list_3 = new ArrayList<>();
                    list_3.add(student);
                    map_students.put(group,list_3);
                }
            }
            return map_students;
        };
        // Создание map, полученной с помощью нашей лямбды функции
        Map<String, List<Student>> map_student=function.apply(list);
        // Вывод группы студентов
        for (String key: map_student.keySet()){
            System.out.println(key);
        }
        // Вывод имен студентов
        for (List<Student> key: map_student.values()){
            for(Student student: key){
                System.out.print(student.name+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        // Вывод группы студентов
        for (String key: map_student.keySet()){
            System.out.print(key+": ");
            // Вывод имен студентов
            for (List<Student> key_2: map_student.values()){
                if(map_student.get(key)!=key_2) continue;
                else{
                    for(Student student: key_2){
                        System.out.print(student.name+". ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
