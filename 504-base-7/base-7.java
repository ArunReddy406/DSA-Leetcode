class Solution {
    public String convertToBase7(int num) {
        String s="";
        if(num==0){
            return "0";
        }
        boolean negative=num<0;
        num=Math.abs(num);
        while(num>0){
           int rem=num%7;
            s=rem+s;
            num/=7;
        }
        if(negative){
            s="-"+s;
        }
        return s;
    }
}