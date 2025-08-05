package Functions;

//Stack Height = log n
public class PowerN {
    public static int power(int x, int n) {
        if (n == 0) return 1; 
        if (x == 0) return 0;

        int halfPower = power(x, n / 2);
        
        if (n % 2 == 0) {
            return halfPower * halfPower; // If n is even
        } else {
            return halfPower * halfPower * x; // If n is odd
        }
    }

    public static void main(String[] args) {
        System.out.println (power (2, 3));
    }
}
