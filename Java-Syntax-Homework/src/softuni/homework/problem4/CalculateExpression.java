package softuni.homework.problem4;

import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double averageNumbers = (a + b + c) / 3;
        double averageFormula = (firstFormula(a, b, c) + secondFormula(a, b, c)) / 2;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f\r\n", firstFormula(a, b, c),
                secondFormula(a, b, c), Math.abs(averageNumbers - averageFormula));
    }

    public static double firstFormula (double a, double b, double c) {
        double formula1 = Math.pow((a*a + b*b ) / ( a*a - b*b ), (a+b+c)/Math.sqrt(c));
        return formula1;
    }
    public static double secondFormula (double a, double b, double c){
        double formula2 = Math.pow((a*a + b*b - (c*c*c)), a-b);
        return  formula2;
    }
}
