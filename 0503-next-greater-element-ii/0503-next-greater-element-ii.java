class Solution {
    public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    Deque<Integer> st = new ArrayDeque<>();
    for (int i = 2 * n - 1; i >= 0; i--) {
        int cur = nums[i % n];
        while (!st.isEmpty() && st.peek() <= cur) {
            st.pop();
        }
        if (i < n) {
            if(st.isEmpty()) {
                res[i] = -1;
            }
            else {
                res[i] = st.peek();
            }
        }
        st.push(cur);
    }
    return res;
    }
}