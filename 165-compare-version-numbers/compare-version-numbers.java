class Solution {
    public int compareVersion(String version1, String version2) {
        String []s1=version1.split("\\.");
        String []s2=version2.split("\\.");
        int max=Math.max(s1.length,s2.length);
        for(int i=0;i<max;i++){
            int a=0,b=0;
            if(i<s1.length){
                a=Integer.parseInt(s1[i]);
            }
            if(i<s2.length){
                b=Integer.parseInt(s2[i]);
            }
            if(a>b){
                return 1;
            }
            if(a<b){
                return -1;
            }
        }
        return 0;
    }
}