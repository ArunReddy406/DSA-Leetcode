class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String bit=Integer.toBinaryString(i);
            if(!s.contains(bit)){
                return false;
            }
        }
        return true;
    }
}