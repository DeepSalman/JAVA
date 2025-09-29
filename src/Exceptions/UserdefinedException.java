package Exceptions;

class WrongMarkException extends Exception {
    //To create your own exception , Extend The parent Exception Class
    //Can create Checked or Unchecked Exception depending on the parent class

    WrongMarkException(){
        super("Wrong mark Outside 100");
    }
}

class calculator {
    public static void CheckMarks(int marks) throws WrongMarkException  {
        if(marks < 0 || marks > 100){
            //you can use throw to manually throw an exception
            //for user made exceptions you need to throw them manually
            //throw an exception object
            //for checked exception either try catch or throws is needed

            throw new WrongMarkException();
        }
        else{
            System.out.println("Valid marks");
        }
    }
}







public class UserdefinedException {
    public static void main(String[] args) {
        try{
            calculator.CheckMarks(101);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
