package Functions;

import java.util.Scanner;

public class Factorial {
    public static void fact (int n) {
      int fact = 1;
       for (int i = 1; i <= n; i++) {
        fact = fact*i;
    }
     System.out.println(fact);
    }
   public static void main(String[] args) {
    System.out.println( "Enter the no");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    fact(n);
    sc.close();
   
   }

}
