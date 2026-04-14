public class Calculator {

    private Floor floor;
    private Carpenter carpenter;


    public Calculator(Floor floor, Carpenter carpenter) {
        this.floor = floor;
        this.carpenter = carpenter;
    }


    public double getTotalCost(){

        return floor.getArea()*carpenter.cost;
    }

}
