// Write a Java method to compute the averageof three numbers.

package Functions;

import java.util.Scanner;

class Problem_01 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the first number : ");
    double a = sc.nextDouble();
    System.out.print("Input the first number : ");
    double b = sc.nextDouble();
    System.out.print("Input the first number : ");
    double c = sc.nextDouble();
    sc.close();
    
    System.out.print("The average value is " + average(a,b, c)+ "\n");
    }

public static double average(double a, double b, double c) {
    return (a + b + c )/ 3;
    
}
}