package Exceptions;

import java.sql.SQLOutput;

class A{
    public static void f1(){
        try{
            System.out.println("Inside f1");
            f2();
            System.out.println("After f1");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void f2(){
        System.out.println("Inside f2");
        f3();
    }
    public static void f3(){
        System.out.println("Inside f3");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}






public class ExcForward {
    public static void main(String[] args) {
        try{
            A.f1();
            System.out.println("MainTry");
        }
        catch(Exception e){
            System.out.println("Exception "+e);
        }
    }
}
