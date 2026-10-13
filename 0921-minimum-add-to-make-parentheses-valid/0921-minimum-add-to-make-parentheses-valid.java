class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(int  i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) {
                    st.push(ch);
                }
                else if (ch == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if(ch == ')') {
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}