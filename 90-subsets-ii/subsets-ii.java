class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>>list=new ArrayList<>();
        int n=nums.length;
        int subset=1<<n;
        Arrays.sort(nums);
        Set<ArrayList<Integer>>set=new HashSet<>();
        for(int num=0;num<subset;num++){
            ArrayList<Integer>subsets=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0){
                    subsets.add(nums[i]);
                }
            }
            set.add(subsets);
        }
        for(ArrayList<Integer>l:set){
            list.add(l);
        }
        return list;
    }
}