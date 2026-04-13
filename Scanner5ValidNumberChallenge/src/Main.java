public static void valid5NumbersCheck(){

    int count =1;
     boolean valid=true;
     int sum=0;
    while(count<=5){
        System.out.println("#"+count+"enter the number:");
            Scanner scanner=new Scanner(System.in);
        try{
            int num=Integer.parseInt(scanner.nextLine()); //if errors occurs it doesnt execute code below straight jumps to catch thatst whycount dont ++
            count++;
            sum+=num;
        }
        catch (NumberFormatException n){
            System.out.println("invalid number!");
            valid=false;
        }
    }

    System.out.println(valid?"all 5 numbers are valid sum is:"+sum:"some or all numbers are invalid!");

}


void main() {
    valid5NumbersCheck();

}
