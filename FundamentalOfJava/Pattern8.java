package FundamentalOfJava;
public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 5; i  >= 1; i--) { //By doing this, it changes rows to columns
            for (int j = 1;  j  <= i; j++) {
               System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 12345
// 1234
// 123
// 12
// 1