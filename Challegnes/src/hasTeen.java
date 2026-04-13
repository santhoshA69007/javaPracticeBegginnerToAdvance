public class hasTeen {

    public  static boolean hasTeen(int a,int b,int c){
        boolean res=false;
        if(a<=19&&b>=13){
            res=true;
        } else if (b<=19&&b>=13) {
            res=true;
        } else if (c<=19&&c>=13) {
            res=true;
        }

        return res;

    }

  

    public static void main(String[] args) {
        System.out.println(hasTeen(23,24,23));
    }
}
