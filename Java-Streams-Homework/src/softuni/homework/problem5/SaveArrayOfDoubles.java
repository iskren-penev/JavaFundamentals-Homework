package softuni.homework.problem5;
import java.io.*;
import java.util.ArrayList;

public class SaveArrayOfDoubles {
    public static void main(String[] args) {
        ArrayList<Double> listOfDoubles = new ArrayList<>();
        listOfDoubles.add(5.5);
        listOfDoubles.add(25.1);
        listOfDoubles.add(3.678);
        listOfDoubles.add(5.89);
        listOfDoubles.add(7.4654);
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream("resources/SaveArrayOfDoubles/doubles.list")))) {
            oos.writeObject(listOfDoubles);
            oos.flush();
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream("resources/SaveArrayOfDoubles/doubles.list")));
            System.out.println("ArrayList of doubles:" + ois.readObject());
            ois.close();
        }catch (FileNotFoundException fnf) {
            System.out.println("File not found!");
        }catch (ClassNotFoundException cnf) {
            System.out.println("Class not found!");
        }        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
