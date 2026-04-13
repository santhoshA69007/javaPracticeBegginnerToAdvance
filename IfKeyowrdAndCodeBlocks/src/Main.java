//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         boolean gameOver=true;
         int score=900;
         int levelCompleted=5;
         int bonus=100;
         if(score<5000 && score >1000){
             System.out.println("Your score was less than or equal to 5000");
         }
         else if(score <1000){
             System.out.println("your score was less than 1000");
         }
         else{
             System.out.println("Got here");
         }

    }

}