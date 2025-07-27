package ConsBasic;

import java.sql.SQLOutput;

class Student1{
    String name;
    int age;
    int roll;

    //Constructor with 3 arguments:
    Student1(String a,int b,int c){
        name = a;
        age = b;
        roll = c;

    }

    //Default Constructor
    Student1(){
        System.out.println("No Constructor input is given in Object!");
    }


    void info(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nRoll: "+roll);
    }


}

public class DefCons {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Sam",20,30);
        s1.info();


        Student1 s2 = new Student1();
        s2.info();
    }

}
