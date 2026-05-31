class Solution {
    private void isValidSubset(int[] nums, List<List<Integer>> result, List<Integer> path, int index){
        result.add(new ArrayList<>(path));
        if(index == nums.length) return;
        
        for(int i=index; i < nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            isValidSubset(nums, result, path, i+1);
            path.remove(path.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        isValidSubset(nums, result, path, 0);
        return result;
    }
}