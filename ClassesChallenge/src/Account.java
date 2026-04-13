public class Account {
    private String customerNmae,email;
    private long balance,accountNumber,phone_number;


    public Account(){
        this("unknown","unknown@email.com",1000,696969462342364l,696969969l);
        System.out.println("Empty Constructor being used!!");
    }

    public  Account(String customerNmae,String email,long balance,long accountNumber,long phone_number){

        System.out.println("paramtere constructor being useddd!");
        this.customerNmae=customerNmae;
        this.email=email;
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.phone_number=phone_number;
    }

    public Account(String customerNmae, String email, long phone_number) {

        this(customerNmae,email,phone_number,99999999l,76878758);
//        this.customerNmae = customerNmae;
//        this.email = email;
//        this.phone_number = phone_number;
    }


    public String getCustomerNmae() {
        return customerNmae;
    }

    public void setCustomerNmae(String customerNmae) {
        this.customerNmae = customerNmae;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long number) {
        this.accountNumber = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }




    public void deposit(long amount){

        if(amount<0) System.out.println("the amount deposit failed due to invalid amount input! of "+amount);

        else {
            this.balance+=amount;
            System.out.println("the amount has been successfully deposited to your account");
        this.currentBalance();
        }
    }
    public void withdraw(long amount){
        if(amount<0) System.out.println("the amount withdraw process failed due to invalid amount input! of "+amount);
        else if (this.balance-amount<0) {
            System.out.println("the amount you enter bigger than the balance amount!");
        } else {
            this.balance-=amount;
            System.out.println("the amount has been successfully withdrawn from your account");
            this.currentBalance();
        }
    }

    public  void currentBalance(){

        System.out.printf("""
                
                Account_Balance:%d
                
                """,this.balance);
    }

    public void display(){

        System.out.println("name:"+this.customerNmae+"\n account_number"+this.accountNumber+" \n phone_number:"+this.phone_number+" \n account_balance:"+this.balance+"\nemail:"+this.email);
    }
}
