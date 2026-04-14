void main() {

//    for (int i=1;i<=5;i++){
//
//    LpaStudent std=new LpaStudent("studentid"+i,switch (i){
//        case 1->"bob";
//        case 2->"mary";
//        case 3->"tim";
//        case 4->"thomas the train";
//        case 5->"ben 10";
//        default -> "unknown";
//    },"10-08"+(1997+i),"java masterclass");
//        System.out.println(std);
//
//    }

    Student std=new Student("bob62346","bob","10/08/2002","java masterclass");
    LpaStudent std1=new LpaStudent("bob62346","bob","10/08/2002","java masterclass");

    std.setName("bob the builder");

    System.out.println(std);
    System.out.println(std1);

}
