class Solution {
    public int countOdds(int low, int high) {
        int sum=high-low+1;
        if(low%2==0&&high%2==0){
            return sum/2;
        }
        return sum/2+1*((sum%2==0)?0:1);
    }
}