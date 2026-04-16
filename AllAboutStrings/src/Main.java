//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


printInformation("Hello World");
printInformation("");
printInformation("   \t \n    ");
String helloWorld="Hello World";
    System.out.printf("index of r is:%d%n",helloWorld.indexOf('r'));

    System.out.printf("index of World is:%d%n",helloWorld.indexOf("World"));
    System.out.printf("index of l is:%d%n",helloWorld.indexOf('l'));
    System.out.printf("index of l is:%d%n",helloWorld.lastIndexOf('l'));

    System.out.printf("index of l is:%d%n",helloWorld.indexOf('l',3));
    System.out.printf("index of l is:%d%n",helloWorld.lastIndexOf('l',8));

    String helloWorldLower=helloWorld.toLowerCase();
    if(helloWorld.equals(helloWorldLower)){
        System.out.println("values mathch exactly");
    }
    if(helloWorld.equalsIgnoreCase(helloWorldLower)){
        System.out.println("valudes amthc ignoring case");
    }

    if(helloWorld.startsWith("Hello")){
        System.out.println("String starts with Hello");
    }
    if(helloWorld.endsWith("World")){
        System.out.println("String ends with World");
    }
    if(helloWorld.contains("World")){
        System.out.println("String contains World");
    }
    if(helloWorld.contentEquals("Hello World")){
        System.out.println("values match exactly");
    }

}

public static void  printInformation(String string){
    System.out.printf("Lenght=%d%n",string.length());

    if(string.isEmpty()){
        System.out.println("string is empty");
        return;
    }
    if(string.isBlank()){
        System.out.println("string is only with whitespaces only no!");
        return;
    }

    System.out.printf("First Character is=%c%n",string.charAt(0));
    System.out.printf("Last Char=%c%n",string.charAt(string.length()-1));
}

