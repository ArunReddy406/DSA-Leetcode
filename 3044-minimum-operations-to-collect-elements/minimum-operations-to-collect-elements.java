class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set1=new HashSet<>();
        int count=0;
        for(int i=1;i<=k;i++){
            set.add(i);
        }
        for(int i=nums.size()-1;i>=0;i--){
            count++;
            if(set.contains(nums.get(i))){
                set1.add(nums.get(i));
                if(set.size()==set1.size()){
                    break;
                }
            }
        }
        return count;
    }
}