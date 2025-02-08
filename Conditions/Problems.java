package Conditions;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // QUESTION 1! 
        // System.out.println("Enter Number : ");
        // int num = sc.nextInt();
        // if (num > 0) {
        //     System.out.println("The given number is positive.");
        // }
        // else if (num < 0) {
        //     System.out.println("The given number is negative.");
        // }
        // else {
        //     System.out.println("The given number is neither negative nor positive.");
        // }



        // QUESTION 2!
        // System.out.println("Enter the number between 1-7 : ");
        // int n = sc.nextInt();
        // switch (n) {
            //     case 1 : System.out.println("Sunday");
            //         break;
            //     case 2 : System.out.println("Monday");
            //         break;
            //     case 3 : System.out.println("Tuesday");
            //         break;
            //     case 4 : System.out.println("Wednesday");
            //         break;
            //     case 5 : System.out.println("Thursday");
            //         break;
            //     case 6 : System.out.println("Friday");
            //         break;
            //     case 7 : System.out.println("Saturday");
            //         break;
            
            //     default:
            //         break;
            // }
            
            
            
            
            // QUESTION 3!
            // inta=63,b=36;
            // System.out.println("Enter the a : ");
            // int a = sc.nextInt();
            // System.out.println("Enter the b : ");
            // int b = sc.nextInt();
            // boolean x = (a < b)? true: false;
            // int  y = (a>b)? a: b;
            // System.out.println(x);
            // System.out.println(y);
            



            // QUESTION 4!
            System.out.print("Input the year: ");
            int year = sc.nextInt();
            boolean x= (year % 4) == 0;
            boolean y= (year % 100) !=  0;
            boolean z= ((year % 100 == 0) && (year % 400==0));
            if(x && (y || z)) {
                System.out.println(year + " is a leap year. ");
            } else {System.out.println(year + " is not a leap year. ");
        }
        sc.close();
    }

}

