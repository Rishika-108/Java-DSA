package FundamentalOfJava;

public class Pattern20 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5-i; j++) {
                System.out.print( " ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num +  " ");
                num = num *  (i - j)/ (j+1);
            }
            System.out.println();
        }
    }
}
// // Pascal' Triangle
//    1
//   1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
