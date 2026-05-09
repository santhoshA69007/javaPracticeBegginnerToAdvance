//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    LinkedList<Town> towns=new LinkedList<>();

    addTown(towns,new Town("Brisbane",917));
    addTown(towns,new Town("Darwin",3972));
    addTown(towns,new Town("Melbourne",877));
    addTown(towns,new Town("Perth",3923));
    towns.addFirst(new Town("Sydney",0));
    boolean flag=true;
    ListIterator<Town> it= towns.listIterator();
    while(flag){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                
                """);
        Scanner scanner=new Scanner(System.in);

        switch (scanner.nextLine()){
            case "F"->{
            if(it.hasNext()){
                System.out.println(it.next().name);
            }

            }
            case "B"->{
                if(it.hasPrevious()){
                    System.out.println(it.previous().name);
                }
            }
            case "L"->{
                for(Town to:towns){
                    System.out.println(to.name);
                }
            }

            case "M"->{
                for(Town to:towns){
                    System.out.printf("""
                            name:%s  distance%d
                            """,to.name,to.distance);
                }
            }

            case "Q"->{
                flag=false;
            }

            default -> System.out.println("enter specified action words only!");
        }
    }


}

public static void addTown(LinkedList<Town> list,Town town) {



    for (Town town1 : list) {
        if (town.name.equalsIgnoreCase(town1.name)) {
            System.out.println("Found duplicate " + town1.name);
            return;
        }
    }

    int matchedIndex=0;
    for(Town tt:list){
    if(town.distance<tt.distance){
            list.add(matchedIndex,town);
            return;
        }
        matchedIndex++;
    }

    list.add(town);

}


class Town{

     String name;
     int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }
}
