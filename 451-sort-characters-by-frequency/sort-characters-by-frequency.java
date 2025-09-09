class Solution {
    public String frequencySort(String s) {
       HashMap<String,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        String str=String.valueOf(c);
        map.put(str,map.getOrDefault(str,0)+1);
       } 
       ArrayList<List<String>>list=new ArrayList<>();
        for(String key:map.keySet()){
            ArrayList<String>l=new ArrayList<>();
            l.add(String.valueOf(map.get(key)));
            l.add(key);
            list.add(l);
        }   
        Collections.sort(list,(a,b)->{
            if(!a.get(0).equals(b.get(0))){
                return Integer.compare(map.get(b.get(1)),map.get(a.get(1)));
            }
            return a.get(1).compareTo(b.get(1));
        });
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            int n=Integer.parseInt(list.get(i).get(0));
            for(int j=0;j<n;j++){
                sb.append(list.get(i).get(1));
            }
        }
        return sb.toString();
    }
}