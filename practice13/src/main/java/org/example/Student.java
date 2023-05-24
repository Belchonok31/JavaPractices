package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.surname}")
    private String surname;
    @Value("${student.group}")
    private String group;

    public String get_name(){
        return this.name;
    }
    public String get_surname(){
        return this.surname;
    }
    public String get_group(){
        return this.group;
    }
}
