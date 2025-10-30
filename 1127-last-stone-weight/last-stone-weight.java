class Solution {
    public int lastStoneWeight(int[] stones) {
        // Arrays.sort(stones);
        // int n=stones.length;
        // while(n>1){
        //     int x=stones[n-2];
        //     int y=stones[n-1];
        //     n=n-2;
        //     if(x!=y){
        //         int weight=y-x;
        //         stones[n++]=weight;
        //         Arrays.sort(stones,0,n);
        //     }
        // }
        // return n==0 ? 0:stones[0];
        PriorityQueue<Integer>pr=new PriorityQueue<>(Collections.reverseOrder());
        for(int st:stones){
            pr.add(st);
        }
        while(pr.size()>1){
            int y=pr.poll();
            int x=pr.poll();
            if(x!=y){
                pr.add(y-x);
            }
        }
        if(pr.size()==0){
            return 0;
        }
        return pr.peek();
    }
}