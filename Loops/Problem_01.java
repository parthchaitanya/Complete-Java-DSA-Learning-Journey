package Loops;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int number = 1;
           while (number <= n) {
                System.out.print(number);
                number++;
        }
        sc.close();
    }
}
