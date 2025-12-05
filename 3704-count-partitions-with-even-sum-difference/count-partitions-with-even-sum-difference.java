class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        //int[] pre = new int[n];
        int ans = 0;
        //pre[0] = nums[0];
        for(int i = 1;i < n;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        for(int i = 0;i < n - 1;i++){
            int l = nums[i];
            int r = nums[n-1] - nums[i];
            if(Math.abs(r - l) % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}