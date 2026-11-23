class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]%3!=0) {
                res++;
            }
        }
        return res;
    }
}