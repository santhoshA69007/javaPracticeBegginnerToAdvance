
public static void sumOfAllEvenDigits(int n){

    int sum=0;
    int count=0;

    int digits=0;
    int temp=n;
    while(temp>0){
        digits++;
        temp/=10;
    }


    while(n>9){

       if(digits%2==0){


        sum+=n%10;
       }
       digits--;
        n/=10;
    }


//    sum+=n;

    System.out.println("sum of all digits is:"+sum);

}



void main() {
sumOfAllEvenDigits(121);
sumOfAllEvenDigits(123);
sumOfAllEvenDigits(444);
sumOfAllEvenDigits(1234567891);
}
