class Solution {
    public int clumsy(int n) {
        Deque <Integer> st = new ArrayDeque<>();
        int k = 0;
        st.push(n);
        for(int i = n -1;i>=1;i--) {
            int num = i;
            int op = k%4;
            if(op == 0) {
                st.push(st.pop() * num);
            } else if(op == 1) {
                st.push(st.pop() / num);
            } else if(op == 2) {
                st.push(num);
            } else if (op == 3) {
                st.push(-num);
            }
            k++;
        }
        int ans = 0;
        while(!st.isEmpty()) {
            ans+=st.pop();
        }
        return ans;
    }
}