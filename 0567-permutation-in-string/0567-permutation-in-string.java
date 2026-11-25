class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.isEmpty() || s1.length() > s2.length()) return false;
        int left = 0, right = 0, count = 0;
        int k = s1.length();
        HashMap<Character, Integer> charmap = new HashMap<>();
        HashMap<Character, Integer>  windowFreq = new HashMap<>();

        for(char c: s1.toCharArray()){
            charmap.put(c, charmap.getOrDefault(c, 0)+ 1);
        }

        char s2Arr[] = s2.toCharArray();

        while(right < s2.length()){
            windowFreq.put(s2Arr[right], windowFreq.getOrDefault(s2Arr[right], 0) + 1);
            count++;
            right++;

            if (count > k){
              int freq = windowFreq.get(s2Arr[left]);
              if(freq == 1){
                windowFreq.remove(s2Arr[left]);
              } else {
                windowFreq.put(s2Arr[left], windowFreq.get(s2Arr[left]) - 1);
              }
              left++;
              count--;
            }
            
            if(count == k){
            if(windowFreq.equals(charmap)){
                return true;
            }}
        }
        return false;
    }
}