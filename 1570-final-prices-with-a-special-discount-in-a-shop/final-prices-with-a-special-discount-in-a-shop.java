class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int dis=0;
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    dis=prices[j];
                    break;
                }
            }
            arr[i]=prices[i]-dis;
        }
        return arr;
    }
}