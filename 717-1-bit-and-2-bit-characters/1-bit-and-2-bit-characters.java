class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<bits.length;i++){
            if(bits[i]==0){
                list.add(1);
            }
            else{
                list.add(2);
                i++;
            }
        }
        return list.get(list.size()-1)==1;
    }
}