package Functions;

import java.util.Scanner;

public class Vote {
    public static String vote (int a) {
       if (a >= 18) {
        return "Can Vote";
       } else  {
        return  "Cannot Vote";
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Age : ");
        int a = sc.nextInt();
        System.out.println(vote(a));
        sc.close();
    }
}
