class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                 return i;
            }
        }
        return -1;
    }
}