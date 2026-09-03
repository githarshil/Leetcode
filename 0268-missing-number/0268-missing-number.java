class Solution {
    public int missingNumber(int[] nums) {
        int i  = 0;
        int correct = nums[i];
        while(i<nums.length){
            correct = nums[i];
            if(correct>=nums.length) {
                i++;
            }
            else if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for(int j = 0 ; j< nums.length;j++){
            if(nums[j]!=j) {
                return j;
            }
        }
        return nums.length;
    }
}