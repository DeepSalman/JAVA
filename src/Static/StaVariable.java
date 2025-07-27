package Static;
class Student{
    String name;
    int id;
    static String UniversityName="UIU";

    //constructor building
    Student(String a,int b){
        name=a;
        id=b;
    }

    void info(){
        System.out.println("Name: "+name+"\nID:"+id+"\nUniversity Name:"+UniversityName); //We use UniversityName as it is an constant :
    }
}
public class StaVariable {
    public static void main(String[] args) {
        Student s2 = new Student("Salman",508);
        s2.info();

        //As instance variable is connected with class we should call it by class

        System.out.println("\nStatic university name is "+Student.UniversityName);
    }
}
