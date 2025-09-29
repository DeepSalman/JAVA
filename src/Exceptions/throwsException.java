package Exceptions;

class p1{


    /// For Unchecked Exception it is not mandatory to use (throws) keyword
    public static void f1(){
        throw new NullPointerException();
    }




    /// For Checked Exception it is mandatory to use (Throws)
    public static void f2() throws Exception {
        throw new Exception();
    }
}


public class throwsException {
    public static void main(String[] args) {
        //p1.f1();

        try {
            p1.f2();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
