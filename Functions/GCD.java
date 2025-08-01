package Functions;

import java.util.Scanner;

public class GCD {
    public static void gcd (int n1, int n2) {
        int gcd = 1;
       for ( int i = 1; i <= n1 && i <= n2; i++) {
        if (n1  % i == 0  && n2 % i == 0) {
        gcd = i;
        }
       } 
       System.out.println( "GCD :  "+ gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter Two No : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1, n2);
        sc.close();
    }
}
