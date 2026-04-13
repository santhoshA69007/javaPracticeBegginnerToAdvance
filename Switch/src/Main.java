import com.sun.source.tree.BreakTree;

void main() {
//int value=1;
//if(value==1){
//    System.out.println("The value was 1");
//} else if (value==2) {
//    System.out.println("The value was 2");
//}
//else {
//    System.out.println("The value neither 2 or 1");
//}
int switchValue=3;

switch (switchValue){
    case 1->System.out.println("Value was 1");

    case 2->
        System.out.println("Value was 2");

    case 3,4,5->{

        System.out.println("was a 3 , a 4 , was a 5");
        System.out.println("actually it is "+switchValue);
    }

    default ->System.out.println("Was not 1 or 2,3,4,5");
}

String month="4OCT";
    System.out.println(month+ " the quater "+getQuater(month ));

}

public static String getQuater(String month){
    return switch (month) {
        case "JAN", "FEB", "MAR" -> "1st";
        case "APRIL", "MAY", "JUN" -> "2nd";
        case "JUL", "AUG", "SEPT" -> "3rd";
        case "OCT", "NOV", "DEC" -> "4th";
        default -> {
             month=month+" is not a valid month";
            yield month;
        }
    };
}
