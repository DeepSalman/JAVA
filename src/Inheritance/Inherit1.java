package Inheritance;
class Person{
    String name;
    int age;

    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Teacher extends Person{
    String qualification;


    void displayInformation2() {
        displayInformation();
        System.out.println("Qualification: "+qualification);
    }
}

class Inherit1 {
    public static void main(String[] args) {
        Teacher t1 = new  Teacher();

        t1.name = "Salman";
        t1.age = 19;
        t1.qualification="PhD";

        t1.displayInformation2();
    }
}
