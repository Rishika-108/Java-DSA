import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ch;
        
        do  {
           System.out.println( "Enter your marks out of 100");
           int marks = sc.nextInt();
           if  (marks  >= 90  && marks  <= 100) {
            System.out.println( "This is good");
           } else if  (marks   <= 89  && marks   >= 60) {
            System.out.println( "This is also good");
           } else if  (marks  <= 59  && marks  >=0) {
            System.out.println( "This is good as well");
           }
            System.out.println("Enter 1 to continue and 0 to exit");
            ch = sc.nextInt();
        } while  (ch == 1);
    
        sc.close();
    }
}
