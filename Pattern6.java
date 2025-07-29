public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 1; i  <= 5; i++) { // No of rows = 5
            for (int j = 1; j  <= 5-i; j++) {
                System.out.print( " ");// Print space until 5-i(i = row number) 
            } // for 1st row, it will print space till 4th column
            for  (int j = 1; j  <= i ; j++) {
                System.out.print( "*"); //When col no is less than/ equal to j; it will 
                // print star 
            }
             System.out.println();
        }
    }
}
/*
        *
      * *
    * * * 
  * * * * 
* * * * *
 */