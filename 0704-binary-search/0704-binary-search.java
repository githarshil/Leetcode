class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }
    
    private int search(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return search(nums, target, start, mid - 1);
        }
        return search(nums, target, mid + 1, end);
    }
}