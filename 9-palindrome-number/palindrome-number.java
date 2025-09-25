class Solution {
    public boolean isPalindrome(int x) {
       if(x<0||(x%10==0&&x!=0)){
        return false;
       } 
       int x1=x;
       int ans=0;
       while(x1>0){
        int rem=x1%10;
        ans=ans*10+rem;
        x1/=10;
       }
       return x==ans;
    }
}