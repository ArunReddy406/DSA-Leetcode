class Solution {
    public int vowelConsonantScore(String s) {
        s=s.toLowerCase();
        int c=0;
        int v=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else if(ch>='0'&&ch<='9'){
                continue;
            }
            else{
                c++;
            }
        }
        if(c>0&&v>0){
            return v/c;
        }
        return 0;
    }
}