class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans=0;
        int i=0,j=0;
        Map<Character,Integer>mp = new HashMap<>();
        while(j<n){
            char ch = s.charAt(j);
            while(mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i))==0){
                    mp.remove(s.charAt(i));
                }
                i++;
            }
            ans = Math.max(ans,j-i+1);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            j++;
        }
        return ans;
    }
}