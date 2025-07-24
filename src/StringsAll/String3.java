package StringsAll;

public class String3 {
    public static void main(String[] args) {
        String s1 = "Salman";
        String s2 = " Farsi";

        String fullname = s1+s2;
        System.out.println("Full name: "+fullname);


        printall();




    }
    static void upper(String s){
        String Upper = s.toUpperCase();
        System.out.println(Upper);
    }

    static void lower(String s){
        String lower = s.toLowerCase();
        System.out.println(lower);
    }
    static void startswith(String s){
        boolean nom = s.startsWith("p");
        System.out.println(nom);
    }
    static void printall(){
        String[] s = {"Salman", "Shorif", "Shakil", "Jannat"};
        for(String x: s){
            System.out.println(x);
        }

    }
}
