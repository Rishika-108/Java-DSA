package FundamentalOfJava;

public class Pattern13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j +  " ");
            }
            for  (int j = 1; j <= i; j++) {
                System.out.print(j +  " ");
            }
            System.out.println();
        }
    }
}
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
