class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
       Arrays.sort(strs);
       String start=strs[0];
       String end=strs[strs.length-1];
       int i=0;
       while(i<start.length()&&i<end.length()&&start.charAt(i)==end.charAt(i)){
        i++;
       }
       return start.substring(0,i);
    }
}