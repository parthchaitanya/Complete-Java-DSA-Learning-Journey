package Functions;

import java.util.Scanner;

public class Syntax_with_Parameter_02 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    public static int calculateSum(int num1, int num2) {   // parameter or formal parameters
        int sum = num1 + num2 ;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        
        int sum = calculateSum(a, b); // arguments or actual parameter.
        System.out.println("Sum is : " + sum);



        // printHelloWorld();4

        sc.close();
    }
    
}
