package FundamentalOfJava;

public class CountNumberOf1 {
    public static void main(String[] args) {
        // Method 1 : In-built Functionality
        int n = 13;
        int count = Integer.bitCount(n);
        System.out.println( "No of '1' is : " + count);

        //Method 2  : Right Shift and AND
        int count2 = 0;
        while (n  > 0) {
            count2 += (n & 1); // Adds 1
            n  >>= 1;// Right Shift to check the next bit
        }
        System.out.println(count2);

        //Method - 3 : Brian Algorithm
        int count3 = 0;
        while (n  > 0) {
            n &= (n-1);
            count3 ++;
        }
        System.out.println(count3);
    }
}
