import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    public static void main (String args[] ) {
        ArrayList <Integer> list = new ArrayList <Integer > ();
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter rows : ");
        int r = sc.nextInt ();
        System.out.println( "Enter column : ");
        int c = sc.nextInt();


        System.out.println( "Enter elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                 int elem = sc.nextInt();
                 list.add(elem);
            }
            
        }
        System.out.println( "Matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
              int index = i*c + j;
              System.out.print(list.get(index) + " ");
             
            }
            System.out.println();
        }
        
        sc.close();

    }
}
