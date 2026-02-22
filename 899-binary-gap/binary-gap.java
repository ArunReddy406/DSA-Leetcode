class Solution {
    public int binaryGap(int n) {
        String s="";
        while(n!=0){
            int rem=n%2;
            s=rem+s;
            n/=2;
        }
        int count=0;
        int maxi=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                list.add(i);
            }
        }
        if(list.size()<=1){
            return 0;
        }
        for(int i=0;i<list.size()-1;i++){
            maxi=Math.max(maxi,list.get(i+1)-list.get(i));
        }
        return maxi;
    }
}