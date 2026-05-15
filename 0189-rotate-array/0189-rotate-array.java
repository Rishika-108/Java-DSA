class Solution {
    private void reverse(int nums[], int fs, int ls){
        while(fs < ls){
            int temp = nums[ls];
            nums[ls] = nums[fs];
            nums[fs] = temp;
            fs++;
            ls--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        
    }
}