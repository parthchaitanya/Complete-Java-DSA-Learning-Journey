package Loops;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a set of integers separated by spaces:");
        String input = sc.nextLine();

        String[] numbers = input.split(" ");

        int sumEven = 0;
        int sumOdd = 0;
        

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        // Print the results
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        sc.close();
    }

}
