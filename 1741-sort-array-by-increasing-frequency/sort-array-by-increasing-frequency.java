class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<List<Integer>>list=new ArrayList<>();
        for(int key:map.keySet()){
            ArrayList<Integer>l=new ArrayList<>();
            l.add(key);
            l.add(map.get(key));
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(1)!=b.get(1)){
                return Integer.compare(a.get(1),b.get(1));
            }
            return Integer.compare(b.get(0),a.get(0));
        });
        int j=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<list.size();i++){
            int a=list.get(i).get(0);
            int b=list.get(i).get(1);
            while(b--!=0){
                arr[j++]=a;                
            }
        }
        return arr;
    }
}