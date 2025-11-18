class Solution {
    public boolean isOneBitCharacter(int[] bits) {
       ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<bits.length;i++){
        if(bits[i]==0){
            list.add(bits[i]);
        }
        else{
            if(i==bits.length-1){
                list.add(bits[i]);
            }
            else{
                list.add(bits[i]*10+bits[i+1]);
                i++;
            }
        }
       }
       if(list.get(list.size()-1)!=0){
        return false;
       }
        return true;
    }
}