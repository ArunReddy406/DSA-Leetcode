class Solution {
    public String reverseByType(String s) {
        ArrayList<Character>c=new ArrayList<>();
        ArrayList<Character>sp=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                c.add(ch);
            }
            else{
                sp.add(ch);
            }
        }
        Collections.reverse(c);
        Collections.reverse(sp);
        StringBuilder sb=new StringBuilder();
        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(Character.isLowerCase(ch1)){
                sb.append(c.get(j));
                j++;
            }
            else{
                sb.append(sp.get(k));
                k++;
            }
        }
        return sb.toString();
    }
}