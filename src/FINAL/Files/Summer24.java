package FINAL.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Summer24 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/FINAL/Files/s24in");
            BufferedReader br = new BufferedReader(fr);

            String line;
            double sum = 0;
            int count = 0;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                sum = sum + Double.parseDouble(line);
                count++;
            }

            double avg = 0;
            avg = sum / count;

            FileWriter fw = new FileWriter("src/FINAL/Files/s24out");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(avg+"");
            bw.newLine();

            br.close();
            bw.close();
            System.out.println("Average calculated successfully!");

        } catch (Exception e) {
            System.out.println("Error occurred while processing the file.");
        }
    }
}
