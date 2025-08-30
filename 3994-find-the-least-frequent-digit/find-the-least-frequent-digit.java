class Solution {
    public int getLeastFrequentDigit(int n) {
        String s=String.valueOf(n);
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<List<Integer>>list=new ArrayList<>();
        for(char key:map.keySet()){
            ArrayList<Integer>l=new ArrayList<>();
            l.add(Character.getNumericValue(key));
            l.add(map.get(key));
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(1)!=b.get(1)){
                return Integer.compare(a.get(1),b.get(1));
            }
            else{
                return Integer.compare(a.get(0),b.get(0));
            }
        });
        return list.get(0).get(0);
    }
}