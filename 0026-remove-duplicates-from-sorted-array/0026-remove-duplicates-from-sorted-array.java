class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for(int fast = 1;fast < nums.length;fast++) {
            if(nums[fast]!=nums[slow]) {
                nums[slow+1]=nums[fast];
                slow++;
            }
        }
        return slow+1;
    }
}