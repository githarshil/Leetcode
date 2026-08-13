class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for(int fast = 0; fast < nums.length;fast++) {
            if (nums[fast]!=0) {
                nums[start] = nums[fast];
                start++;
            }
        }
        for(int i = start;i<nums.length;i++) {
            nums[i] = 0;
        }
    }
}