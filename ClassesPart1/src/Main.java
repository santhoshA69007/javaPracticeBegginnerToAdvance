void main() {

    Car car=new Car();
    car.setMake("Porsche");
    car.setModel("Carrera");

    car.setConvertible(true);
    car.setColor("blue");
    car.setDoors(2);
    car.describeCar();
    System.out.println("make="+car.getMake());
    System.out.println("model ="+car.getModel());

    Car targa=new Car();

    targa.setMake("Porsche");
    targa.setModel("targa");

    targa.setConvertible(false);
    targa.setColor("red");
    targa.setDoors(2);
    targa.describeCar();
    System.out.println("make="+targa.getMake());
    System.out.println("model ="+targa.getModel());
}

