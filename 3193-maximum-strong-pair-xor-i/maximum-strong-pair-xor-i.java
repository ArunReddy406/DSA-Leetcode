class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int x=nums[i];
                int y=nums[j];
                int ans=Math.abs(x-y);
                int min=Math.min(x,y);
                if(ans<=min){
                    xor=Math.max(xor,x^y);
                }
            }
        }
        return xor;
    }
}