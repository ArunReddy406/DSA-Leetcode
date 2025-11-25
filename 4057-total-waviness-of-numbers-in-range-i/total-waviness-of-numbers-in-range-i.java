class Solution {
    public int totalWaviness(int num1, int num2) {
       int count=0;
       for(int i=num1;i<=num2;i++){
        String s=String.valueOf(i);
        if(s.length()<3){
            continue;
        }
        for(int j=1;j<s.length()-1;j++){
            int first=s.charAt(j-1)-'0';
            int mid=s.charAt(j)-'0';
            int last=s.charAt(j+1)-'0';
             if((mid>first&&mid>last)||(mid<first&&mid<last)){
            count++;
            }
        }
       } 
       return count;
    }
}