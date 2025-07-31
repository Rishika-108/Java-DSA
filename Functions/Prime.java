package Functions;

import java.util.Scanner;


public class Prime {
   public static String prime (int n) {
        int count = 0;
        if  (n <= 2) {
            return "Invalid";
        } else  {
            for (int i = 2 ; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count >= 2) {
                return  "Not Prime Number";
            } else  {
                return  "Prime Number";
            }
        }
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println( "Enter a number : ");
    int n = sc.nextInt();
    System.out.println(prime(n));
    sc.close();
   }
}
