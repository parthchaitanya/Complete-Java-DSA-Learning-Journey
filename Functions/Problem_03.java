package Functions;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int digits = sc.nextInt();
        sc.close();
        System.out.println("The sum is " + sumDigits(digits));
    }

public static int sumDigits(int n) {
    int sumDigits = 0;
    while(n>0) {
        int lastDigit = n % 10;
        sumDigits += lastDigit;
        n /= 10;

    }
    return sumDigits;
}
}
