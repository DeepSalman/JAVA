package Encapsulation;

class Human{
    private int age=11;
    private String name="Salman";

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}


public class Encap {
    public static void main(String[] args) {
        Human obj  = new Human();
        System.out.println(obj.getAge());
    }
}
