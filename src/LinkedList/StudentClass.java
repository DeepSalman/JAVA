package LinkedList;

import java.util.LinkedList;

class Student{
    String name,classname;
    int id;

    Student(String name, String ClassName, int id){
        this.name = name;
        this.classname = ClassName;
        this.id = id;
    }


}

public class StudentClass {
    public static void main(String[] args) {
        //Student LinkedList
        LinkedList<Student> l1 = new LinkedList<Student>();

        //Creating Students
        Student s1 = new Student("Jack","Seven",001);
        Student s2 = new Student("Nil","Seven",002);
        Student s3 = new Student("Anne","Seven",003);

        //Object gulo amader Linked list e add korlam
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);

        //Now we have to print

        for(Student s: l1){
            System.out.println(s.id+" "+s.name+" "+s.classname);
        }

    }
}
