package Functions;
//Subsequence of abc - abc, bc,ac,ab,a,b,c
public class Subsequence {
    public static void subsequence (String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char current = str.charAt(index);
        //to be 
        subsequence(str, index + 1, newString+current);
        //not to be
        subsequence(str, index + 1, newString);
    }

    public static void main(String[] args) {
        subsequence( "abc", 0,  "");
    }
}
