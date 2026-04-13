public class LeapYear {

    public static boolean isLeapYear(int year){
        boolean leapYear=false;
        if(year>=1 && year<=9999){
            if(year%4!=0)leapYear=false;

            else{
                leapYear= (year%100==0&&year%400==0);
            }

        }
    return leapYear;
    }
    public static void main(String[] args) {


        System.out.println(isLeapYear(2400));

    }
}
