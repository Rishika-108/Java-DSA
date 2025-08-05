package Functions;

public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];

    public static void Duplicate (String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char current = str.charAt(index);
        if (map[current - 'a'] == true) {
            Duplicate(str, index + 1, newString);
        } else {
            newString += current;
            map[current - 'a'] = true;
            Duplicate(str, index + 1, newString);
        }
    }
    public static void main(String[] args) {
        Duplicate( "abbccda", 0,  "");
    }
}
