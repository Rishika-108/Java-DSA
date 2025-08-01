package Arrays;

import java.util.Scanner;

public class CheckIfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[5];
        System.out.println( "Enter nos of array : ");
           boolean isAscending = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
     
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]  > arr[i+1]) {
                isAscending = false;
            } 
        }

        if (isAscending) {
        System.out.println(  "Ascending");
        } else {
            System.out.println( "Not Ascending");
        } 
        sc.close();
    }
}
