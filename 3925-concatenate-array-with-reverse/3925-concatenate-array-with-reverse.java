class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int  i = 0;i<nums.length;i++) {
            ans[i] = nums[i];
        }
        for(int i = ans.length-1;i>=nums.length;i--) {
            ans[i] = nums[ans.length - 1-i];
        }
        return ans;
    }
}