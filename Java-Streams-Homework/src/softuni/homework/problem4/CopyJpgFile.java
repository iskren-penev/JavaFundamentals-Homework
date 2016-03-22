package softuni.homework.problem4;

import java.io.*;

public class CopyJpgFile {
    public static void main(String[] args) {
        File inputImage = new File("resources/CopyJpgFile/softuni_logo.jpg");
        File outputImage = new File("resources/CopyJpgFile/my-copied-picture.jpg");

        try (FileInputStream fis = new FileInputStream(inputImage);
        FileOutputStream fos = new FileOutputStream(outputImage)) {
            int symbol;
            while ((symbol = fis.read()) != -1) {
                fos.write(symbol);
            }
        }catch (FileNotFoundException fnf) {
            System.out.println("File not found!");
        }catch (IOException ioe) {
            System.out.println("Some I/O exception!");
        }
    }
}
