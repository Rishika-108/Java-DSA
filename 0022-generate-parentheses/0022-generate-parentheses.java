class Solution {
    private void isValidString(int n, List<String> result, String s, int open, int close){
       if(n == 0) {
        result.add(s);
        return;
       }
       if(open == n && close == n){
        result.add(s);
        return;
       }
       if(open < n){
         isValidString(n, result, s + '(', open + 1, close);
       }
       if(close < open){
       isValidString(n, result, s + ')', open, close + 1);
       }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        isValidString(n, result, "", 0, 0);
        return result;
    }
}