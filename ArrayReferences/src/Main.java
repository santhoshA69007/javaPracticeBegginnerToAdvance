//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    int[] firstArr=new int[5];
    int[] secArr=firstArr;

    System.out.println(Arrays.toString(firstArr));
    System.out.println(Arrays.toString(secArr));

    firstArr[0]=1;

    System.out.println(Arrays.toString(secArr));

}
