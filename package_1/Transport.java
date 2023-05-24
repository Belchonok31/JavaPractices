package package_1;

public class Transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;
    public Transport(){

    }
    public Transport(float speed, int weight, String color, byte[] coordinate){
        setValues(speed,weight,color,coordinate);
    }
    public Transport(int weight, byte[] coordinate){
        setValues(25.22f,weight,"White",coordinate);
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed=speed;
        this.weight=weight;
        this.color=color;
        this.coordinate=coordinate;
    }
    public String getValues(){
        String info="Object speed: "+ speed + ". Weight: " + weight + ". Color: " + color+".\n";
        String infoCoordinates = "Coordinates:\n";

        for (int i = 0; i < coordinate.length; i++){
            infoCoordinates+=coordinate[i]+"\n";
        }
        return info+infoCoordinates;
    }

}
