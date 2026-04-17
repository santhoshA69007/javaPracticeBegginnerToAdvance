public class Lamp {
    private String type;
    private boolean isBattery;
    private int gloRating;


    public Lamp(String type, boolean battery, int gloRating) {
        this.type = type;
        this.isBattery = isBattery;
        this.gloRating = gloRating;
    }

    public String getType() {
        return type;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public int getGloRating() {
        return gloRating;
    }

    public void turnOn(){
        System.out.println("light is turning On.. turned on!");
    }



}
