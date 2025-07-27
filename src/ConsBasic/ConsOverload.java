package ConsBasic;

class Student2{
    String name;
    int age;
    int roll;

    //Constructor with full argument
    Student2(String name,int age,int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
    }


    //Constructor with 2 argument
    Student2(String name,int age){
        this.name=name;
        this.age=age;
    }

    //constructor with 1 argument
    Student2(String name){
        this.name=name;
    }


    //null constructor
    Student2(){

    }
    void info(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nRoll: "+roll);
    }

}

public class ConsOverload {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Salman",21,011);
        Student2 s2 = new Student2("As-Ovi",21);
        Student2 s3 = new Student2("Ossi");
        Student2 s4 = new Student2();

        s1.info();
        s2.info();
        s3.info();
        s4.info();
    }
}
