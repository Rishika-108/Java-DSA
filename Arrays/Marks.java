package Arrays;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter size : ");
        int size = sc.nextInt();
        int marks [] = new int[size];

        System.out.println( "Enter marks : ");

        for (int i = 0; i < size; i++) {
             marks[i] = sc.nextInt();
        }
    
        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] +  " ");
        }
        sc.close();
    }
}
