package package_1;

public class Truck extends Transport{
    private boolean isLoaded;
    public Truck(int weight, byte[] coordinate){
        super(weight,coordinate);
    }
    public Truck(int weight, byte[] coordinate, boolean isLoaded){
        super(weight,coordinate);
        this.isLoaded=isLoaded;
    }
    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded(){
        if(isLoaded) return "Грузовик загружен";
        else return "Грузовик не загружен";
    }
    public void setValues(float speed, int weight, String color, byte[] coordinate,boolean isLoaded){
        super.setValues(speed, weight, color, coordinate);
        System.out.println("Наш второй метод");
        this.isLoaded=isLoaded;
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }
}
