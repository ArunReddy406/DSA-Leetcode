class Solution {
    public long removeZeros(long n) {
        long num=0;
        while(n!=0){
            long rem=n%10;
            if(rem!=0){
                num=num*10+rem;
            }
            n/=10;
        }
        long res=0;
        while(num!=0){
            long rem=num%10;
            res=res*10+rem;
            num/=10;
        }
        return res;
    }
}