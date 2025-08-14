package ConsBasic;

class Students1
{
    int id;
    String name;
    float cgpa;

    {
        System.out.println("Init Block");
    }

    Students1()
    {
        System.out.println("A new student is created.");
    }

    Students1(int id, String name)
    {
        this(); // Calls the Students1() constructor -> must always be first line
        this.id = id;
        this.name = name;
        System.out.println("Constructor 2");
        //this();
    }

    Students1(int id, String name, float cgpa)
    {
        this(id, name); // Calls the Students1(id, name) constructor
        this.cgpa = cgpa;
        System.out.println("Constructor 3");
    }

    Students1(Students1 s) // Creates a new Students1 object copying values from Students1 s
    {
        this.id = s.id;
        this.name = s.name;
        this.cgpa = s.cgpa;
    }
}


public class ThisConsBasic {

    public static void main(String[] args) {

        Students1 s1 = new Students1(10, "Bob");
        System.out.println(s1.id + " " + s1.name);

        Students1 s2 = new Students1(15, "Sam", 3.5f);

        Students1 s3 = new Students1(s2);
        System.out.println(s3.id + " " + s3.cgpa + " " + s3.name);



    }
}

