// Stack height = n
public class xRaiseToN {
    public static int x (int x, int n) {

        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }

        int xPowM1 = x(x, n - 1);
        int xPowerN = x*xPowM1;
        return xPowerN;     

    }
    public static void main(String[] args) {
        System.out.println(x(2, 3));
        
    }
}
