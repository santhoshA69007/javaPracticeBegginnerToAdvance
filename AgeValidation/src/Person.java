public class Person {

    private String firstName,lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        return this.age>12&&this.age<20;
    }

    public String getFullName(){
        if(this.firstName!=""&&this.lastName!="")return "";
        return this.firstName+" "+this.lastName;
    }
}
