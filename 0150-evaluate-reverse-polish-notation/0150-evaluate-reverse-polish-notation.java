class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> st = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                if (t.equals("+"))
                    st.push(a + b);
                else if (t.equals("-"))
                    st.push(a - b);
                else if (t.equals("*"))
                    st.push(a * b);
                else
                    st.push(a / b);
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        int num = 0;
        while(!st.isEmpty()) {
            num+=st.pop();
        }
        return num;
    }
}