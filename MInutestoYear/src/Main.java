

public static void printMinutesToYearsAndDays(long min){

    //1 hour 60mins
    //1 day 24 hours
    //1 year 365  days

    long hour,days,year;

    hour=min/60;
    days=hour/24;
    year=days/365;
    days=days%365;

    System.out.println("year "+year+" days "+days);
}

void main() {

    printMinutesToYearsAndDays(525600);
    printMinutesToYearsAndDays(1051200);
    printMinutesToYearsAndDays(561600);
  

}
