class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int len=Math.min(height[i],height[j]);
            int width=j-i;
            water=Math.max(water,len*width);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return water;
    }
}