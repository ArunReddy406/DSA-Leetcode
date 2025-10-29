class Solution {
    public int countValidSelections(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                list.add(i);
            }
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<arr.length;j++){
                nums[j]=arr[j];
            }
            int idx=list.get(i)-1;
            boolean left=true;
            while(idx>=0&&idx<nums.length){
                if(nums[idx]==0){
                    if(left){
                        idx--;
                    }
                    else{
                        idx++;
                    }
                }
                else if(nums[idx]!=0){
                    nums[idx]=nums[idx]-1;
                    if(left){
                        left=false;
                    }
                    else{
                        left=true;
                    }
                    if(left){
                        idx--;
                    }
                    else{
                        idx++;
                    }
                }
            }
            boolean flag=true;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
            for(int j=0;j<arr.length;j++){
                nums[j]=arr[j];
            }
            boolean right=true;
            int y=list.get(i)+1;
            while(y>=0&&y<nums.length){
                if(nums[y]==0){
                    if(right){
                        y++;
                    }
                    else{
                        y--;
                    }
                }
                else if(nums[y]!=0){
                    nums[y]=nums[y]-1;
                    if(right){
                        right=false;
                    }
                    else{
                        right=true;
                    }
                    if(right){
                        y++;
                    }
                    else{
                        y--;
                    }
                }
                
            }
            boolean flag1=true;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=0){
                    flag1=false;
                    break;
                }
            }
            if(flag1){
                count++;
            }
        }
        return count;
    }
}