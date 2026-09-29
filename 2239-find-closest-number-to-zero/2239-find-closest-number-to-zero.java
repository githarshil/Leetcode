class Solution {
    public int findClosestNumber(int[] nums) {
        int min  = nums[0];
        for(int i = 0;i<nums.length;i++) {
            int num = Math.abs(nums[i]);
            if(num<Math.abs(min) || num == Math.abs(min) && nums[i] > 0){
                min = nums[i];
            }
        } 
        return min;
    }
}