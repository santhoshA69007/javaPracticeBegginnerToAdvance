void main() {

    Bird bird=new Bird();
    Animal animal=bird;
    FlightEnabled flier=bird;
    Trackable trackable=bird;
    animal.move();
//    flier.move();
//    tracked.move();
//    flier.takeOff();
//    flier.fly();
//    trackable.track();
//    flier.land();
    inFlight(flier);
    inFlight(new Jet());
    double kmTravelled=100;
    double milesTraveled=kmTravelled*FlightEnabled.KM_TO_MILES;
    System.out.printf("The truck traveled %.2f km or  %.2f miles%n",kmTravelled,milesTraveled);

LinkedList<FlightEnabled> fliers=new LinkedList<>();
fliers.add(bird);
List<FlightEnabled> betterflier=new LinkedList<>();
betterflier.add(bird);


triggerFliers(fliers);
flyFliers(fliers);
landFliers(fliers);

//    triggerFliers(be);
//    flyFliers(fliers);
//    landFliers(fliers);

}



private static void inFlight(FlightEnabled flier){
    flier.takeOff();
    flier.fly();
    if(flier instanceof Trackable trackable){
        trackable.track();
    }
    flier.land();
}

private static void triggerFliers(List<FlightEnabled> fliers){
    for(var flier:fliers){
        flier.takeOff();
    }
}

private static void flyFliers(List<FlightEnabled> fliers){
    for(var flier:fliers){
        flier.fly();
    }
}
private static void landFliers(List<FlightEnabled> fliers){
    for(var flier:fliers){
        flier.land();
    }
}