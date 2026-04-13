public class EqualbyThreeDecimal {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        System.out.println((int)(num1*1000));
//       mistakes learnt %.3f doesnt match becaue it does round off
//       String substring didnt work because - and + numbers
//       multiply by 1000 means 3 digits move right side then casting with int so it removed the decimal then we compare
//now its working so key 1000

        // came up with own solution but f8cked it up 98/100 only roundoff is the problem i tried it then only seen the
        //working of this problem so no worries learnt from this mistake cheer up!
        return (int)(num1*1000)==(int)(num2*1000);
    }


    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.17567777,-3.175777));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));



    }
}
