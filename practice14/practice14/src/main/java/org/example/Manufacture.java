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
public class Manufacture {
    private String name;
    private String address;
    private static List<Manufacture> manufactures = new ArrayList<>();
    public Manufacture(String name, String address){
        this.name=name;
        this.address=address;
    }
    public void add_manufacture(Manufacture manufacture){
        manufactures.add(manufacture);
    }
    public void delete_manufacture(String name){
        manufactures.removeIf(Manufacture-> Objects.equals(Manufacture.getName(),name));
    }
    public void fill_array(){
        if(manufactures.size()==0){
           manufactures.add(new Manufacture("Google","New Your 987-2"));
           manufactures.add(new Manufacture("VK","Moscow 12"));
           manufactures.add(new Manufacture("Telegramm","Chikago 42k"));
        }
    }
    public static List<Manufacture> getManufactures(){
        return manufactures;
    }
}
