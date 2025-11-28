class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        String s=String.valueOf(n);
        // System.out.println(s);
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                str+=s.charAt(i);
            }
        }
        int num=n;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        int res=0;
        if(str.length()==0){
            return 0;
        }
        res=Integer.parseInt(str);
        return sum*res;
    }
}