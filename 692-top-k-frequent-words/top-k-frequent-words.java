class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        ArrayList<List<String>>list=new ArrayList<>();
        for(String key:map.keySet()){
            int val=map.get(key);
            ArrayList<String>l=new ArrayList<>();
            l.add(String.valueOf(val));
            l.add(key);
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            int x=Integer.parseInt(a.get(0));
            int y=Integer.parseInt(b.get(0));
            if(x!=y){
                return Integer.compare(y,x);
            }
            return a.get(1).compareTo(b.get(1));
        });
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(list.get(i).get(1));
        }
        return ans;
    }
}