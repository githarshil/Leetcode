class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int  i = 0;i<nums.length;i++) {
            sum+=nums[i];
            while(nums[i]!=0) {
                int last = nums[i]%10;
                nums[i] = nums[i]/10;
                digitSum += last;
            }
        }
        return Math.abs(sum-digitSum);
    }
}