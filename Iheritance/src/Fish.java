public class Fish extends Animal{
    private  int gills,fins;

    public Fish( String type, double weight, int gills, int fins) {
        super("small", type, weight);
        this.gills = gills;
        this.fins = fins;
    }


    @Override
    public void moves(String speed) {
        super.moves(speed);
        moveMuscules();
        if(speed=="fast") moveFins();
        System.out.println();
    }

    private void moveMuscules(){
        System.out.print("Muscle Moving");
    }

    private void moveFins(){
        System.out.print("backFin Moving");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
