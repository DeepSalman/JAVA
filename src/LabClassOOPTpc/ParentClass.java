package LabClassOOPTpc;

public class ParentClass {
    int parentVariable ;


    void parentMethod(){
        System.out.println("This is Parent");
    }

    void display(){
        System.out.println("Parent");
    }
}

class ChildClass extends  ParentClass{
    int childVariable ;


    void childMethod(){

        System.out.println("This is Child");
        display();
        super.display();
    }

    void display(){
        System.out.println("Child");
    }
}

class Test{
    public static void main(String[] args) {
        ParentClass p = new ParentClass() ;
        p.parentMethod();

        ChildClass c = new ChildClass() ;
        c.childMethod();
    }
}
