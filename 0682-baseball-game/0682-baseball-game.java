class Solution {
    public int calPoints(String[] operations) {
        Deque <Integer> st = new ArrayDeque<>();
        for (int i = 0; i < operations.length; i++) {
            String t = operations[i];
            if (t.equals("+") || t.equals("D") || t.equals("C")) {
                if (t.equals("+")){
                    int b = st.pop();
                    int a = st.peek();
                    int sum = a+b;
                    st.push(b);
                    st.push(sum);
                }
                else if (t.equals("D")){
                    int b = st.peek();
                    int sum = 2*b;
                    st.push(sum);
                }
                else if (t.equals("C")){
                    st.pop();
                }
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