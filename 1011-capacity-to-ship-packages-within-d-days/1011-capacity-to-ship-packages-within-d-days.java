class Solution {
    private boolean isCapacity(int[] weights, int days, int mid){
      int capacity = mid, daysShipped = 1;
      for(int i = 0; i < weights.length; i++){
        if(weights[i] <= capacity){
            capacity -= weights[i];
        } else {
            capacity = mid-weights[i];
            daysShipped++;
        }
      }
      return daysShipped <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(isCapacity(weights, days, mid)){
               ans = mid;
               high = mid-1;
            } else {
               low = mid + 1;
            }
        }
        return ans;
    }
}