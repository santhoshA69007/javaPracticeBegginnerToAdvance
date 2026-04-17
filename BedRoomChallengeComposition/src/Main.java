//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Wall wall1 = new Wall("West");
    Wall wall2 = new Wall("East");
    Wall wall3 = new Wall("South");
    Wall wall4 = new Wall("North");

    Ceiling ceiling = new Ceiling(12, "white");

    Bed bed = new Bed("Modern", 4, 3, 2, 1);

    Lamp lamp = new Lamp("Classic", false, 75);

    BedRoom bedRoom = new BedRoom( wall1, wall2, wall3, wall4,lamp,ceiling,bed);
    bedRoom.makeBed();

    bedRoom.getLamp().turnOn();

    
}
