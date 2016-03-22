package softuni.homework.problem8;

import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strArr = input.split("\\s+");
        if (strArr.length % 2 != 0){
            System.out.println("Invalid length");
        } else {
            int[] intArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            for (int i = 0; i < intArr.length; i+=2) {
                if (intArr[i] % 2 != 0 && intArr[i+1] % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd\r\n",
                            intArr[i], intArr[i+1] );
                } else if (intArr[i] % 2 == 0 && intArr[i+1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even\r\n",
                            intArr[i], intArr[i+1]);
                } else {
                    System.out.printf("%d, %d -> different\r\n",
                            intArr[i], intArr[i+1]);
                }
            }
        }
    }
}

