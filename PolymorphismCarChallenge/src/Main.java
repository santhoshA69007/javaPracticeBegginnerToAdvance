//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Car buggatti=Car.getCar("E","buggatti","electric sports car fast",20);
doCarThings(buggatti);
    Car Toyota=Car.getCar("G","Toyota","Gas powered  car for families",25);
    doCarThings(Toyota);
    System.out.println("--".repeat(10));

    Car tata=Car.getCar("H","Tata","Gas and Electric powered  car for families",40);
     doCarThings(tata);



    Car kia=Car.getCar("H","kia","Gas and Electric powered  car for families",40);

   doCarThings(kia);




}


public static void doCarThings(Car car){

    car.startEngine();
    car.runEngine();
    car.drive();
    car.stop();
    System.out.println(car);

}
