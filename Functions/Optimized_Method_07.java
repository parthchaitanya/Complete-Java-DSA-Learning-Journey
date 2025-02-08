
package Functions;

public class Optimized_Method_07 {



        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // Number is divisible by i, so it's not prime
                }
            }
            return true; // Number is prime
        }
    



        public static void primeInRange(int n) {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }





    
        public static void main(String[] args) {
            primeInRange(20); 
        }
    }
    



