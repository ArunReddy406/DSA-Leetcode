class Solution {
    public int lengthOfLastWord(String s) {
        String []str=s.split(" ");
        int n=str.length;
        int count=0;
        for(int i=str[n-1].length()-1;i>=0;i--){
            count++;
        }
        return count;
    }
}