package FundamentalOfJava;
import java.util.Scanner;

public class Even {
    public static void main  (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter the number till which you want even set of numbers : ");
        int n = sc.nextInt();
        for (int i = 0; i  <= n; i++) {
            if (i  % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
