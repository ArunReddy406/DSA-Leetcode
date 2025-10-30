class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum=0;
        for(int i=0;i<k;i++){
            Arrays.sort(gifts);
            int end=gifts.length-1;
            gifts[end]=(int)Math.floor(Math.sqrt(gifts[end]));
        }
        for(int i=0;i<gifts.length;i++){
            sum+=gifts[i];
        }
        return sum;
    }
}