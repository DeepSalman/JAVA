package Static;

public class TestStatMethod {
    public static void main(String[] args) {
        StatMethod tm1 = new StatMethod();
        tm1.display1(); // Assessed with object

        //Accessed with class name
        StatMethod.display2();


    }
}
