class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=0;
        int se=0;
        int i=2;
        int j=1;
        while(n--!=0){
                se+=i;
                i+=2;
                so+=j;
                j+=2;

        }
        //  System.out.println(so,se);
         return gcd(so,se);
    }
    public int gcd(int a,int b){
        // while(b!=0){
        //     int temp=b;
        //     b=a%b;
        //     a=temp;
        // }
        // return a;
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}