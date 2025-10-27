class Solution {
    public long maxAlternatingSum(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        int n=arr.length;
        long sum=0;
        Arrays.sort(arr);
        for(int i=n/2;i<n;i++){
           sum+=arr[i];
        }
        for(int i=0;i<n/2;i++){
            sum-=arr[i];
        }
        return sum;
    }
}