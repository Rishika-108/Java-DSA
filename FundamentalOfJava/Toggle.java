package FundamentalOfJava;

public class Toggle {
    public static void main(String[] args) {
        // Write a program to toggle a bit a position = “pos” in a number “n”.
        int num = 5;// Binary - 0101
        int positionToToggle = 1;
        int mask = 1  << positionToToggle;// Changes 0001 to 0010
        int newNumber = num ^ mask; // 0101 XOR 0010 => 0111  (which means '1' from position 0 is toggled to position 1)
        System.out.println( "Number after toggling : " + newNumber); // 7

    }
}
