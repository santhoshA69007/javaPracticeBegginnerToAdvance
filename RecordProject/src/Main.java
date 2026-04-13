void main() {

    for (int i=1;i<=5;i++){

    Student std=new Student("studentid"+i,switch (i){
        case 1->"bob";
        case 2->"mary";
        case 3->"tim";
        case 4->"thomas the train";
        case 5->"ben 10";
        default -> "unknown";
    },"10-08"+(1997+i),"java masterclass");
        System.out.println(std);

    }

}
