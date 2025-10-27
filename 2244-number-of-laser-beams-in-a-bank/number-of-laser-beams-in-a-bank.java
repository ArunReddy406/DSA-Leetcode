class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<bank.length;i++){
             int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
                // arr[i]=count;
            }
            if(count!=0){
                list.add(count);
            }
        }
        System.out.println(list);
        int sum=0;
        for(int i=0;i<list.size()-1;i++){
            sum+=list.get(i)*list.get(i+1);
        }
        return sum;
    }
}