public class EnchancedPlayer {
    private String fullName,weapon;
    private int healthPercentage;

    public EnchancedPlayer(String fullName) {
        this(fullName,"Sword",100);
    }

    public EnchancedPlayer(String fullName, String weapon, int health) {
        this.fullName = fullName;
        this.weapon = weapon;
        this.healthPercentage = health<0?1:(health>100?100:health);
    }

    public void loseHealth(int damage){
        healthPercentage -=damage;

        if(healthPercentage <=0){
            System.out.println("player knocked out of the game!");
        }
    }

    public int healthReaming(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){

        healthPercentage +=extraHealth;
        if(healthPercentage >100){
            System.out.println("player health restored to 100%");
            healthPercentage =100;
        }

    }
}
