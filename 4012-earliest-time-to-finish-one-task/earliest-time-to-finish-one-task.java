class Solution {
    public int earliestTime(int[][] tasks) {
        int m=tasks.length;
        int n=tasks[0].length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=tasks[i][j];
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}