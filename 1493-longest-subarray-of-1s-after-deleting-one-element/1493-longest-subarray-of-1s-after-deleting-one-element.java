class Solution {
    public int longestSubarray(int[] nums) {
        int low = 0;
        int result = -1;
        int len = 0;
        int numZero = 0;
        for(int high = 0;high<nums.length;high++) {
            if(nums[high] == 0) {
                numZero++;
            }
            while(numZero>1) {
                if(nums[low] == 0) {
                    numZero--;
                }
                low++;
            }
            result = Math.max(result,high-low);
        }
        return result;
    }
}