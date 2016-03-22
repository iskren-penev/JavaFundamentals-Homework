package softuni.homework.problem5;

import java.util.Scanner;

public class DecimalToBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimalNumber = input.nextInt();

        String base7Number = Integer.toString(decimalNumber, 7);
        System.out.println(base7Number);
    }
}
