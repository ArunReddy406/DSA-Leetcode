class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int b=numBottles;
        int y=numExchange;
        int sum=0;
        while(b>=y){
            int rem=b/y;
            sum+=rem;
            b=rem+(b%y);
        }
        return numBottles+sum;
    }
}