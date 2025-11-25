class Solution {
    public int minimumFlips(int n) {
        String s="";
        while(n>0){
            int rem=n%2;
            s+=rem;
            n/=2;
        }
        int count=0;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char start=s.charAt(i);
            char end=s.charAt(j);
            if(start!=end){
                count++;
            }
            i++;
            j--;
        }
        return count*2;
    }
}