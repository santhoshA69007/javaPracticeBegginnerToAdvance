//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    LinkedList<String> placesToVisit=new LinkedList<>();
    var placesToVist=new LinkedList<String>();
    placesToVist.add("Sydney");
    placesToVist.add(0,"Camberra");
 addMore(placesToVist);
    System.out.println(placesToVist);
//    gettingElements(placesToVist);
//    removeElements(placesToVist);
//    printItnerary(placesToVist);
//    printItnerary2(placesToVist);
//    printItnerary3(placesToVist);
//    System.out.println(placesToVist);
testIterator(placesToVist );

}

public static void testIterator(LinkedList<String> list){
    var iterator=list.listIterator();
    while(iterator.hasNext()){
//        System.out.println(iterator.next());

    if(iterator.next().equals("Santhosh")){
        iterator.add("Lake Wivenhoe");
    }
    }

    while(iterator.hasPrevious()){
        System.out.println(iterator.previous());
    }
    var iterator2=list.listIterator(3);
    System.out.println(iterator2.previous());

    System.out.println(list);
}

public static void printItnerary(LinkedList<String> list){
    System.out.println("Trip starts at "+list.getFirst());
    for (int i = 1; i <list.size() ; i++) {
        System.out.println("--> From: "+list.get(i-1)+" to "+list.get(i));
    }
    System.out.println("Trip ends at "+list.getLast());
}

public static void printItnerary2(LinkedList<String> list){
    System.out.println("Trip starts at "+list.getFirst());
   String previousTown=list.getFirst();
   for(String town:list){
       System.out.println("--> From: "+previousTown+" to "+town);
      previousTown=town;
   }
    System.out.println("Trip ends at "+list.getLast());
}
public static void printItnerary3(LinkedList<String> list){
    System.out.println("Trip starts at "+list.getFirst());
   String previousTown=list.getFirst();
   ListIterator<String> iterator=list.listIterator(1);
   while(iterator.hasNext()){
       var town=iterator.next();
       System.out.println("--> From: "+previousTown+" to "+town);
  previousTown=town;
   }
    System.out.println("Trip ends at "+list.getLast());
}


public static void addMore(LinkedList<String> list){
    list.addFirst("Santhosh");
    list.addLast("aditi");
    //Queue Methods
    list.offer("Melbourne");
    list.offerFirst("Bribane");
    list.offerLast("Toowoomba");
    //Stack Methods

    list.push("Alice Springs");

    //queue /dequeu poll methods

    String p1= list.poll();
    System.out.println(p1);
    String p2= list.pollFirst();
    System.out.println(p2);
    String p3= list.pollLast();
    System.out.println(p3);

    list.push("hi");
    list.push("hello");
    list.push("helloa");
    String p4= list.pop();
    System.out.println(p4);


}



public static void removeElements(LinkedList<String> lists) {

    lists.remove(4);
    lists.remove("Bribane");
    System.out.println(lists);
    String s1=lists.remove(); //removes first element
    System.out.println(s1+" was removed");

    String s2=lists.removeFirst(); //removes first element
    System.out.println(s2+" was removed");

    String s3=lists.removeLast(); //removes first element
    System.out.println(s3+" was removed");


}

public static void gettingElements(LinkedList<String> list){

    System.out.println("Retrieved Element="+list.get(4));
    System.out.println("First Element="+list.getFirst());
    System.out.println("First Element="+list.getLast());
    System.out.println("hi is at position "+list.indexOf("hi"));
    System.out.println("hello is at position "+list.indexOf("hello"));
//Queue retrieveal method

    System.out.println("Element from element ()="+list.element());
// Stack retrieval metods
    System.out.println("Element from peek()="+list.peek());
    System.out.println("Element from peekFirst()="+list.peekFirst());
    System.out.println("Element from peekLasst()="+list.peekLast());
}