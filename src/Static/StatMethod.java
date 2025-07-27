package Static;

public class StatMethod {
    void display1(){
        System.out.println("I am non Static method");
    }

    //by doing so we can use it anywhere
    //This specific method can be used anywhere inside the file.
    static void display2(){
        System.out.println("I am Static method");
    }
}
