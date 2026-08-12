class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] two = new int[2];
        int start = 0;
        int end = nums.length-1;
        while(start<end) {
            int sum = nums[start]+nums[end];
            if(sum == target) {
                int[] index = {start+1,end+1};
                return index;
            }
            else if(nums[start]+nums[end] < target) {
                start++;
            }
            else if(nums[start]+nums[end] > target) {
                end--;
            }
        }
        return two;
    }
}