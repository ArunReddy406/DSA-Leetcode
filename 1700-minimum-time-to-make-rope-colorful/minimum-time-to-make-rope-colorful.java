class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        StringBuilder sb=new StringBuilder(colors);
        ArrayList<Integer>list=new ArrayList<>();
        // for(int num:neededTime){
        //     list.add(num);
        // }
        for(int i=0;i<sb.length()-1;i++){
            char ch=sb.charAt(i);
            char next=sb.charAt(i+1);
            if(ch==next){
                sum+=Math.min(neededTime[i],neededTime[i+1]);
                neededTime[i+1]=Math.max(neededTime[i],neededTime[i+1]);
            //    if(list.get(i)<list.get(i+1)){
            //     sum+=list.get(i);
            //     list.remove(i);
            //     sb.deleteCharAt(i);
            //    }
            //    else{
            //     sum+=list.get(i+1);
            //     list.remove(i+1);
            //     sb.deleteCharAt(i+1);
            //    }
            //    i--;
            }
        }
        return sum;
    }
}