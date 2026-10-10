class Solution {
    public int findNonMinOrMax(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int res = 0;
        for(int i = 1;i<nums.length-1;i++) {
            res = nums[i];
        }
        if(res == 0) {
            return -1;
        }
        return res;
    }
}