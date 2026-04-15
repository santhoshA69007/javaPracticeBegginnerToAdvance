//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

Student student=new Student("santhosh",23);
    System.out.println(student);

    PrimarySchoolStudent jimmy=new PrimarySchoolStudent("jimmy",5,"carole");

    System.out.println(jimmy);

}

class Student{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return  name+" is "+age;
        //        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends  Student{

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
   super(name,age);
   this.parentName=parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}


