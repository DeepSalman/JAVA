class Point {

    int x;
    int y;

    void f1(Point pt) //Point is passed by reference, so original point's x y changes
    {
        pt.x = 100;
        pt.y = 200;
    }

    void f2(int x) //Int is passed by value, original value does not change
    {
        x = 100;
    }

    void Print()
    {
        System.out.println("(" + x + "," + y  + ")");
    }

}



public class PassbyValueReference {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;

        int x = 50;
        p1.f2(x); //Primitive type is passed by value (copied)
        System.out.println("x = " + x); // x stays 50, does not change

        Point p2 = new Point();
        System.out.println("p1.x = " + p1.x + ", p1.y = " + p1.y);
        p2.f1(p1); //Reference type is passed by reference (not copied)
        System.out.println("p1.x = " + p1.x + ", p1.y = " + p1.y); //p1.x p1.y changes

    }

}