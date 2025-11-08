class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            long midSquare=(long)mid*mid;
            if(midSquare==x){
                return mid;
            }
            else if(midSquare<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}