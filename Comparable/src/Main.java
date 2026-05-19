void main() {
Integer five=5;

Integer[] arr={1,0,2,3,4,10};
for(Integer i:arr){
    int val=five.compareTo(i);
    System.out.printf("%d %s %d : compareTo=%d%n",five,(val==0?"==":(val<0)?"<":">"),i,val);
}

String banana="banana";
String[] fruit={"apple","banana","pear","BANANA"};
    for(String s:fruit){
        int val=banana.compareTo(s);
        System.out.printf("%s %s %s  : compareTo=%d%n",banana,(val==0?"==":(val<0)?"<":">"),s,val);
    }


    Arrays.sort(fruit);
    System.out.println(Arrays.toString(fruit ));
    Student[] std={new Student("santhosh"),new Student("aditi"),new Student("bob")};

    for(Student s:std){
        int val=s.compareTo(s);
        System.out.printf("%s %s %s  : compareTo=%d%n",banana,(val==0?"==":(val<0)?"<":">"),s,val);
    }

    Comparator<Student> gpaSorter=new StudentGPAComparator();
    Arrays.sort(std,gpaSorter.reversed());
    System.out.println(Arrays.toString(std));
}
