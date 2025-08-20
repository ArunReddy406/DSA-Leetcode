class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int mat[][]=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    if(i==0||j==0){
                        mat[i][j]=1;
                    }
                    else{
                        mat[i][j]=1+Math.min(mat[i][j-1] , Math.min(mat[i-1][j] , mat[i-1][j-1]));
                    }
                    count=count+mat[i][j];
                }
            }
        }
        return count;
    }
}