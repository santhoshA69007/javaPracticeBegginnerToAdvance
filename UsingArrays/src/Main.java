//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    for(int el:getRandomArray()){
        System.out.print(el+" ");
    }
    System.out.println();
    int[] arr=getRandomArray();
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int[] secondArr=new int[5];

    System.out.println(Arrays.toString(secondArr));
    Arrays.fill(secondArr,5);
    System.out.println(Arrays.toString(secondArr));

    int [] thirdArray= getRandomArray();
    System.out.println(Arrays.toString(thirdArray));
    int [] fourthArray=Arrays.copyOf(thirdArray,thirdArray.length);
    System.out.println(Arrays.toString(fourthArray));

    Arrays.sort(fourthArray);
    System.out.println(Arrays.toString(thirdArray));
    System.out.println(Arrays.toString(fourthArray));

    int [] newArr=Arrays.copyOf(thirdArray,2);
    System.out.println(Arrays.toString(newArr));
    newArr=Arrays.copyOf(thirdArray,29);

    System.out.println(Arrays.toString(newArr));

    String[] sArray={"Able","Jane","Mark","Ralph","David"};

    if(Arrays.binarySearch(sArray,"Mark")>0){

        System.out.println("Mark is ther ein the list!");
    }


    int[] s1={1,2,3,4,5};
    int[] s2={1,2,3,4,5};
    if(Arrays.equals(s1,s2)){
        System.out.println("both arrays are eequla");
    }
    else {
        System.out.println("both arrays are not equals");
    }
}

private int[] getRandomArray(){

    Random random=new Random();

    int[] arr=new int[5];
    for (int i=0;i<arr.length;i++){
        arr[i]=random.nextInt(100);
    }

    return arr;
}
