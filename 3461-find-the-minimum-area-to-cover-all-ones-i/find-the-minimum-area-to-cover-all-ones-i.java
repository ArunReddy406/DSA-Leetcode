class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fr=m;
        int lr=-1;
        int fc=n;
        int lc=-1;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    fr=Math.min(fr,i);
                    lr=Math.max(lr,i);
                    fc=Math.min(fc,j);
                    lc=Math.max(lc,j);
                    count++;
                }

            }
        }
        if(count==0){
            return 0;
        }
        int ans=(lr-fr+1)*(lc-fc+1);
        return ans;
    }
}