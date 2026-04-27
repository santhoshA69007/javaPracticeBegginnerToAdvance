//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    int[] myIntArray=new int[10];
    myIntArray[5]=50;
    double[] myDoubleArray=new double[10];
    myDoubleArray[2]=3.5;
    System.out.println(myDoubleArray[2]);
    int[] firstTen={1,2,3,4,5,6,7,8,9,10};
    System.out.println("FIRST NUMBER:"+firstTen[0]);
    int size=firstTen.length;
    System.out.println("LENGTH OF THE ARRAY:"+size);
    System.out.println("LAST ELEMENT IN THE ARRAY:"+firstTen[size-1]);

    int newArr[];
//    newArr=new int[]{1,2,3,4,5};

     newArr=new int[5];
    for(int i=0;i<newArr.length;i++){
       newArr[i]=i;
    }

    for(int i=0;i<newArr.length;i++){
        System.out.print(newArr[i]+"->");
    }
    System.out.println();

    for(int element:newArr){
        System.out.print(element+" ");
    }
    System.out.println();
    System.out.println(Arrays.toString(newArr));

    Object obj=newArr;

    if(obj instanceof int[]){
        System.out.println("obj is really an instance of int[]");
    }


}



public static void hello(int[] arr){
    System.out.println(Arrays.toString(arr));
}
