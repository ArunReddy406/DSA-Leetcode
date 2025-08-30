class Solution {
    public boolean rotateString(String s, String goal) {
        String str=s;
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            char ch=str.charAt(0);
            sb.append(str.substring(1,s.length()));
            sb.append(ch);
            str=sb.toString();
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}