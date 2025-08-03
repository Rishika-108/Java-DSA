package SortingAlgorithms;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println( "Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //Insertion Array
        for (int i = 1; i < size; i++) {
             int current = arr[i];
             int j = i-1;
             while (j >= 0 &&  (current < arr[j])) {
                 arr[j+1] = arr[j];
                 j--;
             }
             //placement
             arr[j+1] = current;
        }

        System.out.println ( "Sorted Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] +  " ");
        }
        sc.close();
    }
}
