package Functions;

public class Permutations {
    public static void permutations (String str, String per) {
        //str =  "abc"
        if (str.length() == 0) {
            System.out.println(per);
            return;
        }
         for (int i = 0;  i < str.length(); i++) {
            
            char current = str.charAt(i);
            String newStr = str.substring(0, i) +str.substring(i+1) ; 
            //Considering i = 1, i.e:  i = b, therefore (0, i) denotes only "a" is included +  (i+1) denotes 2, 
            //which means  "c" included.
            permutations(newStr, per + current);
         }

    }
    public static void main(String[] args) {
        permutations( "abc",  "");
    }
}
