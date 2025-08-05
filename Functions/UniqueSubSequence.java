package Functions;

import java.util.HashSet;

public class UniqueSubSequence {
   public static void subsequence (String str, int index, String newString, HashSet <String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
            System.out.println(newString);
            set.add (newString);
            return;
            }
        }
        char current = str.charAt(index);
        //to be 
        subsequence(str, index + 1, newString+current,set);
        //not to be
        subsequence(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();
        subsequence( "aaa", 0,  "", set);
    }
}
