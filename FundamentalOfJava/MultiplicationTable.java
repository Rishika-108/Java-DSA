package FundamentalOfJava;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number whose table is to be written : ");
        int n = sc.nextInt();
        for (int i = 1; i  <= 10; i++) {
            System.out.println (n + "X" + i +  "=" + n*i );
        }
        sc.close();
        
    }
}
