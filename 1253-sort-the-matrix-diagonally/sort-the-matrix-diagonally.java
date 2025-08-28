class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            List<Integer>l=new ArrayList<>();
            int r=i;
            int c=0;
            while(r<m&&c<n){
                l.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(l);
            r=i;
            c=0;
            for(int list:l){
                mat[r][c]=list;
                r++;
                c++;
            }
        }
         for(int i=1;i<n;i++){
            List<Integer>l=new ArrayList<>();
            int r=0;
            int c=i;
            while(r<m&&c<n){
                l.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(l);
            r=0;
            c=i;
            for(int list:l){
                mat[r][c]=list;
                r++;
                c++;
            }
        }
        return mat;
    }
}