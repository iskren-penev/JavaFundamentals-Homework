package softuni.homework.problem6;

import java.util.Scanner;

public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String base7Number = input.nextLine();
        int decimalNumber = Integer.valueOf(base7Number, 7);
        System.out.println(decimalNumber);
    }
}
