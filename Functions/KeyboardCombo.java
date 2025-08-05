package Functions;

public class KeyboardCombo {
    public static String[] keypad = { ".", "abc", "def",  "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void keyboard(String str, int index, String comboString) {

        if (index == str.length()) {
            System.out.println(comboString);
            return;
        }

        char current = str.charAt(index);
        String mapping = keypad[current - '0'];
        for (int i = 0; i <mapping.length(); i++) {
            keyboard(str, index+1, comboString+mapping.charAt(i));
        }
        
        
    }
    public static void main(String[] args) {
        keyboard( "23", 0,  "");
        
    }
}
