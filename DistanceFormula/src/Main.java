//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
DistanceFormula df=new DistanceFormula(10,20);
DistanceFormula df1=new DistanceFormula();
DistanceFormula df2=new DistanceFormula(30,40);

    System.out.println(df.distance());
    System.out.println(df.distance(14,24));
    System.out.println(df.distance(df2));
}
