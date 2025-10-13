package ArrayList.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<ST>  a = new ArrayList<>();
        try{
            FileReader f = new FileReader("src/ArrayList/ArrayList/Info");
            BufferedReader r = new BufferedReader(f);

            String Line;
            while ((Line = r.readLine()) != null) {
                String[] part = Line.split(",");

                ST st = new ST(part[0],Integer.parseInt(part[1]),Double.parseDouble(part[2]));
                a.add(st);
            }
            double max = a.get(0).cgpa;
            int index = 0 ;
            for (int i = 1;i<a.size();i++){
                if(max<a.get(i).cgpa){
                    index = i;
                    max = a.get(i).cgpa;
                }


            }
            System.out.println(a.get(index).name);
            System.out.println(a.get(index).id);
            System.out.println(a.get(index).cgpa);
            
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
class ST{
    String name ;
    int id ;
    double cgpa ;

    public ST(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}
