class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int elem1 = 0;
        for(int num: nums){
           if(count == 0){
            elem1 = num;
           }
           if(num == elem1) count++;
           else count--;
        }
        return elem1;
    }
}