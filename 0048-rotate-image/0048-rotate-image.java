class Solution {
    private void reverse(int[] row, int a, int b){
        while(a <= b){
        int temp = row[a];
        row[a] = row[b];
        row[b] = temp;
        a++;
        b--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        //Transpose of the matrix;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
          int currRow[] = matrix[i];
          reverse(currRow, 0 , n-1);
        }
    }
}