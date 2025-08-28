class Solution {
    public int[] evenOddBit(int n) {
        int arr[]=new int[2];
        int even=0;
        int odd=0;
        String s="";
        int sum=0;
        while(n!=0){
            int rem=n%2;
            s+=rem;
            n/=2;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'&&i%2==0){
                even++;
            }
            else if(ch=='1'&&i%2!=0){
                odd++;
            }
          
        }
         arr[0]=even;
           arr[1]=odd;
        return arr;
    }
}