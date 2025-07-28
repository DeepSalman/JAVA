package Abstruction;
class interface_demo{
    void sendMessage(){};
}
class dog extends interface_demo {
    void sendMessage(){
        System.out.println("Doggy");
    }
}

public class Interface {
    public static void main(String[] args) {
        interface_demo demo;
        demo = new dog();
        demo.sendMessage();
    }
}
