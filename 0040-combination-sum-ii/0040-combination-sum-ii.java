class Solution {
    private void isValidCombo(int[] candidates, int target,List<List<Integer>> result, List<Integer> path, int index){
        if(target == 0){
        result.add(new ArrayList<>(path));
        return;
       }
       if(target < 0) return;
       if(index >= candidates.length) return;
     
       for(int i = index; i < candidates.length; i++){
         if(i > index && candidates[i] == candidates[i-1]){
            continue;
         }
       path.add(candidates[i]);
       isValidCombo(candidates, target - candidates[i], result, path, i+1);
       path.remove(path.size() - 1);
       }
       
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        isValidCombo(candidates, target, result, path, 0);
        return result;
    }
}