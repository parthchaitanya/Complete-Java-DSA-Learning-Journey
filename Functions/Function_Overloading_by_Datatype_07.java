package Functions;

public class Function_Overloading_by_Datatype_07 {
    // is the given number is prime or not

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        // corner cases for int = 2
        if (n == 2){
            return true;
        }




        for(int i = 2; i<=n-1; i++) {
            if(n % i == 0) {

                // return false;


                    isPrime = false;
                    break;
            }
        }
        // return true;


        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
}
