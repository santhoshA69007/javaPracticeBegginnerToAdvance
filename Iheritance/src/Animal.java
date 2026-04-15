public class Animal {
    private String size;
            protected String type;
    double weight;

    public Animal(String size, String type, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }
public Animal(){

}
    @Override
    public String toString() {
        return "Animal{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }

    public  void moves(String speed){
        System.out.println(type+" moves "+speed);
    }
    public void makeNoise(){
        System.out.println(type+" makes some kind of noise ");
    }
}
