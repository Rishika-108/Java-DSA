package Strings;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String fname = sc.next();
        String lname = sc.next();//Input a string
        String fullname = fname + lname; //Concatenation
        System.out.println(fullname);
        System.out.println(fullname.length());// Length of string
        System.out.println(fullname.substring(0,5 )); //SubString in a String

        String str =  "123";
        int num = Integer.parseInt(str); //Converts String to Integer
        System.out.println(num + 1);

        int no = 123;
        String str2 = Integer.toString(no); //Converts Integer to String
        System.out.println(str2.length());

        for (int i = 0; i   <= fullname.length(); i++) {
            System.out.print(fullname.charAt(i)); // Access character of String
        }
       
    sc.close();
    }
}
