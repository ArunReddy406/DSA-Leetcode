class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,Set<Integer>>map=new HashMap<>();
        for(int []log:logs){
            int id=log[0];
            int time=log[1];
            if(map.containsKey(id)){
                map.get(id).add(time);
            }
            else{
                map.put(id,new HashSet<>());
                map.get(id).add(time);
            }
        }
        int val[]=new int[k];
        for(Set<Integer>set:map.values()){
            int freq=set.size();
            if(freq<=k){
                val[freq-1]++;
            }
        }
        return val;
    }
}