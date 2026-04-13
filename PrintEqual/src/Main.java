
public static void printEqual(int a,int b,int c){
    if(a<0||b<0 || c<0){
        System.out.println("invalid inputs!");

    }
    else if(a==b &&b==c){
        System.out.println("all are equal!");
    } else if (a!=b && b!=c && c!=a) {
        System.out.println("all are different!");
        
    }

    else{
        System.out.println("neither differnt or equal");
    }

}


void main() {
printEqual(-1,-1,-1);
printEqual(1,1,1);
printEqual(1,1,2);
printEqual(1,2,3);
}
