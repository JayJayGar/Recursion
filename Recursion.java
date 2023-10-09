import java.net.SocketOption;
import java.sql.SQLOutput;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fib(4));
        System.out.println(pal("madamimadam"));
        System.out.println(pal("woppy"));
        System.out.println(mult(3,5));
    }

    public static int fact(int n) {
        if (n==0) { return 1;} //Base case
        return n*fact(n-1);
    }

    /** @return  the nth integer in the fibonacci sequence
     * NOTE: INCREDIBLY SLOW WAY TO DO */
    public static int fib(int n) {
        if (n < 2) { return 1; } //Base case
        return fib(n-1)+fib(n-2);
    }

    /** @return true iff given String is a palindrome */
    public static boolean pal(String s) {
        if (s.length() < 2) { return true; }
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length()-1);
        if(firstChar != lastChar) {
            return false; //Base case
        } return pal(s.substring(1,s.length()-1));
    }

    /** @return the product x*y
     * Pre: x>=0 */
    public static int mult(int x, int y) {
        if (x==0 || y==0) { return 0; } // Base case
        return y + mult(x-1,y); //recursive cast
    }
}
