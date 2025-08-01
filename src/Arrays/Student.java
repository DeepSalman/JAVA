public class Student {
    String name ;
    int id = 4 ;
    double  cgpa  ;


    void display(){
        System.out.println("Name : " + name );
        System.out.println("ID   : " + id );
        System.out.println("CGPA : " + cgpa );
        System.out.println("-------------------------");

    }
}

class Test1{
    public static void main(String[] args) {
        Student  st1 = new Student() ;
        Student  st2 = new Student() ;

        st1.display();

        st2.display();

//        Student shajia = new Student() ;
//
//        shajia.display();
//
//        shajia.name = "Shajia" ;
//        shajia.id = 1 ;
//        shajia.cgpa = 1.22 ;
//
//        shajia.display();
//
//
//        Student a = new Student() ;
//
//        a.name= "Apurbo" ;
//        a.id =  2 ;
//        a.cgpa =  3.5 ;
//
//        a.display();
    }
}
