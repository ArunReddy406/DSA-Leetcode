class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        Arrays.sort(nums);
        int first=nums[0];
        int last=nums[nums.length-1];
        for(int i=first;i<=last;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}