class Solution {
    public int scoreOfParentheses(String s) {
        Deque <Integer> st = new ArrayDeque<>();
        st.push(0);
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                st.push(0);
            }
            else {
                int val = st.pop();
                int score = Math.max(2*val,1);
                st.push(score + st.pop());
            }
        }
        return st.pop();
    }
}