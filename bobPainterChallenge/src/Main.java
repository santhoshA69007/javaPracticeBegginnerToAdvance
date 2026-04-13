public static int getBucketCount(double width,double height,double areaCoverPerPaint,int extraPaints){

    double area=width*height;

    int bucketsNeeded=(int)(area/areaCoverPerPaint);

    return bucketsNeeded;


}


void main() {

    System.out.println(getBucketCount(3.4,2.1,1.5,2));
}
