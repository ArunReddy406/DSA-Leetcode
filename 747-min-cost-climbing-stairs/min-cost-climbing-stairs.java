class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int arr[]=new int[n+1];
        // arr[0]=cost[0];
        // arr[1]=cost[1];
        for(int i=2;i<=n;i++){
            arr[i]=Math.min(cost[i-1]+arr[i-1],cost[i-2]+arr[i-2]);
        }
        return arr[n];
    }
}