class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for(int x : nums1) {
            set.add(x);
        }
        for (int x : nums2) {
            if(set.contains(x)) {
                inter.add(x);
            }
        }
        return inter.stream().mapToInt(Integer::intValue).toArray();
    }
}