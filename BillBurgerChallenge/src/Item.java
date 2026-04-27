public class Item {
    private String type;
    private String name;
    private int quantity;
    private double price;
    private static double totalPrice=0;
    private String size="DEFAULT";

    public Item(String type, String name, double price, String size) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.size = size;
        totalPrice+=price;
    }
    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
        totalPrice+=price;
    }

    public int getQuantity() {
        return quantity;
    }

   public static double getTotalPrice(){
        return totalPrice;
   }

    public double getPrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (getSize()){
            case "SMALL"->getPrice()-0.5;
            case "BIG"->getPrice()*1.5;
            default -> getPrice();
        };
    }

    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void printItem(String name, double price){

        System.out.printf("%s : %.2f %n",name,price);

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public  void printItem(){
        Item.printItem(getName()+" "+getType(),getAdjustedPrice());
    }



}
