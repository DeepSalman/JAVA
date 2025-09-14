package LabClassOOPTpc;

class vehicle {
    vehicle(int a) {

        System.out.println("This is Vehicle");
    }
}

class Bike extends vehicle {
    Bike() {
        super(10);
        System.out.println("This is Bike");

    }
}


public class Vehicle1{
    public static void main(String[] args) {

        Bike b = new Bike() ;
    }
}
