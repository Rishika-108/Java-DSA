package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println( "Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        //Bubble Sort
        for (int i = 0; i < size - 1; i++) { // i is used to count the number of iterations
            for (int j = 0; j < size - i - 1; j++) { //j is used as index of array
                if (arr[j]  > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println ( "Sorted Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] +  " ");
        }
        sc.close();
    }
}
