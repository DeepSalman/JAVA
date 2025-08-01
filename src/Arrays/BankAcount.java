class BankAccount {
    String name ;
    int id ;
    double  balance ;


    void display(){
        System.out.println("Name : " + name );
        System.out.println("ID   : " + id );
        System.out.println("Balance: " + balance );
        System.out.println("-------------------------");

    }

    void deposite(int amount ){
        balance += amount ;
    }


    void withdraw(int amount){
        if ( balance < amount ){
            System.out.println("OverFlow");
        }
        else {
            balance -= amount ;
        }
    }

//    public static void main(String[] args) {
//        BankAccount  b = new BankAccount() ;
//
//        b.name = "Mr X" ;
//        b.id =  1 ;
//        b.balance = 500 ;
//        b.display();
//
//        b.deposite(100);
//
//        b.withdraw(10);
//
//        b.display();
//    }
}

class Test2{
    public static void main(String[] args) {
        BankAccount  b = new BankAccount() ;

        b.name = "Mr X" ;
        b.id =  1 ;
        b.balance = 500 ;
        b.display();

        b.deposite(100);

        b.withdraw(10);

        b.display();
    }
}
