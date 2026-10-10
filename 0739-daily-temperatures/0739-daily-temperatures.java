class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Deque <Integer> st = new ArrayDeque<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i])
                st.pop(); // too small, useless
            if (!st.isEmpty()) {
                ans[i] = st.peek()-i; // top = next greater
            } else {
                ans[i] = 0;
            }
            st.push(i);
        }
        return ans;
    }
}