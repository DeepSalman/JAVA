package FINAL.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

class information{
    String id;
    String name;
    int m1;
    int m2;
    int sum;

    information(String id, String name, int m1, int m2) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;

    }

    public int sum() {
        sum = m1 + m2;
        return sum;
    }

}

public class Spring25 {
    public static void main(String[] args) {
        ArrayList<information> info = new ArrayList<>();
        try{
            FileReader f = new FileReader("src/FINAL/Files/s25in");
            BufferedReader br = new BufferedReader(f);

            String line;
            while((line=br.readLine())!=null){
                line.trim();
                String[] words = line.split(" ");
                information inf = new information(words[0], words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]));
                info.add(inf);
            }
            f.close();
            FileWriter fw = new FileWriter("src/FINAL/Files/s25out1");
            BufferedWriter bw = new BufferedWriter(fw);


            for(int i=0;i<info.size();i++){
                bw.write(info.get(i).id+" "+info.get(i).name);
                bw.newLine();
            }
            bw.close();
            System.out.println("Logics");

            FileWriter fw2 = new FileWriter("src/FINAL/Files/s25out2");
            BufferedWriter bw2 = new BufferedWriter(fw2);
            for(int i=0;i<info.size();i++){
                int total = info.get(i).m1+info.get(i).m2;
               bw2.write(info.get(i).id+" "+total);
               bw2.newLine();
            }
            bw2.close();



        }
        catch(Exception e){
            System.out.println("Logical error occured");

        }
    }
}
