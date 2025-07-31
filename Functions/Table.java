package Functions;

import java.util.Scanner;

public class Table {
    public static void Tables (int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter number : ");
        int n = sc.nextInt();
        Tables(n);
        sc.close();
    }
}
