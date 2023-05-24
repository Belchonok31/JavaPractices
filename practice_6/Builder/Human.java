package practice_6.Builder;

public class Human {
    private String name;
    private int age;
    private boolean has_car;
    private boolean has_iphone;
    private Human(HumanBuilder humanBuilder){
        this.name=humanBuilder.name;
        this.age=humanBuilder.age;
        this.has_car=humanBuilder.has_car;
        this.has_iphone=humanBuilder.has_iphone;
    }
    @Override
    public String toString(){
        return "{name: "+this.name+" age: "+this.age+" has_car: "+this.has_car+" has_iphone: "+this.has_iphone+"}";
    }
    public static class HumanBuilder{
        private String name;
        private int age;
        private boolean has_car;
        private boolean has_iphone;
        public HumanBuilder(String name, int age){
            this.name=name;
            this.age=age;
        }
        public HumanBuilder set_has_car(boolean has_car){
            this.has_car=has_car;
            return this;
        }
        public HumanBuilder set_has_iphone(boolean has_iphone){
            this.has_iphone=has_iphone;
            return this;
        }
        public Human build(){
            return new Human(this);
        }
    }
}
