class Solution {
    private void isValidCombo(int k, int n, List<List<Integer>> result,
    List<Integer> path, int index){
       if(n < 0) return;
       if(n == 0 && path.size() == k){
        result.add(new ArrayList<>(path));
        return;
       }

       for(int i = 1; i <= 9; i++){
         if(i > index && path.size() <= k){
           path.add(i);
           isValidCombo(k, n-i, result, path, i);
           k--;
           path.remove(path.size()-1); 
           k++;
         } 
       }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        isValidCombo(k, n, result, path, 0);
        return result;
    }
}