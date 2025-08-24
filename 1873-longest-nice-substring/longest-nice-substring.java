class Solution {
    public String longestNiceSubstring(String s) {
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }

        }
        int max=0;
        String res="";
        for(String str:list){
            Set<Character>set=new HashSet<>();
            for(int i=0;i<str.length();i++){
                set.add(str.charAt(i));
            }
            boolean flag=true;
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                char c1=Character.toLowerCase(c);
                char c2=Character.toUpperCase(c);
                if(!set.contains(c1)||!set.contains(c2)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                if(max<str.length()){
                    max=str.length();
                    res=str;
                }
            }
        }
        return res;
    }
}