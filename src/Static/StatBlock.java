package Static;

public class StatBlock {
    static int id;
    static String name;

    static{
        id = 101;
        name = "StatBlock Testing";
    }

    static void display1(){
        System.out.println("ID:"+id+"\nName:"+name );
    }

    public static void main(String[] args) {
        StatBlock.display1();
        // WE dont have to reference and allocate memory for an object
        // Because there is not need for object as we can access everything with class name
        // This happened because of the static property.
    }
}
