class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
            List<Integer>l=new ArrayList<>();
            int r=i;
            int c=0;
            while(r<n&&c<n){
                l.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(l,Collections.reverseOrder());
            r=i;
            c=0;
            for(int list:l){
                grid[r][c]=list;
                r++;
                c++;
            }
        }
         for(int i=1;i<n;i++){
            List<Integer>l=new ArrayList<>();
            int r=0;
            int c=i;
            while(r<n&&c<n){
                l.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(l);
            r=0;
            c=i;
            for(int list:l){
                grid[r][c]=list;
                r++;
                c++;
            }
        }
        return grid;
    }
}