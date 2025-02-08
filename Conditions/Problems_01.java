package Conditions;

import java.util.Scanner;

public class Problems_01 {
    public static void main(String[] args) {
         // Print if a number is Odd or Even
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if(number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
