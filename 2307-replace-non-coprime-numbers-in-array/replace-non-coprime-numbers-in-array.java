class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer>st=new Stack<>();
        for(int num:nums){
            int l=num;
            while(!st.isEmpty()){
                int y=st.peek();
                int g=gcd(l,y);
                if(g!=1){
                    l=lcm(l,y);
                    st.pop();
                    //st.push(l);
                }
                else{
                    break;
                }
            }
            st.push(l);
        }
        ArrayList<Integer>list=new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.peek());
            st.pop();
        }
        Collections.reverse(list);
        return list;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public  int lcm(int a, int b) {
        return (((a/ gcd(a, b)) * b) );
    }
}