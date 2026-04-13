
public class Customer {
    String name,email;
    long creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public Customer(String name, String email, long creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer() {

        this("Unknown","unknown@gmail.com",1000);
    }

    public Customer(String name, String email) {
        this(name,email,1000);
    }

    public void display(){
        System.out.println("name:"+this.name+"\n email:"+this.email+" \n credit_limit:"+this.creditLimit);
    }
}
