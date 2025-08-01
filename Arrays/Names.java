package Arrays;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "How many names you want to enter ? ");
        int size = sc.nextInt();
        String names [] = new String[size];
        System.out.println( "Enter names : ");

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        } sc.close();
    }
}
