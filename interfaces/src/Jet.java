public class Jet implements FlightEnabled,Trackable{

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+" coordinates are recorderd");

    }

    @Override
    public FlightStages transitions(FlightStages stage) {
        System.out.println(getClass().getSimpleName()+" transitioning");

        return FlightEnabled.super.transitions(stage);
    }
}
