class Solution {
    public void wiggleSort(int[] nums) {
        int idx=0;
        int n=nums.length;
        if(n%2==0){
            idx=n/2;
        }
        else{
            idx=n/2+1;
        }
        Arrays.sort(nums);
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<idx;i++){
            list1.add(nums[i]);
        }
        for(int i=idx;i<n;i++){
            list2.add(nums[i]);
        }
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int x=list1.size()-1;
        int y=list2.size()-1;
        while(x>=0||y>=0){
            if(x>=0){
            nums[i]=(list1.get(x));
            x--;
            i++;
            }
            if(y>=0){
            nums[i]=(list2.get(y));
            y--;
            i++;
            }
        }
    }
}