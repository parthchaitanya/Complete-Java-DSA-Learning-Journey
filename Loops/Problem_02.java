package Loops;

import java.util.Scanner;


class Problem_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 4;
        int sum = 0;


        int i = 1;
        while(i<= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
       sc.close();
    }
}
