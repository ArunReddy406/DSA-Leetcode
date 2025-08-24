class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        if(n<=0){
            return 0;
        }
        int sum=0;
        int subset=1<<n;
        for(int num=0;num<subset;num++){
            int xor=0;
            for(int i=0;i<n;i++){
                if((num&1<<i)!=0){
                    xor^=nums[i];
                }
            }
            sum+=xor;
        }
        return sum;
    }
}