
//Write an Inheritance hierarchy for classed rectangle, Circle, Triangle. Create an abstract
//class named Shape as super-class of the hierarchy. Write an application that instantiates object
// of your classes and output their areas

package Abstruction;

abstract class Shape {
    abstract double area();  // Changed from int to double
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }
}

class Triangle extends Shape {
    int length;
    int width;

    Triangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return 0.5 * length * width;
    }
}

class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;  // fixed formula
    }
}

public class MiniProblem {
    public static void main(String[] args) {
        Shape sp;

        sp = new Rectangle(10, 10);
        System.out.println("Rectangle Area: " + sp.area());

        sp = new Triangle(10, 10);
        System.out.println("Triangle Area: " + sp.area());

        sp = new Circle(10);
        System.out.println("Circle Area: " + sp.area());
    }
}
