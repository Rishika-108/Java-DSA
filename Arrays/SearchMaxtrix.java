package Arrays;

import java.util.Scanner;

public class SearchMaxtrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
     System.out.println( "Enter no of rows : ");
     int r = sc.nextInt();
     System.out.println( "Enter no column : ");
     int c = sc.nextInt();
     int marks[][] = new int[r][c];

     System.out.println( "Enter elements of matrix : ");
     for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
        marks[i][j] = sc.nextInt();
        }
     }
    System.out.println( "Enter no to search : ");
    int n = sc.nextInt();
    for (int i = 0; i  < r; i++) {
        for (int j = 0; j  < c; j++) {
            if (n == marks[i][j]) {
                System.out.println(n +  " found at " +  i +  "th row " + j +  "th column");
            }
        }
    } sc.close();
    }
}
