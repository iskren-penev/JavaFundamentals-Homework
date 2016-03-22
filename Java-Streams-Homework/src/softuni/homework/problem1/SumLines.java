package softuni.homework.problem1;

import java.io.*;

public class SumLines {

    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(
                new FileReader(new File ("resources/SumLines/lines.txt")))
        ) {
            String s;
            while ((s = bfr.readLine()) != null) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += s.charAt(i);
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found!");
        } catch (IOException ioe) {
            System.out.println("File not found!");
        }
    }
}
