class Solution {
    public int countLargestGroup(int n) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=digitSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max=-1;
        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==max){
                count++;
            }
        }
        return count;
    }
    public int digitSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}