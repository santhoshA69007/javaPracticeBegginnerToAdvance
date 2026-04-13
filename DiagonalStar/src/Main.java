public static void printSquareStar(int num){

    int k=num;
    for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(i==1||i==num||j==num||j==1||j==i||k==j?'*':" ");

            }
            k--;
        System.out.println();
    }

}

void main() {
printSquareStar(5);
printSquareStar(8);
}
