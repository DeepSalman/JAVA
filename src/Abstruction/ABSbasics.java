package Abstruction;
//Abstraction refers something Imaginary,fiction,non-real
//Abstract-Partial Abstraction (Normal Abstraction)
//Interface-Complete Abstracton-Forcing Child class to do something must


abstract class Animal{
    //What can be added in an Abstraction class?
    //Any kind of variable
    //Constructor
    //Complete-Method
    //Abstract Method

    String name;
    int number;
    int position;
    public Animal(String name,int number){
        this.name=name;
        this.number=number;
    }

    void smile(){
        System.out.println("Non-Abstract Method");
    }

    abstract void animal_method();
}

class Dog extends Animal{
    public Dog(String name,int number){
        super(name,number);
    }
    @Override
    public void animal_method() {
        System.out.println("Abstract Method inside Dog Class");
    }

    void only_dog(){
        System.out.println("Non-Abstract Dog Method");
    }


}

class Something{
    //Abstract Function f1 cannot be written inside a normal class
    //abstract void f1();



}

abstract class Bird extends Animal{ //Abstract Class can extend a parent Abstract class
    public Bird(String name,int number){
        super(name,number);
    }
    //No-Need to override Parent class abstract method Walk
    //Bird Can have its own Abstract Method
    abstract void bird_method();
}

class Eagle extends Bird{
    public Eagle(String name,int number){
        super(name,number);
    }

    @Override
    void bird_method() {
        System.out.println("Abstract Method of Bird inside Eagle Class");
    }

    @Override
    void animal_method() {
        System.out.println("Abstract Method of Animal inside Eagle Class");
    }
}

abstract class Insect extends Animal{
    public Insect(String name,int number){
        super(name,number);
    }
    public abstract void insect_method();
    public void crawl(){
        System.out.println("Normal method inside Insect");
    }

    public void animal_method(){}
}
class Spider extends Insect{
    public Spider(String name,int number){
        super(name,number);
    }
    @Override
    public void insect_method() {}
    // No need to override the Animal_method()  as it is already overridden in Insect class
}

public class ABSbasics {
    public static void main(String[] args) {
        Animal a = new Dog("Hello",19);
        a.animal_method();

        ((Dog)a).only_dog();
    }
}