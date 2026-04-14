//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Carpenter carpenter=new Carpenter(3.5);
    Floor floor=new Floor(2.75,4.0);
    Calculator calculator=new Calculator(floor,carpenter);

    System.out.println(calculator.getTotalCost());


}
