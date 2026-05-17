class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int elem1 = 0, elem2 = 0;
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int num: nums){
            if(count1 == 0 && num != elem2){
                elem1 = num;
                count1++;
            } else if(count2 == 0 && num != elem1) {
                elem2 = num;
                count2++;
            } else if (num == elem1){
                count1++;
            } else if (num == elem2){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1= 0; count2 = 0;
        for(int num: nums){
            if(num == elem1) count1++;
            else if(num == elem2) count2++;
        }
        if(count1 > n/3) result.add(elem1);
        if(count2 > n/3) result.add(elem2);
        return result;

    }
}