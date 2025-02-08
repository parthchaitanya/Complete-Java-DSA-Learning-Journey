package Patterns;

public class Nested_Loops_01 {
    public static void main(String[] args) {
        int n = 4;
        for (int l = 1; l<=n; l++) {
            for(int star=1; star<=l; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
