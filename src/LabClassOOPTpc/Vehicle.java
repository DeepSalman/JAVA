package LabClassOOPTpc;

public class Vehicle {
    public Vehicle( int a) {
        System.out.println("This is Vehicle");
    }
}

class Bike extends  Vehicle{
    public Bike() {
        super(10);
        System.out.println("This is Bike");

    }
}


class Test2{
    public static void main(String[] args) {
        Bike b = new Bike() ;
    }
}
