package Inheritance;
//Inheritance Parent class
class Person1{
    private String name;
    private int age;

    //Get The items (getter)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Set The items (setter)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void info(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }

}



//Inherit class - Child class
class Teacher1 extends Person1{
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void info2(){
        info();
        System.out.println("Qualification is "+qualification);
    }
}




public class PrivateInheritance {
    public static void main(String[] args) {
        Teacher1 t1 = new Teacher1();
        t1.setName("Salman");
        t1.setAge(20);
        t1.setQualification("M Phil");

        t1.info2();

        System.out.println(t1.getAge());


    }
}


