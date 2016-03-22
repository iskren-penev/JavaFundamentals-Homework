package org.softuni.homework.getaverage;

import java.util.Locale;
import java.util.Scanner;

public class GetAverage {
    public static double getAverage (double a, double b, double c){

        return (a + b + c) / 3;
    }
    public static void main (String[] args){
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double average = getAverage(a,b,c);
        System.out.println(String.format("%.2f", average));
    }
}
