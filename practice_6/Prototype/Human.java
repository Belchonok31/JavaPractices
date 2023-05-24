package practice_6.Prototype;

public class Human implements Prototype{
    private String name;
    public Human(String name){
        this.name=name;
    }
    @Override
    public Human copy() {
        Human clone_human = new Human(this.name);
        return clone_human;
    }
    @Override
    public String toString() {
        return "{Name: "+this.name+"}";
    }
}
