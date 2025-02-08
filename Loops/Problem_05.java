package Loops;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        
        int num = sc.nextInt();
        // int i = 1;
        for (int i = 1; i<11; i++){

            System.out.println(num + "*" + i + "=" + num*i);
        }

        sc.close();
    }
}
