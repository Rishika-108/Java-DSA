class Solution {
    public boolean isPalindrome(String s) {
        String lowercase = s.toLowerCase();
        String oriString = lowercase.replaceAll("[^a-z0-9]","");

        String rev = "";
        int n = oriString.length();
        for(int i = n-1 ; i >= 0; i--){
           rev += oriString.charAt(i);
        }
        if(oriString.equals(rev)) return true;
        return false;
    }
}