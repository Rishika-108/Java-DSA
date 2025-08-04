public class Factorial2 {
    public static void fact (int i, int n, int fact) {

        if (i == n) { // Base Condition
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact *=i; 
        fact(i+1, n, fact);//Recursive call
    }
    public static void main(String[] args) {
        fact(1, 5, 1);
        
    }
}
