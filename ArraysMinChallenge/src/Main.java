//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("smallest number in the arrays is:"+findMinimum(readIntegers()));
}

public int[] readIntegers(){

    Scanner scanner=new Scanner(System.in);

    int[] arr=new int[5];

    for (int i = 0; i < arr.length; i++) {
        System.out.println("Enter the number"+i+":");
        arr[i]=scanner.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    return arr;
}

public int findMinimum(int[] arr){

    int min=arr[0];
    for(int i:arr){

        if(i==min) continue;
        if(min>i){
            min=i;
        }
    }
    return min;

}
