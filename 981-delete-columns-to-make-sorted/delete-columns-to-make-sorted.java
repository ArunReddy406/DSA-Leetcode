class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int row=strs.length;
        int col=strs[0].length();
        int f=0;
        for(int j=0;j<col;j++){
            for(int i=0;i<row-1;i++){
                char ch=strs[i].charAt(j);
                char ch1=strs[i+1].charAt(j);
                if(Character.compare(ch,ch1)>0){
                    f=1;
                    break;
                }
            }
            if(f==1){
                count++;
                f=0;
            }
        }
        return count;
    }
}