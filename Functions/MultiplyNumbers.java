package Functions;

import java.util.Scanner;

public class MultiplyNumbers {
    public static void Multiply (int a, int b) {
        int product = a*b;
        System.out.println(product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Num1 : ");
        int a = sc.nextInt();
        System.out.println( "Enter Num2 : ");
        int b = sc.nextInt();
        Multiply(a, b);
        sc.close();
    }
    
    
//Way 2
//     public static int product (int a, int b) {
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(product(a, b));
//         sc.close();
//     }
}
