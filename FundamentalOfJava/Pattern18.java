package FundamentalOfJava;

public class Pattern18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print( " ");
            }
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(i +  " ");
            }
            System.out.println();
        }
    }
}
// 
// 1 1 1 1
//  2 2 2
//   3 3
//    4