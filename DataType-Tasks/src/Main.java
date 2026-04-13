import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static void rectangleAreaPermimeter(int lenght,int breadth,char area){

        if(area=='a')System.out.println("reactangeleArea:"+lenght*breadth);
        else System.out.println("rectangelPermieter:"+2*(lenght+breadth));

    }

    static void circleDiaCircumArea(int radius){
        float PI=3.14f;
        float circum=2*PI*radius;
        System.out.println("circumference:"+circum);
        System.out.println("diameter:"+2*radius);
        System.out.println("area:"+PI*(radius*radius));

    }

    static void converter(double centi){
        double meter=centi/100;
        double kilometer=meter/1000;
        System.out.println("meter:"+meter);
        System.out.println("kilometer:"+kilometer);

    }

    static void celciousFarhenite(double temp,char type){
       if(type=='c') System.out.println("farheit is:"+(temp*1.8+32));
       else System.out.println("celcious:"+(temp-32)*5/9);
    }

    static  void convertDays(int days){
        int weeks,ddays,year;
        if(days<365){
             weeks =days/7;
             ddays=days%7;
             System.out.printf("weeks %d days:%d",weeks,ddays);
        }
        else{
             year=days/365;
            int year_to_days=year*365;
            weeks=(year_to_days-days)/7;
            ddays=(days-year_to_days)%7;
            System.out.printf("years %d weeks %d days:%d",year,weeks,ddays);
        }

    }


    static void powerOfAnyNumber(double pow,double base){
       double res= Math.pow(pow,base);
       System.out.println(


       );
       System.out.println("power of base and pow:"+res);

    }

    static void calculateSquareRoot(double num){

        double res=Math.sqrt(num);
        System.out.println(res);
    }

    static  void thirdAngleOfTriangle(double a,double b){

        double res=180-(a+b);
        System.out.println(res);

    }
   static  void areaOfTriangle(double len,double breadth){

        System.out.println(0.5*len*breadth);
   }
 static  void equililateralTriangle(double a){
        System.out.println("equilateral triangle :"+Math.sqrt(3)/4*Math.pow(a,2));
 }

 static  void  markCalc(int [] marks ,double max_marks){

       int sum=0;
       for(int i=0;i<marks.length;i++){
           sum+=marks[i];
       }
       int average=sum/marks.length;
       double percentage=(sum/max_marks)*100;

        System.out.println("average:"+ average+" total:"+sum+" percentage:"+percentage);

 }

 public static void simpleInterestCompound(double p,double n,double r,String type){

        if(type=="si")System.out.println("si:"+p*n*r/100);
        else {
            double amount=p*(1+r/100);
            amount=Math.pow(amount,n);
            System.out.println("ci:"+amount);
        }

 }



    public static void main(String[] args) {
//1. Write a java program to enter length and breadth of a rectangle and find its perimeter. ok
rectangleAreaPermimeter(10,20,'p');
       // 2. Write a Java program to enter length and breadth of a rectangle and find its area. ok
        rectangleAreaPermimeter(10,20,'a');

       // 3. Write a Java program to enter radius of a circle and find its diameter, circumference and area. ok
      circleDiaCircumArea(10);

      //4. Write a Java program to enter length in centimeter and convert it into meter and kilometer.
        converter(200);

        //5. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
        celciousFarhenite(100,'c');
        //6. Write a java program to enter temperature in Fahrenheit and convert to Celsius
        celciousFarhenite(100,'f');
        //7. Write a java program to convert days into years, weeks and days. ok
        convertDays(2506);
        //8. Write a java program to find power of any number x ^ y. ok
        powerOfAnyNumber(7,2);
        //9. Write a java program to enter any number and calculate its square root. ok
        calculateSquareRoot(49);
        //10. Write a java program to enter two angles of a triangle and find the third angle. ok
        thirdAngleOfTriangle(40,50);
        //11. Write a java program to enter base and height of a triangle and find its area. ok
        areaOfTriangle(20,10);
        //12. Write a java program to calculate area of an equilateral triangle. ok
        equililateralTriangle(20);
        //13. Write a java program to enter marks of five subjects and calculate total, average and percentage. ok
        int []arr={90,90,90};
        markCalc(arr,300);

        //14. Write a java program to enter P, T, R and calculate Simple Interest. ok
        simpleInterestCompound(20000,1,10,"si");
        //15. Write a java program to enter P, T, R and calculate Compound Interest. ok
        simpleInterestCompound(20000,1,10,"ci");
    }
}