public class GasPowered extends Car {
    private int gasLevel=100;
    private boolean isGasLevelOk;
    private double avgKmPerLitre;

    public GasPowered(String description, String carName, double avgKmPerLitre) {
        super(description, carName);
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        isGasLevelOk=gasLevel<=0?false:true;
        if(isGasLevelOk)
        super.startEngine();
        else System.out.println(this.getClass().getSimpleName()+" car is out of gas! refuel then try again!");
    }

    @Override
    public void drive() {
      if(isGasLevelOk)  super.drive();
      else System.out.println("fuel is dried up empty tank refuel then start driving your "+this.getClass().getSimpleName()+" car");
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    protected void runEngine() {
       if(isGasLevelOk) super.runEngine();
    }


    @Override
    public String toString() {
        return "GasPowered{" +
                "gasLevel=" + gasLevel +
                ", isGasLevelOk=" + isGasLevelOk +
                ", avgKmPerLitre=" + avgKmPerLitre +
                "} " + super.toString();
    }
}
