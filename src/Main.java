import java.util.InputMismatchException;
import java.util.Scanner;


interface Transaction {
    public void give();
    public void receive();
}
abstract class Payment implements Transaction{
    double amount;
    String currency ="BDT";

    Payment(double amount){
        this.amount = amount;
    }

    @Override
    public void give(){
//Write code here
        System.out.println(currency+" "+amount+" is paid");
    }
    @Override
    public void receive() {
        System.out.println("[Nothing to receive]");
    }
    public abstract double getCharge();
    public double getTax(){
        return 0;
//Write code here
    }
}
class CashPay extends Payment {

    CashPay(int ammount){
        super(ammount);
    }

    public double getCharge(){
        return 0;
    }
}

class CreditCardPay extends Payment {
    public CreditCardPay(double amount) {
        super(amount);
    }

    @Override
    public double getCharge() {
        return amount * 0.025; // 2.5% charge
    }
}
class CheckPay extends Payment {
    public CheckPay(int amount) {
        super(amount);
    }
    public double getCharge(){
        return 10.0;
    }

}



public class Main{


    public static void main(String[] args){

    }
}




