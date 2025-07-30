package FundamentalOfJava;

public class Pattern19 {
    public static void main(String[] args) {
        for (int i = 1;  i <= 8; i++) {
            
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                System.out.print( "*"); 
                } else  {
                    System.out.print( " ");
                }
             }
           
            int spaces = 2* (8-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) {
               if (j == 1 || j == i) {
                System.out.print( "*"); 
                } else  {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
         for (int i = 8;  i  >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                System.out.print( "*"); 
                } else  {
                    System.out.print( " ");
                }
             }
           
            int spaces = 2* (8-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) {
               if (j == 1 || j == i) {
                System.out.print( "*"); 
                } else  {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }
}
//Hollow buterfly