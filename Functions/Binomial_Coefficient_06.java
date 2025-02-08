package Functions;

public class Binomial_Coefficient_06 {
    public static int BioCoeff(int n, int r) {
        int fact_n = n;
        int fact_r = r;
        int fact_nmr = n-r;

        int BioCoeff = fact_n/ (fact_r * fact_nmr);
        return BioCoeff;
    }

    public static void main(String[] args) {
        System.out.println(BioCoeff(5, 2));
    }
}
