package SortingAlgorithms;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr [] = new int[3];
        //Input
        System.out.println( "Enter array : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > j) {
                    smallest = j;
                } 
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        //Output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }

        sc.close();
    }
}
