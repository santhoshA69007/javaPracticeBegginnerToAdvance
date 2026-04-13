public static boolean isCatPlaying(boolean summer,int temparature){

    if(temparature>=25 && temparature<=35 && !summer){
        return true;
    } else if (temparature>=25 && temparature<=45 && summer) {
        return true;
    }
    else{
        return false;
    }
}

void main() {
    System.out.println(isCatPlaying(true,10));
    System.out.println(isCatPlaying(false,36));
    System.out.println(isCatPlaying(false,35));

}

