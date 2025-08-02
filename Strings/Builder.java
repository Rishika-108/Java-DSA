package Strings;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder( "Tony");//Declaring String Builder
        System.out.println(sb);

        System.out.println(sb.charAt(0));//Print character of specific index

        sb.setCharAt(0, 'p');// Changes character at specific Index
        System.out.println(sb);

        sb.insert(0, 'S'); // Inserts a charcater at specific index
        System.out.println(sb);

        sb.delete(0,1 ); //Deletes a substring in the index range
        System.out.println(sb);

        sb.append ('y'); //Appends at end of String
        System.out.println(sb);

        System.out.println(sb.length()); // Prints length of String
    }
}
