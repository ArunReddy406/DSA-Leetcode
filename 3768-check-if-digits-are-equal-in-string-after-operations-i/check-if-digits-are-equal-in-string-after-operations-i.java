class Solution {
    public boolean hasSameDigits(String s) {
        char arr[];
        while(s.length()>2){
            arr=s.toCharArray();
            String str="";
            for(int i=0;i<s.length()-1;i++){
                int x=arr[i]-'0';
                int y=arr[i+1]-'0';
                int sum=(x+y)%10;
                str=str+Integer.valueOf(sum);
            }
            s=str;
        }
        return s.charAt(0)==s.charAt(1);
    }
}