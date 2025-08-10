package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteSpecificNumber {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList <Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter 5 numbers in range 1 - 50 : ");
        for (int i = 0; i < 5; i++) {
            int elem = sc.nextInt();
            list.add(elem);
        }
        for (int i = list.size() - 1; i  >= 0; i--) { // Used reverse loop to avoid index shifting and
            // skipping of numbers at now shifted index
            if (list.get(i) > 25) {
                list.remove(i);
            }
        }
        System.out.println(list);
        sc.close();
    }
}
