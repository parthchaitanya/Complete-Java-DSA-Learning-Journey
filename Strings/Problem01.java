import java.util.*;
public class Problem01 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // System.out.print("Enter the String :");
        String str = new Scanner(System.in).next();
        int count = 0;


        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i); 
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
                count++;
            }
        }
        System.out.println("count of vowels is : " + count);
    }

}
