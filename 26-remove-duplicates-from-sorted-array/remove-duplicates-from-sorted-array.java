class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
                    return 0;
        }
        // int k=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[k]=nums[i];
        //         k++;
        //     }
        // }
        // return k;
        Set<Integer>set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=0;
        for(int num:set){
            nums[i++]=num;
        }
        return set.size();
    }
}