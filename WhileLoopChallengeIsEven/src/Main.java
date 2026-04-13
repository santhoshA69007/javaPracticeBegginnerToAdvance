

public static boolean isEven(int n){

    return n%2==0;
}



void main() {
    int i=5;
    int totalOdd=0;
    int totalEven=0;
    while(i<=20&&totalEven<5){

        if(isEven(i)){
            totalEven++;
        }
        else {
            totalOdd++;
        }
        i++;
    }
    System.out.println("total even number is:"+totalEven);
    System.out.println("total odd number is:"+totalOdd);
}
