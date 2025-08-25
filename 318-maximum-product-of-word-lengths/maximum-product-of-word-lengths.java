class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int max=0;
        for(int i=0;i<n;i++){
            Set<Character>set=new HashSet<>();
            // boolean flag=true;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
               set.add(ch);
            }
            for(int k=i+1;k<n;k++){
                boolean flag=true;
                for(int c=0;c<words[k].length();c++){
                    if(set.contains(words[k].charAt(c))){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    max=Math.max(max,words[i].length()*words[k].length());
                }
            }
        }
        return max;
    }
}