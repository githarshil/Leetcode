class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int result = -1;
        int windowSum = 0;
        int len = 0;
        for(int high=0;high<nums.length;high++) {
            if(nums[high]==1){
                windowSum+=nums[high];
            }
            int numZero = high-low+1-windowSum;
            while(numZero>k){
                len = high-low+1;
                windowSum -= nums[low];
                low++;
                numZero = high-low+1-windowSum;
            }
            result = Math.max(result,high - low + 1);
        }
        return result;
    }
}