package Conditions;

import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // ternary operator 
        String type = ((number%2) == 0)?"even" : "odd";
        System.out.println(type);

        sc.close();
    }
}
