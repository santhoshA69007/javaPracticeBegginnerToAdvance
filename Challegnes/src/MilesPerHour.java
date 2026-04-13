public class MilesPerHour {
    public static long milesPerHour(double kiloMeter){

        if(kiloMeter<0) return -1;
        double res=kiloMeter/1.609344d;

        return (long) Math.round( res);
    }

    public static void printConversion(double kiloMeter){
        long res=milesPerHour(kiloMeter);
        if(res<0) System.out.println("invalid");
        else {
            System.out.println(kiloMeter+" km/hr"+"="+res+" mi/hr");
        }
    }
    public static void main(String[] args) {


        printConversion(-1);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }
}

