class Solution {
    private Map<Character, char[]> map = Map.of(
        '2', new char[]{'a', 'b', 'c'},
        '3', new char[]{'d', 'e', 'f'},
        '4', new char[]{'g', 'h', 'i'},
        '5', new char[]{'j', 'k', 'l'},
        '6', new char[]{'m', 'n', 'o'},
        '7', new char[]{'p', 'q', 'r', 's'},
        '8', new char[]{'t', 'u', 'v'},
        '9', new char[]{'w', 'x', 'y', 'z'}
    );
    private void isValidCombo(String digits, List<String> result, String s, int index){
       if(digits.length() == index) {
        result.add(s);
        return;
       }
         char c = digits.charAt(index);
         char arr[] = map.get(c);
         for(int i = 0; i < arr.length; i++){
            isValidCombo(digits, result, s + arr[i], index+1);
         }     
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) return result;
        isValidCombo(digits, result, "", 0);
        return result;
    }
}