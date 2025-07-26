
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println( "Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println( "Choice  : 1.Add 2.Sub 3.Multiply 4.Divide");
        int ch = sc.nextInt();
        switch (ch) {
            case 1 :
            System.out.println(num1 + num2);
            break;
            case 2 :
            System.out.println(num1 - num2);
            break;
            case 3 :
            System.out.println(num1 * num2);
            break;
            case 4 :
            System.out.println(num1/num2);
            break;
            default :
            System.out.println( "Enter only from 1-4");
            break;
        }
        sc.close();
    }
}
