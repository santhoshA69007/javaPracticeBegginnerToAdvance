
public static void factorsOfGivenNumber(int num){
    System.out.print(num+" factors are:");
    for(int i=1;i<=num;i++){

        if(num%i==0){

            System.out.print(","+i);
        }
    }

}

void main() {
factorsOfGivenNumber(20);
}
