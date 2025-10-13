package FILE.FileRead;


import java.io.BufferedReader;
import java.io.FileReader;

public class Practice {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("src/FILE/FileRead/Input1");
            BufferedReader r = new BufferedReader(f);

            String Line = r.readLine();
            System.out.println(Line);

            String[] part = Line.split("-");

            int i = Integer.parseInt(part[1]);
            double c = Double.parseDouble(part[2]);

            ST s = new ST(part[0],i,c);

            System.out.println(s.name);
            System.out.println(s.id);
            System.out.println(s.cgpa);






        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class ST{
    String name;
    int id;
    double cgpa;

    ST(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;

    }
}