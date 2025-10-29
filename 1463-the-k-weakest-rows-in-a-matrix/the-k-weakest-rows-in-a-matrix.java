class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            ArrayList<Integer>l=new ArrayList<>();
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            l.add(count);
            l.add(i);
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(0)!=b.get(0)){
                return Integer.compare(a.get(0),b.get(0));
            }
            return Integer.compare(a.get(1),b.get(1));
        });
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i).get(1);
        }
        // int j=0;
        // for(ArrayList<Integer>l1:list){
        //     arr[j++]=l1.get(1);
        //     if(j==k){
        //         break;
        //     }
        // }
        return arr;
    }
}