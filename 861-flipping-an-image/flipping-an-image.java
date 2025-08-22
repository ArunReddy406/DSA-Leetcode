class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int mat[][]=new int[n][n];
        for(int i=0;i<image.length;i++){
            int k=0;
            for(int j=image[i].length-1;j>=0;j--){
                int a=image[i][j];
                mat[i][k]=a^1;
                k++;
            }
        }
        return mat;
    }
}