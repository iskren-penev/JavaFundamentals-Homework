package softuni.homework.problem10;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        System.out.println(taenMetod(str1, str2));
    }
    private static int taenMetod(String s1, String s2){
        int sum = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                sum += s1.charAt(i) * s2.charAt(i);
            }
        } else if (s1.length() > s2.length()) {
            for (int i = 0; i < s2.length(); i++) {
                sum += s1.charAt(i) * s2.charAt(i);
            }
            for (int i = s2.length(); i < s1.length(); i++) {
                sum += s1.charAt(i);
            }
        } else if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                sum += s1.charAt(i) * s2.charAt(i);
            }
            for (int i = s1.length(); i < s2.length(); i++) {
                sum += s2.charAt(i);
            }
        }
        return sum;
    }
}
