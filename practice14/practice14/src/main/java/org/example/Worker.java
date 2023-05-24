package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Component
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Worker {
    private String firstName;

    private String lastName;
    private String middleName;
    private static List<Worker> workers = new ArrayList<>();
    public Worker(String firstName, String lastName, String middleName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
    }
    public void add_worker(Worker worker){
        workers.add(worker);
    }
    public void delete_worker(String firstName){
        workers.removeIf(worker -> Objects.equals(worker.getFirstName(),firstName));
    }
    public void fill_array(){
        if(workers.size()==0){
            workers.add(new Worker("Alex","Belosludtsev","Belka"));
            workers.add(new Worker("Big","Special","King"));
            workers.add(new Worker("Super","Mario","Valya"));
            workers.add(new Worker("Billy","Butcher","Igorevich"));
        }
    }
    public static List<Worker> get_worker(){
        return workers;
    }
}
