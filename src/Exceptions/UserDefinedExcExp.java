package Exceptions;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Gorib!");
    }
}

class Bank{
    static double balance = 1000;
    public static void withdeaw(int x) throws InsufficientBalanceException {
        if(x<=balance){
            balance-=x;
        }
        else{
            throw new InsufficientBalanceException();
        }
    }
}



public class UserDefinedExcExp {
    public static void main(String[] args) {
        try{
        Bank.withdeaw(10101);
    }
        catch(Exception e){
            System.out.println(e);}
    }
}
