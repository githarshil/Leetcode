class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int start = 0;
        int end = 1;
        int[] res = new int[nums.length];
        while(start<nums.length) {
            int count = 0;
            while(end<nums.length) {
                if(nums[start]>nums[end]) {
                    count++;
                    end++;
                }
                else{
                    end++;
                }
            }
            res[start] = count;
            start++;
            end = 0;
        }
        return res;
    }
}