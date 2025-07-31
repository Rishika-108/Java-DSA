package Functions;

import java.util.Scanner;

public class Even {
    public static String Odd (int n) {
       if (n % 2 == 0) {
        return  "Even";
       } else  {
        return  "Odd";
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter number");
        int n = sc.nextInt();
        System.out.println(Odd(n));
        sc.close();
    }
}
