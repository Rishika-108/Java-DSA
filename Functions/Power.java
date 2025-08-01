package Functions;

import java.util.Scanner;

public class Power {
    public static double power (double a, double b) {
        return Math.pow(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter base and power : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(power(a, b));
        sc.close();
    }
}
