class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea=0;
        int maxDia=0;
        for(int []rect:dimensions){
            int l=rect[0];
            int b=rect[1];
            int dia=l*l+b*b;
            int area=l*b;
            if(dia>maxDia||(dia==maxDia&&area>maxArea)){
                maxDia=dia;
                maxArea=l*b;
            }
        }
        return maxArea;
    }
}