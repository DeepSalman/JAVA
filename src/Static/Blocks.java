package Static;

class Point {

    int x;
    int y;

    //Initialization Block
    {
        System.out.println("A new Point is created");
        x = 5;
        y = 5;
    }

    {
        System.out.println("Init block 2");
    }

    static //Static Block Will execute very Top of the code and for once
    {
        System.out.println("Static block");
    }


}


public class Blocks {

    public static void main(String[] args) {
        Point p1 = new Point();

        Point p2 = new Point();
        Point p3 = new Point();

    }
}
