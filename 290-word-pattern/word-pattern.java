class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []str=s.split(" ");
         if(pattern.length()!=str.length){
            return false;
        }
        HashSet<Character>set1=new HashSet<>();
        HashSet<String>set2=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            set1.add(ch);
        }
        for(int i=0;i<str.length;i++){
            set2.add(str[i]);
        }
        if(set1.size()!=set2.size()){
            return false;
        }
        HashMap<Character,String>map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
                if(map.containsKey(ch)){
                    if(!map.get(ch).equals(str[i])){
                        return false;
                    }
                }
                else{
                    map.put(ch,str[i]);
                }
        }
        return true;
    }
}