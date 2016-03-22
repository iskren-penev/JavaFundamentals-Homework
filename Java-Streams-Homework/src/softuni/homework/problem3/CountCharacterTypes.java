package softuni.homework.problem3;

import java.io.*;
public class CountCharacterTypes {
    public static void main(String[] args) {
        File text = new File("resources/CountCharacterTypes/words.txt");
        try (BufferedReader bfr = new BufferedReader(new FileReader(text));
        BufferedWriter bwr = new BufferedWriter(new FileWriter("resources/CountCharacterTypes/count_chars.txt"))){
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            String line;
            while ((line = bfr.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == 'a'|| line.charAt(i)== 'e' || line.charAt(i)=='i'||                               line.charAt(i) == 'o' || line.charAt(i) == 'u'){
                        vowels++;
                    }else if (line.charAt(i) == '.'|| line.charAt(i) == '!' ||
                              line.charAt(i) == '?' || line.charAt(i) == ',') {
                        punctuation++;
                    }else if (line.charAt(i) != ' ') {
                        consonants++;
                    }
                }
            }
            bwr.write("Vowels:" + vowels + "\r\n");
            bwr.write("Consonants:" + consonants + "\r\n");
            bwr.write("Punctuation:" + punctuation + "\r\n");
        }catch (FileNotFoundException fnf){
            System.out.println("File not found!");
        }catch (IOException ioe){
            System.out.println("I/O Exception");
        }
    }
}
