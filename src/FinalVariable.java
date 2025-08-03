
class Pointer{
    int x;
    int y;

    void print(){
        System.out.println("(" + x + "," + y  + ")");
    }
}

public class FinalVariable {

    public static void main(String[] args) {




        final int x = 10;
        // x = 20; //Cannot change a final variable
        final float y;
        y = 10; //Can only assign once at the start
        //y = 20;

        final Pointer p1 = new Pointer(); //p1 cannot point to any other object
        p1.x = 10;
        p1.y = 20;
        p1.print();

        Pointer p2 = new Pointer();
        p2.x = 100;
        p2.y = 200;
        p2.print();

        //p1 = p2; //p1 cannot point to p2's object





    }

}