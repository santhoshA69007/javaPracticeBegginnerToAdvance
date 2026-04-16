public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private  Refrigerator refrigerator;
    private  DishWasher dishWasher;

    public SmartKitchen() {
        refrigerator=new Refrigerator();
        coffeeMaker=new CoffeeMaker();
        dishWasher=new DishWasher();
    }

    private void addWater(){

        coffeeMaker.setHasWorkToDo(true);

    }

    private  void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }

    private  void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(){

        pourMilk();
        addWater();
        loadDishWasher();
    }

    public void doKitchenWork(){


        System.out.println("smart kitchen started working !");
        refrigerator.orderFood();
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
        System.out.println("order served and cleaned!");


    }



}
