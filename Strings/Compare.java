package Strings;

public class Compare {
    public static void main(String[] args) {
        String str1 =  "Rishi";
        String str2 =  "Rishi";
        if  (str1.equals(str2)) {
            System.out.println( "Same String");
        } else  {
            System.out.println( "Not Equal");
        }

        if (str1 == str2) {
            System.out.println( "Same");
        } else  {
            System.out.println( "Not Same");
        }

        //Gives Incorrect Answer
        if (new String( "Rishi") == new String( "Rishi") ) {
            System.out.println( "Same");
        } else  {
            System.out.println( "Not Same");
        }
    }
}
