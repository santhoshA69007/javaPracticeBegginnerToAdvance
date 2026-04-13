public static void minAndMax(){

    boolean valid=true;
    int max=0,min=0;
    while (valid){

        Scanner scanner=new Scanner(System.in);
        System.out.println("max="+max+" and min="+min);
        try{
            int num=Integer.parseInt(scanner.nextLine());

            min=num>max?max:num;
            max=(num>max)?num:max;

        }
        catch (NumberFormatException nfe){
            System.out.println("program quiting presisng any non integer or string or char leads breaking loop!");
            valid=false;
        }


    }
    System.out.println("so the max="+max+" and min="+min);
}

void main() {
minAndMax();
}
