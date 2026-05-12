public class Test {
    static void main() {

       inFlight(new Jet());
//       OrbitEarth.log("Testing"+ new Satellite());
        orbit(new Satellite());
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


private static void orbit(OrbitEarth flier){
    flier.takeOff();
    flier.fly();
    flier.land();
}
}


