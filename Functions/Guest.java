package Functions;

public class Guest {
    public static int invite (int n) {
     if (n  <= 1) { // Only One Guest is left to be called, therefore only singleWay is available
        return 1;
     }
     //Call them as singles
     int singleWays = invite(n-1);

     //Call them as pairs
     int pairWays =  (n-1) * invite(n-2);

     return singleWays+pairWays;
    }
    public static void main(String[] args) {
        System.out.println(invite(4));
        
    }
}
