package Strings;

import java.util.Scanner;

public class ArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Size : ");
        int size = sc.nextInt();
        String names [] = new String[size];
        int length = 0;
        for (int i = 0; i < size; i++) {
            names [i] = sc.next();
            length += names[i].length();
            
        }
        System.out.println(length);
        sc.close();
    }
}
