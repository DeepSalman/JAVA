package Polymorphism;

class QurbaniAnimal{
    void sound(){
        System.out.println("Make Sound");
    }
}

class Cow extends QurbaniAnimal{
    void sound(){
        System.out.println("Cow makes Sound");
    }

    void f1(){
        System.out.println("Cow Method");
    }
}

class Goat extends QurbaniAnimal{
    void sound(){
        System.out.println("Goat makes Sound");
    }
}

class Haat{

    static QurbaniAnimal buyQurbaniAnimal(String option)
    {
        if(option == "Cow") return new Cow();

        if(option == "Goat") return new Goat();

        return null;

    }
}


public class TypeCasting {

    public static void main(String[] args) {

        QurbaniAnimal q1 = Haat.buyQurbaniAnimal("Cow");
        q1.sound();

        QurbaniAnimal q2 = Haat.buyQurbaniAnimal("Goat");
        q2.sound();

        Cow c1 = new Cow();
        System.out.println("Instance of Cow = " + (c1 instanceof Cow));
        System.out.println("Instance of QurbaniAnimal = " + (c1 instanceof QurbaniAnimal));

        c1 = null;
        System.out.println("Instance of Cow = " + (c1 instanceof Cow));
        System.out.println("Instance of QurbaniAnimal = " + (c1 instanceof QurbaniAnimal));

        c1 = new Cow();
        //  System.out.println("Instance of Goat = " + (c1 instanceof Goat));

        /* QurbaniAnimal q3 = Haat.buyQurbaniAnimal("Duck");
        q3.sound(); */ // null is called so crashes

        QurbaniAnimal q3 = Haat.buyQurbaniAnimal("Duck");
        if (q3 instanceof QurbaniAnimal) q3.sound();

        QurbaniAnimal q4 = new Cow();
        q4.sound();
        //q4.f1(); //Only Child Method, so does not run

        ((Cow) q4).f1();

        //q4.f1(); //q4 does not change

        QurbaniAnimal q5 = new QurbaniAnimal();
        //  ((Cow) q5).f1(); // error, cannot cast


    }
}
