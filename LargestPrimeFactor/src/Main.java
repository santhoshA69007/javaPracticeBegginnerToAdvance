
public static void largestPrimeFactor(int num){
    int maxPrimeFactor=num;
    boolean isPrime=true;


    for(int i=2;(i<num&&num>0);i++){
     isPrime=true;
        for (int j=2;j<i;j++){

            if(i%j==0){
                isPrime=false;
                break;
            }

        }
        if(isPrime && num% i==0){

        maxPrimeFactor=isPrime?i:maxPrimeFactor;
        }


    }

    System.out.println("largest prime factors is:"+maxPrimeFactor);
}

void main() {
largestPrimeFactor(7);
largestPrimeFactor(21);
largestPrimeFactor(217);
largestPrimeFactor(45);
largestPrimeFactor(-1);
}
