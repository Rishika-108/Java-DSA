public class Fibonacci2 {
    public static void fibo (int a, int b,int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibo(b, c, n-1);// Now a = b, and b = c
       
    }
    public static void main(String[] args) {
        int a = 0, b = 1, n = 7;
        System.out.println(a);
        System.out.println(b);
        fibo(0, 1, n-2);
    }
}
