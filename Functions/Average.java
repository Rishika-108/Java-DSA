package Functions;

import java.util.Scanner;

public class Average {
    public static double average (int a, int b, int c) {
        return  (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Num1, Num2, Num3 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(average(a, b, c));
        sc.close();
    }
}
