public class DistanceFormula {

    private int x,y,z;

    public DistanceFormula() {
    }

    public DistanceFormula(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(((0-x)*(0-x))+ ((0-y)*(0-y)) );
    }

    public double distance(int x2, int y2){
        return Math.sqrt(((x2-x)*(x2-x))+ ((y2-y)*(y2-y)) );
    }

    public double distance(DistanceFormula another){

        return Math.sqrt(((another.x-x)*(another.x-x))+ ((another.y-y)*(another.y-y)) );
    }





}
