class Solution {
    public int countVowelSubstrings(String word) {
       int count=0;
        for(int i=0;i<word.length();i++){
            Set<Character>set=new HashSet<>();
            for(int j=i;j<word.length();j++){
                char c=word.charAt(j);
                 if(isVowel(c)){
                set.add(c);
                 if(set.size()==5){
                 count++;
              }
            }
            else{
                break;
            }
          }
        }
       return count;
    }
    public boolean isVowel(char ch){
    return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}