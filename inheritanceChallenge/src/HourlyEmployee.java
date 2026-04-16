public class HourlyEmployee extends Employee  {
    private double hourlyPay;


    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPay) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPay = hourlyPay;
    }

    public double getDoublePay(){
        return hourlyPay*2;

    }




    public double collectPay(int num) {
        return num;
    }



    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPay=" + hourlyPay +
                "} " + super.toString();
    }
}
