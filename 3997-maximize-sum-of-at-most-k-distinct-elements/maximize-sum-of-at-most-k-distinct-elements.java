class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int num[]=new int[set.size()];
        int idx=0;
        for(int arr:set){
            num[idx++]=arr;
        }
        Arrays.sort(num);
        int len=Math.min(k,num.length);
        int ans[]=new int[len];
        for(int i=num.length-1;i>=num.length-len;i--){
            ans[j++]=num[i];
        }
        return ans;
    }
}