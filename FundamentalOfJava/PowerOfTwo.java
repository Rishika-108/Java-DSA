package FundamentalOfJava;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter number : ");
        int n = sc.nextInt();
        if ((n  > 0) &&  (n  & (n-1)) == 0) {
            System.out.println( "Is a power");
        } else  {
            System.out.println( "Is not a power");
        }
        sc.close();
    }
}
