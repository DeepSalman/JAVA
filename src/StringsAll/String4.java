package StringsAll;

public class String4 {
    public static void main(String[] args) {
        String s1 = "This is my country ";
        String s2 = "This is not my country";
        split(s2);
    }
    static void replace(String a){
        String rep = a.replace('i','j');
        System.out.println(rep);
    }
    static void split(String a){
        String[] split = a.split(" ");
        for(String x: split){
            System.out.println(x);
        }
    }
}
