package Arrays;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Rows : ");
        int r = sc.nextInt();
        System.out.println( "Columns : ");
        int c = sc.nextInt();
        int matrix [][] = new int[r][c];

        System.out.println( "Enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println( "Matrix : ");
        for (int i = 0; i  < r; i++) {
            for (int j = 0; j  < c; j++) {
                System.out.print(matrix[i][j]  +  " ");
            }
            System.out.println();
        }
        System.out.println( "Transpose : ");
        for (int i = 0; i  < c; i++) {
            for (int j = 0; j  < r; j++) {
                System.out.print(matrix[j][i]  +  " ");
            }
            System.out.println();
        } sc.close();
    }
}
