class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        int k = p.length();
        int left = 0, right = 0, count = 0;
        HashMap<Character, Integer> pmap = new HashMap<>();
        HashMap<Character, Integer> windowFreq = new HashMap<>();

        if(p.isEmpty() || p.length() > s.length()) return indices;

        for(char c: p.toCharArray()){
            pmap.put(c, pmap.getOrDefault(c, 0 ) + 1);
        }

        char[] sArr = s.toCharArray();

        while(right < sArr.length){
            windowFreq.put(sArr[right], windowFreq.getOrDefault(sArr[right], 0) + 1);
            count++;
            right++;
           
           if(count > k){
            int freq = windowFreq.get(sArr[left]);
            if(freq == 1) windowFreq.remove(sArr[left]);
            else windowFreq.put(sArr[left], freq - 1);

            left++;
            count--;
           }

           if(count == k){
             if(windowFreq.equals(pmap)){
                indices.add(left);
             }
           }
        }

        return indices;
    }
}