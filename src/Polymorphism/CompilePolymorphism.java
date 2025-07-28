package Polymorphism;
class Person{ //Here person class is the super class
    void display(){
        System.out.println("Hello Person");
    }
}

class Teacher extends Person{
    void display(){
        System.out.println("Hello Teacher");
    }
}

class Student extends Person{
    void display(){
        System.out.println("Hello Student");
    }
}

public class CompilePolymorphism {
    public static void main(String[] args) {
        Person p1 = new Person();
        Teacher t1 = new Teacher();
        Student s1 = new Student();

        p1.display();
        t1.display();
        s1.display();
    }
}
