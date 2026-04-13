
public static void perfectNumber(int num){
    int res=0;
    for(int i=1;i<num;i++){

        if(num%i==0){
            res+=i;
        }



    }

    System.out.println(res==num?"perfect number":"not a perfect number");


}

void main() {

perfectNumber(15);
perfectNumber(6);
}
