class Solution {
    private void isValidCombo(int[] candidates, int target, 
    List<List<Integer>> result, List<Integer> path, int i){
        if(target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if(target < 0) return;
        if(i >= candidates.length) return;   

        path.add(candidates[i]);
        isValidCombo(candidates, target - candidates[i], result, path, i);
        path.remove(path.size() - 1);
        isValidCombo(candidates, target, result, path, i+1);  
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        isValidCombo(candidates, target, result,path,0);
        return result;
    }
}