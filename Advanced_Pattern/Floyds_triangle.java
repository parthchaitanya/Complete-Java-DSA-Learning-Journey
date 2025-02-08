package Advanced_Pattern;

public class Floyds_triangle {
    public static void flloyd_Triangle(int n) {
        // outer
        int counter = 1;
        for(int i = 1; i<=n; i++) {
            // inner - how many times will counter be  printer 
            for( int j = 1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        flloyd_Triangle(5);
    }
}
