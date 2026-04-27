public class Meals{

    private SideItems sideItems;
    private Drinks drinks;
    private Burger burger;


    public Meals(){
        this("REGULAR","COCA COLA","CHICKEN-FRIES");


    }
    public Meals(String burgerType,String drink,String sideItem){

        if(burgerType=="DELUXE"){
            burger=new DeluxeBurger("BURGER","DELUXE BURGER","BIG");
        }
        else {

         burger=new Burger("Burger",burgerType,"BIG");
        }
         drinks=new Drinks("TYPE-2",drink,"BIG");
         sideItems=new SideItems("TYPE-2",sideItem,"SMALL");


    }

    public double totalPrice(){
        double colaPrice=drinks.getCola()!=null?drinks.getCola().getAdjustedPrice():0;
        double spritePrice=(drinks.getSprite()!=null)?drinks.getSprite().getAdjustedPrice():0;
        double chickenFries=sideItems.getChickenFries()!=null?sideItems.getChickenFries().getAdjustedPrice():0;
        double potatoFries=sideItems.getPotatoFries()!=null?sideItems.getPotatoFries().getAdjustedPrice():0;
        if(burger instanceof DeluxeBurger) return  burger.getAdjustedPrice();
       else return burger.getAdjustedPrice()+(colaPrice+spritePrice)+chickenFries+potatoFries;
    }

    public void  printItemList(){

        if(burger instanceof DeluxeBurger){
            burger.printItem();
            Item.printItem(drinks.getCola().getName(),0);
            Item.printItem(sideItems.getChickenFries().getName(),0);
        }
        else{

        burger.printItem();
        drinks.getCola().printItem();
        sideItems.getChickenFries().printItem();
        }
        System.out.println("_".repeat(30));
        Item.printItem("TOTAL PRICE:",totalPrice());

    }



    public void addToppings(String e1,String e2,String e3){
        burger.addToppings(e1,e2,e3);
    }




}