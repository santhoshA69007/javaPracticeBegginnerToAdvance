import javax.swing.*;

void main() {
BaseballTeam phillies1=new BaseballTeam("Philadephia phillies");
BaseballTeam astros1=new BaseballTeam("Houston Astros");
scoreResult(phillies1,3,astros1,5);


    SportsTeam phillies2=new SportsTeam("Philadephia phillies");
    SportsTeam astros2=new SportsTeam("Houston Astros");
    scoreResult(phillies2,3,astros2,5);

    Team<BaseballPlayer> phillies=new Team("Philadephia phillies");
    Team<BaseballPlayer> astros=new Team("Houston Astros");
    var guthrie =new  BaseballPlayer("D Guthrie","Center Fielder");
    phillies.addTeamMember(guthrie);
    scoreResult(phillies,3,astros,5);

var harper=new BaseballPlayer("B Harper","Right Fielder");
var marsh=new BaseballPlayer("B Marsh","Right Fielder");

phillies.addTeamMember(harper);
phillies.addTeamMember(marsh);
phillies.listTeamMembers();

    Team<FootballPlayer> afc =new Team<FootballPlayer>("Adelaide Crows");
    var tex=new FootballPlayer("Tex Walker","Centre half forward");
    afc.addTeamMember(tex);
    afc.listTeamMembers();

    afc.listTeamMembers();

}

public static void scoreResult(BaseballTeam team1,int t1_score,BaseballTeam team2, int t2_score){
    String message=team1.setScore(t1_score,t2_score);
    team2.setScore(t2_score,t1_score);
    System.out.printf("%s %s %s %n",team1,message,team2);

}

public static void scoreResult(SportsTeam team1,int t1_score,SportsTeam team2, int t2_score){
    String message=team1.setScore(t1_score,t2_score);
    team2.setScore(t2_score,t1_score);
    System.out.printf("%s %s %s %n",team1,message,team2);

}

public static void scoreResult(Team team1,int t1_score,Team team2, int t2_score){
    String message=team1.setScore(t1_score,t2_score);
    team2.setScore(t2_score,t1_score);
    System.out.printf("%s %s %s %n",team1,message,team2);

}