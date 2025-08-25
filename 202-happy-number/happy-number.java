class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer>num=new HashSet<>();
       while(n!=1){
        if(num.contains(n)){
            return false;
        }
        num.add(n);
        n=SumOfDigitsOfNumber(n);
       } 
       return true;
    }
    public static int SumOfDigitsOfNumber(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}