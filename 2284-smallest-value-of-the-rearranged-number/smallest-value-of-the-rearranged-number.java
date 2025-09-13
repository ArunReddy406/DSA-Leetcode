class Solution {
    public long smallestNumber(long num) {
        boolean negative=num<0;
        num=Math.abs(num);
        long ans=0;
       ArrayList<Integer>list=new ArrayList<>();
       while(num!=0){
        long rem=num%10;
        list.add((int)rem);
        num/=10;
       }
       if(list.size()==0){
        return 0;
       }
       Collections.sort(list);
        String s="";
       if(negative){
        for(int i=list.size()-1;i>=0;i--){
            ans=ans*10+list.get(i);
        }
        return -ans;
       }
       int min=Integer.MAX_VALUE;
       for(int i=0;i<list.size();i++){
        if(list.get(i)!=0){
            min=Math.min(list.get(i),min);
        }
       }
       list.remove(Integer.valueOf(min));
       ans=min;
       for(int i=0;i<list.size();i++){
        ans=ans*10+list.get(i);
       }
       return ans;
    }
}