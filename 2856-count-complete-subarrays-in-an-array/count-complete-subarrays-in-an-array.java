class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
         int count=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>dup=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(set.contains(nums[j])){
                    dup.add(nums[j]);
                    if(set.size()==dup.size()){
                        count++;
                    }
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}