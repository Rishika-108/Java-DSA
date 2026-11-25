class Solution {
    public int maxVowels(String s, int k) {
      HashSet<Character> vowel = new HashSet<>();
      vowel.add('a');
      vowel.add('e');
      vowel.add('i');
      vowel.add('o');
      vowel.add('u');

      int left = 0, right = 0, count = 0;
      int maxCount = 0;

      while(right < s.length()){
          if(vowel.contains(s.charAt(right))) count++;
          right++;

          if (right - left > k){
            if(vowel.contains(s.charAt(left))) count --;
            left++;
          }
        maxCount = Math.max(count, maxCount);
      }
      return maxCount;
    }
}