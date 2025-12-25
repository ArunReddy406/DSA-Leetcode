class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum=0;
        int p=0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1;i>=0 && k>0;i--){
            if(happiness[i]-p<=0){
                break;
            }
            sum+=happiness[i]-p;
            k--;
            p++;
        }
        return sum;
    }
}