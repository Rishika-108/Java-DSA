class Solution {
    private boolean isBloomed(int[] bloomDay, int m, int k, int mid){
        int consecutiveFlowers = 0, banquet = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                consecutiveFlowers++;
                if(consecutiveFlowers == k){
                    banquet++;
                    consecutiveFlowers = 0;
                } 
            } else {
                    consecutiveFlowers = 0;
            }
        }
        return  banquet >= m; 
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;
        if((long)m * k > bloomDay.length) return -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isBloomed(bloomDay, m, k, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}