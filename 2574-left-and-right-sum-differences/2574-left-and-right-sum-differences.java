class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            int j = i-1;
            int k = i+1;
            int leftSum = 0;
            int rightSum = 0;
            while(j>=0) {
                leftSum += nums[j];
                j--;
            }
            while(k<=nums.length-1) {
                rightSum += nums[k];
                k++;
            }
            ans[i] = Math.abs(leftSum - rightSum);
        }
        return ans;
    }
}