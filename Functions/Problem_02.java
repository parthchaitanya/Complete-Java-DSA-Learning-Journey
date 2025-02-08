package Functions;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num ;

        System.out.print("Enter an integer : ");
        int num = sc.nextInt();


        if(isEven(num)) {
            System.out.print("Number is even");
        } else {
            System.out.print("Number is odd");
        }
        sc.close();

    }

    public static boolean isEven(int number) {
        if (number % 2  == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
