package Functions;

import java.util.Scanner;

public class Radius {
    public static double circum (int r) {
        return 3.14*r*2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter r");
        int r = sc.nextInt();
        System.out.println(circum(r));
        sc.close();
    }
}
