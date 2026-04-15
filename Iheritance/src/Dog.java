public class Dog extends  Animal{

    //because it inheriting the animal class there itself constructor parmaterized explicit her java doesnt create impolicit constructor
    //for the dog class i think


    private String earShape,tailShape;

   public Dog(){
        super("size","Mutt",50);

    }

    public  Dog(String type, double weight){

       this(type,weight,"Perky","Curled");

    }



    public Dog(String type, double weight, String earShape, String tailShape) {
        super((weight<15?"small":(weight<35?"medium":"large")), type, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void moves(String speed) {
        super.moves(speed);
//        System.out.println("Dogs walks ,run and wag thier tail");

   if(speed=="slow"){
       walk();
       wagTail();
   }
   else{
       run();
       bark();
   }
        System.out.println();
   }


public void makeNoise(){
      if(type=="wolf"){
          System.out.println("Ow Woooooo!");
      }
       bark();
    System.out.println();
}

    private void bark(){
        System.out.print("Woof!");
    }

    private void walk(){
        System.out.print("Dog Walking!");
    }

    private void run(){
        System.out.print("Dog Running!");
    }
    private void wagTail(){
        System.out.print("Tail Wagging!!");
    }





}
