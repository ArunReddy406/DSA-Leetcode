class Solution {
    public int[] sortByBits(int[] arr) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer>l=new ArrayList<>();
            int count=Integer.bitCount(arr[i]);
            l.add(arr[i]);
            l.add(count);
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(1)!=b.get(1)){
                return Integer.compare(a.get(1),b.get(1));
            }
            return Integer.compare(a.get(0),b.get(0));
        });
        int bits[]=new int[arr.length];
        for(int i=0;i<list.size();i++){
            bits[i]=list.get(i).get(0);
        }
        return bits;
    }
}