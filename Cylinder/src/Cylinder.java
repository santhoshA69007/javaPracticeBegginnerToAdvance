public class Cylinder extends Circle {
 private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return Math.PI*Math.pow(this.getRadius(),2)*height;
    }



}
