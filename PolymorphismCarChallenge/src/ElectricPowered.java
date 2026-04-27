public class ElectricPowered extends Car{
    private int battery=100;
    private boolean isEngineStarted;
    private double avgKmPerCharge;


    public ElectricPowered(String description, String carName, double avgKmPerCharge) {
        super(description, carName);
        this.avgKmPerCharge = avgKmPerCharge;

    }

    @Override
    public void startEngine() {
        System.out.println("checking battery level....");
        System.out.println("batter level is:"+battery);
        isEngineStarted=battery<=5?false:true;
        System.out.println(!isEngineStarted?"battery crtically low cant start the car only in emergency situation only can be started!":"electric motor is started...");

        if(isEngineStarted) super.startEngine();

    }

    @Override
    public void drive() {
        if(!isEngineStarted){

            System.out.println("turn on the car Electric motor to drive! it turned Off");
        }
        else {

            super.drive();
            battery-=5;
        }

    }


    @Override
    public String toString() {
        return "ElectricPowered{" +
                "battery=" + battery +
                ", isEngineStarted=" + isEngineStarted +
                ", avgKmPerCharge=" + avgKmPerCharge +
                "} " + super.toString();
    }

    @Override
    protected void runEngine() {
        if(isEngineStarted) super.runEngine();
    }
}
