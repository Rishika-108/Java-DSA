package Arrays;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Size : ");
        int size = sc.nextInt();
        int nos[] = new int[size];
        System.out.println( "Enter nos : ");
        for (int i = 0; i < size; i++) {
             nos[i] = sc.nextInt();
        }
        System.out.println( "Enter no to search : ");
        int s = sc.nextInt();

        for (int i = 0; i < size; i++)  {
           if (s == nos[i] ) {
            System.out.println(s +  " present at " + i);
           }
        } sc.close();
    }
}
