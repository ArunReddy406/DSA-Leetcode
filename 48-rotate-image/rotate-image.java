class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int a=0;
        int mat[][]=new int[n][n];
        for(int j=0;j<n;j++){
            int b=0;
            for(int i=n-1;i>=0;i--){
                mat[a][b]=matrix[i][j];
                b++;
            }
            a++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=mat[i][j];
            }
        }
    }
}