public class Refrigerator {
private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("ordering.... taking milk from fridge pouring it in glass!");
        }

    }


}
