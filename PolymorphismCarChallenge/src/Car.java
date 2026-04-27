public class Car {

    private String description,carName;

    public Car(String description, String carName) {
        this.description = description;
        this.carName = carName;

    }

    public void startEngine(){

        System.out.println(this.getClass().getSimpleName()+" car engine is started...\n"+description);

    }

    public void drive(){

        System.out.println(this.getClass().getSimpleName()+" Car started driving...! ");


    }

    public void stop(){
        System.out.println(getClass().getSimpleName()+" Car is Stopped...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "description='" + description + '\'' +
                ", carName='" + carName + '\'' +
                '}';
    }

    protected void runEngine(){

        System.out.println(this.getClass().getSimpleName()+" engine is running...!");
    }


    public static Car getCar(String type, String carName,String description,double avgKmPer){

        return switch (type.toUpperCase()){
            case "G"->new GasPowered(description,carName,avgKmPer);
            case "E"->new ElectricPowered(description,carName,avgKmPer);
            case "H"->new HybridPowered(description,carName,avgKmPer);
            default -> new Car(carName,description);
        };

    }



}
