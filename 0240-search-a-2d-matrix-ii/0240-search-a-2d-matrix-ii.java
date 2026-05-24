class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
         return false;
         
        int i = 0, j = m - 1;
        while(i < n && j >= 0){
           if(target < matrix[i][j]){
                  j--; //  move left
                } else if ( target > matrix[i][j]){
                  i++;   // move down
                } else if (target == matrix[i][j]) {
                    return true;
                }
        } 
        return false;
    }
}