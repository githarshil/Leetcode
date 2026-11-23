class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnd = nums[0];
        int ans = nums[0];
        for(int i = 1;i<nums.length;i++) {
            int v1 = bestEnd + nums[i];
            int v2 = nums[i];
            bestEnd = Math.max(v1,v2);
            ans = Math.max(ans,bestEnd);
        }
        return ans;
    }
}