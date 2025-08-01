package Functions;

import java.util.Scanner;

public class SumOfOdd {
    public static void sumOfOdd( int n) {
        if (n  >= 0) {
           int sum = 0; 
           for (int i = 1; i <= n; i++) {
            if (i %2 != 0) {
               sum += i;
            }
           } 
        System.out.println(sum);      
        } else  {
            System.out.println( "No negative numbers");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter n");
        int n = sc.nextInt();
        sumOfOdd(n);
        sc.close();
    }
}
