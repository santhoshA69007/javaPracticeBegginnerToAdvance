//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

int[]res=getRandomArray(5);


    System.out.println(Arrays.toString(res));
Arrays.sort(res);

for(int i=res.length-1;i>=0;i--){
    System.out.print(res[i]+" ");
}


}


public int[] getRandomArray(int size){

    int[] arr= new int[size];
    Random random=new Random();

    for(int i=0;i<arr.length;i++){
        arr[i]=random.nextInt(10);
    }

    return arr;
}
