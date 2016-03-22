package org.softuni.homework.printcharactertriangle;

import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j + 97));
            }
            System.out.println();
        }
        for (int i = number - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j + 97));
            }
            System.out.println();
        }
    }
}
