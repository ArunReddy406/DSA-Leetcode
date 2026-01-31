class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        if(k<=1){
            return 0;
        }
        int j=0;
        Arrays.sort(nums);
        for(int i=k-1;i<nums.length;i++){
            int sum=nums[i]-nums[j];
            min=Math.min(min,sum);
            j++;
        }
        return min;
    }
}