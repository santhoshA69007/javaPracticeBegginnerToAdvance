public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
if(speed.equals("slow")){
    System.out.println(getExplicitType()+" lazily swimming");
}
else{
    System.out.println(getExplicitType()+" daring frantically");
}
    }

    @Override
    public void makeNoise() {

        if(type=="GoldFish"){
            System.out.println("swish!");

        }
else{
            System.out.println("splash!");
        }
    }

}
