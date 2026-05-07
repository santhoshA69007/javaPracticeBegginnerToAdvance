//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



void main() {

    Object[] groceryItems=new Object[3];
    groceryItems[0]=new GroceryItem("MILK");
    groceryItems[1]=new GroceryItem("APPLES","PRODUCE",5);
    groceryItems[2]="5 oranges!";
    System.out.println(Arrays.toString(groceryItems));
    ArrayList objectList=new ArrayList<>();
    objectList.add(new GroceryItem("Butter"));
    objectList.add("yogurt");
    System.out.println(objectList);
    ArrayList<GroceryItem> groceryItems1=new ArrayList();
    groceryItems1.add(new GroceryItem("Milk"));
    groceryItems1.add(new GroceryItem("oranges","produce",5));
    groceryItems1.set(0,new GroceryItem("Yogurt"));
    groceryItems1.remove(1);
    System.out.println(groceryItems1);

}
