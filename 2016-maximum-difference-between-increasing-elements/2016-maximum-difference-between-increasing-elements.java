class Solution {
    public int maximumDifference(int[] nums) {
        int min  = nums[0];
        int maxDiff = 0;
        for(int i = 1;i<nums.length;i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            int diff = nums[i] - min;
            if(diff>maxDiff) {
                maxDiff = diff;
            }
        }
        if(maxDiff == 0) {
            return -1;
        }
        return maxDiff;
    }
}