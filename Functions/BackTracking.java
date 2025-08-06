package Functions;

public class BackTracking {
    public static void perm (String str, String per, int index) {
         if (str.length() == 0) {
            System.out.println(per);
            return;
         }
         for (int i =0; i < str.length(); i++) {
          char current = str.charAt(i);
          String newStr = str.substring(0, i) + str.substring(i+1);
          perm(newStr, per+current, index + 1);
         }
         
    }
    public static void main(String[] args) {
        perm( "abc",  "", 0);
    }
}
