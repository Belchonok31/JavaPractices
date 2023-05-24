package ru.belosludtsev.practice15.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Data
@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;

}
