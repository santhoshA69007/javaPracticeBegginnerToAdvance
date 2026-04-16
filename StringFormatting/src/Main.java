//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String bulletIt="Print a BulletIt list:"+"\n\t \u2022 First Point"+"\n\t\t \u2022 Sub Point";
    System.out.println(bulletIt);

    String textBlock= """
    Print a BulletIt list:
      \u2022 First Point 
          \u2022 Sub Point
            """;
    System.out.println(textBlock);

int age=24;
    System.out.printf("your are is:%d%n",age);

int year=2023 -age;

    System.out.printf("Age=%d,Birth Year=%d",age,year);
    System.out.printf("Age=%.2f",(float)age);

for (int i=1;i<=100000;i*=10){
    System.out.printf("Printing %6d%n",i);
}

String formattedString=String.format("Your age is:%d",age);
    System.out.println(formattedString);
formattedString="Your age is:%d".formatted(age);
    System.out.println(formattedString);
}
