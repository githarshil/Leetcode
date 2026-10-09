class Solution {
    public int minLength(String s) {
              Deque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!st.isEmpty() && (c == 'B' && st.peek() == 'A' || c == 'D' && st.peek() == 'C')) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.size();
    }
}