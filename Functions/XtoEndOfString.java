package Functions;

public class XtoEndOfString {
    public static void move (String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);

        if (currentChar == 'x') {
            count ++;
            move(str, index + 1, count, newString);
        } else  {
            newString += currentChar;
            move(str, index + 1, count, newString);
        }
    }
    public static void main(String[] args) {
        move( "axbcxxd", 0, 0, null);
    }
}
