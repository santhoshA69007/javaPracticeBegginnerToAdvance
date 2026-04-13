void main() {
sumAndAverage();
}

public static void sumAndAverage(){

    int sum=0,count=0;
    while(true){

        System.out.println("press any character other than integer will result progrm quitting!");
        System.out.println("enter the number:");
        try{
            Scanner scanner=new Scanner(System.in);
            int num=Integer.parseInt(scanner.nextLine());
            sum+=num;
            count++;
        }
        catch (NumberFormatException nfe){

            break;
        }

    }
    System.out.println("average is:"+(sum/count)+" and sum is:"+sum);
}
