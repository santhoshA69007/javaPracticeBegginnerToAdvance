public static void sumFirstAndLastDigit(int n){
    if(n>0){

    int lastDigit=n%10;
    while(n>9){

        n/=10;
    }

    int firstDigit=n;
    System.out.println("the sum of "+lastDigit+" + "+firstDigit+" ="+(firstDigit+lastDigit));

    }
else{
        System.out.println("invalid negative number or zero");
    }
}

void main() {
sumFirstAndLastDigit(121);
sumFirstAndLastDigit(1221);
sumFirstAndLastDigit(99999221);
sumFirstAndLastDigit(-345234536);
}
