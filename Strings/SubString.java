package Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter Email : ");
        String email = sc.nextLine();
        String result =  " ";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) ==  '@') {
            break;
            } else  {
               result += email.charAt(i);
            }
        } System.out.println(result);
        
        sc.close();
    }
}
