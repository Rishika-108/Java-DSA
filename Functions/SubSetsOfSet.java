package Functions;

import java.util.ArrayList;

public class SubSetsOfSet {
    public static void printSubset (ArrayList <Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) +  " ");
        }
        System.out.println();
    }
    public static void Subset (int n, ArrayList <Integer>subset) {
        if (n==0) {
            printSubset(subset);
            return;
        }

         // Will be added in list
         subset.add(n);
         Subset(n - 1, subset);

         //Will not be added in List
        subset.remove(subset.size()-1);
        Subset(n-1, subset);
    }
    public static void main(String[] args) {
        ArrayList <Integer> subset = new ArrayList<>();
        Subset(3, subset);
    }
}
