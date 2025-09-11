class Solution {
    public String sortVowels(String s) {
      HashSet<Character>set=new HashSet<>(Arrays.asList('a', 'e','i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
      ArrayList<Character>list=new ArrayList<>();
      for(char ch:s.toCharArray()){
        if(set.contains(ch)){
            list.add(ch);
        }
      }  
      Collections.sort(list);
      StringBuilder str=new StringBuilder();
      int vowelIndex=0;
      for(char ch:s.toCharArray()){
        if(set.contains(ch)){
            str.append(list.get(vowelIndex++));
        }
        else{
            str.append(ch);
        }
      }
      return str.toString();
    }
}