class Solution {
    public String getEncryptedString(String s, int k) {
        String str="";
        int n=s.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            str+=s.charAt((i+k)%n);
        }
        return str;
    }
}