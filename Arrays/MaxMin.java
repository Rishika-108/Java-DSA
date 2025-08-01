package Arrays;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nos[] = new int[4];
        System.out.println( "Enter 4 no : ");
        for (int i=0; i < 4; i++) {
           nos[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            if (nos[i]  > max)
              max = nos[i];

            if (nos[i] < min)
            min = nos[i];
        } System.out.println( "Maximum " + max +  " Minimum " + min);
        sc.close();
    }
}
