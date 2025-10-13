package FILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ST{

    String name;

    public ST(String name) {

        this.name = name;
    }

    public String toString(){
        return "Name : " + this.name + ", CG : "; /*+ this.cg;*/
    }
}



class namesort implements Comparator<ST>{
    public int compare(ST a, ST b) {
        return a.name.compareTo(b.name);
    }
}

public class Practice {
    public static void main(String[] args) {
        ArrayList<ST> list = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        try{
            FileReader r1 = new FileReader("src/FILE/F1");
            BufferedReader b1 = new BufferedReader(r1);
            FileReader r2 = new FileReader("src/FILE/F2");
            BufferedReader b2 = new BufferedReader(r2);

            String names;
            String cgs;
            while(((names=b1.readLine())!=null)){
                ST s1 = new ST(names);
                list.add(s1);
            }

            while((cgs=b2.readLine())!=null){
                list2.add(Double.parseDouble(cgs));
            }
            b1.close();
            b2.close();

            Collections.sort(list, new namesort());
            System.out.println(list);

            Collections.sort(list2,Collections.reverseOrder());
            System.out.println(list2);

            FileWriter fw = new FileWriter("src/FILE/F3");
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i=0;i<list.size();i++){
                bw.write(list.get(i).name+"-"+list2.get(i));
                bw.newLine();
            }
            bw.close();



        }
        catch(Exception e){

        }
    }
}
