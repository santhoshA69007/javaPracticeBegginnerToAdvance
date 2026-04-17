public class BedRoom {
    private Wall wall1,wall2,wall3,wall4;
    private Lamp lamp;
    private Ceiling ceiling;
    private Bed bed;
    private String bedRoomName;


    public BedRoom(Wall wall1,Wall wall2,Wall wall3,Wall wall4, Lamp lamp, Ceiling ceiling, Bed bed) {
        this.wall1= wall1;
        this.wall2= wall2;
        this.wall3= wall3;
        this.wall4= wall4;
        this.lamp = lamp;
        this.ceiling = ceiling;
        this.bed = bed;
    }


    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){

       bed.make();

    }



}
