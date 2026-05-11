import java.util.ArrayList;

public class Store {
    ArrayList<Product> products=new ArrayList<>();


    public void addProduct(Product product){

        products.add(product);

        System.out.println(  product.productInfo());
        System.out.println(product.getProductName()+" product added successfully to your card!");
    }


    public void getBill(){
        double totalPrice=0;
        for(Product product:products){
            product.printPricedItem(1);
            totalPrice+=product.getSalesPrice();


        }

        System.out.println("total price is: "+totalPrice);
    }


}



abstract class Product{

    double price;
    String type;
    String description;


    public Product(double price, String type, String description) {
        this.price = price;
        this.type = type;
        this.description = description;
    }

   final  public double getSalesPrice(){
        return price;
    }


   final public   void printPricedItem(int quantity){
       System.out.println(getClass().getSimpleName()+" : "+(price*quantity));
   }


   final public String getProductName(){
        return getClass().getSimpleName();
   }

   final public String productInfo(){
        return String.format("""
                category:%s
                name:%s
                price:%f
                description:%s
                """,this.type,this.getProductName(),this.price,this.description);
   }

}



class Phone extends Product {

    double size;
    int batteryMah;


    public Phone(double price, String type, String description, double size, int batteryMah) {
        super(price, type, description);
        this.size = size;
        this.batteryMah = batteryMah;
    }
}

class Charger extends Product{

    double length;
    boolean braided;

    public Charger(double price,String type, String description, double length, boolean braided) {
        super(price, type, description);
        this.length = length;
        this.braided = braided;
    }
}

