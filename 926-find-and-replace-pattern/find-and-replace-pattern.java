class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String>list=new ArrayList<>();
        Set<Character>set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            set.add(ch);
        }
        
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            HashMap<Character,Character>map=new HashMap<>();
            HashSet<Character>setw=new HashSet<>();
            for(int j=0;j<words[i].length();j++){
                setw.add(words[i].charAt(j));
            }
            if(setw.size()!=set.size()){
                continue;
            }
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                 if(map.containsKey(ch)){
                        if(map.get(ch)!=pattern.charAt(j)){
                            flag=false;
                            break;
                        }
                    }
                    else{
                    map.put(ch,pattern.charAt(j));
                    }
            }
            if(flag){
                list.add(words[i]);
            }
        }
        return list;
    }
}