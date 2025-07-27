package Class;
class school{
    String name;
    int id;
    int year;
    String dept;

    void info(){
        System.out.println("Name: "+name+"\nID:"+id+"\nYear:"+year+"\nDept:"+dept);
    }
}
public class Cls1 {
    public static void main(String[] args) {
        school s1 = new school();
        s1.name="Salman";
        s1.id = 508;
        s1.year= 2020;
        s1.dept = "CSE";

        s1.info();
    }
}
