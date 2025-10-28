package FINAL.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Spring24 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/FINAL/Files/sp24in");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("src/FINAL/Files/sp24out");
            BufferedWriter bw = new BufferedWriter(fw);

            String line;
            int min =100000 ;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                char c = line.charAt(0);
                if (c>='0'&&c<='9') { // check if the line contains only digits
                    int num = Integer.parseInt(line);
                    if (num < min) {
                        min = num;
                    }
                    found = true;
                }
            }

            if (found) {
                bw.write("Minimum value: " + min);
            } else {
                bw.write("No numbers found in file.");
            }

            br.close();
            bw.close();
            System.out.println("Minimum value written successfully!");

        } catch (Exception e) {
            System.out.println("Error occurred while processing the file.");
        }






    }
}
