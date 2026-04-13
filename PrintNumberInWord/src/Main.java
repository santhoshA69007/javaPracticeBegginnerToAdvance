public static void printNumberInWord(int num){

    switch (num){
        case 1-> System.out.println("One");
        case 2-> System.out.println("Two");
        case 3-> System.out.println("Three");
        case 4-> System.out.println("Four");
        case 5-> System.out.println("Five");
        case 6-> System.out.println("Six");
        case 7-> System.out.println("Seven");
        case 8-> System.out.println("eight");
        case 9-> System.out.println("nine");
        default -> System.out.println("other number");
    }
}



void main() {
printNumberInWord(1);
printNumberInWord(2);
printNumberInWord(-2);
}
