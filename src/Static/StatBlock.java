package Static;

public class StatBlock {
    static int id;
    static String name;

    static{
        id = 101;
        name = "StatBlock Testing";
    }

    void display1(){
        System.out.println("ID:"+id+"\nName:"+name );
    }
}
