class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        // for(String str:words){
        //     if(s.startsWith(str)){
        //         count ++;
        //     }
        // }
        for(int i=0;i<words.length;i++){
            if(words[i].length()<=s.length()){
                 boolean flag=true;
                for(int j=0;j<words[i].length();j++){
                    if(words[i].charAt(j)!=s.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                 if(flag){
                count++;
                }
            }
        }
        return count;
    }
}