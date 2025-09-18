class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char prev=s.charAt(i);
            char pre=s.charAt(i-1);
            if(prev==pre){
                count++;
            }
            else{
                count=1;
            }
            if(count<3){
                sb.append(prev);
            }
        }
        return sb.toString();
    }
}