
void main() {
    Account santhosh=new Account("santhosh","asanthosh200210@gmail.com",1000,8436323463266l,643623463);


//    santhosh.setBalance(1000);
//    santhosh.setCustomerNmae("santhosh");
//    santhosh.setEmail("asanthsoh200210@gmail.com");
//    santhosh.setAccountNumber(23643623763l);
//    santhosh.setPhone_number(6234636366l);
    santhosh.display();

    santhosh.deposit(5000);
    santhosh.withdraw(300);
    santhosh.withdraw(5701);

    Account sam=new Account();
    sam.display();

    Account tim=new Account("tim","tim@gmail.com",435463323l);
    tim.display();
}
