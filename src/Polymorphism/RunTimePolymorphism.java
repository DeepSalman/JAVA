package Polymorphism;
class Person1{ //Here person class is the super class
    void display(){
        System.out.println("Hello Person");
    }
}

class Teacher1 extends Person1{
    void display(){
        System.out.println("Hello Teacher");
    }
}

class Student1 extends Person1{
    void display(){
        System.out.println("Hello Student");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.display();

        p1 = new Teacher1();
        p1.display();

        p1 = new Student1();
        p1.display();


    }
}
