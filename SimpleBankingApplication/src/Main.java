void main() {

Bank indianBank=new Bank("indianBank");
indianBank.addNewCustomer("santhosh");
indianBank.addNewCustomer("aditi");
indianBank.sendMoney("santhosh","aditi",100);
}


class Bank{
    private String name;
    ArrayList<Customer>customers=new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addNewCustomer(String name){

        for(Customer customer:customers){

            if(customer.name.equals(name)){
                System.out.println("customer already exits with this name!");
           return;
            }
        }
        customers.add(new Customer(name));
        printAStatement(name);
    }


    public void printAStatement(String name){

        for(Customer customer:customers){

            if(customer.name.equals(name)){
                System.out.println("name:"+customer.name);
                System.out.println("bankbalance:"+customer.bankBalance);
                System.out.println("transactions");
                System.out.println(customer.transactions);
                return;
            }
        }

    }

    public void sendMoney(String sender,String recipient,double money){
        ListIterator<Customer>it=customers.listIterator();

        Customer customer_sender=null;
        Customer customer_receiver=null;
        while(it.hasNext()){
            Customer temp=it.next();
            if(temp.name.equals(sender)){

                customer_sender=temp;

            }

            if(temp.name.equals(recipient)){
                customer_receiver=temp;
            }

        }

        if(customer_receiver!=null && customer_sender!=null){
            customer_sender.bankBalance-=money;
            customer_sender.transactions.add(-money);
            customer_receiver.bankBalance+=money;
            customer_receiver.transactions.add(money);
            printAStatement(customer_sender.name);
            printAStatement(customer_receiver.name);
        }
    }
}

class Customer{
    String name;
    ArrayList<Double>transactions=new ArrayList<>();
    double bankBalance=10000;
    public Customer(String name) {
        this.name = name;
    }
}

