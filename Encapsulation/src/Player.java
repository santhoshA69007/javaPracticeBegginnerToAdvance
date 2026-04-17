public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health-=damage;

        if(health<=0){
            System.out.println("player knocked out of the game!");
        }
    }

    public int healthReaming(){
        return health;
    }

    public void restoreHealth(int extraHealth){

        health+=extraHealth;
        if(health>100){
            System.out.println("player health restored to 100%");
        health=100;
        }

    }

}
