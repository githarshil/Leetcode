class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int write = nums.length-1;
            while(start<=end) {
                if(Math.abs(nums[start])<Math.abs(nums[end])) {
                    result[write] = nums[end] * nums[end];
                    end--;
                }
                else if(Math.abs(nums[start])>Math.abs(nums[end]))  {
                    result[write] = nums[start]*nums[start];
                    start++;
                }
                else {
                    result[write] = nums[end]*nums[end];
                    end--;
                }
                write--;
        }
        return result;
    }
}