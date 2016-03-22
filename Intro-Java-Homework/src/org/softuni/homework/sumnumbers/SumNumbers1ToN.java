package org.softuni.homework.sumnumbers;

import java.util.Scanner;

public class SumNumbers1ToN {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
