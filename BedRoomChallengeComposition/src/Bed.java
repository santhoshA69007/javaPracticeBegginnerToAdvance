public class Bed {
private String type;
private  int pillows,height,sheets,quilt;

    public Bed(String type, int pillows, int height, int sheets, int quilt) {
        this.type = type;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getType() {
        return type;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make(){
        System.out.println("making the bed... bed is done!");
    }




}
