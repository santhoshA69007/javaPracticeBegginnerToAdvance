
public static void gcd(int n1,int n2,int n3){
    int min=0;
    if(n1<n2&& n1<n3){
        min=n1;

    } else if (n2<n1&&n2<n3) {
        min=n2;

    }
    else{
        min=n3;
    }

    while (min>=2){


        if(n1%min==0&&n2%min==0&&n3%min==0){
            System.out.println("the gcd is:"+min);
            break;
        }
        min--;
    }


}

void main() {
gcd(27,18,36);
}
