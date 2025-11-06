class Solution {
    public int longestSubsequence(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int xor=0;
        boolean zero=true;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            if(nums[i]!=0){
                zero=false;
            }
            
        }
        if(zero){
                return 0;
            }
        if(xor!=0){
            return nums.length;
        }
        return nums.length-1;
    }
}