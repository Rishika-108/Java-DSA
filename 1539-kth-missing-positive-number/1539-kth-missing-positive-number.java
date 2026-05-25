class Solution {
    public int findKthPositive(int[] arr, int k) {
      int n = arr.length;
      int low = 0;
      int high = n-1;
      while(low <= high){
        int mid = low + (high - low)/2;
        int totalMissing = arr[mid] - mid - 1;
        if(totalMissing < k){
            low = mid + 1;
        } else if(totalMissing >= k){
            high = mid - 1;
        }
      }
       return low + k;
    }
}