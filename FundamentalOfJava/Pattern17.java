package FundamentalOfJava;

public class Pattern17 {
    public static void main(String[] args) {
        for (int i = 1; i  <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j +  " ");
            }
            System.out.println();
        }
    }
}
//Pyramid 
//   1
//  1 2
// 1 2 3
