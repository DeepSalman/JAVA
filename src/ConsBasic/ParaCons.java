package ConsBasic;

class Student{
    String name;
    int age;
    int roll;

    Student(String a,int b,int c){
        name = a;
        age = b;
        roll = c;

    }
    void info(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nRoll: "+roll);
    }


}

public class ParaCons {
    public static void main(String[] args) {
        Student s1 = new Student("Sam",20,30);
        s1.info();
    }

}
