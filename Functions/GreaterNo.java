package Functions;

import java.util.Scanner;

public class GreaterNo {
    public static String greaterNo(int a, int b)  {
         if (a  > b) {
            return  "First No is Greater";
         } else  {
            return  "Second No is Greater";
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter n1, n2");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greaterNo(a, b));
        sc.close();
    }
}
