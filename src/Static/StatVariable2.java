package Static;
class Students{
    static int count =0;

    Students(){
        count++;
    }
    void sum(){
        System.out.println("Sum: "+count);
    }
}
public class StatVariable2 {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.sum();

        Students s2=new Students();
        s2.sum();

        Students s3=new Students();
        s3.sum();

        Students s4=new Students();
        s4.sum();

        Students s5=new Students();
        s5.sum();
    }
}
