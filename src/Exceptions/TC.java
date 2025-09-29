package Exceptions;

import java.io.IOException;

class c1{
    public static void f1() throws Exception{
        System.out.println("f1 starts");
        System.out.println(10/0);
        System.out.println("F1 ends");
    }
    public static void f2() throws ArithmeticException{
        //For Unchecked exceptions throw is not required although can be written
        System.out.println(10/0);
    }
    public static void f3() throws IOException{
        System.out.println("F3 starts");
    }
}





public class TC{
    public static void main(String[] args) {
        System.out.println("Main Starts");

        //Checked Exceptions are forced to handled by try catch
        //thats why f1 and f3 must be handled with try catch
        //f2 throws an unchecked exception so this wont give any compile time error

        try{
            c1.f1();
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            c1.f3();
        }
        catch(Exception e){
            System.out.println(e);
        }

        c1.f2();
    }
}