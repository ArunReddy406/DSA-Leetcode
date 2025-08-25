class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>>set=new HashSet<>();
        int n=nums.length;
        int subset=1<<n;
        for(int num=0;num<subset;num++){
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((num&1<<i)!=0){
                    if(l.size()==0||l.get(l.size()-1)<=nums[i]){
                        l.add(nums[i]);
                    }
                }
            }
            if(l.size()>=2){
                set.add(l);
            }
        }
        return new ArrayList<>(set);
    }
}