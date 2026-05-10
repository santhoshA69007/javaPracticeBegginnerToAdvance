//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Integer boxedInt=Integer.valueOf(15); //prefreed but unnecessary
    Integer deprecatedBoxing= new Integer(15); //deprecated sicnce jdk9
    int unboxedInt =boxedInt.intValue();

    //Automatic
    Integer autoBoxed=15;
    int autoUnboxed=autoBoxed;
    System.out.println(autoBoxed.getClass().getName());

  Double resultBoxed=getLiteralDoublePrimitive();
  double resultUnboxed=getDoubleObject();

  Integer[] wrapperArray=new Integer[5];
  wrapperArray[0]=5;
    System.out.println(wrapperArray[0].getClass());

 Character[] characterArray={'a','b','c','d'};
    System.out.println(Arrays.toString(characterArray));

    var outList=getList(1,2,3,4,5);
    System.out.println(outList);

}



private static ArrayList<Integer> getList(Integer... varargs){
    ArrayList<Integer> aList=new ArrayList<>();
    for(int i:varargs){
        aList.add(i);
    }
    return aList;
}



private static Double getDoubleObject(){
    return Double.valueOf(100.00);
}

private static Double getLiteralDoublePrimitive(){
    return 100.00;
}

private static int returnAnInt(Integer i){
    return i;
}
private static Integer returnAnInteger(int i){
    return i;
}
