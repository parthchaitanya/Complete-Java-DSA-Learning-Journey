package Conditions;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String Result = (marks >= 33)? "PASS" : "FAIL";
        System.out.println(Result);
        sc.close();
    }
}
