class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // StringBuilder str=new StringBuilder(magazine);
        // for(int i=0;i<ransomNote.length();i++){
        //     char c=ransomNote.charAt(i);
        //     int index=str.indexOf(String.valueOf(c));
        //     if(index==-1){
        //         return false;
        //     }
        //     str.deleteCharAt(index);
        // }
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
       for(int i=0;i<ransomNote.length();i++){
        char ch=ransomNote.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
       }
       for(int i=0;i<magazine.length();i++){
        char ch=magazine.charAt(i);
        map2.put(ch,map2.getOrDefault(ch,0)+1);
       }
       for(char key:map1.keySet()){
        if(!map2.containsKey(key)){
            return false;
        }
        if(!(map2.get(key)>=map1.get(key))){
            return false;
        }
       }
       return true;
    }
}