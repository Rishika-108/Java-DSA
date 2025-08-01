package Functions;

import java.util.Scanner;

public class CountNumber {
    public static void count () {
       int  pcount = 0;
       int  ncount = 0;
       int  zcount = 0;
       int ch;
       Scanner sc = new Scanner(System.in);
       
        do {
            System.out.println( "Enter Number : ");
            int n = sc.nextInt();
            if (n  > 0) {
            pcount+=1;
            } else if (n  < 0) {
            ncount += 1;
            } else if (n == 0)  {
            zcount += 1;
            }
            System.out.println( "Enter 1 to continue 0 to exit");
            ch = sc.nextInt();
        } while (ch == 1);
        System.out.println( "Positive : " + pcount +  " Negative : " + ncount +  " Zeroes : " + zcount);
        sc.close ();
    }
    public static void main(String[] args) {
            count();
            
    }
}
