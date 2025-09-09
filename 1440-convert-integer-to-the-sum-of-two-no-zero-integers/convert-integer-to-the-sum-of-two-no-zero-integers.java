class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int i=1;i<=n;i++){
            int j=n-i;
            if(isZero(i)&&isZero(j)){
                return new int[]{i,j};
            }
        }
       return new int[]{};
    }
    public boolean isZero(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}