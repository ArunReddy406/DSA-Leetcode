class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            int pre=0;
            for(int j=0;j<=i;j++){
                pre+=nums[j];
            }
            if((sum-pre*2)%2==0){
                count++;
            }
        }
        return count;
    }
}