class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int week=0;
        for(int i=0;i<=n;i++){
            if((i-1)%7==0&&i!=1){
                week++;
            }
            sum=sum+week+(i-7*week);
        }
        return sum;
    }
}