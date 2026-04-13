
public static String printDayOfWeek(int week){

    return switch (week){
        case 0-> week+" is Sunday";
        case 1-> week+" is Monday";
        case 2-> week+" is Tuesday";
        case 3-> week+" is Wednesday";
        case 4-> week+" is Thursday";
        case 5-> week+" is Friday";
        case 6-> week+" is Saturday";
        default-> {
            yield week+" is not a week";
        }
    };
}

public static String printWeekDay(int week){

    if (week == 0) {
       return week + " is Sunday";
    } else if (week == 1) {
       return week + " is Monday";
    } else if (week == 2) {
       return week + " is Tuesday";
    } else if (week == 3) {
       return week + " is Wednesday";
    } else if (week == 4) {
       return week + " is Thursday";
    } else if (week == 5) {
        return week + " is Friday";
    } else if (week == 6) {
       return week + " is Saturday";
    } else {
       return  week + " is not a week";
    }

}

void main() {
    System.out.println(printDayOfWeek(9));
    System.out.println(printWeekDay(9));
}
