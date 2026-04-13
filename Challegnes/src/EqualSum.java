public class EqualSum {
public static boolean isEqualSum(int a,int b,int c){
    return (a+b)==c;
}
    public static void main(String[] args) {

        System.out.println(isEqualSum(1,2,3));
        System.out.println(isEqualSum(1,1,1));
        System.out.println(isEqualSum(1,-1,0));
    }
}
