class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String>list=new ArrayList<>();
        for(String word:words){
            list.add(word);
        }
        for(int i=1;i<list.size();i++){
            char []ch=list.get(i).toCharArray();
            Arrays.sort(ch);
            char []c=list.get(i-1).toCharArray();
            Arrays.sort(c);
            if(Arrays.equals(c,ch)){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}