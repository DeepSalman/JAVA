package FINAL.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Fall24 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/FINAL/Files/f24in");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("src/FINAL/Files/f24out");
            BufferedWriter bw = new BufferedWriter(fw);

            String line;
            while ((line = br.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c>='0' && c<='9') {
                        bw.write(c);
                    }
                }

                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("Digits extracted successfully!");

        } catch (Exception e) {
            System.out.println("Error occurred while processing the file.");
        }
    }
}
