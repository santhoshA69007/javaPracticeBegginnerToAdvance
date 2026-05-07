//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
String [] originalArray=new String[] {"First","Second","Third"};
var originalList=Arrays.asList(originalArray);
originalList.set(0,"one");
    System.out.println("List:"+originalList);
    System.out.println("array:"+Arrays.toString(originalArray));
originalList.sort(Comparator.naturalOrder());
    System.out.println("array:"+Arrays.toString(originalArray));

    List<String> newList=Arrays.asList("Sunday","Monday","Tuesday");
    System.out.println(newList);

}

