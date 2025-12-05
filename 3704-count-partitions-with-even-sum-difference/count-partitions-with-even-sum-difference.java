class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum += nums[i];
            int pre=0;
            for(int j=i+1;j < nums.length;j++){
                pre+=nums[j];
            }
            if((sum-pre)%2==0){
                count++;
            }
        }
        return count;
    }
}