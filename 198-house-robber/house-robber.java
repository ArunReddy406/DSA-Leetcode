class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sum1=nums[0];
        int sum2=Math.max(nums[0],nums[1]); 
        for(int i=2;i<nums.length;i++){
            int x = Math.max(nums[i] + sum1, sum2);
            sum1 = sum2;
            sum2 = x;
        }
        int max=Math.max(sum1,sum2);
        return max;
    }
}