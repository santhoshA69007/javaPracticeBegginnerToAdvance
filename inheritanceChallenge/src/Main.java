//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


SalariedEmployee santhosh=new SalariedEmployee("santhosh","2002","2077",69007l,"2026",1000000,false);
HourlyEmployee bob=new HourlyEmployee("bob","2000","2065",69420l,"2023",99);
    System.out.println(santhosh.getAge());
    System.out.println(santhosh.collectPay());
    santhosh.retire();
    santhosh.terminate(santhosh.endDate);
    System.out.println(bob.getAge());
    System.out.println(bob.collectPay(5));
    System.out.println(bob.getDoublePay());
    bob.terminate(bob.endDate);
    System.out.println(santhosh);
    System.out.println(bob);
}
