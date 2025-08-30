class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            char ch=s.charAt(0);
            sb.append(s.substring(1,s.length()));
            sb.append(ch);
            s=sb.toString();
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}