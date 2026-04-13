//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.





public class Main {

    public static int calculateHighScorePosition(int score){
        int res=4;
        if(score>=1000){
            res=1;
        } else if (score>=500) {
            res=2;
            
        }
        else if(score>=100){
            res=3;
        }


        return res;


    }

    public static void displayHighScoreList(String name,int position){

        System.out.println(name+" managed to get into position "+position+ " on the highscore list");

    }
    public static void main(String[] args) {

        int position=calculateHighScorePosition(50);
        displayHighScoreList("tim",position);

         position=calculateHighScorePosition(1050);
        displayHighScoreList("santhosh",position);

        position=calculateHighScorePosition(500);
        displayHighScoreList("bob",position);

        position=calculateHighScorePosition(999);
        displayHighScoreList("tim",position);


    }
}