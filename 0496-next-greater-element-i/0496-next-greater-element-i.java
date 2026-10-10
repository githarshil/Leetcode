class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = next(nums2);

        int[] lookup = new int[10001]; 
        for (int j = 0; j < nums2.length; j++) {
            lookup[nums2[j]] = ans[j];
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = lookup[nums1[i]];
        }
        return result;

    }

    public int[] next(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = -1;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res;
    }
}