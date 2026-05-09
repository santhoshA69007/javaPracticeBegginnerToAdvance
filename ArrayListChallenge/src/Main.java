//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   int n=-1;
   ArrayList<String> groceries=new ArrayList<>();
   Scanner scanner=new Scanner(System.in);
   boolean isRunning=true;
    while(isRunning){

        System.out.println("""
                0 for quit the program
                1 for insert the grociers item comma delimited!
                2 for remove teh grociers items comma delimted!
                
                
                """);

        n=scanner.nextInt();

        scanner.nextLine();


        switch (n){
            case 0-> isRunning=false;
            case 1->{
                System.out.println("enter the grociers items to insert:");
                String sg= scanner.nextLine();
                List<String > lt=(List.of(sg.split(",")));
                if(!groceries.containsAll(lt)){
                    groceries.addAll(lt);

                }
                else {
                    System.out.println("duplicates are not allowed!");
                }
            }
            case 2->{
                System.out.println("enter the grociers items to remove:");
                String sg= scanner.nextLine();
                List<String > lt=(List.of(sg.split(",")));
                if(groceries.containsAll(lt)){
                    groceries.removeAll(lt);
                }
                else{
                    System.out.println("items not found to be removed!");
                }
            }

            default -> System.out.println("enter the correct number");
        }

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);




    }


}
