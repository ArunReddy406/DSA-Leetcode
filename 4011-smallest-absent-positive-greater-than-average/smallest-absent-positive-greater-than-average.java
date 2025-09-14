class Solution {
    public int smallestAbsent(int[] nums) {
        int n=nums.length;
        double sum=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            sum+=nums[i];
        }
        sum=sum/n;
        for(int i=1;;i++){
            if(i>sum&&!set.contains(i)){
                return i;
            }
        }
    }
}