class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int i=0;
        Set<Character>set=new HashSet<>();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            max=Math.max(max,set.size());
        }
        return max;
    }
}