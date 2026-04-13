public static void convertNumtoWords(int num){

    String res="";
    while(num>0){

        int temp=num%10;
        num/=10;
        switch (temp){


            case 1-> res=" one"+res;
            case 2->res=" two"+res;
            case 3-> res=" three "+res;
            case 4-> res=" four"+res;
            case 5-> res=" five"+res;
            case 6-> res=" six"+res;
            case 7-> res=" seven"+res;
            case 8-> res=" eight"+res;
            case 9-> res=" nine"+res;
            case 0 ->res=" zero"+res;
            default->res="invalid number please try again";
        }


    }
    System.out.println(res);

}


void main() {



convertNumtoWords(1213);
convertNumtoWords(-121);

}
