class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count =0;
        String[]word=text.split(" ");
        for(int i=0;i<word.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(word[i].contains(String.valueOf(brokenLetters.charAt(j)))){
                    count ++;
                    break;
                }
            }
        }
        return word.length-count;
    }
}