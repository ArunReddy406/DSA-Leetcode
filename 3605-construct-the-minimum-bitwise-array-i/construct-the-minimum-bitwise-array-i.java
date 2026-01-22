class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int num=nums.get(i);
            for(int j=0;j<=num;j++){
                if((j|j+1)==num){
                    ans[i]=j;
                    break;
                }
            }
            if(ans[i]==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
}