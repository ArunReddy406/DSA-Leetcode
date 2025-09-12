class Solution {
    public boolean doesAliceWin(String s) {
        int vowel=0;
        int con=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
        }
        if(vowel>0){
            return true;
        }
        return false;
    }
}