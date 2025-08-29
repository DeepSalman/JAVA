

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


public class Main {

    public static void main(String[] args) {



        QurbaniAnimal q4 = new Cow();
        q4.sound();
//        q4.f1(); //Only Child Method, so does not run

        ((Cow) q4).f1();

//        q4.f1(); //q4 does not change

        QurbaniAnimal q5 = new QurbaniAnimal();
        //  ((Cow) q5).f1(); // error, cannot cast


    }
}
