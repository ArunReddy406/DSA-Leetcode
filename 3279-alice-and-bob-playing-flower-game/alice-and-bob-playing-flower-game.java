class Solution {
    public long flowerGame(int n, int m) {
      long even_x=n/2;
      long even_y=(n+1)/2;
      long odd_x=m/2;
      long odd_y=(m+1)/2;
      long ans=(odd_x*even_y)+(even_x*odd_y);
       return ans;
    }
}