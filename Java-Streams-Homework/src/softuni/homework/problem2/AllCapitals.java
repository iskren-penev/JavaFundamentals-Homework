package softuni.homework.problem2;
import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        File path = new File("resources/AllCapitals/lines.txt");
        File finalPath = new File (path + ".tmp");
        finalPath.getParentFile().mkdirs();
        try (BufferedReader bfr = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter(finalPath))) {
            String s;
            String full ="";
            while ((s = bfr.readLine()) != null) {
                s = s.toUpperCase();
                full += s + "\r\n";
            }
            bw.write(full);

        } catch (FileNotFoundException fnf) {
            System.out.println("File not found!");
        } catch (IOException ioe) {
            System.out.println("File not found!");
        }
        if (path.delete()) {
            finalPath.renameTo(path);
        }

    }
}
