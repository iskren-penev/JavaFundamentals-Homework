package softuni.homework.problem6;

import java.io.*;

public class SaveACustomObject {
    public static Course[] courses;

    public static void main(String[] args) {
        courses = new Course[4];
        courses[0] = new Course("Java Fundamentals", 35);
        courses[1] = new Course("Programming Basics", 48);
        courses[2] = new Course("Advanced C#", 19);
        courses[3] = new Course("Yoga", 35);

        saveObjects();
        loadObjects();
    }
    public static class Course implements Serializable {
        private String name;
        private int numberOfStudents;

        public Course(String name, int numberOfStudents) {
            this.setName(name);
            this.setNumber(numberOfStudents);
        }
        public void setName (String name) {this.name = name;}
        public void setNumber (int numberOfStudents) {this.numberOfStudents = numberOfStudents;}
        public String getName() {return name;}
        public int getNumber() {return numberOfStudents;}
    }
    private static void saveObjects() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("resources/SaveACustomObject/course.save")))) {

            for(Course c : courses) {
                oos.writeObject(c);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }

    private static void loadObjects() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("resources/SaveACustomObject/course.save")))) {
            Object obj;

            while ((obj = ois.readObject()) != null) {
                System.out.println(obj);
            }
        }
        catch (EOFException eof) {
            System.out.println("END OF FILE!");
        }
        catch (ClassNotFoundException | IOException cnfe) {
            System.out.println(cnfe.toString());
        }
    }
}
