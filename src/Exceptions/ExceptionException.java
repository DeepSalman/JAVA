package Exceptions;

public class ExceptionException {

    public static void main(String[] args) {
        try{
            System.out.println("Outer Try Starts");
            try{
                System.out.println("Inner Try Starts");
                System.out.println(10/10);

            }
            catch(ArithmeticException e){
                System.out.println("Inner catch Starts");
                System.out.println(e);
            }
            finally {
                System.out.println("Inner finally Starts");
                System.out.println(10/0);
            }
        }
        catch(Exception e){
            System.out.println("Outer catch Starts");
            System.out.println(e);
        }
        finally {
            System.out.println("Outer finally Starts");

        }
    }
}
