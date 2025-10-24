class Solution {
    public int missingMultiple(int[] nums, int k) {
       Arrays.sort(nums);
       HashSet<Integer>set=new HashSet<>();
       int max=nums[nums.length-1];
       int ans=1;
       for(int num:nums){
        set.add(num);
       }
       for(int i=1;i<=max+k;i++){
        if(!set.contains(k*i)){
            ans=k*i;
            break;
        }
       } 
       return ans;
    }
}