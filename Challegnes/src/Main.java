//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void checkNumber(int num){

        if(num==0){
          System.out.println("Zero");
        } else if (num<0) {
            System.out.println("negative");

        }
        else {
            System.out.println("positive");
        }
    }


    public static void main(String[] args) {

        checkNumber(-5);
        checkNumber(0);
        checkNumber(10);
    }
}