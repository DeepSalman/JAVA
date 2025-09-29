package Exceptions;

import java.sql.SQLOutput;

class A1{
    /// Test Case 01 : No Exception
    public static void Case01(){
        /// Test Case 01 : No Exception
        System.out.println("Case 01: No Exception");
        try{
            System.out.println("Outer Try Starts");
            try{
                System.out.println("Inner Try Starts");
                System.out.println(10/10);
                System.out.println("Inner try ends");
            }
            catch(ArithmeticException e){
                System.out.println("Inner Catch starts");
                System.out.println(e);
            }
            finally{
                System.out.println("Inner finally");
            }
            System.out.println("Outer Try Ends");
        }
        catch(NullPointerException e){
            System.out.println("Outer Catch ");
            System.out.println(e);
        }
        finally{
            System.out.println("Outer Finally");
        }
    }

    /// Test Case 02 : Exception in inner try + caught in inner catch
    public static void Case02(){

        System.out.println("Case 02");
        try{
                System.out.println("Outer Try Starts");
            try{
                System.out.println("Inner try Starts");
                System.out.println(10/0);
                System.out.println("Inner try ends");
            }
            catch(ArithmeticException e){
                System.out.println("Inner Catch starts");
                System.out.println(e);

            }
            finally{
                System.out.println("Inner finally");
            }
            System.out.println("Outer Try Ends");
        }
        catch (NullPointerException e){
            System.out.println("Outer Catch ");
            System.out.println(e);
        }
        finally{
            System.out.println("Outer Finally");
        }

    }

    /// Exception in innter try + not caught in inner catch + caught in outer catch
    public static void Case03(){
        System.out.println("Case 03");
        try{
            System.out.println("Outer Try Starts");
            try{
                System.out.println("Inner try Starts");
                int[] arr = new int[10];
                arr[100]=5;
                System.out.println("Inner try ends");
            }
            catch(ArithmeticException e){
                System.out.println("Inner Catch starts");
                System.out.println(e);
            }
            finally{
                System.out.println("Inner finally");
            }
            System.out.println("Outer Try Ends");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer Catch starts");
            System.out.println(e);
        }
        finally{
            System.out.println("Outer Finally");

        }
    }

    /// Exception in inner try + not caught in inner catch + not caught in outer catch
    public static void Case04(){
        System.out.println("Case 04");
        try{
            System.out.println("Outer Try Starts");
            try{
                System.out.println("Inner try Starts");
                int[] arr = new int[10];
                arr[100]=5;
                System.out.println("Inner try ends");

            }
            catch (ArithmeticException e){
                System.out.println("Inner Catch starts");
                System.out.println(e);

            }
            finally{
                System.out.println("Inner finally");
            }
            System.out.println("Outer Try Ends");
        }
        catch(ArithmeticException e){
            System.out.println("Inner Catch starts");
            System.out.println(e);
        }
        finally {

            System.out.println("Outer Finally");
        }
    }


    public static void Case05(){
        try
        {
            System.out.println("outer try starts");
            System.out.println(10/0);
            try //this block is not entered as exception is thrown in the line above
            {
                System.out.println("inner try starts");
                int arr[] = new int[5];
                arr[100] = 10;
                System.out.println("inner try ends");
            }
            catch(ArithmeticException e)
            {
                System.out.println("inner catch");
                System.out.println(e);
            }
            finally //this finally does not run as the corresponding try-catch block is not entered
            {
                System.out.println("inner finally");
            }
            System.out.println("outer try ends"); //this line is skipped as exception is thrown above
        }
        catch(ArithmeticException e)
        {
            System.out.println("outer catch");
            System.out.println(e);
        }
        finally  //finally always runs if try-catch block is entered
        {
            System.out.println("Outer finally");
        }
    }
}



public class NestedTryCatch {
    public static void main(String[] args) {
        A1.Case05();




    }
}
