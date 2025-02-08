package Loops;

import java.util.Scanner;

public class Continue_Statement_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter your number : ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }
            System.out.println("number was : " + n);
            sc.close();
        } while(true);
    }
}

