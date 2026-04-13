
public static int digitSum(int num){
    if(num<0)return -1;
//    if(num%10<=0)return  num;
    int sum=0;
    while(num>9){

        sum+=(num%10);

        num/=10;

    }
    return sum+num;

}


void main() {
    System.out.println(digitSum(1000));
    System.out.println(digitSum(9));
    System.out.println(digitSum(-9));
    System.out.println(digitSum(125));
    System.out.println(digitSum(1234));
}
