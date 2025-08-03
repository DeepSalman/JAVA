package Static;

class StudentProfile
{
    int id;
    float cgpa;
    static String uni = "UIU"; //static variable - 1 common variable for all objects of the same class

    void f1()
    {
        System.out.println("Normal Function");
    }

    static void f2()
    {
        System.out.println("Static Function");
        //  System.out.println("Id: " + id + " cgpa: " + cgpa);
        // Cannot use non-static variables inside static function
        // Non-static variables need objects, static function can be called by class name
    }
}

public class StaticClassTopic {

    int myVar = 10; //Non-static variable of Code1 class
    //We can not use inside a static function/class

    public static void main(String[] args) {

        System.out.println("Univeristy name: " + StudentProfile.uni);
        StudentProfile.f2();
        // Student.f1(); //Cannot use non-static variable/function using class name, need objects
        // Student.id;

        StudentProfile s1 = new StudentProfile();
        System.out.println("Id: " + s1.id + " cgpa: " + s1.cgpa + " uni: " + s1.uni);
        s1.f1();

        // myVar = 100; // Cannot use non-static variable of Code1 class inside static function of Code1 class

    }
}
