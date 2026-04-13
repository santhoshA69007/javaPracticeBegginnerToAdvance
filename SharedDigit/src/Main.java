public static void sharedDigitCheck(int n1,int n2){
    boolean isShareddigit=false;
    while(n1>0 && !isShareddigit){
       int tempN2=n2;
       while(tempN2>0){

           if(tempN2%10==n1%10){
               System.out.println("shared digit found!") ;
              isShareddigit=true;
              break;

           }
           tempN2/=10;

       }
       n1/=10;


    }


}



void main() {


    sharedDigitCheck(129999,29);
}
