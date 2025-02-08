package Patterns;

public class Half_Pyramid_03 {
    public static void main(String[] args) {
        int n = 8;
        for(int line=1;  line<=n;  line++){
            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
