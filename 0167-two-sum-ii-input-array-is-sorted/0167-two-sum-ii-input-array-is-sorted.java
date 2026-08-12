class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] index = new int[2];
        while(start<end) {
            int sum = nums[start]+nums[end];
            if(sum == target) {
                index[0] = start+1;
                index[1] = end+1;
                return index;
            }
            else if(nums[start]+nums[end] < target) {
                start++;
            }
            else if(nums[start]+nums[end] > target) {
                end--;
            }
        }
        return index;
    }
}