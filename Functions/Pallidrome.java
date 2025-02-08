package Functions;

import java.util.Scanner;

public class Pallidrome {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int pallindrome = sc.nextInt();

        if(isPallindrome(pallindrome)) {
            System.out.println("Number :" + pallindrome +  " is a pallindrome");
        } else {
            System.out.println("Number :" + pallindrome +  " is a not pallindrome");
        }
        sc.close();
    }

    public static boolean isPallindrome (int number) {
        int pallindrome = number;
        int reverse = 0;

        while (pallindrome != 0) {
            int remainder = pallindrome % 10;
            reverse = reverse * 10 + remainder;
            pallindrome = pallindrome / 10;
        }
        // if original and the reverse of number is equal means
        // number is pallindrome in Java

        if(number == reverse) {
            return true;
        }
        return false;
    }
}
