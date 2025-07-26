import java.util.Scanner;
public class CanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter your age : ");
        int age = sc.nextInt();
        if  (age  >= 18)  {
            System.out.println( "Yes, you can vote.");
        } else  {
            System.out.println ( "You are too young to vote.");
        }
        sc.close();
    }
}
