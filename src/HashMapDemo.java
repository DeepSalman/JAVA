import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> customer = new HashMap<Integer,String>();

        //Put-to set
        //Get- to get
        customer.put(101,"Anis");
        customer.put(102,"Salman");
        customer.put(103,"Hello");

        System.out.println(customer.get(101));
    }
}
