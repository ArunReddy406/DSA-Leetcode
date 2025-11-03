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
                // sum+=Math.min(list.get(i),list.get(i+1));
                // list.remove(Integer.valueOf(Math.min(list.get(i),list.get(i+1))));
                // sb.deleteCharAt(i);
                // i--;
            }
        }
        return sum;
    }
}