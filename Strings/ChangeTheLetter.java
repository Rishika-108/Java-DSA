package Strings;

import java.util.Scanner;

public class ChangeTheLetter {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println( "Enter String");
       String str = sc.nextLine(); 
       String result =  " ";
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'e') {
             result += 'i';
           } else  {
              result += str.charAt(i);
           }
           
       } System.out.println( "Result" + result);
       sc.close();
       
    }
}
