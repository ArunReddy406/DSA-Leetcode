class Solution {
    public int countSubstrings(String s) {
        int  count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                int m=0;
                int n=str.length()-1;
                boolean flag=true;
                while(m<n){
                    char start=str.charAt(m);
                    char end=str.charAt(n);
                    if(start!=end){
                        flag=false;
                        break;
                    }
                    m++;
                    n--;
                }
                if(flag){
                count++;
                }
            }
        }
        return count;
    }
}