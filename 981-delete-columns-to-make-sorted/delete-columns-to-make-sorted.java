class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int row=strs.length;
        int col=strs[0].length();
        int f=0;
        for(int i=0;i<col;i++){
            for(int j=0;j<row-1;j++){
                char ch=strs[j].charAt(i);
                char ch1=strs[j+1].charAt(i);
                if(Character.compare(ch,ch1)>0){
                    f=1;
                    break;
                }
                // if(f==1){
                //     count++;
                //     f=0;
                // }
            }
            if(f==1){
                    count++;
                    f=0;
                }
        }
        return count;
    }
}