class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=0;
        int sum=0;
        if(n%2==0){
            mid=n/2;
        }
        else{
            mid=(n+1)/2;
        }
        for(int i=0;i<n;i++){
            sum+=Math.abs(nums[i]-nums[mid-1]);
        }
        return sum;
    }
}