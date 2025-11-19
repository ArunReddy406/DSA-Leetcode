class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer>set=new HashSet<>();
        // ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
}