package softuni.homework.problem11;

import java.util.Scanner;

public class GetFirstOddOrEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strArr = input.split("\\s+");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        input = scan.nextLine();
        String[] commands = input.split("\\s+");
        drugTaenMetod(commands[2], Integer.parseInt(commands[1]), intArr);
    }
    public static void drugTaenMetod(String str, int count, int[] array) {
        int counter = 1;
        if (str.equals("even")) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] % 2 == 0) && counter <= count) {
                    System.out.print(array[i]);
                    System.out.print(" ");
                    counter++;
                }
            }
        }
        if (str.equals("odd")) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] % 2 != 0)&& counter <= count)  {
                    System.out.print(array[i]);
                    System.out.print(" ");
                    counter++;
                }
            }
        }
        System.out.println();
    }
}

