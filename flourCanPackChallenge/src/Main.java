public static boolean canPack(int big,int small,int flourPack){
    if(big<0||small<0) return false;
    int bigPacks=big*5;
    int smallPacks=small*1;

    if((bigPacks+smallPacks)==flourPack) return true;

    else{
        int remaingBigPack=flourPack-bigPacks;

        return remaingBigPack>0? flourPack==bigPacks+(smallPacks-(smallPacks-remaingBigPack)):false;

    }


}




void main() {
    System.out.println(canPack(1,0,4));
    System.out.println(canPack(2,2,12));
    System.out.println(canPack(-2,10,10));
    System.out.println(canPack(2,0,10));
    System.out.println(canPack(2,0,9));
    System.out.println(canPack(1,5,9));
    System.out.println(canPack(0,5,4));



}
