class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for (int x : nums1) {
            set.add(x);
        }
        for (int x : nums2) {
            if (set.contains(x)) {
                inter.add(x);
            }
        }
        int[] res = new int[inter.size()];
        int i = 0;
        for (int x : inter) {
            res[i++] = x;
        }
        return res;
    }
}