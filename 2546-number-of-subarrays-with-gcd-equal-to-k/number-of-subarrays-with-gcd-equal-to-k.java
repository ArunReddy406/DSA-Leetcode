class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int g=0;
            for(int j=i;j<nums.length;j++){
                g=hcf(g,nums[j]);
                if(g==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static int hcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}