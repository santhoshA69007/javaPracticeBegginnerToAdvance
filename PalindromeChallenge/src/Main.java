public static boolean isPalindrome(int num){

    int res=0;
    int temp=num;

    while(temp>9){
       res=10*(res+(temp%10));
       temp/=10;

    }
    res+=temp;
    System.out.println(res);
    return res==num;

}

void main() {
    int num=99;
    System.out.println(num+" is a palindrome ="+isPalindrome(num));

}
