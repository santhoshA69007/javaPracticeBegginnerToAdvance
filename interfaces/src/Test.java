public class Test {
    static void main() {

       inFlight(new Jet());
    }
    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transitions(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable trackable){
            trackable.track();
        }
        flier.land();
    }
}
