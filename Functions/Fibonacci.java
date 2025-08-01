package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci (int n) {
      int  firstTerm = 0;
      int  secondTerm = 1;
      System.out.println( "0");
        for (int i = 0; i <=n; i++) {
            int nextterm = firstTerm + secondTerm;
            System.out.print(nextterm +  " ");
            firstTerm = secondTerm;
            secondTerm = nextterm;
        }
           
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter No : ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
