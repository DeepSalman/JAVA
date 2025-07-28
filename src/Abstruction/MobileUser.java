package Abstruction;
abstract class Mobile_User{
    abstract void sendMessage();//We can store a abstract method with a non abstract method
    void call(){ //we can use a non abstract method also
        System.out.println("Call method");
    }
}

class Rahim extends Mobile_User{
    @Override
    void sendMessage() {
        System.out.println("Hi im Rahim");
    }
    void call(){
        System.out.println("Calling Rahim");
    }
}
class Karim extends Mobile_User{
    @Override
    void sendMessage() {
        System.out.println("Hi im Karim");
    }
}

public class MobileUser {
    public static void main(String[] args) {
        Mobile_User m1; //Created Abstract reference

        m1 = new Rahim();
        m1.sendMessage();// created object using reference
        m1.call();


        m1 = new Karim();
        m1.sendMessage();
    }
}
