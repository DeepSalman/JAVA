package Abstruction;

//Inside and Interface we can have veriable and method
//Child class must override
//Inside Interface variables are declared as Final Static
//Methods are declared as public abstract

interface Flying{
    final static String type="Flying Animal";
    int x=10; // Though you didnt write final static , compiler autometically turned it into an final static

    public abstract void fly();
    void flapwings(); //Automatically it becomes public abstract
}

class Crow implements Flying{
    public Crow(){

    }
    public void fly(){}
    public void flapwings(){}

}

interface swiming{
    void swim();
}

class Duck implements swiming,Flying{
    public void fly(){}
    public void flapwings(){}
    public void swim(){}
}

class ParentClass{}
interface I1{}
interface I2{}

//Can extend and implement at the same time
class ChildClass extends ParentClass implements I1, I2{}

interface ParentInterface
{
    void f1();
}

//Child interface can inherit from Parent interface using extends
interface ChildInterface extends ParentInterface
{
    void f2();
}

class SomeClass implements ChildInterface
{
    //Must implement both the methods since Child interface has f1() f2()
    public void f1(){}
    public void f2(){}
}















public class InterfaceBASIC {
}