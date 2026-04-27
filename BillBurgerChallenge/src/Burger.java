public class Burger extends Item{

    private static final double PRIZE=15.00;
    private DeluxeBurger deluxeBurger;
    private Item extra1,extra2,extra3;

    public Burger(String type, String name, String size) {
        super(type, name, PRIZE, size);

    }

    public double getToppingPrice(String extra){

        return switch (extra){
            case "AVACADO"->2;
            case "HAM","BACON","CHICKEN"->1.5;
            default -> 0;
        }
        ;
    }

    public void addToppings(String extra1,String extra2,String extra3){

        this.extra1=new Item("TOPPING",extra1,getToppingPrice(extra1));
        this.extra2=new Item("TOPPING",extra2,getToppingPrice(extra2));
        this.extra3=new Item("TOPPING",extra3,getToppingPrice(extra3));

    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice()+(extra1!=null? extra1.getAdjustedPrice() : 0)+(extra2!=null? extra2.getAdjustedPrice() : 0)+(extra3!=null? extra3.getAdjustedPrice() : 0);
    }

    public void extraToppingPrice(){

        printItem("BASE BURGER",super.getAdjustedPrice());

        if(extra1!=null){
            extra1.printItem();
        }
        if(extra2!=null){
            extra2.printItem();
        }
        if(extra3!=null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {

        extraToppingPrice();
        System.out.println("-".repeat(25));
        super.printItem();
    }

}

class DeluxeBurger extends Burger{

    private final int MAX_TOPPING_LIMIT=5;
    private final double PRIZE=30;
    private final int MAX_BURGER_NO=1;
    private final int TOPPING_PRICE=0;

    public DeluxeBurger(String type, String name, String size) {
        super(type, name, size);

    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice();
    }

    @Override
    public void printItem() {
        super.printItem();
    }






    public int getMAX_TOPPING_LIMIT() {
        return MAX_TOPPING_LIMIT;
    }


    public double getPRIZE() {
        return PRIZE;
    }


    public int getMAX_BURGER_NO() {
        return MAX_BURGER_NO;
    }
    public double getTOPPING_PRICE() {
        return TOPPING_PRICE;
    }


}