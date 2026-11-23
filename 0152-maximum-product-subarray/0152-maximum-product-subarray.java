class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2= min * nums[i];
            int v3 = max * nums[i];
            max = Math.max(v1, Math.max(v2,v3));
            min = Math.min(v1, Math.min(v2,v3));
            ans = Math.max(ans,Math.max(max,min));
        }
        return ans;
    }
}