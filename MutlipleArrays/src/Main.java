


void main() {

    int[][] arr=new int[3][3];

    for(int i=0;i<arr.length;i++){
        for(int j=0;i<arr.length;i++){
            arr[i][j]=i+1;
        }
    }

    arr[1]=new int[]{1,2,3,4,5};
    System.out.println(Arrays.deepToString(arr));



}
