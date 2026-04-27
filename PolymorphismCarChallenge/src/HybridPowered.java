public class HybridPowered extends Car{
  private boolean isGasLevelOk,isBatteryLevelOk,isEngineStarted;
  private int batteryLevel=100,gasLevel=100;
  private double avgKmPerLitre;

    public HybridPowered(String description, String carName,double avgKmPerLitre) {
        super(description, carName);
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        isBatteryLevelOk=batteryLevel>=1;
        isGasLevelOk=gasLevel>=1;
        if(isBatteryLevelOk||isGasLevelOk)super.startEngine();
    }

    @Override
    public void drive() {
        if(isBatteryLevelOk||isGasLevelOk) super.drive();
        System.out.println("driving with electric and gas powered engine!");
    }

    @Override
    public void stop() {
        super.stop();
    }


    @Override
    public String toString() {
        return "HybridPowered{" +
                "isGasLevelOk=" + isGasLevelOk +
                ", isBatteryLevelOk=" + isBatteryLevelOk +
                ", isEngineStarted=" + isEngineStarted +
                ", batteryLevel=" + batteryLevel +
                ", gasLevel=" + gasLevel +
                ", avgKmPerLitre=" + avgKmPerLitre +
                "} " + super.toString();
    }

    @Override
    protected void runEngine() {
        if(isEngineStarted) super.runEngine();
    }
}
