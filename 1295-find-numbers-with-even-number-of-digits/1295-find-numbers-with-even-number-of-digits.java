class Solution {
    public int findNumbers(int[] nums) {
        int num_count = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = (int) Math.log10(nums[i]) + 1;
            if (count % 2 == 0) {
                num_count++;
            }
        }
        return num_count;
    }
}