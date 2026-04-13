void main() {
for (int counter=1;counter<=5;counter++){
    System.out.println(counter);
}

for(double rate=2;rate<=5.0;rate++){

    System.out.println("10,000 of"+rate+"% intrest ="+calculateInterest(10000,rate));
}
for(double rate=7.5;rate<=10.0;rate+=0.25){
    if(rate>8.5) break;
    System.out.println("$100 at"+rate+"% intrest ="+calculateInterest(100,rate));
}


}

public static double calculateInterest(double amount,double interestRate){
    return (amount*(interestRate/100));
}
