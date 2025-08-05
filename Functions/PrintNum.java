package Functions;


public class PrintNum {
    public static void printNum (int n) {
        if (n == 6) // Base Condition
        return;
        System.out.println(n);//Print value
        printNum (n+1); //Recursive call
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
    
}