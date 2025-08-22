class Solution {
    public boolean hasAlternatingBits(int n) {
        // StringBuilder sb=new StringBuilder();
        String s="";
        while(n!=0){
            int rem=n%2;
            s=rem+s;
            n/=2;
        }
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1==ch2){
                return false;
            }
        }
        return true;
    }
}