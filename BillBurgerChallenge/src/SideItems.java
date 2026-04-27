public class SideItems {
    private int totalPrice;
    private int quantity;
    private ChickenFries chickenFries;
    private PotatoFries potatoFries;

   public SideItems(String type, String name, String size){

       if(type=="TYPE-2") chickenFries=new ChickenFries(type,name,size);
       else potatoFries=new PotatoFries(type,name,size);

   }




    public int getTotalPrice() {
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public ChickenFries getChickenFries() {
        return chickenFries;
    }

    public PotatoFries getPotatoFries() {
        return potatoFries;
    }
}


class ChickenFries extends Item{

    private static  double PRICE=5;


    public ChickenFries(String type, String name, String size) {
        super(type, name,PRICE, size);
    }


    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice();
    }

    public static void setPRICE(double PRICE) {
        ChickenFries.PRICE = PRICE;
    }

    public double getPRICE() {
        return PRICE;
    }
}


class PotatoFries extends Item {

    public PotatoFries(String type, String name, String size) {
        super(type, name, PRICE, size);
    }

    private static  double PRICE=2;


    public static void setPRICE(double PRICE) {
        PotatoFries.PRICE = PRICE;
    }

    public double getPRICE() {
        return PRICE;
    }
}