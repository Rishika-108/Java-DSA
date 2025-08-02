package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder( "Rishi");
        for (int i = 0; i  < sb.length()/2; i++) {
            int front = i;
            int last = sb.length() - i - 1;
            char fronChar = sb.charAt(front);
            char backChar = sb.charAt(last);

            sb.setCharAt(front, backChar);
            sb.setCharAt(last, fronChar);
        }
        System.out.println(sb);
    }
}
