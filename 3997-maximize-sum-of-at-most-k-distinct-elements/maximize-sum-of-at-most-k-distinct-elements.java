class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int num[]=new int[set.size()];
        int idx=0;
        for(int arr:set){
            num[idx++]=arr;
        }
        int len=Math.min(k,num.length);
        int ans[]=new int[len];
        Arrays.sort(num);
        int j=0;
        for(int i=num.length-1;i>=num.length-len;i--){
            ans[j++]=num[i];
        }
        return ans;
    }
}