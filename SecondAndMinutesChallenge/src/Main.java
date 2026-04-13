
public static String getDurationString(int seconds){
    int hour,min,sec;
//    if( seconds>0&&seconds>=3600) {
//        hour = seconds / 3600;
//        min = (seconds % 3600) / 60;
//        sec = (seconds % 3600) % 60;
//    }
//    else if(seconds>0&&seconds<3600){
//        hour=0;
//        min=(seconds/60);
//        sec=(seconds%60);
//        }

    if(seconds>0){
        min=seconds/60;
        hour=min/60;
        min=min%60;
        sec=seconds%60;
    }
    else {
        return "invalid input try again!";
    }
        return getDurationString(hour,min,sec);
    }


public static String getDurationString(int min,int sec){

    if(min<0 || sec <0 || sec>59){
        return "invalid input try again";
    }
    int secConversion=min*60;
    int totalSec=secConversion+sec;
    return getDurationString(totalSec);
}



public static String getDurationString(int hour,int min,int sec){

    return hour+"h "+min+"m "+sec+"s";

}


void main() {
String res=getDurationString(3945);
    System.out.println(res);
    System.out.println(getDurationString(65,45));
    System.out.println(getDurationString(65,145));

}
