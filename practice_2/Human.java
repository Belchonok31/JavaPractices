package practice_2;

import java.time.LocalDate;

public class Human implements Comparable<Human>{
    protected int age;
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;
    protected int weight;
    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight){
        this.age=age;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.weight=weight;
    }
    @Override
    public String toString(){
        return "Human{age: "+this.age+" firstName: " +
                this.firstName+" lastName: "+this.lastName+
                " birthDate: "+this.birthDate+" weight: "+this.weight+"}";
    }

    @Override
    public int compareTo(Human o) {
        if(this.birthDate.getYear() > o.birthDate.getYear()){
            return 1;
        }
        else if(this.birthDate.getYear() == o.birthDate.getYear()){
            if(this.birthDate.getMonthValue() > o.birthDate.getMonthValue()){
                return 1;
            }
            else if (this.birthDate.getMonthValue() == o.birthDate.getMonthValue()){
                if(this.birthDate.getDayOfMonth() > o.birthDate.getDayOfMonth()){
                    return 1;
                }
                else if(this.birthDate.getDayOfMonth() == o.birthDate.getDayOfMonth()){
                    if(this.weight < o.weight){
                        return 1;
                    }
                    else if (this.weight == o.weight){
                        return 0;
                    }
                    else return -1;
                }
                else return -1;
            }
            else return -1;
        }
        else{
            return -1;
        }
    }

}
