package Encapsulation;

class Human1{
    private int age=11;
    private String name="Salman";

    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }


    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}


public class Encap2 {
    public static void main(String[] args) {
        Human1 obj  = new Human1();

        obj.setAge(10);
        obj.setName("Salman");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
