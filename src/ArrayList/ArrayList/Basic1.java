package ArrayList.ArrayList;

import java.util.ArrayList;

public class Basic1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();///Can Sore any type of data
        a.add("hello");
        a.add(1);
        a.add(4.5f);

        System.out.println("a= "+a);

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("hello");
        a2.add("BOB");
        a2.add("Jim");
        a2.add("jolly");
        System.out.println("a2= "+a2);

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(2);
        a3.add(3);
        System.out.println("a3= "+a3);

        // Adding an element based on index numbers:
        a3.add(0,0);///Inserting value using indexing
        System.out.println("a3= "+a3);

        try{
            a3.add(100,0);///Index out of bound
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("a2 elements : ");
        for(int i=0;i<a2.size();i++){
            System.out.println(a2.get(i));
        }

        System.out.println("a3 elements : "+a3);
        System.out.println("Element replace");//Set replaces the element at a given index
        a3.set(1,10);
        System.out.println("a3 elements : "+a3);


        System.out.println("String Arraylist "+a2);
        String ax = a2.remove(2);
        System.out.println("Returned String "+ax);
        a2.remove("jolly");
        System.out.println("String Arraylist "+a2);

        /// To remove a specific number from an integer arraylist
        System.out.println(a3);
        a3.remove(Integer.valueOf(0));
        System.out.println(a3);

    }
}
