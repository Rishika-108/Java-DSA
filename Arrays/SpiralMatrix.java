package Arrays;

import java.util.Scanner;

public class SpiralMatrix {
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
        System.out.println( "Spiral Order : ");
        int rowStart = 0;
        int rowEnd = r-1;
        int colStart = 0;
        int colEnd = c - 1;
        while (rowStart  <= rowEnd  && colStart  <= colEnd) {
            for (int col = colStart; col <= colEnd; col ++) {
                System.out.print( matrix[rowStart][col] +  " ");
            } rowStart++;

            for (int row = rowStart; row <= rowEnd ;row++) {
                System.out.print(matrix[row][colEnd] +  " ");
            } colEnd--;

            for (int col = colEnd; col  >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] +  " ");
            } rowEnd--;

            for (int row = rowEnd; row  >= rowStart; row--)  {
                System.out.print(matrix[row][colStart] +  " ");
            } colStart++;
            System.out.println();
        }
        sc.close();
    }
}
// 1 2 3
// 4 5 6
// 7 8 9
// Answer : 1 2 3 6 9 7 4 5