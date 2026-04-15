public class Worker {
    private String name,birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }


    public int getAge(){
        return 2026-Integer.parseInt(birthDate);
    }

    public double collectPay(){

        return 0;
    }

    public void terminate(String endDate){
        if(endDate.equals("2026")) System.out.println("retired");
        else System.out.println("still you can work!");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
