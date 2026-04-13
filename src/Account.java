public class Account {
    private String customerNmae,email;
    private long balance,number,phone_number;


    public Account(){
        System.out.println("Empty Constructor being used!");
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
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

        System.out.println("name:"+this.customerNmae+"\n account_number"+this.number+" \n phone_number:"+this.phone_number+" \n account_balance:"+this.balance+"\nemail:"+this.email);
    }
}
