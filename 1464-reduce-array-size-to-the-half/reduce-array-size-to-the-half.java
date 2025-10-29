class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int nums[]=new int[map.size()];
        int j=0;
        for(int key:map.keySet()){
            nums[j++]=map.get(key);
        }
        Arrays.sort(nums);
        int mid=0;
        int n=arr.length;
        if(n%2==0){
            mid=n/2;
        }
        else{
            mid=(n+1)/2;
        }
        int sum=n;
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            sum-=nums[i];
            count++;
            if(sum<=mid){
                break;
            }
        }
        return count;
    }
}