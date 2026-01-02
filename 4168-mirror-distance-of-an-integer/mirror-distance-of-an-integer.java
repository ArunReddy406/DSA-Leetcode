class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int x=n;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        int ans=Math.abs(x-rev);
        return ans;
    }
}