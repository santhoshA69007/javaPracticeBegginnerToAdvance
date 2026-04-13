

public static double convertToCentimeters(int inches){

    return inches*2.54;

}public static double convertToCentimeters(int feet,int inches){

//    return convertToCentimeters(foot*12)+convertToCentimeters(inches);
//    return convertToCentimeters(((foot*12)+inches));
    int feetToInches=feet*12;
    int totalInches=feetToInches+inches;
    double result=convertToCentimeters(totalInches);
    return result;


}



//one foot  =12inches
//1inch =2.54cm
void main() {
    System.out.println(convertToCentimeters(5,8));
    System.out.println(convertToCentimeters(68));

}
