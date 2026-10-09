class Solution {
    public String makeGood(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
            if (!st.isEmpty() && Character.toLowerCase(c) == Character.toLowerCase(st.peek()) && c != st.peek()) {
                st.pop();
            }
            else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}