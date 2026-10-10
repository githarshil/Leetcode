class Solution {
    public int[] asteroidCollision(int[] arr) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            while (!st.isEmpty() && st.peek() > 0 && a < 0 && st.peek() < -a) {
                st.pop();
            }
            if (!st.isEmpty() && a<0 && st.peek()>0) {
                if (st.peek() == -a) {
                    st.pop();
                }
            } else {
                st.push(a);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}