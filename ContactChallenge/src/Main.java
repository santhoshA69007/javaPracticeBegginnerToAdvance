//Create a program that implements a simple mobile phone with the following capabilities.
//Able to store, modify, remove and query contact names.
//You will want to create a separate class for Contacts (name and phone number).
//Create a master class (MobilePhone) that holds the ArrayList of Contacts
//The MobilePhone class has the functionality listed above.
//Add a menu of options that are available.
//Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
//and search/find contact.
//When adding or updating be sure to check if the contact already exists (use name)
//Be sure not to expose the inner workings of the ArrayList to MobilePhone
//        e.g. no ints, no .get(i) etc
//MobilePhone should do everything with Contact objects only.


void main() {


    MobilePhone mp =new MobilePhone();
    Scanner scanner=new Scanner(System.in);
    boolean flag=true;
    while(flag){
        System.out.println("""
               
               0.Quit, 
               1.print list of contacts, 
               2.add new contact, 
               3.update existing contact, 
               4.remove contact
                """);
int n=scanner.nextInt();
        scanner.nextLine();
    switch (n){
        case 0-> flag=false;
        case 1-> mp.getAllContact();
        case 2-> {

            String name=scanner.nextLine();
            String phone_number=scanner.nextLine();

            mp.createContact(name,phone_number);
        }
        case 3->{

            String name=scanner.nextLine();
            mp.editContact(name);
        }
        case 4->{

            String name=scanner.nextLine();
            mp.removeContact(name);
        }

        default -> System.out.println("this is not valid number plz press given options numbers only!");
    }
    }


}

class MobilePhone {

    ArrayList<Contacts> contacts = new ArrayList<>();


    public void getContact(String name) {

        for (Contacts con : contacts) {
            if (con.name.equals(name)) {
                System.out.printf("""
                        name:%s
                        phone_number:%s
                        
                        """, con.name, con.phone_number);
            }
        }
    }


    public void getAllContact() {
        System.out.println(contacts);
    }

    public void editContact(String name) {

        for (Contacts con : contacts) {
            if (con.name.equals(name)) {
                System.out.println("contact foudn!");

                Scanner scanner = new Scanner(System.in);
                System.out.println("enter the name to edit");

                String new_name = scanner.nextLine();
                con.name = new_name.isEmpty() ? con.name : new_name;


                System.out.println("enter the phone_number to edit");

                String new_phoneNumber = scanner.nextLine();
                con.phone_number = new_phoneNumber.isEmpty() ? con.phone_number : new_phoneNumber;


                System.out.printf("""
                        new edited contact+
                        name:%s
                        phone_number:%s
                        
                        """, con.name, con.phone_number);
            }
        }
    }


    public void removeContact(String name) {

        for (Contacts con : contacts) {
            if (con.name.equals(name)) {

                contacts.remove(con);
                System.out.println("contact removed successfully!");
            }
        }



    }
    public void createContact (String name, String phone_number){

        contacts.add(new Contacts(name,phone_number));

    }
}

class Contacts{

    private String name,phone_number;

    public Contacts(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }


    @Override
    public String toString() {
        return String.format("""
                name:%s
                phone_number:%s
                """,this.name,this.phone_number);
    }
}
