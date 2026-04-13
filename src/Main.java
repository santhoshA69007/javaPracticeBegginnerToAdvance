
void main() {
    Account santhosh=new Account();
    santhosh.setBalance(1000);
    santhosh.setCustomerNmae("santhosh");
    santhosh.setEmail("asanthsoh200210@gmail.com");
    santhosh.setNumber(23643623763l);
    santhosh.setPhone_number(6234636366l);
    santhosh.display();

    santhosh.deposit(5000);
    santhosh.withdraw(300);
    santhosh.withdraw(5701);
}
