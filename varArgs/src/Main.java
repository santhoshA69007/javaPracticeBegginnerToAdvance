//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

String[] splitStrings="Hello World".split(" ");
    System.out.println(String.join(",",splitStrings));
printText(splitStrings);
printText("hello");

    System.out.println("hello world");
    System.out.println("hello wordl");

}

private static void printText(String... textList){
    for(String t:textList){
        System.out.println(t);
    }
}
